// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface LinkResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.LinkResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string linkPath = 1;</code>
   * @return The linkPath.
   */
  java.lang.String getLinkPath();
  /**
   * <code>string linkPath = 1;</code>
   * @return The bytes for linkPath.
   */
  com.google.protobuf.ByteString
      getLinkPathBytes();

  /**
   * <code>string error = 2;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 2;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <code>.org.opendedup.grpc.errorCodes errorCode = 3;</code>
   * @return The errorCode.
   */
  org.opendedup.grpc.errorCodes getErrorCode();
}
