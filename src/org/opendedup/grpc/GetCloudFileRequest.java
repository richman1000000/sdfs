// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.GetCloudFileRequest}
 */
public final class GetCloudFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.GetCloudFileRequest)
    GetCloudFileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCloudFileRequest.newBuilder() to construct.
  private GetCloudFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCloudFileRequest() {
    file_ = "";
    dstfile_ = "";
    changeid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCloudFileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCloudFileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            file_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dstfile_ = s;
            break;
          }
          case 24: {

            overwrite_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            changeid_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.GetCloudFileRequest.class, org.opendedup.grpc.GetCloudFileRequest.Builder.class);
  }

  public static final int FILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object file_;
  /**
   * <code>string file = 1;</code>
   * @return The file.
   */
  @java.lang.Override
  public java.lang.String getFile() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      file_ = s;
      return s;
    }
  }
  /**
   * <code>string file = 1;</code>
   * @return The bytes for file.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileBytes() {
    java.lang.Object ref = file_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      file_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DSTFILE_FIELD_NUMBER = 2;
  private volatile java.lang.Object dstfile_;
  /**
   * <code>string dstfile = 2;</code>
   * @return The dstfile.
   */
  @java.lang.Override
  public java.lang.String getDstfile() {
    java.lang.Object ref = dstfile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dstfile_ = s;
      return s;
    }
  }
  /**
   * <code>string dstfile = 2;</code>
   * @return The bytes for dstfile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDstfileBytes() {
    java.lang.Object ref = dstfile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dstfile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OVERWRITE_FIELD_NUMBER = 3;
  private boolean overwrite_;
  /**
   * <code>bool overwrite = 3;</code>
   * @return The overwrite.
   */
  @java.lang.Override
  public boolean getOverwrite() {
    return overwrite_;
  }

  public static final int CHANGEID_FIELD_NUMBER = 4;
  private volatile java.lang.Object changeid_;
  /**
   * <code>string changeid = 4;</code>
   * @return The changeid.
   */
  @java.lang.Override
  public java.lang.String getChangeid() {
    java.lang.Object ref = changeid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      changeid_ = s;
      return s;
    }
  }
  /**
   * <code>string changeid = 4;</code>
   * @return The bytes for changeid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChangeidBytes() {
    java.lang.Object ref = changeid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      changeid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, file_);
    }
    if (!getDstfileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dstfile_);
    }
    if (overwrite_ != false) {
      output.writeBool(3, overwrite_);
    }
    if (!getChangeidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, changeid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, file_);
    }
    if (!getDstfileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dstfile_);
    }
    if (overwrite_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, overwrite_);
    }
    if (!getChangeidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, changeid_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.opendedup.grpc.GetCloudFileRequest)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.GetCloudFileRequest other = (org.opendedup.grpc.GetCloudFileRequest) obj;

    if (!getFile()
        .equals(other.getFile())) return false;
    if (!getDstfile()
        .equals(other.getDstfile())) return false;
    if (getOverwrite()
        != other.getOverwrite()) return false;
    if (!getChangeid()
        .equals(other.getChangeid())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FILE_FIELD_NUMBER;
    hash = (53 * hash) + getFile().hashCode();
    hash = (37 * hash) + DSTFILE_FIELD_NUMBER;
    hash = (53 * hash) + getDstfile().hashCode();
    hash = (37 * hash) + OVERWRITE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOverwrite());
    hash = (37 * hash) + CHANGEID_FIELD_NUMBER;
    hash = (53 * hash) + getChangeid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.GetCloudFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.opendedup.grpc.GetCloudFileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.opendedup.grpc.GetCloudFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.GetCloudFileRequest)
      org.opendedup.grpc.GetCloudFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.GetCloudFileRequest.class, org.opendedup.grpc.GetCloudFileRequest.Builder.class);
    }

    // Construct using org.opendedup.grpc.GetCloudFileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      file_ = "";

      dstfile_ = "";

      overwrite_ = false;

      changeid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_GetCloudFileRequest_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileRequest getDefaultInstanceForType() {
      return org.opendedup.grpc.GetCloudFileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileRequest build() {
      org.opendedup.grpc.GetCloudFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.GetCloudFileRequest buildPartial() {
      org.opendedup.grpc.GetCloudFileRequest result = new org.opendedup.grpc.GetCloudFileRequest(this);
      result.file_ = file_;
      result.dstfile_ = dstfile_;
      result.overwrite_ = overwrite_;
      result.changeid_ = changeid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.opendedup.grpc.GetCloudFileRequest) {
        return mergeFrom((org.opendedup.grpc.GetCloudFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.GetCloudFileRequest other) {
      if (other == org.opendedup.grpc.GetCloudFileRequest.getDefaultInstance()) return this;
      if (!other.getFile().isEmpty()) {
        file_ = other.file_;
        onChanged();
      }
      if (!other.getDstfile().isEmpty()) {
        dstfile_ = other.dstfile_;
        onChanged();
      }
      if (other.getOverwrite() != false) {
        setOverwrite(other.getOverwrite());
      }
      if (!other.getChangeid().isEmpty()) {
        changeid_ = other.changeid_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.opendedup.grpc.GetCloudFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.GetCloudFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object file_ = "";
    /**
     * <code>string file = 1;</code>
     * @return The file.
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        file_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file = 1;</code>
     * @return The bytes for file.
     */
    public com.google.protobuf.ByteString
        getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file = 1;</code>
     * @param value The file to set.
     * @return This builder for chaining.
     */
    public Builder setFile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      file_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string file = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFile() {
      
      file_ = getDefaultInstance().getFile();
      onChanged();
      return this;
    }
    /**
     * <code>string file = 1;</code>
     * @param value The bytes for file to set.
     * @return This builder for chaining.
     */
    public Builder setFileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      file_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dstfile_ = "";
    /**
     * <code>string dstfile = 2;</code>
     * @return The dstfile.
     */
    public java.lang.String getDstfile() {
      java.lang.Object ref = dstfile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dstfile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dstfile = 2;</code>
     * @return The bytes for dstfile.
     */
    public com.google.protobuf.ByteString
        getDstfileBytes() {
      java.lang.Object ref = dstfile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dstfile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dstfile = 2;</code>
     * @param value The dstfile to set.
     * @return This builder for chaining.
     */
    public Builder setDstfile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dstfile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dstfile = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDstfile() {
      
      dstfile_ = getDefaultInstance().getDstfile();
      onChanged();
      return this;
    }
    /**
     * <code>string dstfile = 2;</code>
     * @param value The bytes for dstfile to set.
     * @return This builder for chaining.
     */
    public Builder setDstfileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dstfile_ = value;
      onChanged();
      return this;
    }

    private boolean overwrite_ ;
    /**
     * <code>bool overwrite = 3;</code>
     * @return The overwrite.
     */
    @java.lang.Override
    public boolean getOverwrite() {
      return overwrite_;
    }
    /**
     * <code>bool overwrite = 3;</code>
     * @param value The overwrite to set.
     * @return This builder for chaining.
     */
    public Builder setOverwrite(boolean value) {
      
      overwrite_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool overwrite = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOverwrite() {
      
      overwrite_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object changeid_ = "";
    /**
     * <code>string changeid = 4;</code>
     * @return The changeid.
     */
    public java.lang.String getChangeid() {
      java.lang.Object ref = changeid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        changeid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string changeid = 4;</code>
     * @return The bytes for changeid.
     */
    public com.google.protobuf.ByteString
        getChangeidBytes() {
      java.lang.Object ref = changeid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        changeid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string changeid = 4;</code>
     * @param value The changeid to set.
     * @return This builder for chaining.
     */
    public Builder setChangeid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      changeid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string changeid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearChangeid() {
      
      changeid_ = getDefaultInstance().getChangeid();
      onChanged();
      return this;
    }
    /**
     * <code>string changeid = 4;</code>
     * @param value The bytes for changeid to set.
     * @return This builder for chaining.
     */
    public Builder setChangeidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      changeid_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.GetCloudFileRequest)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.GetCloudFileRequest)
  private static final org.opendedup.grpc.GetCloudFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.GetCloudFileRequest();
  }

  public static org.opendedup.grpc.GetCloudFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCloudFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCloudFileRequest>() {
    @java.lang.Override
    public GetCloudFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCloudFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCloudFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCloudFileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.GetCloudFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

