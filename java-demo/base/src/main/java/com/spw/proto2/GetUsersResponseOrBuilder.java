// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.spw.proto2;

public interface GetUsersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trojan.api.GetUsersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool success = 1;</code>
   */
  boolean getSuccess();

  /**
   * <code>string info = 2;</code>
   */
  java.lang.String getInfo();
  /**
   * <code>string info = 2;</code>
   */
  com.google.protobuf.ByteString
      getInfoBytes();

  /**
   * <code>.trojan.api.UserStatus status = 3;</code>
   */
  boolean hasStatus();
  /**
   * <code>.trojan.api.UserStatus status = 3;</code>
   */
  com.spw.proto2.UserStatus getStatus();
  /**
   * <code>.trojan.api.UserStatus status = 3;</code>
   */
  com.spw.proto2.UserStatusOrBuilder getStatusOrBuilder();
}