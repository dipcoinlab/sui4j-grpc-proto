package sui.rpc.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: sui/rpc/v2/signature_verification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SignatureVerificationServiceGrpc {

  private SignatureVerificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sui.rpc.v2.SignatureVerificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest,
      sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> getVerifySignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifySignature",
      requestType = sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest.class,
      responseType = sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest,
      sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> getVerifySignatureMethod() {
    io.grpc.MethodDescriptor<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest, sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> getVerifySignatureMethod;
    if ((getVerifySignatureMethod = SignatureVerificationServiceGrpc.getVerifySignatureMethod) == null) {
      synchronized (SignatureVerificationServiceGrpc.class) {
        if ((getVerifySignatureMethod = SignatureVerificationServiceGrpc.getVerifySignatureMethod) == null) {
          SignatureVerificationServiceGrpc.getVerifySignatureMethod = getVerifySignatureMethod =
              io.grpc.MethodDescriptor.<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest, sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifySignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SignatureVerificationServiceMethodDescriptorSupplier("VerifySignature"))
              .build();
        }
      }
    }
    return getVerifySignatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignatureVerificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceStub>() {
        @java.lang.Override
        public SignatureVerificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureVerificationServiceStub(channel, callOptions);
        }
      };
    return SignatureVerificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignatureVerificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceBlockingStub>() {
        @java.lang.Override
        public SignatureVerificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureVerificationServiceBlockingStub(channel, callOptions);
        }
      };
    return SignatureVerificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignatureVerificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SignatureVerificationServiceFutureStub>() {
        @java.lang.Override
        public SignatureVerificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SignatureVerificationServiceFutureStub(channel, callOptions);
        }
      };
    return SignatureVerificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Perform signature verification of a UserSignature against the provided message.
     * </pre>
     */
    default void verifySignature(sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifySignatureMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SignatureVerificationService.
   */
  public static abstract class SignatureVerificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SignatureVerificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SignatureVerificationService.
   */
  public static final class SignatureVerificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SignatureVerificationServiceStub> {
    private SignatureVerificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureVerificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureVerificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Perform signature verification of a UserSignature against the provided message.
     * </pre>
     */
    public void verifySignature(sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest request,
        io.grpc.stub.StreamObserver<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifySignatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SignatureVerificationService.
   */
  public static final class SignatureVerificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SignatureVerificationServiceBlockingStub> {
    private SignatureVerificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureVerificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureVerificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Perform signature verification of a UserSignature against the provided message.
     * </pre>
     */
    public sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse verifySignature(sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifySignatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SignatureVerificationService.
   */
  public static final class SignatureVerificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SignatureVerificationServiceFutureStub> {
    private SignatureVerificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignatureVerificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SignatureVerificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Perform signature verification of a UserSignature against the provided message.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse> verifySignature(
        sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifySignatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFY_SIGNATURE = 0;

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
        case METHODID_VERIFY_SIGNATURE:
          serviceImpl.verifySignature((sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest) request,
              (io.grpc.stub.StreamObserver<sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse>) responseObserver);
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
          getVerifySignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureRequest,
              sui.rpc.v2.SignatureVerificationServiceOuterClass.VerifySignatureResponse>(
                service, METHODID_VERIFY_SIGNATURE)))
        .build();
  }

  private static abstract class SignatureVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignatureVerificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sui.rpc.v2.SignatureVerificationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SignatureVerificationService");
    }
  }

  private static final class SignatureVerificationServiceFileDescriptorSupplier
      extends SignatureVerificationServiceBaseDescriptorSupplier {
    SignatureVerificationServiceFileDescriptorSupplier() {}
  }

  private static final class SignatureVerificationServiceMethodDescriptorSupplier
      extends SignatureVerificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SignatureVerificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SignatureVerificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignatureVerificationServiceFileDescriptorSupplier())
              .addMethod(getVerifySignatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
