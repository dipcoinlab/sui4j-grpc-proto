package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/transaction_execution_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransactionExecutionServiceGrpc {

  private TransactionExecutionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sui.rpc.v2.TransactionExecutionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest,
      sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> getExecuteTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteTransaction",
      requestType = sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest.class,
      responseType = sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest,
      sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> getExecuteTransactionMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest, sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> getExecuteTransactionMethod;
    if ((getExecuteTransactionMethod = TransactionExecutionServiceGrpc.getExecuteTransactionMethod) == null) {
      synchronized (TransactionExecutionServiceGrpc.class) {
        if ((getExecuteTransactionMethod = TransactionExecutionServiceGrpc.getExecuteTransactionMethod) == null) {
          TransactionExecutionServiceGrpc.getExecuteTransactionMethod = getExecuteTransactionMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest, sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionExecutionServiceMethodDescriptorSupplier("ExecuteTransaction"))
              .build();
        }
      }
    }
    return getExecuteTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest,
      sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> getSimulateTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateTransaction",
      requestType = sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest.class,
      responseType = sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest,
      sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> getSimulateTransactionMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest, sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> getSimulateTransactionMethod;
    if ((getSimulateTransactionMethod = TransactionExecutionServiceGrpc.getSimulateTransactionMethod) == null) {
      synchronized (TransactionExecutionServiceGrpc.class) {
        if ((getSimulateTransactionMethod = TransactionExecutionServiceGrpc.getSimulateTransactionMethod) == null) {
          TransactionExecutionServiceGrpc.getSimulateTransactionMethod = getSimulateTransactionMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest, sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimulateTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TransactionExecutionServiceMethodDescriptorSupplier("SimulateTransaction"))
              .build();
        }
      }
    }
    return getSimulateTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionExecutionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceStub>() {
        @java.lang.Override
        public TransactionExecutionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionExecutionServiceStub(channel, callOptions);
        }
      };
    return TransactionExecutionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionExecutionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceBlockingStub>() {
        @java.lang.Override
        public TransactionExecutionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionExecutionServiceBlockingStub(channel, callOptions);
        }
      };
    return TransactionExecutionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionExecutionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransactionExecutionServiceFutureStub>() {
        @java.lang.Override
        public TransactionExecutionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransactionExecutionServiceFutureStub(channel, callOptions);
        }
      };
    return TransactionExecutionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void executeTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteTransactionMethod(), responseObserver);
    }

    /**
     */
    default void simulateTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimulateTransactionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransactionExecutionService.
   */
  public static abstract class TransactionExecutionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransactionExecutionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransactionExecutionService.
   */
  public static final class TransactionExecutionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransactionExecutionServiceStub> {
    private TransactionExecutionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionExecutionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionExecutionServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simulateTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimulateTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransactionExecutionService.
   */
  public static final class TransactionExecutionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransactionExecutionServiceBlockingStub> {
    private TransactionExecutionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionExecutionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionExecutionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse executeTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse simulateTransaction(sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimulateTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransactionExecutionService.
   */
  public static final class TransactionExecutionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransactionExecutionServiceFutureStub> {
    private TransactionExecutionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionExecutionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransactionExecutionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse> executeTransaction(
        sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse> simulateTransaction(
        sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimulateTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_TRANSACTION = 0;
  private static final int METHODID_SIMULATE_TRANSACTION = 1;

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
        case METHODID_EXECUTE_TRANSACTION:
          serviceImpl.executeTransaction((sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse>) responseObserver);
          break;
        case METHODID_SIMULATE_TRANSACTION:
          serviceImpl.simulateTransaction((sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse>) responseObserver);
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
          getExecuteTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionRequest,
              sui.rpc.v2.TransactionExecutionServiceOuterClass.ExecuteTransactionResponse>(
                service, METHODID_EXECUTE_TRANSACTION)))
        .addMethod(
          getSimulateTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionRequest,
              sui.rpc.v2.TransactionExecutionServiceOuterClass.SimulateTransactionResponse>(
                service, METHODID_SIMULATE_TRANSACTION)))
        .build();
  }

  private static abstract class TransactionExecutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TransactionExecutionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sui.rpc.v2.TransactionExecutionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TransactionExecutionService");
    }
  }

  private static final class TransactionExecutionServiceFileDescriptorSupplier
      extends TransactionExecutionServiceBaseDescriptorSupplier {
    TransactionExecutionServiceFileDescriptorSupplier() {}
  }

  private static final class TransactionExecutionServiceMethodDescriptorSupplier
      extends TransactionExecutionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TransactionExecutionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TransactionExecutionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TransactionExecutionServiceFileDescriptorSupplier())
              .addMethod(getExecuteTransactionMethod())
              .addMethod(getSimulateTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
