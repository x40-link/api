# X40 Link API

Protocol Buffer definitions for the X40 Link service. The Buf module is
`buf.build/x40-link/api`. The v1alpha source is in
[`x40/link/v1alpha/`](x40/link/v1alpha/).

`ShortLinkService` defines authenticated management of a `ShortLink` with
Create, Get, List, Update, and Delete methods. The separate public HTTP
redirect remains a 307. Each management RPC declares an OAuth scope in
[`auth.proto`](x40/link/v1alpha/auth.proto); the running service must enforce
those scopes. The proto annotation alone does not implement authentication.

All management RPCs already declare `google.api.http` bindings following
[Google's HTTP transcoding guidance (AIP-127)](https://google.aip.dev/127).
See the [HTTP reference](docs/reference/http.md) for routes, JSON bodies, and
query parameters. Serving these bindings requires an HTTP/JSON transcoder or
equivalent handlers in the running service.

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
hard-deleted resource. The UID format remains opaque and request IDs may be
non-UUID ASCII strings, so UUID4 checks are suppressed at those fields. Buf's
two response-shape exceptions are scoped to `short_link.proto` in `buf.yaml`.

The API does not set a product-specific path-length limit. Before v1alpha is
served, the service migration must establish and document the effective HTTP
transport and storage limits.

## Validation

Install [Task](https://taskfile.dev/docs/installation/), Go 1.26 or newer,
and a JDK 17 or newer, then run `task setup`. Ensure Go's binary directory
(`$(go env GOPATH)/bin`) is on `PATH`. The tasks are:

```sh
task generate        # Regenerate Go code and the OpenAPI document.
task generate:mobile # Regenerate iOS and Android stubs.
task build           # Compile the schema.
task lint            # Run Buf lint and Google's API linter.
task lint:buf        # Run Buf lint alone.
task lint:aip        # Run the API linter alone.
task test:go         # Test the Go package with the race detector.
task build:android   # Build the Android Gradle library.
task build:ios       # Build the Swift package with Swift 6.1 or newer.
task validate        # Build and lint the schema, test Go, and build Android.
```

The checked-in Go package is
`github.com/x40-link/api/gen/x40/link/v1alpha`. It contains protobuf messages,
the `ShortLinkServiceServer` and `ShortLinkServiceClient` interfaces, and a
gRPC-Gateway HTTP/JSON reverse proxy for the annotated management routes.
Register a service with `RegisterShortLinkServiceServer`. To serve the HTTP
bindings through the gRPC server, register the gateway using
`RegisterShortLinkServiceHandlerFromEndpoint` or
`RegisterShortLinkServiceHandler` with a gRPC connection. This path preserves
gRPC interceptors, including authentication. The generated gateway does not
implement the separate public 307 redirect endpoint.

The source package, generator versions, and Go dependencies are pinned in
`buf.gen.yaml`, `Taskfile.yml`, and `go.mod`. Run `task generate` after changing
the proto files, then commit the generated files with the schema change. Run
`task generate:mobile` for the mobile clients. The mobile generators are pinned
in `buf.gen.mobile.yaml` and run on the Buf Schema Registry, so that task needs
network access. It writes public SwiftProtobuf and gRPC Swift 2 types to
`gen/ios/`, and Android Protobuf Lite messages, Kotlin builders, and gRPC Java
and Kotlin stubs to `gen/android/`.

## Using the generated packages

- **Go:** Import `github.com/x40-link/api/gen/x40/link/v1alpha` from this
  module. Once the changes are committed and pushed, a consumer can run
  `go get github.com/x40-link/api@<commit-or-version>`. A version tag is useful
  for stable releases; a GitHub Release asset is unnecessary.
- **iOS:** Add `https://github.com/x40-link/api.git` as a Swift Package
  dependency and select the `X40LinkAPI` product. [Package.swift](Package.swift)
  builds the checked-in Swift sources and declares their Protobuf and gRPC
  dependencies. The package requires Swift 6.1 and iOS 18 or later. The app
  supplies its gRPC transport and channel.
- **Android:** The standalone [Gradle library](android/build.gradle.kts) builds
  the checked-in Java/Kotlin sources as `com.x40.link:api-android`. For a local
  checkout, add `includeBuild("../api/android")` to the app's
  `settings.gradle.kts` (adjust the path), then add
  `implementation("com.x40.link:api-android:0.0.0-SNAPSHOT")` to the app module.
  The included build substitutes the source library for that coordinate. The
  app supplies a gRPC transport and channel. The selected gRPC Java runtime
  supports Android API 24 or later.

To publish the Android library into your local Maven repository, run
`./android/gradlew -p android -PapiVersion=0.1.0 publishToMavenLocal`. A
consumer can then use `mavenLocal()` and
`implementation("com.x40.link:api-android:0.1.0")`. To publish to a hosted Maven
repository, run `publish` with `-PmavenRepositoryUrl=<repository-url>` and
`-PapiVersion=<version>`; set `MAVEN_USERNAME` and `MAVEN_PASSWORD` if the
repository requires credentials. No GitHub Release is needed. Run
`task build:ios` on a machine with Swift 6.1 or newer to check the Swift package.

The [OpenAPI 3.1 document](docs/openapi/x40/link/v1alpha/short_link.openapi.json)
describes the annotated management routes and can be served by a renderer later.
The upstream OpenAPI 3 generator is currently alpha, so review changes to this
document when updating the generator.
