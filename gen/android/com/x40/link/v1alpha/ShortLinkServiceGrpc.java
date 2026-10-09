package com.x40.link.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Authenticated management of short links. The public HTTP redirect remains
 * outside this service and continues to use status 307.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ShortLinkServiceGrpc {

  private ShortLinkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "x40.link.v1alpha.ShortLinkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.x40.link.v1alpha.CreateShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getCreateShortLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShortLink",
      requestType = com.x40.link.v1alpha.CreateShortLinkRequest.class,
      responseType = com.x40.link.v1alpha.ShortLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x40.link.v1alpha.CreateShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getCreateShortLinkMethod() {
    io.grpc.MethodDescriptor<com.x40.link.v1alpha.CreateShortLinkRequest, com.x40.link.v1alpha.ShortLink> getCreateShortLinkMethod;
    if ((getCreateShortLinkMethod = ShortLinkServiceGrpc.getCreateShortLinkMethod) == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        if ((getCreateShortLinkMethod = ShortLinkServiceGrpc.getCreateShortLinkMethod) == null) {
          ShortLinkServiceGrpc.getCreateShortLinkMethod = getCreateShortLinkMethod =
              io.grpc.MethodDescriptor.<com.x40.link.v1alpha.CreateShortLinkRequest, com.x40.link.v1alpha.ShortLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShortLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.CreateShortLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.ShortLink.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateShortLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x40.link.v1alpha.GetShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getGetShortLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShortLink",
      requestType = com.x40.link.v1alpha.GetShortLinkRequest.class,
      responseType = com.x40.link.v1alpha.ShortLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x40.link.v1alpha.GetShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getGetShortLinkMethod() {
    io.grpc.MethodDescriptor<com.x40.link.v1alpha.GetShortLinkRequest, com.x40.link.v1alpha.ShortLink> getGetShortLinkMethod;
    if ((getGetShortLinkMethod = ShortLinkServiceGrpc.getGetShortLinkMethod) == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        if ((getGetShortLinkMethod = ShortLinkServiceGrpc.getGetShortLinkMethod) == null) {
          ShortLinkServiceGrpc.getGetShortLinkMethod = getGetShortLinkMethod =
              io.grpc.MethodDescriptor.<com.x40.link.v1alpha.GetShortLinkRequest, com.x40.link.v1alpha.ShortLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetShortLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.GetShortLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.ShortLink.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetShortLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x40.link.v1alpha.ListShortLinksRequest,
      com.x40.link.v1alpha.ListShortLinksResponse> getListShortLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShortLinks",
      requestType = com.x40.link.v1alpha.ListShortLinksRequest.class,
      responseType = com.x40.link.v1alpha.ListShortLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x40.link.v1alpha.ListShortLinksRequest,
      com.x40.link.v1alpha.ListShortLinksResponse> getListShortLinksMethod() {
    io.grpc.MethodDescriptor<com.x40.link.v1alpha.ListShortLinksRequest, com.x40.link.v1alpha.ListShortLinksResponse> getListShortLinksMethod;
    if ((getListShortLinksMethod = ShortLinkServiceGrpc.getListShortLinksMethod) == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        if ((getListShortLinksMethod = ShortLinkServiceGrpc.getListShortLinksMethod) == null) {
          ShortLinkServiceGrpc.getListShortLinksMethod = getListShortLinksMethod =
              io.grpc.MethodDescriptor.<com.x40.link.v1alpha.ListShortLinksRequest, com.x40.link.v1alpha.ListShortLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShortLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.ListShortLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.ListShortLinksResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListShortLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x40.link.v1alpha.UpdateShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getUpdateShortLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShortLink",
      requestType = com.x40.link.v1alpha.UpdateShortLinkRequest.class,
      responseType = com.x40.link.v1alpha.ShortLink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x40.link.v1alpha.UpdateShortLinkRequest,
      com.x40.link.v1alpha.ShortLink> getUpdateShortLinkMethod() {
    io.grpc.MethodDescriptor<com.x40.link.v1alpha.UpdateShortLinkRequest, com.x40.link.v1alpha.ShortLink> getUpdateShortLinkMethod;
    if ((getUpdateShortLinkMethod = ShortLinkServiceGrpc.getUpdateShortLinkMethod) == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        if ((getUpdateShortLinkMethod = ShortLinkServiceGrpc.getUpdateShortLinkMethod) == null) {
          ShortLinkServiceGrpc.getUpdateShortLinkMethod = getUpdateShortLinkMethod =
              io.grpc.MethodDescriptor.<com.x40.link.v1alpha.UpdateShortLinkRequest, com.x40.link.v1alpha.ShortLink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateShortLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.UpdateShortLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.ShortLink.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateShortLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.x40.link.v1alpha.DeleteShortLinkRequest,
      com.google.protobuf.Empty> getDeleteShortLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteShortLink",
      requestType = com.x40.link.v1alpha.DeleteShortLinkRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.x40.link.v1alpha.DeleteShortLinkRequest,
      com.google.protobuf.Empty> getDeleteShortLinkMethod() {
    io.grpc.MethodDescriptor<com.x40.link.v1alpha.DeleteShortLinkRequest, com.google.protobuf.Empty> getDeleteShortLinkMethod;
    if ((getDeleteShortLinkMethod = ShortLinkServiceGrpc.getDeleteShortLinkMethod) == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        if ((getDeleteShortLinkMethod = ShortLinkServiceGrpc.getDeleteShortLinkMethod) == null) {
          ShortLinkServiceGrpc.getDeleteShortLinkMethod = getDeleteShortLinkMethod =
              io.grpc.MethodDescriptor.<com.x40.link.v1alpha.DeleteShortLinkRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteShortLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.x40.link.v1alpha.DeleteShortLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteShortLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShortLinkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceStub>() {
        @java.lang.Override
        public ShortLinkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShortLinkServiceStub(channel, callOptions);
        }
      };
    return ShortLinkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ShortLinkServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceBlockingV2Stub>() {
        @java.lang.Override
        public ShortLinkServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShortLinkServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ShortLinkServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShortLinkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceBlockingStub>() {
        @java.lang.Override
        public ShortLinkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShortLinkServiceBlockingStub(channel, callOptions);
        }
      };
    return ShortLinkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShortLinkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShortLinkServiceFutureStub>() {
        @java.lang.Override
        public ShortLinkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShortLinkServiceFutureStub(channel, callOptions);
        }
      };
    return ShortLinkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Atomically claim an explicit path or generate an unused suffix. Generated
     * collisions are retried; no existing link is overwritten.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0133::response-lro=disabled --)
     * </pre>
     */
    default void createShortLink(com.x40.link.v1alpha.CreateShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShortLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Read an owned link, including before DNS points to the short domain.
     * </pre>
     */
    default void getShortLink(com.x40.link.v1alpha.GetShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShortLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * List owned links in one domain or, with domains/-, across all domains.
     * </pre>
     */
    default void listShortLinks(com.x40.link.v1alpha.ListShortLinksRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ListShortLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShortLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply mutable fields. On success reads and redirects see the new state.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0134::response-lro=disabled --)
     * </pre>
     */
    default void updateShortLink(com.x40.link.v1alpha.UpdateShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShortLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an owned link. On success reads and redirects see its absence.
     * Writes complete synchronously and return Empty directly.
     * (-- api-linter: core::0135::response-lro=disabled --)
     * </pre>
     */
    default void deleteShortLink(com.x40.link.v1alpha.DeleteShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteShortLinkMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShortLinkService.
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public static abstract class ShortLinkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShortLinkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShortLinkService.
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public static final class ShortLinkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShortLinkServiceStub> {
    private ShortLinkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShortLinkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShortLinkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Atomically claim an explicit path or generate an unused suffix. Generated
     * collisions are retried; no existing link is overwritten.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0133::response-lro=disabled --)
     * </pre>
     */
    public void createShortLink(com.x40.link.v1alpha.CreateShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShortLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Read an owned link, including before DNS points to the short domain.
     * </pre>
     */
    public void getShortLink(com.x40.link.v1alpha.GetShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShortLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List owned links in one domain or, with domains/-, across all domains.
     * </pre>
     */
    public void listShortLinks(com.x40.link.v1alpha.ListShortLinksRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ListShortLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShortLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply mutable fields. On success reads and redirects see the new state.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0134::response-lro=disabled --)
     * </pre>
     */
    public void updateShortLink(com.x40.link.v1alpha.UpdateShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShortLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an owned link. On success reads and redirects see its absence.
     * Writes complete synchronously and return Empty directly.
     * (-- api-linter: core::0135::response-lro=disabled --)
     * </pre>
     */
    public void deleteShortLink(com.x40.link.v1alpha.DeleteShortLinkRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteShortLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShortLinkService.
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public static final class ShortLinkServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ShortLinkServiceBlockingV2Stub> {
    private ShortLinkServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShortLinkServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShortLinkServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Atomically claim an explicit path or generate an unused suffix. Generated
     * collisions are retried; no existing link is overwritten.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0133::response-lro=disabled --)
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink createShortLink(com.x40.link.v1alpha.CreateShortLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read an owned link, including before DNS points to the short domain.
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink getShortLink(com.x40.link.v1alpha.GetShortLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List owned links in one domain or, with domains/-, across all domains.
     * </pre>
     */
    public com.x40.link.v1alpha.ListShortLinksResponse listShortLinks(com.x40.link.v1alpha.ListShortLinksRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListShortLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply mutable fields. On success reads and redirects see the new state.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0134::response-lro=disabled --)
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink updateShortLink(com.x40.link.v1alpha.UpdateShortLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an owned link. On success reads and redirects see its absence.
     * Writes complete synchronously and return Empty directly.
     * (-- api-linter: core::0135::response-lro=disabled --)
     * </pre>
     */
    public com.google.protobuf.Empty deleteShortLink(com.x40.link.v1alpha.DeleteShortLinkRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteShortLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ShortLinkService.
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public static final class ShortLinkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShortLinkServiceBlockingStub> {
    private ShortLinkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShortLinkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShortLinkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Atomically claim an explicit path or generate an unused suffix. Generated
     * collisions are retried; no existing link is overwritten.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0133::response-lro=disabled --)
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink createShortLink(com.x40.link.v1alpha.CreateShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Read an owned link, including before DNS points to the short domain.
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink getShortLink(com.x40.link.v1alpha.GetShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List owned links in one domain or, with domains/-, across all domains.
     * </pre>
     */
    public com.x40.link.v1alpha.ListShortLinksResponse listShortLinks(com.x40.link.v1alpha.ListShortLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShortLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply mutable fields. On success reads and redirects see the new state.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0134::response-lro=disabled --)
     * </pre>
     */
    public com.x40.link.v1alpha.ShortLink updateShortLink(com.x40.link.v1alpha.UpdateShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShortLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an owned link. On success reads and redirects see its absence.
     * Writes complete synchronously and return Empty directly.
     * (-- api-linter: core::0135::response-lro=disabled --)
     * </pre>
     */
    public com.google.protobuf.Empty deleteShortLink(com.x40.link.v1alpha.DeleteShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteShortLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShortLinkService.
   * <pre>
   * Authenticated management of short links. The public HTTP redirect remains
   * outside this service and continues to use status 307.
   * </pre>
   */
  public static final class ShortLinkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShortLinkServiceFutureStub> {
    private ShortLinkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShortLinkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShortLinkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Atomically claim an explicit path or generate an unused suffix. Generated
     * collisions are retried; no existing link is overwritten.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0133::response-lro=disabled --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x40.link.v1alpha.ShortLink> createShortLink(
        com.x40.link.v1alpha.CreateShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShortLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Read an owned link, including before DNS points to the short domain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x40.link.v1alpha.ShortLink> getShortLink(
        com.x40.link.v1alpha.GetShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShortLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List owned links in one domain or, with domains/-, across all domains.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x40.link.v1alpha.ListShortLinksResponse> listShortLinks(
        com.x40.link.v1alpha.ListShortLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShortLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply mutable fields. On success reads and redirects see the new state.
     * Writes complete synchronously and return the resource directly.
     * (-- api-linter: core::0134::response-lro=disabled --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.x40.link.v1alpha.ShortLink> updateShortLink(
        com.x40.link.v1alpha.UpdateShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShortLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an owned link. On success reads and redirects see its absence.
     * Writes complete synchronously and return Empty directly.
     * (-- api-linter: core::0135::response-lro=disabled --)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteShortLink(
        com.x40.link.v1alpha.DeleteShortLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteShortLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SHORT_LINK = 0;
  private static final int METHODID_GET_SHORT_LINK = 1;
  private static final int METHODID_LIST_SHORT_LINKS = 2;
  private static final int METHODID_UPDATE_SHORT_LINK = 3;
  private static final int METHODID_DELETE_SHORT_LINK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SHORT_LINK:
          serviceImpl.createShortLink((com.x40.link.v1alpha.CreateShortLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink>) responseObserver);
          break;
        case METHODID_GET_SHORT_LINK:
          serviceImpl.getShortLink((com.x40.link.v1alpha.GetShortLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink>) responseObserver);
          break;
        case METHODID_LIST_SHORT_LINKS:
          serviceImpl.listShortLinks((com.x40.link.v1alpha.ListShortLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ListShortLinksResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SHORT_LINK:
          serviceImpl.updateShortLink((com.x40.link.v1alpha.UpdateShortLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.x40.link.v1alpha.ShortLink>) responseObserver);
          break;
        case METHODID_DELETE_SHORT_LINK:
          serviceImpl.deleteShortLink((com.x40.link.v1alpha.DeleteShortLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateShortLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.x40.link.v1alpha.CreateShortLinkRequest,
              com.x40.link.v1alpha.ShortLink>(
                service, METHODID_CREATE_SHORT_LINK)))
        .addMethod(
          getGetShortLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.x40.link.v1alpha.GetShortLinkRequest,
              com.x40.link.v1alpha.ShortLink>(
                service, METHODID_GET_SHORT_LINK)))
        .addMethod(
          getListShortLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.x40.link.v1alpha.ListShortLinksRequest,
              com.x40.link.v1alpha.ListShortLinksResponse>(
                service, METHODID_LIST_SHORT_LINKS)))
        .addMethod(
          getUpdateShortLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.x40.link.v1alpha.UpdateShortLinkRequest,
              com.x40.link.v1alpha.ShortLink>(
                service, METHODID_UPDATE_SHORT_LINK)))
        .addMethod(
          getDeleteShortLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.x40.link.v1alpha.DeleteShortLinkRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SHORT_LINK)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShortLinkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateShortLinkMethod())
              .addMethod(getGetShortLinkMethod())
              .addMethod(getListShortLinksMethod())
              .addMethod(getUpdateShortLinkMethod())
              .addMethod(getDeleteShortLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
