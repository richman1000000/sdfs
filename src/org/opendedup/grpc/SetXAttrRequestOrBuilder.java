// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

public interface SetXAttrRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.opendedup.grpc.SetXAttrRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string attr = 1;</code>
   * @return The attr.
   */
  java.lang.String getAttr();
  /**
   * <code>string attr = 1;</code>
   * @return The bytes for attr.
   */
  com.google.protobuf.ByteString
      getAttrBytes();

  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string path = 3;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();
}
