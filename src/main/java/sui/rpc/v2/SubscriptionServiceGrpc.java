package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/subscription_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubscriptionServiceGrpc {

  private SubscriptionServiceGrpc() {}

  public static final String SERVICE_NAME = "sui.rpc.v2.SubscriptionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SubscriptionServiceOuterClass.SubscribeCheckpointsRequest,
      SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> getSubscribeCheckpointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCheckpoints",
      requestType = SubscriptionServiceOuterClass.SubscribeCheckpointsRequest.class,
      responseType = SubscriptionServiceOuterClass.SubscribeCheckpointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<SubscriptionServiceOuterClass.SubscribeCheckpointsRequest,
      SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> getSubscribeCheckpointsMethod() {
    io.grpc.MethodDescriptor<SubscriptionServiceOuterClass.SubscribeCheckpointsRequest, SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> getSubscribeCheckpointsMethod;
    if ((getSubscribeCheckpointsMethod = SubscriptionServiceGrpc.getSubscribeCheckpointsMethod) == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        if ((getSubscribeCheckpointsMethod = SubscriptionServiceGrpc.getSubscribeCheckpointsMethod) == null) {
          SubscriptionServiceGrpc.getSubscribeCheckpointsMethod = getSubscribeCheckpointsMethod =
              io.grpc.MethodDescriptor.<SubscriptionServiceOuterClass.SubscribeCheckpointsRequest, SubscriptionServiceOuterClass.SubscribeCheckpointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCheckpoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscriptionServiceOuterClass.SubscribeCheckpointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscriptionServiceOuterClass.SubscribeCheckpointsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubscriptionServiceMethodDescriptorSupplier("SubscribeCheckpoints"))
              .build();
        }
      }
    }
    return getSubscribeCheckpointsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscriptionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceStub>() {
        @Override
        public SubscriptionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceStub(channel, callOptions);
        }
      };
    return SubscriptionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscriptionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceBlockingStub>() {
        @Override
        public SubscriptionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceBlockingStub(channel, callOptions);
        }
      };
    return SubscriptionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscriptionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubscriptionServiceFutureStub>() {
        @Override
        public SubscriptionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubscriptionServiceFutureStub(channel, callOptions);
        }
      };
    return SubscriptionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to the stream of checkpoints.
     * This API provides a subscription to the checkpoint stream for the Sui
     * blockchain. When a subscription is initialized the stream will begin with
     * the latest executed checkpoint as seen by the server. Responses are
     * guaranteed to return checkpoints in-order and without gaps. This enables
     * clients to know exactly the last checkpoint they have processed and in the
     * event the subscription terminates (either by the client/server or by the
     * connection breaking), clients will be able to reinitialize a subscription
     * and then leverage other APIs in order to request data for the checkpoints
     * they missed.
     * </pre>
     */
    default void subscribeCheckpoints(SubscriptionServiceOuterClass.SubscribeCheckpointsRequest request,
                                      io.grpc.stub.StreamObserver<SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCheckpointsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SubscriptionService.
   */
  public static abstract class SubscriptionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return SubscriptionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SubscriptionService.
   */
  public static final class SubscriptionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SubscriptionServiceStub> {
    private SubscriptionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SubscriptionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to the stream of checkpoints.
     * This API provides a subscription to the checkpoint stream for the Sui
     * blockchain. When a subscription is initialized the stream will begin with
     * the latest executed checkpoint as seen by the server. Responses are
     * guaranteed to return checkpoints in-order and without gaps. This enables
     * clients to know exactly the last checkpoint they have processed and in the
     * event the subscription terminates (either by the client/server or by the
     * connection breaking), clients will be able to reinitialize a subscription
     * and then leverage other APIs in order to request data for the checkpoints
     * they missed.
     * </pre>
     */
    public void subscribeCheckpoints(SubscriptionServiceOuterClass.SubscribeCheckpointsRequest request,
                                     io.grpc.stub.StreamObserver<SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCheckpointsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SubscriptionService.
   */
  public static final class SubscriptionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SubscriptionServiceBlockingStub> {
    private SubscriptionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SubscriptionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to the stream of checkpoints.
     * This API provides a subscription to the checkpoint stream for the Sui
     * blockchain. When a subscription is initialized the stream will begin with
     * the latest executed checkpoint as seen by the server. Responses are
     * guaranteed to return checkpoints in-order and without gaps. This enables
     * clients to know exactly the last checkpoint they have processed and in the
     * event the subscription terminates (either by the client/server or by the
     * connection breaking), clients will be able to reinitialize a subscription
     * and then leverage other APIs in order to request data for the checkpoints
     * they missed.
     * </pre>
     */
    public java.util.Iterator<SubscriptionServiceOuterClass.SubscribeCheckpointsResponse> subscribeCheckpoints(
        SubscriptionServiceOuterClass.SubscribeCheckpointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCheckpointsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SubscriptionService.
   */
  public static final class SubscriptionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SubscriptionServiceFutureStub> {
    private SubscriptionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SubscriptionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubscriptionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE_CHECKPOINTS = 0;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_CHECKPOINTS:
          serviceImpl.subscribeCheckpoints((SubscriptionServiceOuterClass.SubscribeCheckpointsRequest) request,
              (io.grpc.stub.StreamObserver<SubscriptionServiceOuterClass.SubscribeCheckpointsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
          getSubscribeCheckpointsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              SubscriptionServiceOuterClass.SubscribeCheckpointsRequest,
              SubscriptionServiceOuterClass.SubscribeCheckpointsResponse>(
                service, METHODID_SUBSCRIBE_CHECKPOINTS)))
        .build();
  }

  private static abstract class SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubscriptionServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SubscriptionServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SubscriptionService");
    }
  }

  private static final class SubscriptionServiceFileDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier {
    SubscriptionServiceFileDescriptorSupplier() {}
  }

  private static final class SubscriptionServiceMethodDescriptorSupplier
      extends SubscriptionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubscriptionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SubscriptionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscriptionServiceFileDescriptorSupplier())
              .addMethod(getSubscribeCheckpointsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
