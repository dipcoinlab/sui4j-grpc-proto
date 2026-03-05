package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/ledger_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LedgerServiceGrpc {

  private LedgerServiceGrpc() {}

  public static final String SERVICE_NAME = "sui.rpc.v2.LedgerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetServiceInfoRequest,
      LedgerServiceOuterClass.GetServiceInfoResponse> getGetServiceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceInfo",
      requestType = LedgerServiceOuterClass.GetServiceInfoRequest.class,
      responseType = LedgerServiceOuterClass.GetServiceInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetServiceInfoRequest,
      LedgerServiceOuterClass.GetServiceInfoResponse> getGetServiceInfoMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetServiceInfoRequest, LedgerServiceOuterClass.GetServiceInfoResponse> getGetServiceInfoMethod;
    if ((getGetServiceInfoMethod = LedgerServiceGrpc.getGetServiceInfoMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getGetServiceInfoMethod = LedgerServiceGrpc.getGetServiceInfoMethod) == null) {
          LedgerServiceGrpc.getGetServiceInfoMethod = getGetServiceInfoMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.GetServiceInfoRequest, LedgerServiceOuterClass.GetServiceInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetServiceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetServiceInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("GetServiceInfo"))
              .build();
        }
      }
    }
    return getGetServiceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetObjectRequest,
      LedgerServiceOuterClass.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = LedgerServiceOuterClass.GetObjectRequest.class,
      responseType = LedgerServiceOuterClass.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetObjectRequest,
      LedgerServiceOuterClass.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetObjectRequest, LedgerServiceOuterClass.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = LedgerServiceGrpc.getGetObjectMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getGetObjectMethod = LedgerServiceGrpc.getGetObjectMethod) == null) {
          LedgerServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.GetObjectRequest, LedgerServiceOuterClass.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetObjectsRequest,
      LedgerServiceOuterClass.BatchGetObjectsResponse> getBatchGetObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetObjects",
      requestType = LedgerServiceOuterClass.BatchGetObjectsRequest.class,
      responseType = LedgerServiceOuterClass.BatchGetObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetObjectsRequest,
      LedgerServiceOuterClass.BatchGetObjectsResponse> getBatchGetObjectsMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetObjectsRequest, LedgerServiceOuterClass.BatchGetObjectsResponse> getBatchGetObjectsMethod;
    if ((getBatchGetObjectsMethod = LedgerServiceGrpc.getBatchGetObjectsMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getBatchGetObjectsMethod = LedgerServiceGrpc.getBatchGetObjectsMethod) == null) {
          LedgerServiceGrpc.getBatchGetObjectsMethod = getBatchGetObjectsMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.BatchGetObjectsRequest, LedgerServiceOuterClass.BatchGetObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.BatchGetObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.BatchGetObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("BatchGetObjects"))
              .build();
        }
      }
    }
    return getBatchGetObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetTransactionRequest,
      LedgerServiceOuterClass.GetTransactionResponse> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = LedgerServiceOuterClass.GetTransactionRequest.class,
      responseType = LedgerServiceOuterClass.GetTransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetTransactionRequest,
      LedgerServiceOuterClass.GetTransactionResponse> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetTransactionRequest, LedgerServiceOuterClass.GetTransactionResponse> getGetTransactionMethod;
    if ((getGetTransactionMethod = LedgerServiceGrpc.getGetTransactionMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getGetTransactionMethod = LedgerServiceGrpc.getGetTransactionMethod) == null) {
          LedgerServiceGrpc.getGetTransactionMethod = getGetTransactionMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.GetTransactionRequest, LedgerServiceOuterClass.GetTransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetTransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("GetTransaction"))
              .build();
        }
      }
    }
    return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetTransactionsRequest,
      LedgerServiceOuterClass.BatchGetTransactionsResponse> getBatchGetTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetTransactions",
      requestType = LedgerServiceOuterClass.BatchGetTransactionsRequest.class,
      responseType = LedgerServiceOuterClass.BatchGetTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetTransactionsRequest,
      LedgerServiceOuterClass.BatchGetTransactionsResponse> getBatchGetTransactionsMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.BatchGetTransactionsRequest, LedgerServiceOuterClass.BatchGetTransactionsResponse> getBatchGetTransactionsMethod;
    if ((getBatchGetTransactionsMethod = LedgerServiceGrpc.getBatchGetTransactionsMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getBatchGetTransactionsMethod = LedgerServiceGrpc.getBatchGetTransactionsMethod) == null) {
          LedgerServiceGrpc.getBatchGetTransactionsMethod = getBatchGetTransactionsMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.BatchGetTransactionsRequest, LedgerServiceOuterClass.BatchGetTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.BatchGetTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.BatchGetTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("BatchGetTransactions"))
              .build();
        }
      }
    }
    return getBatchGetTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetCheckpointRequest,
      LedgerServiceOuterClass.GetCheckpointResponse> getGetCheckpointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCheckpoint",
      requestType = LedgerServiceOuterClass.GetCheckpointRequest.class,
      responseType = LedgerServiceOuterClass.GetCheckpointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetCheckpointRequest,
      LedgerServiceOuterClass.GetCheckpointResponse> getGetCheckpointMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetCheckpointRequest, LedgerServiceOuterClass.GetCheckpointResponse> getGetCheckpointMethod;
    if ((getGetCheckpointMethod = LedgerServiceGrpc.getGetCheckpointMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getGetCheckpointMethod = LedgerServiceGrpc.getGetCheckpointMethod) == null) {
          LedgerServiceGrpc.getGetCheckpointMethod = getGetCheckpointMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.GetCheckpointRequest, LedgerServiceOuterClass.GetCheckpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCheckpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetCheckpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetCheckpointResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("GetCheckpoint"))
              .build();
        }
      }
    }
    return getGetCheckpointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetEpochRequest,
      LedgerServiceOuterClass.GetEpochResponse> getGetEpochMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEpoch",
      requestType = LedgerServiceOuterClass.GetEpochRequest.class,
      responseType = LedgerServiceOuterClass.GetEpochResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetEpochRequest,
      LedgerServiceOuterClass.GetEpochResponse> getGetEpochMethod() {
    io.grpc.MethodDescriptor<LedgerServiceOuterClass.GetEpochRequest, LedgerServiceOuterClass.GetEpochResponse> getGetEpochMethod;
    if ((getGetEpochMethod = LedgerServiceGrpc.getGetEpochMethod) == null) {
      synchronized (LedgerServiceGrpc.class) {
        if ((getGetEpochMethod = LedgerServiceGrpc.getGetEpochMethod) == null) {
          LedgerServiceGrpc.getGetEpochMethod = getGetEpochMethod =
              io.grpc.MethodDescriptor.<LedgerServiceOuterClass.GetEpochRequest, LedgerServiceOuterClass.GetEpochResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEpoch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetEpochRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  LedgerServiceOuterClass.GetEpochResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LedgerServiceMethodDescriptorSupplier("GetEpoch"))
              .build();
        }
      }
    }
    return getGetEpochMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LedgerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LedgerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LedgerServiceStub>() {
        @Override
        public LedgerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LedgerServiceStub(channel, callOptions);
        }
      };
    return LedgerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LedgerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LedgerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LedgerServiceBlockingStub>() {
        @Override
        public LedgerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LedgerServiceBlockingStub(channel, callOptions);
        }
      };
    return LedgerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LedgerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LedgerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LedgerServiceFutureStub>() {
        @Override
        public LedgerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LedgerServiceFutureStub(channel, callOptions);
        }
      };
    return LedgerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Query the service for general information about its current state.
     * </pre>
     */
    default void getServiceInfo(LedgerServiceOuterClass.GetServiceInfoRequest request,
                                io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceInfoMethod(), responseObserver);
    }

    /**
     */
    default void getObject(LedgerServiceOuterClass.GetObjectRequest request,
                           io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     */
    default void batchGetObjects(LedgerServiceOuterClass.BatchGetObjectsRequest request,
                                 io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetObjectsMethod(), responseObserver);
    }

    /**
     */
    default void getTransaction(LedgerServiceOuterClass.GetTransactionRequest request,
                                io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetTransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     */
    default void batchGetTransactions(LedgerServiceOuterClass.BatchGetTransactionsRequest request,
                                      io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetTransactionsMethod(), responseObserver);
    }

    /**
     */
    default void getCheckpoint(LedgerServiceOuterClass.GetCheckpointRequest request,
                               io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetCheckpointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCheckpointMethod(), responseObserver);
    }

    /**
     */
    default void getEpoch(LedgerServiceOuterClass.GetEpochRequest request,
                          io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetEpochResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEpochMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LedgerService.
   */
  public static abstract class LedgerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return LedgerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LedgerService.
   */
  public static final class LedgerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LedgerServiceStub> {
    private LedgerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LedgerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LedgerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query the service for general information about its current state.
     * </pre>
     */
    public void getServiceInfo(LedgerServiceOuterClass.GetServiceInfoRequest request,
                               io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetServiceInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getObject(LedgerServiceOuterClass.GetObjectRequest request,
                          io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchGetObjects(LedgerServiceOuterClass.BatchGetObjectsRequest request,
                                io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransaction(LedgerServiceOuterClass.GetTransactionRequest request,
                               io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetTransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchGetTransactions(LedgerServiceOuterClass.BatchGetTransactionsRequest request,
                                     io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCheckpoint(LedgerServiceOuterClass.GetCheckpointRequest request,
                              io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetCheckpointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCheckpointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEpoch(LedgerServiceOuterClass.GetEpochRequest request,
                         io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetEpochResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEpochMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LedgerService.
   */
  public static final class LedgerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LedgerServiceBlockingStub> {
    private LedgerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LedgerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LedgerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query the service for general information about its current state.
     * </pre>
     */
    public LedgerServiceOuterClass.GetServiceInfoResponse getServiceInfo(LedgerServiceOuterClass.GetServiceInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.GetObjectResponse getObject(LedgerServiceOuterClass.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.BatchGetObjectsResponse batchGetObjects(LedgerServiceOuterClass.BatchGetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.GetTransactionResponse getTransaction(LedgerServiceOuterClass.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.BatchGetTransactionsResponse batchGetTransactions(LedgerServiceOuterClass.BatchGetTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.GetCheckpointResponse getCheckpoint(LedgerServiceOuterClass.GetCheckpointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCheckpointMethod(), getCallOptions(), request);
    }

    /**
     */
    public LedgerServiceOuterClass.GetEpochResponse getEpoch(LedgerServiceOuterClass.GetEpochRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEpochMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LedgerService.
   */
  public static final class LedgerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LedgerServiceFutureStub> {
    private LedgerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LedgerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LedgerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Query the service for general information about its current state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.GetServiceInfoResponse> getServiceInfo(
        LedgerServiceOuterClass.GetServiceInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.GetObjectResponse> getObject(
        LedgerServiceOuterClass.GetObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.BatchGetObjectsResponse> batchGetObjects(
        LedgerServiceOuterClass.BatchGetObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.GetTransactionResponse> getTransaction(
        LedgerServiceOuterClass.GetTransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.BatchGetTransactionsResponse> batchGetTransactions(
        LedgerServiceOuterClass.BatchGetTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetTransactionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.GetCheckpointResponse> getCheckpoint(
        LedgerServiceOuterClass.GetCheckpointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCheckpointMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<LedgerServiceOuterClass.GetEpochResponse> getEpoch(
        LedgerServiceOuterClass.GetEpochRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEpochMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE_INFO = 0;
  private static final int METHODID_GET_OBJECT = 1;
  private static final int METHODID_BATCH_GET_OBJECTS = 2;
  private static final int METHODID_GET_TRANSACTION = 3;
  private static final int METHODID_BATCH_GET_TRANSACTIONS = 4;
  private static final int METHODID_GET_CHECKPOINT = 5;
  private static final int METHODID_GET_EPOCH = 6;

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
        case METHODID_GET_SERVICE_INFO:
          serviceImpl.getServiceInfo((LedgerServiceOuterClass.GetServiceInfoRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetServiceInfoResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((LedgerServiceOuterClass.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetObjectResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_OBJECTS:
          serviceImpl.batchGetObjects((LedgerServiceOuterClass.BatchGetObjectsRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((LedgerServiceOuterClass.GetTransactionRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetTransactionResponse>) responseObserver);
          break;
        case METHODID_BATCH_GET_TRANSACTIONS:
          serviceImpl.batchGetTransactions((LedgerServiceOuterClass.BatchGetTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.BatchGetTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_CHECKPOINT:
          serviceImpl.getCheckpoint((LedgerServiceOuterClass.GetCheckpointRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetCheckpointResponse>) responseObserver);
          break;
        case METHODID_GET_EPOCH:
          serviceImpl.getEpoch((LedgerServiceOuterClass.GetEpochRequest) request,
              (io.grpc.stub.StreamObserver<LedgerServiceOuterClass.GetEpochResponse>) responseObserver);
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
          getGetServiceInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.GetServiceInfoRequest,
              LedgerServiceOuterClass.GetServiceInfoResponse>(
                service, METHODID_GET_SERVICE_INFO)))
        .addMethod(
          getGetObjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.GetObjectRequest,
              LedgerServiceOuterClass.GetObjectResponse>(
                service, METHODID_GET_OBJECT)))
        .addMethod(
          getBatchGetObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.BatchGetObjectsRequest,
              LedgerServiceOuterClass.BatchGetObjectsResponse>(
                service, METHODID_BATCH_GET_OBJECTS)))
        .addMethod(
          getGetTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.GetTransactionRequest,
              LedgerServiceOuterClass.GetTransactionResponse>(
                service, METHODID_GET_TRANSACTION)))
        .addMethod(
          getBatchGetTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.BatchGetTransactionsRequest,
              LedgerServiceOuterClass.BatchGetTransactionsResponse>(
                service, METHODID_BATCH_GET_TRANSACTIONS)))
        .addMethod(
          getGetCheckpointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.GetCheckpointRequest,
              LedgerServiceOuterClass.GetCheckpointResponse>(
                service, METHODID_GET_CHECKPOINT)))
        .addMethod(
          getGetEpochMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              LedgerServiceOuterClass.GetEpochRequest,
              LedgerServiceOuterClass.GetEpochResponse>(
                service, METHODID_GET_EPOCH)))
        .build();
  }

  private static abstract class LedgerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LedgerServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return LedgerServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LedgerService");
    }
  }

  private static final class LedgerServiceFileDescriptorSupplier
      extends LedgerServiceBaseDescriptorSupplier {
    LedgerServiceFileDescriptorSupplier() {}
  }

  private static final class LedgerServiceMethodDescriptorSupplier
      extends LedgerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LedgerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LedgerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LedgerServiceFileDescriptorSupplier())
              .addMethod(getGetServiceInfoMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getBatchGetObjectsMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getBatchGetTransactionsMethod())
              .addMethod(getGetCheckpointMethod())
              .addMethod(getGetEpochMethod())
              .build();
        }
      }
    }
    return result;
  }
}
