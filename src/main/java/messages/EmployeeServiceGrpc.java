package messages;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: messages.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetByBadgeNumberRequest,
      com.grpc.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByBadgeNumber",
      requestType = com.grpc.messages.Messages.GetByBadgeNumberRequest.class,
      responseType = com.grpc.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetByBadgeNumberRequest,
      com.grpc.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod() {
    io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetByBadgeNumberRequest, com.grpc.messages.Messages.EmployeeResponse> getGetByBadgeNumberMethod;
    if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetByBadgeNumberMethod = EmployeeServiceGrpc.getGetByBadgeNumberMethod) == null) {
          EmployeeServiceGrpc.getGetByBadgeNumberMethod = getGetByBadgeNumberMethod =
              io.grpc.MethodDescriptor.<com.grpc.messages.Messages.GetByBadgeNumberRequest, com.grpc.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetByBadgeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.GetByBadgeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetByBadgeNumber"))
                  .build();
          }
        }
     }
     return getGetByBadgeNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetAllRequest,
      com.grpc.messages.Messages.EmployeeResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAll",
      requestType = com.grpc.messages.Messages.GetAllRequest.class,
      responseType = com.grpc.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetAllRequest,
      com.grpc.messages.Messages.EmployeeResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.grpc.messages.Messages.GetAllRequest, com.grpc.messages.Messages.EmployeeResponse> getGetAllMethod;
    if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllMethod = EmployeeServiceGrpc.getGetAllMethod) == null) {
          EmployeeServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.grpc.messages.Messages.GetAllRequest, com.grpc.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetAll"))
                  .build();
          }
        }
     }
     return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest,
      com.grpc.messages.Messages.EmployeeResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Save",
      requestType = com.grpc.messages.Messages.EmployeeRequest.class,
      responseType = com.grpc.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest,
      com.grpc.messages.Messages.EmployeeResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest, com.grpc.messages.Messages.EmployeeResponse> getSaveMethod;
    if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveMethod = EmployeeServiceGrpc.getSaveMethod) == null) {
          EmployeeServiceGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<com.grpc.messages.Messages.EmployeeRequest, com.grpc.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "Save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("Save"))
                  .build();
          }
        }
     }
     return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest,
      com.grpc.messages.Messages.EmployeeResponse> getSaveAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAll",
      requestType = com.grpc.messages.Messages.EmployeeRequest.class,
      responseType = com.grpc.messages.Messages.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest,
      com.grpc.messages.Messages.EmployeeResponse> getSaveAllMethod() {
    io.grpc.MethodDescriptor<com.grpc.messages.Messages.EmployeeRequest, com.grpc.messages.Messages.EmployeeResponse> getSaveAllMethod;
    if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getSaveAllMethod = EmployeeServiceGrpc.getSaveAllMethod) == null) {
          EmployeeServiceGrpc.getSaveAllMethod = getSaveAllMethod =
              io.grpc.MethodDescriptor.<com.grpc.messages.Messages.EmployeeRequest, com.grpc.messages.Messages.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "SaveAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("SaveAll"))
                  .build();
          }
        }
     }
     return getSaveAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.messages.Messages.AddPhotoRequest,
      com.grpc.messages.Messages.AddPhotoResponse> getAddPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPhoto",
      requestType = com.grpc.messages.Messages.AddPhotoRequest.class,
      responseType = com.grpc.messages.Messages.AddPhotoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpc.messages.Messages.AddPhotoRequest,
      com.grpc.messages.Messages.AddPhotoResponse> getAddPhotoMethod() {
    io.grpc.MethodDescriptor<com.grpc.messages.Messages.AddPhotoRequest, com.grpc.messages.Messages.AddPhotoResponse> getAddPhotoMethod;
    if ((getAddPhotoMethod = EmployeeServiceGrpc.getAddPhotoMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getAddPhotoMethod = EmployeeServiceGrpc.getAddPhotoMethod) == null) {
          EmployeeServiceGrpc.getAddPhotoMethod = getAddPhotoMethod =
              io.grpc.MethodDescriptor.<com.grpc.messages.Messages.AddPhotoRequest, com.grpc.messages.Messages.AddPhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "AddPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.AddPhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.messages.Messages.AddPhotoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("AddPhoto"))
                  .build();
          }
        }
     }
     return getAddPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getByBadgeNumber(com.grpc.messages.Messages.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByBadgeNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.grpc.messages.Messages.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void save(com.grpc.messages.Messages.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSaveAllMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.messages.Messages.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.AddPhotoResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddPhotoMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetByBadgeNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.messages.Messages.GetByBadgeNumberRequest,
                com.grpc.messages.Messages.EmployeeResponse>(
                  this, METHODID_GET_BY_BADGE_NUMBER)))
          .addMethod(
            getGetAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.grpc.messages.Messages.GetAllRequest,
                com.grpc.messages.Messages.EmployeeResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.messages.Messages.EmployeeRequest,
                com.grpc.messages.Messages.EmployeeResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getSaveAllMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.grpc.messages.Messages.EmployeeRequest,
                com.grpc.messages.Messages.EmployeeResponse>(
                  this, METHODID_SAVE_ALL)))
          .addMethod(
            getAddPhotoMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.grpc.messages.Messages.AddPhotoRequest,
                com.grpc.messages.Messages.AddPhotoResponse>(
                  this, METHODID_ADD_PHOTO)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getByBadgeNumber(com.grpc.messages.Messages.GetByBadgeNumberRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.grpc.messages.Messages.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(com.grpc.messages.Messages.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeRequest> saveAll(
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSaveAllMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.grpc.messages.Messages.AddPhotoRequest> addPhoto(
        io.grpc.stub.StreamObserver<com.grpc.messages.Messages.AddPhotoResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddPhotoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.messages.Messages.EmployeeResponse getByBadgeNumber(com.grpc.messages.Messages.GetByBadgeNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByBadgeNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.grpc.messages.Messages.EmployeeResponse> getAll(
        com.grpc.messages.Messages.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.messages.Messages.EmployeeResponse save(com.grpc.messages.Messages.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.messages.Messages.EmployeeResponse> getByBadgeNumber(
        com.grpc.messages.Messages.GetByBadgeNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByBadgeNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.messages.Messages.EmployeeResponse> save(
        com.grpc.messages.Messages.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_BADGE_NUMBER = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_SAVE = 2;
  private static final int METHODID_SAVE_ALL = 3;
  private static final int METHODID_ADD_PHOTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_BADGE_NUMBER:
          serviceImpl.getByBadgeNumber((com.grpc.messages.Messages.GetByBadgeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.grpc.messages.Messages.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((com.grpc.messages.Messages.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse>) responseObserver);
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
        case METHODID_SAVE_ALL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.saveAll(
              (io.grpc.stub.StreamObserver<com.grpc.messages.Messages.EmployeeResponse>) responseObserver);
        case METHODID_ADD_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addPhoto(
              (io.grpc.stub.StreamObserver<com.grpc.messages.Messages.AddPhotoResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.messages.Messages.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetByBadgeNumberMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getSaveMethod())
              .addMethod(getSaveAllMethod())
              .addMethod(getAddPhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
