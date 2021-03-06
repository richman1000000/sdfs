// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IOService.proto

package org.opendedup.grpc;

/**
 * Protobuf type {@code org.opendedup.grpc.StatFS}
 */
public  final class StatFS extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.opendedup.grpc.StatFS)
    StatFSOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StatFS.newBuilder() to construct.
  private StatFS(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StatFS() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StatFS();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StatFS(
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
          case 8: {

            bsize_ = input.readInt32();
            break;
          }
          case 16: {

            blocks_ = input.readInt64();
            break;
          }
          case 24: {

            bfree_ = input.readInt64();
            break;
          }
          case 32: {

            bavail_ = input.readInt64();
            break;
          }
          case 40: {

            files_ = input.readInt64();
            break;
          }
          case 48: {

            ffree_ = input.readInt64();
            break;
          }
          case 56: {

            fsid_ = input.readInt64();
            break;
          }
          case 64: {

            namelen_ = input.readInt32();
            break;
          }
          case 72: {

            frsize_ = input.readInt32();
            break;
          }
          case 80: {

            flags_ = input.readInt32();
            break;
          }
          case 88: {

            type_ = input.readInt32();
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
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_StatFS_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_StatFS_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.opendedup.grpc.StatFS.class, org.opendedup.grpc.StatFS.Builder.class);
  }

  public static final int BSIZE_FIELD_NUMBER = 1;
  private int bsize_;
  /**
   * <pre>
   * Optimal transfer block size 
   * </pre>
   *
   * <code>int32 bsize = 1;</code>
   * @return The bsize.
   */
  public int getBsize() {
    return bsize_;
  }

  public static final int BLOCKS_FIELD_NUMBER = 2;
  private long blocks_;
  /**
   * <pre>
   * Total data blocks in filesystem 
   * </pre>
   *
   * <code>int64 blocks = 2;</code>
   * @return The blocks.
   */
  public long getBlocks() {
    return blocks_;
  }

  public static final int BFREE_FIELD_NUMBER = 3;
  private long bfree_;
  /**
   * <pre>
   * Free blocks in filesystem 
   * </pre>
   *
   * <code>int64 bfree = 3;</code>
   * @return The bfree.
   */
  public long getBfree() {
    return bfree_;
  }

  public static final int BAVAIL_FIELD_NUMBER = 4;
  private long bavail_;
  /**
   * <pre>
   * Free blocks available to unprivileged user 
   * </pre>
   *
   * <code>int64 bavail = 4;</code>
   * @return The bavail.
   */
  public long getBavail() {
    return bavail_;
  }

  public static final int FILES_FIELD_NUMBER = 5;
  private long files_;
  /**
   * <pre>
   * Total inodes in filesystem 
   * </pre>
   *
   * <code>int64 files = 5;</code>
   * @return The files.
   */
  public long getFiles() {
    return files_;
  }

  public static final int FFREE_FIELD_NUMBER = 6;
  private long ffree_;
  /**
   * <pre>
   * Free inodes in filesystem 
   * </pre>
   *
   * <code>int64 ffree = 6;</code>
   * @return The ffree.
   */
  public long getFfree() {
    return ffree_;
  }

  public static final int FSID_FIELD_NUMBER = 7;
  private long fsid_;
  /**
   * <pre>
   * Filesystem ID 
   * </pre>
   *
   * <code>int64 fsid = 7;</code>
   * @return The fsid.
   */
  public long getFsid() {
    return fsid_;
  }

  public static final int NAMELEN_FIELD_NUMBER = 8;
  private int namelen_;
  /**
   * <pre>
   * Maximum length of filenames 
   * </pre>
   *
   * <code>int32 namelen = 8;</code>
   * @return The namelen.
   */
  public int getNamelen() {
    return namelen_;
  }

  public static final int FRSIZE_FIELD_NUMBER = 9;
  private int frsize_;
  /**
   * <pre>
   * Fragment size (since Linux 2.6) 
   * </pre>
   *
   * <code>int32 frsize = 9;</code>
   * @return The frsize.
   */
  public int getFrsize() {
    return frsize_;
  }

  public static final int FLAGS_FIELD_NUMBER = 10;
  private int flags_;
  /**
   * <pre>
   * Mount flags of filesystem 
   * </pre>
   *
   * <code>int32 flags = 10;</code>
   * @return The flags.
   */
  public int getFlags() {
    return flags_;
  }

  public static final int TYPE_FIELD_NUMBER = 11;
  private int type_;
  /**
   * <pre>
   * Type of filesystem (see below) 
   * </pre>
   *
   * <code>int32 type = 11;</code>
   * @return The type.
   */
  public int getType() {
    return type_;
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
    if (bsize_ != 0) {
      output.writeInt32(1, bsize_);
    }
    if (blocks_ != 0L) {
      output.writeInt64(2, blocks_);
    }
    if (bfree_ != 0L) {
      output.writeInt64(3, bfree_);
    }
    if (bavail_ != 0L) {
      output.writeInt64(4, bavail_);
    }
    if (files_ != 0L) {
      output.writeInt64(5, files_);
    }
    if (ffree_ != 0L) {
      output.writeInt64(6, ffree_);
    }
    if (fsid_ != 0L) {
      output.writeInt64(7, fsid_);
    }
    if (namelen_ != 0) {
      output.writeInt32(8, namelen_);
    }
    if (frsize_ != 0) {
      output.writeInt32(9, frsize_);
    }
    if (flags_ != 0) {
      output.writeInt32(10, flags_);
    }
    if (type_ != 0) {
      output.writeInt32(11, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bsize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, bsize_);
    }
    if (blocks_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, blocks_);
    }
    if (bfree_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, bfree_);
    }
    if (bavail_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, bavail_);
    }
    if (files_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, files_);
    }
    if (ffree_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, ffree_);
    }
    if (fsid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, fsid_);
    }
    if (namelen_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, namelen_);
    }
    if (frsize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, frsize_);
    }
    if (flags_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, flags_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(11, type_);
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
    if (!(obj instanceof org.opendedup.grpc.StatFS)) {
      return super.equals(obj);
    }
    org.opendedup.grpc.StatFS other = (org.opendedup.grpc.StatFS) obj;

    if (getBsize()
        != other.getBsize()) return false;
    if (getBlocks()
        != other.getBlocks()) return false;
    if (getBfree()
        != other.getBfree()) return false;
    if (getBavail()
        != other.getBavail()) return false;
    if (getFiles()
        != other.getFiles()) return false;
    if (getFfree()
        != other.getFfree()) return false;
    if (getFsid()
        != other.getFsid()) return false;
    if (getNamelen()
        != other.getNamelen()) return false;
    if (getFrsize()
        != other.getFrsize()) return false;
    if (getFlags()
        != other.getFlags()) return false;
    if (getType()
        != other.getType()) return false;
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
    hash = (37 * hash) + BSIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBsize();
    hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlocks());
    hash = (37 * hash) + BFREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBfree());
    hash = (37 * hash) + BAVAIL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBavail());
    hash = (37 * hash) + FILES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFiles());
    hash = (37 * hash) + FFREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFfree());
    hash = (37 * hash) + FSID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFsid());
    hash = (37 * hash) + NAMELEN_FIELD_NUMBER;
    hash = (53 * hash) + getNamelen();
    hash = (37 * hash) + FRSIZE_FIELD_NUMBER;
    hash = (53 * hash) + getFrsize();
    hash = (37 * hash) + FLAGS_FIELD_NUMBER;
    hash = (53 * hash) + getFlags();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.opendedup.grpc.StatFS parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.StatFS parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.opendedup.grpc.StatFS parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.StatFS parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.StatFS parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.opendedup.grpc.StatFS parseFrom(
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
  public static Builder newBuilder(org.opendedup.grpc.StatFS prototype) {
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
   * Protobuf type {@code org.opendedup.grpc.StatFS}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.opendedup.grpc.StatFS)
      org.opendedup.grpc.StatFSOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_StatFS_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_StatFS_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendedup.grpc.StatFS.class, org.opendedup.grpc.StatFS.Builder.class);
    }

    // Construct using org.opendedup.grpc.StatFS.newBuilder()
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
      bsize_ = 0;

      blocks_ = 0L;

      bfree_ = 0L;

      bavail_ = 0L;

      files_ = 0L;

      ffree_ = 0L;

      fsid_ = 0L;

      namelen_ = 0;

      frsize_ = 0;

      flags_ = 0;

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.opendedup.grpc.IOService.internal_static_org_opendedup_grpc_StatFS_descriptor;
    }

    @java.lang.Override
    public org.opendedup.grpc.StatFS getDefaultInstanceForType() {
      return org.opendedup.grpc.StatFS.getDefaultInstance();
    }

    @java.lang.Override
    public org.opendedup.grpc.StatFS build() {
      org.opendedup.grpc.StatFS result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.opendedup.grpc.StatFS buildPartial() {
      org.opendedup.grpc.StatFS result = new org.opendedup.grpc.StatFS(this);
      result.bsize_ = bsize_;
      result.blocks_ = blocks_;
      result.bfree_ = bfree_;
      result.bavail_ = bavail_;
      result.files_ = files_;
      result.ffree_ = ffree_;
      result.fsid_ = fsid_;
      result.namelen_ = namelen_;
      result.frsize_ = frsize_;
      result.flags_ = flags_;
      result.type_ = type_;
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
      if (other instanceof org.opendedup.grpc.StatFS) {
        return mergeFrom((org.opendedup.grpc.StatFS)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.opendedup.grpc.StatFS other) {
      if (other == org.opendedup.grpc.StatFS.getDefaultInstance()) return this;
      if (other.getBsize() != 0) {
        setBsize(other.getBsize());
      }
      if (other.getBlocks() != 0L) {
        setBlocks(other.getBlocks());
      }
      if (other.getBfree() != 0L) {
        setBfree(other.getBfree());
      }
      if (other.getBavail() != 0L) {
        setBavail(other.getBavail());
      }
      if (other.getFiles() != 0L) {
        setFiles(other.getFiles());
      }
      if (other.getFfree() != 0L) {
        setFfree(other.getFfree());
      }
      if (other.getFsid() != 0L) {
        setFsid(other.getFsid());
      }
      if (other.getNamelen() != 0) {
        setNamelen(other.getNamelen());
      }
      if (other.getFrsize() != 0) {
        setFrsize(other.getFrsize());
      }
      if (other.getFlags() != 0) {
        setFlags(other.getFlags());
      }
      if (other.getType() != 0) {
        setType(other.getType());
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
      org.opendedup.grpc.StatFS parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.opendedup.grpc.StatFS) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bsize_ ;
    /**
     * <pre>
     * Optimal transfer block size 
     * </pre>
     *
     * <code>int32 bsize = 1;</code>
     * @return The bsize.
     */
    public int getBsize() {
      return bsize_;
    }
    /**
     * <pre>
     * Optimal transfer block size 
     * </pre>
     *
     * <code>int32 bsize = 1;</code>
     * @param value The bsize to set.
     * @return This builder for chaining.
     */
    public Builder setBsize(int value) {
      
      bsize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optimal transfer block size 
     * </pre>
     *
     * <code>int32 bsize = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBsize() {
      
      bsize_ = 0;
      onChanged();
      return this;
    }

    private long blocks_ ;
    /**
     * <pre>
     * Total data blocks in filesystem 
     * </pre>
     *
     * <code>int64 blocks = 2;</code>
     * @return The blocks.
     */
    public long getBlocks() {
      return blocks_;
    }
    /**
     * <pre>
     * Total data blocks in filesystem 
     * </pre>
     *
     * <code>int64 blocks = 2;</code>
     * @param value The blocks to set.
     * @return This builder for chaining.
     */
    public Builder setBlocks(long value) {
      
      blocks_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total data blocks in filesystem 
     * </pre>
     *
     * <code>int64 blocks = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlocks() {
      
      blocks_ = 0L;
      onChanged();
      return this;
    }

    private long bfree_ ;
    /**
     * <pre>
     * Free blocks in filesystem 
     * </pre>
     *
     * <code>int64 bfree = 3;</code>
     * @return The bfree.
     */
    public long getBfree() {
      return bfree_;
    }
    /**
     * <pre>
     * Free blocks in filesystem 
     * </pre>
     *
     * <code>int64 bfree = 3;</code>
     * @param value The bfree to set.
     * @return This builder for chaining.
     */
    public Builder setBfree(long value) {
      
      bfree_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free blocks in filesystem 
     * </pre>
     *
     * <code>int64 bfree = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBfree() {
      
      bfree_ = 0L;
      onChanged();
      return this;
    }

    private long bavail_ ;
    /**
     * <pre>
     * Free blocks available to unprivileged user 
     * </pre>
     *
     * <code>int64 bavail = 4;</code>
     * @return The bavail.
     */
    public long getBavail() {
      return bavail_;
    }
    /**
     * <pre>
     * Free blocks available to unprivileged user 
     * </pre>
     *
     * <code>int64 bavail = 4;</code>
     * @param value The bavail to set.
     * @return This builder for chaining.
     */
    public Builder setBavail(long value) {
      
      bavail_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free blocks available to unprivileged user 
     * </pre>
     *
     * <code>int64 bavail = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBavail() {
      
      bavail_ = 0L;
      onChanged();
      return this;
    }

    private long files_ ;
    /**
     * <pre>
     * Total inodes in filesystem 
     * </pre>
     *
     * <code>int64 files = 5;</code>
     * @return The files.
     */
    public long getFiles() {
      return files_;
    }
    /**
     * <pre>
     * Total inodes in filesystem 
     * </pre>
     *
     * <code>int64 files = 5;</code>
     * @param value The files to set.
     * @return This builder for chaining.
     */
    public Builder setFiles(long value) {
      
      files_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total inodes in filesystem 
     * </pre>
     *
     * <code>int64 files = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFiles() {
      
      files_ = 0L;
      onChanged();
      return this;
    }

    private long ffree_ ;
    /**
     * <pre>
     * Free inodes in filesystem 
     * </pre>
     *
     * <code>int64 ffree = 6;</code>
     * @return The ffree.
     */
    public long getFfree() {
      return ffree_;
    }
    /**
     * <pre>
     * Free inodes in filesystem 
     * </pre>
     *
     * <code>int64 ffree = 6;</code>
     * @param value The ffree to set.
     * @return This builder for chaining.
     */
    public Builder setFfree(long value) {
      
      ffree_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free inodes in filesystem 
     * </pre>
     *
     * <code>int64 ffree = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFfree() {
      
      ffree_ = 0L;
      onChanged();
      return this;
    }

    private long fsid_ ;
    /**
     * <pre>
     * Filesystem ID 
     * </pre>
     *
     * <code>int64 fsid = 7;</code>
     * @return The fsid.
     */
    public long getFsid() {
      return fsid_;
    }
    /**
     * <pre>
     * Filesystem ID 
     * </pre>
     *
     * <code>int64 fsid = 7;</code>
     * @param value The fsid to set.
     * @return This builder for chaining.
     */
    public Builder setFsid(long value) {
      
      fsid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filesystem ID 
     * </pre>
     *
     * <code>int64 fsid = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFsid() {
      
      fsid_ = 0L;
      onChanged();
      return this;
    }

    private int namelen_ ;
    /**
     * <pre>
     * Maximum length of filenames 
     * </pre>
     *
     * <code>int32 namelen = 8;</code>
     * @return The namelen.
     */
    public int getNamelen() {
      return namelen_;
    }
    /**
     * <pre>
     * Maximum length of filenames 
     * </pre>
     *
     * <code>int32 namelen = 8;</code>
     * @param value The namelen to set.
     * @return This builder for chaining.
     */
    public Builder setNamelen(int value) {
      
      namelen_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum length of filenames 
     * </pre>
     *
     * <code>int32 namelen = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamelen() {
      
      namelen_ = 0;
      onChanged();
      return this;
    }

    private int frsize_ ;
    /**
     * <pre>
     * Fragment size (since Linux 2.6) 
     * </pre>
     *
     * <code>int32 frsize = 9;</code>
     * @return The frsize.
     */
    public int getFrsize() {
      return frsize_;
    }
    /**
     * <pre>
     * Fragment size (since Linux 2.6) 
     * </pre>
     *
     * <code>int32 frsize = 9;</code>
     * @param value The frsize to set.
     * @return This builder for chaining.
     */
    public Builder setFrsize(int value) {
      
      frsize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Fragment size (since Linux 2.6) 
     * </pre>
     *
     * <code>int32 frsize = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrsize() {
      
      frsize_ = 0;
      onChanged();
      return this;
    }

    private int flags_ ;
    /**
     * <pre>
     * Mount flags of filesystem 
     * </pre>
     *
     * <code>int32 flags = 10;</code>
     * @return The flags.
     */
    public int getFlags() {
      return flags_;
    }
    /**
     * <pre>
     * Mount flags of filesystem 
     * </pre>
     *
     * <code>int32 flags = 10;</code>
     * @param value The flags to set.
     * @return This builder for chaining.
     */
    public Builder setFlags(int value) {
      
      flags_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mount flags of filesystem 
     * </pre>
     *
     * <code>int32 flags = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlags() {
      
      flags_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * Type of filesystem (see below) 
     * </pre>
     *
     * <code>int32 type = 11;</code>
     * @return The type.
     */
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * Type of filesystem (see below) 
     * </pre>
     *
     * <code>int32 type = 11;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of filesystem (see below) 
     * </pre>
     *
     * <code>int32 type = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:org.opendedup.grpc.StatFS)
  }

  // @@protoc_insertion_point(class_scope:org.opendedup.grpc.StatFS)
  private static final org.opendedup.grpc.StatFS DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.opendedup.grpc.StatFS();
  }

  public static org.opendedup.grpc.StatFS getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StatFS>
      PARSER = new com.google.protobuf.AbstractParser<StatFS>() {
    @java.lang.Override
    public StatFS parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StatFS(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StatFS> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StatFS> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.opendedup.grpc.StatFS getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

