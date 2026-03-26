package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/move_package_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovePackageServiceGrpc {

  private MovePackageServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sui.rpc.v2.MovePackageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> getGetPackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPackage",
      requestType = sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest.class,
      responseType = sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> getGetPackageMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> getGetPackageMethod;
    if ((getGetPackageMethod = MovePackageServiceGrpc.getGetPackageMethod) == null) {
      synchronized (MovePackageServiceGrpc.class) {
        if ((getGetPackageMethod = MovePackageServiceGrpc.getGetPackageMethod) == null) {
          MovePackageServiceGrpc.getGetPackageMethod = getGetPackageMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovePackageServiceMethodDescriptorSupplier("GetPackage"))
              .build();
        }
      }
    }
    return getGetPackageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> getGetDatatypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatatype",
      requestType = sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest.class,
      responseType = sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> getGetDatatypeMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> getGetDatatypeMethod;
    if ((getGetDatatypeMethod = MovePackageServiceGrpc.getGetDatatypeMethod) == null) {
      synchronized (MovePackageServiceGrpc.class) {
        if ((getGetDatatypeMethod = MovePackageServiceGrpc.getGetDatatypeMethod) == null) {
          MovePackageServiceGrpc.getGetDatatypeMethod = getGetDatatypeMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDatatype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovePackageServiceMethodDescriptorSupplier("GetDatatype"))
              .build();
        }
      }
    }
    return getGetDatatypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> getGetFunctionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFunction",
      requestType = sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest.class,
      responseType = sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> getGetFunctionMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> getGetFunctionMethod;
    if ((getGetFunctionMethod = MovePackageServiceGrpc.getGetFunctionMethod) == null) {
      synchronized (MovePackageServiceGrpc.class) {
        if ((getGetFunctionMethod = MovePackageServiceGrpc.getGetFunctionMethod) == null) {
          MovePackageServiceGrpc.getGetFunctionMethod = getGetFunctionMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest, sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFunction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovePackageServiceMethodDescriptorSupplier("GetFunction"))
              .build();
        }
      }
    }
    return getGetFunctionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> getListPackageVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPackageVersions",
      requestType = sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest.class,
      responseType = sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest,
      sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> getListPackageVersionsMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest, sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> getListPackageVersionsMethod;
    if ((getListPackageVersionsMethod = MovePackageServiceGrpc.getListPackageVersionsMethod) == null) {
      synchronized (MovePackageServiceGrpc.class) {
        if ((getListPackageVersionsMethod = MovePackageServiceGrpc.getListPackageVersionsMethod) == null) {
          MovePackageServiceGrpc.getListPackageVersionsMethod = getListPackageVersionsMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest, sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPackageVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovePackageServiceMethodDescriptorSupplier("ListPackageVersions"))
              .build();
        }
      }
    }
    return getListPackageVersionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovePackageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceStub>() {
        @java.lang.Override
        public MovePackageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovePackageServiceStub(channel, callOptions);
        }
      };
    return MovePackageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovePackageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceBlockingStub>() {
        @java.lang.Override
        public MovePackageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovePackageServiceBlockingStub(channel, callOptions);
        }
      };
    return MovePackageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovePackageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovePackageServiceFutureStub>() {
        @java.lang.Override
        public MovePackageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovePackageServiceFutureStub(channel, callOptions);
        }
      };
    return MovePackageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPackage(sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackageMethod(), responseObserver);
    }

    /**
     */
    default void getDatatype(sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDatatypeMethod(), responseObserver);
    }

    /**
     */
    default void getFunction(sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFunctionMethod(), responseObserver);
    }

    /**
     */
    default void listPackageVersions(sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPackageVersionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovePackageService.
   */
  public static abstract class MovePackageServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovePackageServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovePackageService.
   */
  public static final class MovePackageServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovePackageServiceStub> {
    private MovePackageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovePackageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovePackageServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPackage(sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDatatype(sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDatatypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFunction(sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFunctionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPackageVersions(sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPackageVersionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovePackageService.
   */
  public static final class MovePackageServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovePackageServiceBlockingStub> {
    private MovePackageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovePackageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovePackageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse getPackage(sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackageMethod(), getCallOptions(), request);
    }

    /**
     */
    public sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse getDatatype(sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDatatypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse getFunction(sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFunctionMethod(), getCallOptions(), request);
    }

    /**
     */
    public sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse listPackageVersions(sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPackageVersionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovePackageService.
   */
  public static final class MovePackageServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovePackageServiceFutureStub> {
    private MovePackageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovePackageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovePackageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse> getPackage(
        sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse> getDatatype(
        sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDatatypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse> getFunction(
        sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFunctionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse> listPackageVersions(
        sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPackageVersionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PACKAGE = 0;
  private static final int METHODID_GET_DATATYPE = 1;
  private static final int METHODID_GET_FUNCTION = 2;
  private static final int METHODID_LIST_PACKAGE_VERSIONS = 3;

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
        case METHODID_GET_PACKAGE:
          serviceImpl.getPackage((sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse>) responseObserver);
          break;
        case METHODID_GET_DATATYPE:
          serviceImpl.getDatatype((sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse>) responseObserver);
          break;
        case METHODID_GET_FUNCTION:
          serviceImpl.getFunction((sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse>) responseObserver);
          break;
        case METHODID_LIST_PACKAGE_VERSIONS:
          serviceImpl.listPackageVersions((sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse>) responseObserver);
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
          getGetPackageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.MovePackageServiceOuterClass.GetPackageRequest,
              sui.rpc.v2.MovePackageServiceOuterClass.GetPackageResponse>(
                service, METHODID_GET_PACKAGE)))
        .addMethod(
          getGetDatatypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeRequest,
              sui.rpc.v2.MovePackageServiceOuterClass.GetDatatypeResponse>(
                service, METHODID_GET_DATATYPE)))
        .addMethod(
          getGetFunctionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionRequest,
              sui.rpc.v2.MovePackageServiceOuterClass.GetFunctionResponse>(
                service, METHODID_GET_FUNCTION)))
        .addMethod(
          getListPackageVersionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsRequest,
              sui.rpc.v2.MovePackageServiceOuterClass.ListPackageVersionsResponse>(
                service, METHODID_LIST_PACKAGE_VERSIONS)))
        .build();
  }

  private static abstract class MovePackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovePackageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sui.rpc.v2.MovePackageServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovePackageService");
    }
  }

  private static final class MovePackageServiceFileDescriptorSupplier
      extends MovePackageServiceBaseDescriptorSupplier {
    MovePackageServiceFileDescriptorSupplier() {}
  }

  private static final class MovePackageServiceMethodDescriptorSupplier
      extends MovePackageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MovePackageServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MovePackageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovePackageServiceFileDescriptorSupplier())
              .addMethod(getGetPackageMethod())
              .addMethod(getGetDatatypeMethod())
              .addMethod(getGetFunctionMethod())
              .addMethod(getListPackageVersionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
