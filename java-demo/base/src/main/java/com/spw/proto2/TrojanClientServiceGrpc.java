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
public final class TrojanClientServiceGrpc {

  private TrojanClientServiceGrpc() {}

  public static final String SERVICE_NAME = "trojan.api.TrojanClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.spw.proto2.GetTrafficRequest,
      com.spw.proto2.GetTrafficResponse> getGetTrafficMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTraffic",
      requestType = com.spw.proto2.GetTrafficRequest.class,
      responseType = com.spw.proto2.GetTrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.spw.proto2.GetTrafficRequest,
      com.spw.proto2.GetTrafficResponse> getGetTrafficMethod() {
    io.grpc.MethodDescriptor<com.spw.proto2.GetTrafficRequest, com.spw.proto2.GetTrafficResponse> getGetTrafficMethod;
    if ((getGetTrafficMethod = TrojanClientServiceGrpc.getGetTrafficMethod) == null) {
      synchronized (TrojanClientServiceGrpc.class) {
        if ((getGetTrafficMethod = TrojanClientServiceGrpc.getGetTrafficMethod) == null) {
          TrojanClientServiceGrpc.getGetTrafficMethod = getGetTrafficMethod = 
              io.grpc.MethodDescriptor.<com.spw.proto2.GetTrafficRequest, com.spw.proto2.GetTrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "trojan.api.TrojanClientService", "GetTraffic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.GetTrafficRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.spw.proto2.GetTrafficResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrojanClientServiceMethodDescriptorSupplier("GetTraffic"))
                  .build();
          }
        }
     }
     return getGetTrafficMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrojanClientServiceStub newStub(io.grpc.Channel channel) {
    return new TrojanClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrojanClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrojanClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrojanClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrojanClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrojanClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTraffic(com.spw.proto2.GetTrafficRequest request,
        io.grpc.stub.StreamObserver<com.spw.proto2.GetTrafficResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTrafficMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTrafficMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.spw.proto2.GetTrafficRequest,
                com.spw.proto2.GetTrafficResponse>(
                  this, METHODID_GET_TRAFFIC)))
          .build();
    }
  }

  /**
   */
  public static final class TrojanClientServiceStub extends io.grpc.stub.AbstractStub<TrojanClientServiceStub> {
    private TrojanClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTraffic(com.spw.proto2.GetTrafficRequest request,
        io.grpc.stub.StreamObserver<com.spw.proto2.GetTrafficResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTrafficMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrojanClientServiceBlockingStub extends io.grpc.stub.AbstractStub<TrojanClientServiceBlockingStub> {
    private TrojanClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.spw.proto2.GetTrafficResponse getTraffic(com.spw.proto2.GetTrafficRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTrafficMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrojanClientServiceFutureStub extends io.grpc.stub.AbstractStub<TrojanClientServiceFutureStub> {
    private TrojanClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrojanClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrojanClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrojanClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.spw.proto2.GetTrafficResponse> getTraffic(
        com.spw.proto2.GetTrafficRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTrafficMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRAFFIC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrojanClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrojanClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRAFFIC:
          serviceImpl.getTraffic((com.spw.proto2.GetTrafficRequest) request,
              (io.grpc.stub.StreamObserver<com.spw.proto2.GetTrafficResponse>) responseObserver);
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

  private static abstract class TrojanClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrojanClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.spw.proto2.HelloWorldProto2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrojanClientService");
    }
  }

  private static final class TrojanClientServiceFileDescriptorSupplier
      extends TrojanClientServiceBaseDescriptorSupplier {
    TrojanClientServiceFileDescriptorSupplier() {}
  }

  private static final class TrojanClientServiceMethodDescriptorSupplier
      extends TrojanClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrojanClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrojanClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrojanClientServiceFileDescriptorSupplier())
              .addMethod(getGetTrafficMethod())
              .build();
        }
      }
    }
    return result;
  }
}
