package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/name_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NameServiceGrpc {

  private NameServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sui.rpc.v2.NameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.LookupNameRequest,
      sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> getLookupNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupName",
      requestType = sui.rpc.v2.NameServiceOuterClass.LookupNameRequest.class,
      responseType = sui.rpc.v2.NameServiceOuterClass.LookupNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.LookupNameRequest,
      sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> getLookupNameMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.LookupNameRequest, sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> getLookupNameMethod;
    if ((getLookupNameMethod = NameServiceGrpc.getLookupNameMethod) == null) {
      synchronized (NameServiceGrpc.class) {
        if ((getLookupNameMethod = NameServiceGrpc.getLookupNameMethod) == null) {
          NameServiceGrpc.getLookupNameMethod = getLookupNameMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.NameServiceOuterClass.LookupNameRequest, sui.rpc.v2.NameServiceOuterClass.LookupNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.NameServiceOuterClass.LookupNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.NameServiceOuterClass.LookupNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServiceMethodDescriptorSupplier("LookupName"))
              .build();
        }
      }
    }
    return getLookupNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest,
      sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> getReverseLookupNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReverseLookupName",
      requestType = sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest.class,
      responseType = sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest,
      sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> getReverseLookupNameMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest, sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> getReverseLookupNameMethod;
    if ((getReverseLookupNameMethod = NameServiceGrpc.getReverseLookupNameMethod) == null) {
      synchronized (NameServiceGrpc.class) {
        if ((getReverseLookupNameMethod = NameServiceGrpc.getReverseLookupNameMethod) == null) {
          NameServiceGrpc.getReverseLookupNameMethod = getReverseLookupNameMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest, sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReverseLookupName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServiceMethodDescriptorSupplier("ReverseLookupName"))
              .build();
        }
      }
    }
    return getReverseLookupNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceStub>() {
        @java.lang.Override
        public NameServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceStub(channel, callOptions);
        }
      };
    return NameServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceBlockingStub>() {
        @java.lang.Override
        public NameServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceBlockingStub(channel, callOptions);
        }
      };
    return NameServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceFutureStub>() {
        @java.lang.Override
        public NameServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceFutureStub(channel, callOptions);
        }
      };
    return NameServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void lookupName(sui.rpc.v2.NameServiceOuterClass.LookupNameRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupNameMethod(), responseObserver);
    }

    /**
     */
    default void reverseLookupName(sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReverseLookupNameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NameService.
   */
  public static abstract class NameServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NameServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NameService.
   */
  public static final class NameServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NameServiceStub> {
    private NameServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceStub(channel, callOptions);
    }

    /**
     */
    public void lookupName(sui.rpc.v2.NameServiceOuterClass.LookupNameRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reverseLookupName(sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReverseLookupNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NameService.
   */
  public static final class NameServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NameServiceBlockingStub> {
    private NameServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sui.rpc.v2.NameServiceOuterClass.LookupNameResponse lookupName(sui.rpc.v2.NameServiceOuterClass.LookupNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse reverseLookupName(sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReverseLookupNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NameService.
   */
  public static final class NameServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NameServiceFutureStub> {
    private NameServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.NameServiceOuterClass.LookupNameResponse> lookupName(
        sui.rpc.v2.NameServiceOuterClass.LookupNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse> reverseLookupName(
        sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReverseLookupNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOOKUP_NAME = 0;
  private static final int METHODID_REVERSE_LOOKUP_NAME = 1;

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
        case METHODID_LOOKUP_NAME:
          serviceImpl.lookupName((sui.rpc.v2.NameServiceOuterClass.LookupNameRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.LookupNameResponse>) responseObserver);
          break;
        case METHODID_REVERSE_LOOKUP_NAME:
          serviceImpl.reverseLookupName((sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse>) responseObserver);
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
          getLookupNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.NameServiceOuterClass.LookupNameRequest,
              sui.rpc.v2.NameServiceOuterClass.LookupNameResponse>(
                service, METHODID_LOOKUP_NAME)))
        .addMethod(
          getReverseLookupNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameRequest,
              sui.rpc.v2.NameServiceOuterClass.ReverseLookupNameResponse>(
                service, METHODID_REVERSE_LOOKUP_NAME)))
        .build();
  }

  private static abstract class NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sui.rpc.v2.NameServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NameService");
    }
  }

  private static final class NameServiceFileDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier {
    NameServiceFileDescriptorSupplier() {}
  }

  private static final class NameServiceMethodDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NameServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NameServiceFileDescriptorSupplier())
              .addMethod(getLookupNameMethod())
              .addMethod(getReverseLookupNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
