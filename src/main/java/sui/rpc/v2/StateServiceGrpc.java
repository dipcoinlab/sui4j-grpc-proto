package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/state_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StateServiceGrpc {

  private StateServiceGrpc() {}

  public static final String SERVICE_NAME = "sui.rpc.v2.StateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<StateServiceOuterClass.ListDynamicFieldsRequest,
      StateServiceOuterClass.ListDynamicFieldsResponse> getListDynamicFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDynamicFields",
      requestType = StateServiceOuterClass.ListDynamicFieldsRequest.class,
      responseType = StateServiceOuterClass.ListDynamicFieldsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StateServiceOuterClass.ListDynamicFieldsRequest,
      StateServiceOuterClass.ListDynamicFieldsResponse> getListDynamicFieldsMethod() {
    io.grpc.MethodDescriptor<StateServiceOuterClass.ListDynamicFieldsRequest, StateServiceOuterClass.ListDynamicFieldsResponse> getListDynamicFieldsMethod;
    if ((getListDynamicFieldsMethod = StateServiceGrpc.getListDynamicFieldsMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getListDynamicFieldsMethod = StateServiceGrpc.getListDynamicFieldsMethod) == null) {
          StateServiceGrpc.getListDynamicFieldsMethod = getListDynamicFieldsMethod =
              io.grpc.MethodDescriptor.<StateServiceOuterClass.ListDynamicFieldsRequest, StateServiceOuterClass.ListDynamicFieldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDynamicFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListDynamicFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListDynamicFieldsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("ListDynamicFields"))
              .build();
        }
      }
    }
    return getListDynamicFieldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StateServiceOuterClass.ListOwnedObjectsRequest,
      StateServiceOuterClass.ListOwnedObjectsResponse> getListOwnedObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOwnedObjects",
      requestType = StateServiceOuterClass.ListOwnedObjectsRequest.class,
      responseType = StateServiceOuterClass.ListOwnedObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StateServiceOuterClass.ListOwnedObjectsRequest,
      StateServiceOuterClass.ListOwnedObjectsResponse> getListOwnedObjectsMethod() {
    io.grpc.MethodDescriptor<StateServiceOuterClass.ListOwnedObjectsRequest, StateServiceOuterClass.ListOwnedObjectsResponse> getListOwnedObjectsMethod;
    if ((getListOwnedObjectsMethod = StateServiceGrpc.getListOwnedObjectsMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getListOwnedObjectsMethod = StateServiceGrpc.getListOwnedObjectsMethod) == null) {
          StateServiceGrpc.getListOwnedObjectsMethod = getListOwnedObjectsMethod =
              io.grpc.MethodDescriptor.<StateServiceOuterClass.ListOwnedObjectsRequest, StateServiceOuterClass.ListOwnedObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOwnedObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListOwnedObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListOwnedObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("ListOwnedObjects"))
              .build();
        }
      }
    }
    return getListOwnedObjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StateServiceOuterClass.GetCoinInfoRequest,
      StateServiceOuterClass.GetCoinInfoResponse> getGetCoinInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCoinInfo",
      requestType = StateServiceOuterClass.GetCoinInfoRequest.class,
      responseType = StateServiceOuterClass.GetCoinInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StateServiceOuterClass.GetCoinInfoRequest,
      StateServiceOuterClass.GetCoinInfoResponse> getGetCoinInfoMethod() {
    io.grpc.MethodDescriptor<StateServiceOuterClass.GetCoinInfoRequest, StateServiceOuterClass.GetCoinInfoResponse> getGetCoinInfoMethod;
    if ((getGetCoinInfoMethod = StateServiceGrpc.getGetCoinInfoMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetCoinInfoMethod = StateServiceGrpc.getGetCoinInfoMethod) == null) {
          StateServiceGrpc.getGetCoinInfoMethod = getGetCoinInfoMethod =
              io.grpc.MethodDescriptor.<StateServiceOuterClass.GetCoinInfoRequest, StateServiceOuterClass.GetCoinInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCoinInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.GetCoinInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.GetCoinInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetCoinInfo"))
              .build();
        }
      }
    }
    return getGetCoinInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StateServiceOuterClass.GetBalanceRequest,
      StateServiceOuterClass.GetBalanceResponse> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBalance",
      requestType = StateServiceOuterClass.GetBalanceRequest.class,
      responseType = StateServiceOuterClass.GetBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StateServiceOuterClass.GetBalanceRequest,
      StateServiceOuterClass.GetBalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<StateServiceOuterClass.GetBalanceRequest, StateServiceOuterClass.GetBalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = StateServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getGetBalanceMethod = StateServiceGrpc.getGetBalanceMethod) == null) {
          StateServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<StateServiceOuterClass.GetBalanceRequest, StateServiceOuterClass.GetBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.GetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.GetBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("GetBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StateServiceOuterClass.ListBalancesRequest,
      StateServiceOuterClass.ListBalancesResponse> getListBalancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBalances",
      requestType = StateServiceOuterClass.ListBalancesRequest.class,
      responseType = StateServiceOuterClass.ListBalancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StateServiceOuterClass.ListBalancesRequest,
      StateServiceOuterClass.ListBalancesResponse> getListBalancesMethod() {
    io.grpc.MethodDescriptor<StateServiceOuterClass.ListBalancesRequest, StateServiceOuterClass.ListBalancesResponse> getListBalancesMethod;
    if ((getListBalancesMethod = StateServiceGrpc.getListBalancesMethod) == null) {
      synchronized (StateServiceGrpc.class) {
        if ((getListBalancesMethod = StateServiceGrpc.getListBalancesMethod) == null) {
          StateServiceGrpc.getListBalancesMethod = getListBalancesMethod =
              io.grpc.MethodDescriptor.<StateServiceOuterClass.ListBalancesRequest, StateServiceOuterClass.ListBalancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBalances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListBalancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StateServiceOuterClass.ListBalancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StateServiceMethodDescriptorSupplier("ListBalances"))
              .build();
        }
      }
    }
    return getListBalancesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceStub>() {
        @Override
        public StateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceStub(channel, callOptions);
        }
      };
    return StateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceBlockingStub>() {
        @Override
        public StateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceBlockingStub(channel, callOptions);
        }
      };
    return StateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StateServiceFutureStub>() {
        @Override
        public StateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StateServiceFutureStub(channel, callOptions);
        }
      };
    return StateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void listDynamicFields(StateServiceOuterClass.ListDynamicFieldsRequest request,
                                   io.grpc.stub.StreamObserver<StateServiceOuterClass.ListDynamicFieldsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDynamicFieldsMethod(), responseObserver);
    }

    /**
     */
    default void listOwnedObjects(StateServiceOuterClass.ListOwnedObjectsRequest request,
                                  io.grpc.stub.StreamObserver<StateServiceOuterClass.ListOwnedObjectsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOwnedObjectsMethod(), responseObserver);
    }

    /**
     */
    default void getCoinInfo(StateServiceOuterClass.GetCoinInfoRequest request,
                             io.grpc.stub.StreamObserver<StateServiceOuterClass.GetCoinInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCoinInfoMethod(), responseObserver);
    }

    /**
     */
    default void getBalance(StateServiceOuterClass.GetBalanceRequest request,
                            io.grpc.stub.StreamObserver<StateServiceOuterClass.GetBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    default void listBalances(StateServiceOuterClass.ListBalancesRequest request,
                              io.grpc.stub.StreamObserver<StateServiceOuterClass.ListBalancesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBalancesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StateService.
   */
  public static abstract class StateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return StateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StateService.
   */
  public static final class StateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StateServiceStub> {
    private StateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceStub(channel, callOptions);
    }

    /**
     */
    public void listDynamicFields(StateServiceOuterClass.ListDynamicFieldsRequest request,
                                  io.grpc.stub.StreamObserver<StateServiceOuterClass.ListDynamicFieldsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDynamicFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOwnedObjects(StateServiceOuterClass.ListOwnedObjectsRequest request,
                                 io.grpc.stub.StreamObserver<StateServiceOuterClass.ListOwnedObjectsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOwnedObjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCoinInfo(StateServiceOuterClass.GetCoinInfoRequest request,
                            io.grpc.stub.StreamObserver<StateServiceOuterClass.GetCoinInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCoinInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBalance(StateServiceOuterClass.GetBalanceRequest request,
                           io.grpc.stub.StreamObserver<StateServiceOuterClass.GetBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBalances(StateServiceOuterClass.ListBalancesRequest request,
                             io.grpc.stub.StreamObserver<StateServiceOuterClass.ListBalancesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBalancesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StateService.
   */
  public static final class StateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StateServiceBlockingStub> {
    private StateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public StateServiceOuterClass.ListDynamicFieldsResponse listDynamicFields(StateServiceOuterClass.ListDynamicFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDynamicFieldsMethod(), getCallOptions(), request);
    }

    /**
     */
    public StateServiceOuterClass.ListOwnedObjectsResponse listOwnedObjects(StateServiceOuterClass.ListOwnedObjectsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOwnedObjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public StateServiceOuterClass.GetCoinInfoResponse getCoinInfo(StateServiceOuterClass.GetCoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCoinInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public StateServiceOuterClass.GetBalanceResponse getBalance(StateServiceOuterClass.GetBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public StateServiceOuterClass.ListBalancesResponse listBalances(StateServiceOuterClass.ListBalancesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBalancesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StateService.
   */
  public static final class StateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StateServiceFutureStub> {
    private StateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected StateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StateServiceOuterClass.ListDynamicFieldsResponse> listDynamicFields(
        StateServiceOuterClass.ListDynamicFieldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDynamicFieldsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StateServiceOuterClass.ListOwnedObjectsResponse> listOwnedObjects(
        StateServiceOuterClass.ListOwnedObjectsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOwnedObjectsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StateServiceOuterClass.GetCoinInfoResponse> getCoinInfo(
        StateServiceOuterClass.GetCoinInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCoinInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StateServiceOuterClass.GetBalanceResponse> getBalance(
        StateServiceOuterClass.GetBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StateServiceOuterClass.ListBalancesResponse> listBalances(
        StateServiceOuterClass.ListBalancesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBalancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DYNAMIC_FIELDS = 0;
  private static final int METHODID_LIST_OWNED_OBJECTS = 1;
  private static final int METHODID_GET_COIN_INFO = 2;
  private static final int METHODID_GET_BALANCE = 3;
  private static final int METHODID_LIST_BALANCES = 4;

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
        case METHODID_LIST_DYNAMIC_FIELDS:
          serviceImpl.listDynamicFields((StateServiceOuterClass.ListDynamicFieldsRequest) request,
              (io.grpc.stub.StreamObserver<StateServiceOuterClass.ListDynamicFieldsResponse>) responseObserver);
          break;
        case METHODID_LIST_OWNED_OBJECTS:
          serviceImpl.listOwnedObjects((StateServiceOuterClass.ListOwnedObjectsRequest) request,
              (io.grpc.stub.StreamObserver<StateServiceOuterClass.ListOwnedObjectsResponse>) responseObserver);
          break;
        case METHODID_GET_COIN_INFO:
          serviceImpl.getCoinInfo((StateServiceOuterClass.GetCoinInfoRequest) request,
              (io.grpc.stub.StreamObserver<StateServiceOuterClass.GetCoinInfoResponse>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((StateServiceOuterClass.GetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<StateServiceOuterClass.GetBalanceResponse>) responseObserver);
          break;
        case METHODID_LIST_BALANCES:
          serviceImpl.listBalances((StateServiceOuterClass.ListBalancesRequest) request,
              (io.grpc.stub.StreamObserver<StateServiceOuterClass.ListBalancesResponse>) responseObserver);
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
          getListDynamicFieldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              StateServiceOuterClass.ListDynamicFieldsRequest,
              StateServiceOuterClass.ListDynamicFieldsResponse>(
                service, METHODID_LIST_DYNAMIC_FIELDS)))
        .addMethod(
          getListOwnedObjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              StateServiceOuterClass.ListOwnedObjectsRequest,
              StateServiceOuterClass.ListOwnedObjectsResponse>(
                service, METHODID_LIST_OWNED_OBJECTS)))
        .addMethod(
          getGetCoinInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              StateServiceOuterClass.GetCoinInfoRequest,
              StateServiceOuterClass.GetCoinInfoResponse>(
                service, METHODID_GET_COIN_INFO)))
        .addMethod(
          getGetBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              StateServiceOuterClass.GetBalanceRequest,
              StateServiceOuterClass.GetBalanceResponse>(
                service, METHODID_GET_BALANCE)))
        .addMethod(
          getListBalancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              StateServiceOuterClass.ListBalancesRequest,
              StateServiceOuterClass.ListBalancesResponse>(
                service, METHODID_LIST_BALANCES)))
        .build();
  }

  private static abstract class StateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StateServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return StateServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StateService");
    }
  }

  private static final class StateServiceFileDescriptorSupplier
      extends StateServiceBaseDescriptorSupplier {
    StateServiceFileDescriptorSupplier() {}
  }

  private static final class StateServiceMethodDescriptorSupplier
      extends StateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StateServiceFileDescriptorSupplier())
              .addMethod(getListDynamicFieldsMethod())
              .addMethod(getListOwnedObjectsMethod())
              .addMethod(getGetCoinInfoMethod())
              .addMethod(getGetBalanceMethod())
              .addMethod(getListBalancesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
