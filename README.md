# X40 Link API

Protocol Buffer definitions for the X40 Link service. The Buf module is
`buf.build/x40-link/api`. The v1alpha source is in
[`x40/link/v1alpha/`](x40/link/v1alpha/).

`ShortLinkService` defines authenticated management of a `ShortLink` with
Create, Get, List, Update, and Delete methods. The separate public HTTP
redirect remains a 307. Each management RPC declares an OAuth scope in
[`auth.proto`](x40/link/v1alpha/auth.proto); the running service must enforce
those scopes. The proto annotation alone does not implement authentication.

## Identity and lifecycle

A link has one canonical `(domain, path)` identity. Its name is
`domains/{domain}/shortLinks/{encoded_path}`. `encoded_path` is `p` plus
lowercase, unpadded RFC 4648 Base32 of the UTF-8 bytes of the canonical path.
For example, `/` is `pf4`. The encoding is reversible and safe as one resource
name segment. The independent `short_link_id` prescribed by AIP-133 is omitted
deliberately: the client chooses the path and the server derives the ID.

The domain is case-insensitive and cannot include a port. The path starts with
`/`; its case, literal `+`, repeated slashes, and percent-escaped reserved
characters distinguish links. Canonical path spelling uses uppercase hex in
percent escapes and decodes percent-escaped unreserved characters. A source
query neither distinguishes a link nor gets appended to its destination. HTTP
and HTTPS sources identify the same link, and `short_url` uses HTTPS. An
explicit path `/` claims the root, while omitting `path` on Create asks for a
generated suffix. Destinations must be absolute HTTP or HTTPS URLs.

Create claims the address atomically, and `request_id` retains a successful
result for 24 hours. `UpdateShortLink` accepts masks for `destination_url` and
`annotations`; `allow_missing` creates a named link, applying all mutable
fields. `DeleteShortLink` supports `allow_missing`. An optional ETag on Update
or Delete is a precondition. `domains/-` lists the caller's links across all
domains. All management reads are owner-authorized or owner-filtered. Writes
are synchronous and immediately visible to management reads and redirects.

The schema is part of a coordinated migration described in
[issue #10](https://github.com/x40-link/api/issues/10). The existing service,
storage, generated code, CLI, and OAuth configuration must be migrated before
v1alpha is served. In particular, Firestore must use an injective source-path
key and atomically enforce create and ETag preconditions, while preserving
access to existing records.

The direct Create/Update responses and absence of a `reconciling` field reflect
synchronous writes. Narrow inline API-linter suppressions document the pinned
linter's unconditional LRO and reconciliation checks, the path-derived ID and
resource pattern, and the absence of `delete_time` and `display_name` on this
hard-deleted resource. The pinned googleapis dependency lacks `field_info.proto`,
so the UID and request ID format checks are suppressed at those fields. Buf's
two response-shape exceptions are scoped to `short_link.proto` in `buf.yaml`.

The API does not set a product-specific path-length limit. Before v1alpha is
served, the service migration must establish and document the effective HTTP
transport and storage limits.

## Validation

Install [Task](https://taskfile.dev/docs/installation/) and Go, then run
`task setup`. Ensure Go's binary directory (`$(go env GOPATH)/bin`) is on
`PATH`. The tasks are:

```sh
task build       # Compile the schema.
task lint        # Run Buf lint and Google's API linter.
task lint:buf    # Run Buf lint alone.
task lint:aip    # Run the API linter alone.
task validate    # Build and run both linters.
```

No language-specific generators or published client packages are configured
here yet. The Go package option reserves
`github.com/x40-link/api/gen/x40/link/v1alpha` for generated Go code.
