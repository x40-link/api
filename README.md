# X40 Link API

Protocol Buffer definitions for the X40 Link service. The source definitions
live in [`dev/`](dev/); server and client implementations can generate code
from the same contract.

The Buf module is named `buf.build/x40-link/api`. The module currently defines
`x40.dev.url.ManageURLs` with three RPCs: `Get` (public), `New`, and `List`.
`New` and `List` declare required OAuth scopes using the custom option in
[`dev/auth.proto`](dev/auth.proto). The running service enforces those scopes;
the annotation does not itself implement authentication in generated clients.

Install [Task](https://taskfile.dev/docs/installation/) and Go, then run
`task setup`. Make sure Go's binary directory (`$(go env GOPATH)/bin`) is on
your `PATH`. The tasks are:

```sh
task build       # Compile the schema.
task lint        # Run Buf lint and Google's API linter.
task lint:buf    # Run Buf lint alone.
task lint:aip    # Run the API linter alone.
task validate    # Build and run both linters.
```

The current API predates these checks and has existing lint findings. In
particular, its package layout, RPC names, and missing HTTP annotations need
an API design and compatibility decision before `task lint` can pass. The
linters report these findings rather than suppressing them.

No language-specific generators or published client packages are configured
here yet. The current Go package option reserves
`github.com/x40-link/api/gen/dev` for generated Go code. Browser clients
also need a browser-compatible transport; these definitions alone do not
expose the service over HTTP+JSON or gRPC-Web.
