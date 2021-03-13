package com.spw.proto2;

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
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api.proto")
public final class TrojanServerServiceGrpc {

  private TrojanServerServiceGrpc() {}

  public static final String SERVICE_NAME = "trojan.api.TrojanServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.spw.proto2.ListUsersRequest,
      com.spw.proto2.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.spw.proto2.ListUsersRequest.class,
      responseType = com.spw.proto2.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.spw.proto2.ListUsersRequest,
      com.spw.proto2.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.spw.proto2.ListUsersRequest, com.spw.proto2.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = TrojanServerServiceGrpc.getListUsersMethod) == null) {
      synchronized (TrojanServerServiceGrpc.class) {
        if ((getListUsersMethod = TrojanServerServiceGrpc.getListUsersMethod) == null) {
          TrojanServerServiceGrpc.getListUsersMethod = getListUsersMethod = 
              io.grpc.MethodDescriptor.<com.spw.proto2.ListUsersRequest, com.spw.proto2.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "trojan.api.TrojanServerService", "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.ListUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrojanServerServiceMethodDescriptorSupplier("ListUsers"))
                  .build();
          }
        }
     }
     return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.spw.proto2.GetUsersRequest,
      com.spw.proto2.GetUsersResponse> getGetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsers",
      requestType = com.spw.proto2.GetUsersRequest.class,
      responseType = com.spw.proto2.GetUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.spw.proto2.GetUsersRequest,
      com.spw.proto2.GetUsersResponse> getGetUsersMethod() {
    io.grpc.MethodDescriptor<com.spw.proto2.GetUsersRequest, com.spw.proto2.GetUsersResponse> getGetUsersMethod;
    if ((getGetUsersMethod = TrojanServerServiceGrpc.getGetUsersMethod) == null) {
      synchronized (TrojanServerServiceGrpc.class) {
        if ((getGetUsersMethod = TrojanServerServiceGrpc.getGetUsersMethod) == null) {
          TrojanServerServiceGrpc.getGetUsersMethod = getGetUsersMethod = 
              io.grpc.MethodDescriptor.<com.spw.proto2.GetUsersRequest, com.spw.proto2.GetUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "trojan.api.TrojanServerService", "GetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.GetUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.GetUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrojanServerServiceMethodDescriptorSupplier("GetUsers"))
                  .build();
          }
        }
     }
     return getGetUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.spw.proto2.SetUsersRequest,
      com.spw.proto2.SetUsersResponse> getSetUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUsers",
      requestType = com.spw.proto2.SetUsersRequest.class,
      responseType = com.spw.proto2.SetUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.spw.proto2.SetUsersRequest,
      com.spw.proto2.SetUsersResponse> getSetUsersMethod() {
    io.grpc.MethodDescriptor<com.spw.proto2.SetUsersRequest, com.spw.proto2.SetUsersResponse> getSetUsersMethod;
    if ((getSetUsersMethod = TrojanServerServiceGrpc.getSetUsersMethod) == null) {
      synchronized (TrojanServerServiceGrpc.class) {
        if ((getSetUsersMethod = TrojanServerServiceGrpc.getSetUsersMethod) == null) {
          TrojanServerServiceGrpc.getSetUsersMethod = getSetUsersMethod = 
              io.grpc.MethodDescriptor.<com.spw.proto2.SetUsersRequest, com.spw.proto2.SetUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "trojan.api.TrojanServerService", "SetUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.SetUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.SetUsersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrojanServerServiceMethodDescriptorSupplier("SetUsers"))
                  .build();
          }
        }
     }
     return getSetUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrojanServerServiceStub newStub(io.grpc.Channel channel) {
    return new TrojanServerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrojanServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrojanServerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrojanServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrojanServerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrojanServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * list all users
     * </pre>
     */
    public void listUsers(com.spw.proto2.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.spw.proto2.ListUsersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * obtain specified user's info
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spw.proto2.GetUsersRequest> getUsers(
        io.grpc.stub.StreamObserver<com.spw.proto2.GetUsersResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * setup existing users' config
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spw.proto2.SetUsersRequest> setUsers(
        io.grpc.stub.StreamObserver<com.spw.proto2.SetUsersResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.spw.proto2.ListUsersRequest,
                com.spw.proto2.ListUsersResponse>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            getGetUsersMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.spw.proto2.GetUsersRequest,
                com.spw.proto2.GetUsersResponse>(
                  this, METHODID_GET_USERS)))
          .addMethod(
            getSetUsersMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.spw.proto2.SetUsersRequest,
                com.spw.proto2.SetUsersResponse>(
                  this, METHODID_SET_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class TrojanServerServiceStub extends io.grpc.stub.AbstractStub<TrojanServerServiceStub> {
    private TrojanServerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanServerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanServerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * list all users
     * </pre>
     */
    public void listUsers(com.spw.proto2.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.spw.proto2.ListUsersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * obtain specified user's info
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spw.proto2.GetUsersRequest> getUsers(
        io.grpc.stub.StreamObserver<com.spw.proto2.GetUsersResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetUsersMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * setup existing users' config
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.spw.proto2.SetUsersRequest> setUsers(
        io.grpc.stub.StreamObserver<com.spw.proto2.SetUsersResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSetUsersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TrojanServerServiceBlockingStub extends io.grpc.stub.AbstractStub<TrojanServerServiceBlockingStub> {
    private TrojanServerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanServerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanServerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * list all users
     * </pre>
     */
    public java.util.Iterator<com.spw.proto2.ListUsersResponse> listUsers(
        com.spw.proto2.ListUsersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrojanServerServiceFutureStub extends io.grpc.stub.AbstractStub<TrojanServerServiceFutureStub> {
    private TrojanServerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanServerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanServerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanServerServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIST_USERS = 0;
  private static final int METHODID_GET_USERS = 1;
  private static final int METHODID_SET_USERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrojanServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrojanServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.spw.proto2.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.spw.proto2.ListUsersResponse>) responseObserver);
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
        case METHODID_GET_USERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getUsers(
              (io.grpc.stub.StreamObserver<com.spw.proto2.GetUsersResponse>) responseObserver);
        case METHODID_SET_USERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setUsers(
              (io.grpc.stub.StreamObserver<com.spw.proto2.SetUsersResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrojanServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrojanServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.spw.proto2.HelloWorldProto2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrojanServerService");
    }
  }

  private static final class TrojanServerServiceFileDescriptorSupplier
      extends TrojanServerServiceBaseDescriptorSupplier {
    TrojanServerServiceFileDescriptorSupplier() {}
  }

  private static final class TrojanServerServiceMethodDescriptorSupplier
      extends TrojanServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrojanServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrojanServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrojanServerServiceFileDescriptorSupplier())
              .addMethod(getListUsersMethod())
              .addMethod(getGetUsersMethod())
              .addMethod(getSetUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
