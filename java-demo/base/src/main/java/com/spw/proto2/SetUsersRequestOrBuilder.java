// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.spw.proto2;

public interface SetUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trojan.api.SetUsersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.trojan.api.UserStatus status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>.trojan.api.UserStatus status = 1;</code>
   */
  com.spw.proto2.UserStatus getStatus();
  /**
   * <code>.trojan.api.UserStatus status = 1;</code>
   */
  com.spw.proto2.UserStatusOrBuilder getStatusOrBuilder();

  /**
   * <code>.trojan.api.SetUsersRequest.Operation operation = 2;</code>
   */
  int getOperationValue();
  /**
   * <code>.trojan.api.SetUsersRequest.Operation operation = 2;</code>
   */
  com.spw.proto2.SetUsersRequest.Operation getOperation();
}
