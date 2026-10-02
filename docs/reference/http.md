# ShortLink HTTP API

The HTTP contract is defined by the `google.api.http` annotations in
[`short_link.proto`](../../x40/link/v1alpha/short_link.proto). The bindings
follow [AIP-127](https://google.aip.dev/127) and the standard methods in
[AIP-131](https://google.aip.dev/131), [AIP-132](https://google.aip.dev/132),
[AIP-133](https://google.aip.dev/133), [AIP-134](https://google.aip.dev/134), and
[AIP-135](https://google.aip.dev/135).

## Routes

Paths below are relative to the management API's base URL. `{domain}` is one
domain segment; `{encoded_path}` is the path-derived resource ID described in
the [identity reference](../../README.md#identity-and-lifecycle).

| RPC | HTTP method | Path | JSON request body |
| --- | --- | --- | --- |
| CreateShortLink | POST | `/v1alpha/domains/{domain}/shortLinks` | ShortLink |
| GetShortLink | GET | `/v1alpha/domains/{domain}/shortLinks/{encoded_path}` | None |
| ListShortLinks | GET | `/v1alpha/domains/{domain}/shortLinks` | None |
| UpdateShortLink | PATCH | `/v1alpha/domains/{domain}/shortLinks/{encoded_path}` | ShortLink |
| DeleteShortLink | DELETE | `/v1alpha/domains/{domain}/shortLinks/{encoded_path}` | None |

For Create and List, the path supplies `parent`. For Get and Delete it supplies
`name`; for Update it supplies `short_link.name`. List across all domains uses
`/v1alpha/domains/-/shortLinks`.

## Bodies and query parameters

Bodies and responses use [ProtoJSON](https://protobuf.dev/programming-guides/json/)
with lower camel case field names. Create and Update accept the ShortLink
object directly, without a `shortLink` wrapper. Remaining request fields map
to query parameters:

| RPC | Query parameters |
| --- | --- |
| CreateShortLink | `requestId`, `validateOnly` |
| GetShortLink | None |
| ListShortLinks | `pageSize`, `pageToken` |
| UpdateShortLink | `updateMask`, `allowMissing`, `validateOnly` |
| DeleteShortLink | `etag`, `allowMissing`, `validateOnly` |

For example, creating the root link sends:

```http
POST /v1alpha/domains/example.com/shortLinks
Content-Type: application/json

{"path":"/","destinationUrl":"https://example.org/"}
```

Updating its destination sends:

```http
PATCH /v1alpha/domains/example.com/shortLinks/pf4?updateMask=destinationUrl
Content-Type: application/json

{"name":"domains/example.com/shortLinks/pf4","destinationUrl":"https://example.org/new"}
```

`updateMask` is a comma-separated list of lower camel case field paths, such
as `destinationUrl,annotations`. Query parameter values must be URL-encoded
where necessary, including quoted ETags and pagination tokens. For Update,
an ETag precondition belongs in the ShortLink body's `etag` field; for Delete,
it belongs in the `etag` query parameter.

Create, Get, and Update return a ShortLink JSON object. List returns a
ListShortLinksResponse object containing `shortLinks` and, when there is
another page, `nextPageToken`. Delete returns `google.protobuf.Empty` (an
empty JSON object).

## Serving and authorization

This repository defines the bindings; it does not implement an HTTP server.
The running service must configure an HTTP/JSON transcoder or equivalent
handlers and enforce the OAuth scope declared on each RPC in
[`auth.proto`](../../x40/link/v1alpha/auth.proto). The public short-link
redirect remains a separate HTTP endpoint returning status 307.
