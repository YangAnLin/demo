// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.spw.proto;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\005proto\"\037\n\014HelloRequest\022\017\n\007" +
      "request\030\001 \001(\t\"!\n\rHelloResponse\022\020\n\010respon" +
      "se\030\001 \001(\t2\257\002\n\014HelloService\0229\n\nHelloWorld\022" +
      "\023.proto.HelloRequest\032\024.proto.HelloRespon" +
      "se\"\000\022G\n\026HelloWorldServerStream\022\023.proto.H" +
      "elloRequest\032\024.proto.HelloResponse\"\0000\001\022G\n" +
      "\026HelloWorldClientStream\022\023.proto.HelloReq" +
      "uest\032\024.proto.HelloResponse\"\000(\001\022R\n\037HelloW" +
      "orldClientAndServerStream\022\023.proto.HelloR" +
      "equest\032\024.proto.HelloResponse\"\000(\0010\001B%\n\rco" +
      "m.spw.protoB\017HelloWorldProtoP\001\210\001\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_HelloRequest_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_proto_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_HelloResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
