# X40 Link API

Protocol Buffer definitions for the X40 Link service. The source definitions
live in [`dev/`](dev/); server and client implementations can generate code
from the same contract.

The Buf module is named `buf.build/x40-link/api`. The module currently defines
`x40.dev.url.ManageURLs` with three RPCs: `Get` (public), `New`, and `List`.
`New` and `List` declare required OAuth scopes using the custom option in
[`dev/auth.proto`](dev/auth.proto). The running service enforces those scopes;
the annotation does not itself implement authentication in generated clients.

To check the schema locally, install [Buf](https://buf.build/docs/installation/)
and run:

```sh
buf build
```

No language-specific generators or published client packages are configured
here yet. The current Go package option reserves
`github.com/x40-link/api/gen/dev` for generated Go code. Browser clients
also need a browser-compatible transport; these definitions alone do not
expose the service over HTTP+JSON or gRPC-Web.
