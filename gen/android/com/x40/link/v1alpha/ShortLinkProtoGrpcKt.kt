package com.x40.link.v1alpha

import com.google.protobuf.Empty
import com.x40.link.v1alpha.ShortLinkServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for x40.link.v1alpha.ShortLinkService.
 */
public object ShortLinkServiceGrpcKt {
  public const val SERVICE_NAME: String = ShortLinkServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createShortLinkMethod: MethodDescriptor<CreateShortLinkRequest, ShortLink>
    @JvmStatic
    get() = ShortLinkServiceGrpc.getCreateShortLinkMethod()

  public val getShortLinkMethod: MethodDescriptor<GetShortLinkRequest, ShortLink>
    @JvmStatic
    get() = ShortLinkServiceGrpc.getGetShortLinkMethod()

  public val listShortLinksMethod: MethodDescriptor<ListShortLinksRequest, ListShortLinksResponse>
    @JvmStatic
    get() = ShortLinkServiceGrpc.getListShortLinksMethod()

  public val updateShortLinkMethod: MethodDescriptor<UpdateShortLinkRequest, ShortLink>
    @JvmStatic
    get() = ShortLinkServiceGrpc.getUpdateShortLinkMethod()

  public val deleteShortLinkMethod: MethodDescriptor<DeleteShortLinkRequest, Empty>
    @JvmStatic
    get() = ShortLinkServiceGrpc.getDeleteShortLinkMethod()

  /**
   * A stub for issuing RPCs to a(n) x40.link.v1alpha.ShortLinkService service as suspending coroutines.
   */
  @StubFor(ShortLinkServiceGrpc::class)
  public class ShortLinkServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ShortLinkServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ShortLinkServiceCoroutineStub = ShortLinkServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createShortLink(request: CreateShortLinkRequest, headers: Metadata = Metadata()): ShortLink = unaryRpc(
      channel,
      ShortLinkServiceGrpc.getCreateShortLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getShortLink(request: GetShortLinkRequest, headers: Metadata = Metadata()): ShortLink = unaryRpc(
      channel,
      ShortLinkServiceGrpc.getGetShortLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listShortLinks(request: ListShortLinksRequest, headers: Metadata = Metadata()): ListShortLinksResponse = unaryRpc(
      channel,
      ShortLinkServiceGrpc.getListShortLinksMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateShortLink(request: UpdateShortLinkRequest, headers: Metadata = Metadata()): ShortLink = unaryRpc(
      channel,
      ShortLinkServiceGrpc.getUpdateShortLinkMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteShortLink(request: DeleteShortLinkRequest, headers: Metadata = Metadata()): Empty = unaryRpc(
      channel,
      ShortLinkServiceGrpc.getDeleteShortLinkMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the x40.link.v1alpha.ShortLinkService service based on Kotlin coroutines.
   */
  public abstract class ShortLinkServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for x40.link.v1alpha.ShortLinkService.CreateShortLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createShortLink(request: CreateShortLinkRequest): ShortLink = throw StatusException(UNIMPLEMENTED.withDescription("Method x40.link.v1alpha.ShortLinkService.CreateShortLink is unimplemented"))

    /**
     * Returns the response to an RPC for x40.link.v1alpha.ShortLinkService.GetShortLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getShortLink(request: GetShortLinkRequest): ShortLink = throw StatusException(UNIMPLEMENTED.withDescription("Method x40.link.v1alpha.ShortLinkService.GetShortLink is unimplemented"))

    /**
     * Returns the response to an RPC for x40.link.v1alpha.ShortLinkService.ListShortLinks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listShortLinks(request: ListShortLinksRequest): ListShortLinksResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method x40.link.v1alpha.ShortLinkService.ListShortLinks is unimplemented"))

    /**
     * Returns the response to an RPC for x40.link.v1alpha.ShortLinkService.UpdateShortLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateShortLink(request: UpdateShortLinkRequest): ShortLink = throw StatusException(UNIMPLEMENTED.withDescription("Method x40.link.v1alpha.ShortLinkService.UpdateShortLink is unimplemented"))

    /**
     * Returns the response to an RPC for x40.link.v1alpha.ShortLinkService.DeleteShortLink.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteShortLink(request: DeleteShortLinkRequest): Empty = throw StatusException(UNIMPLEMENTED.withDescription("Method x40.link.v1alpha.ShortLinkService.DeleteShortLink is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShortLinkServiceGrpc.getCreateShortLinkMethod(),
      implementation = ::createShortLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShortLinkServiceGrpc.getGetShortLinkMethod(),
      implementation = ::getShortLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShortLinkServiceGrpc.getListShortLinksMethod(),
      implementation = ::listShortLinks
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShortLinkServiceGrpc.getUpdateShortLinkMethod(),
      implementation = ::updateShortLink
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShortLinkServiceGrpc.getDeleteShortLinkMethod(),
      implementation = ::deleteShortLink
    )).build()
  }
}
