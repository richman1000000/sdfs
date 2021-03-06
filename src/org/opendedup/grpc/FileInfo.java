// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileInfo.proto

package org.opendedup.grpc;

public final class FileInfo {
  private FileInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_FileInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_FileInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_FileMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_FileMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_FileInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_FileInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_IOMonitorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_IOMonitorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_WFileAttributesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_WFileAttributesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_WFileAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_WFileAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_RFileAttributesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_RFileAttributesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_RFileAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_RFileAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_FileAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_FileAttributes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016FileInfo.proto\022\022org.opendedup.grpc\"]\n\017" +
      "FileInfoRequest\022\020\n\010fileName\030\001 \001(\t\022\017\n\007com" +
      "pact\030\002 \001(\010\022\025\n\rnumberOfFiles\030\003 \001(\005\022\020\n\010lis" +
      "tGuid\030\004 \001(\t\"\273\001\n\023FileMessageResponse\022\r\n\005e" +
      "rror\030\001 \001(\t\022\020\n\010listGuid\030\002 \001(\t\0226\n\010response" +
      "\030\003 \003(\0132$.org.opendedup.grpc.FileInfoResp" +
      "onse\0221\n\terrorCode\030\004 \001(\0162\036.org.opendedup." +
      "grpc.errorCodes\022\030\n\020maxNumberOfFiles\030\005 \001(" +
      "\005\"\246\006\n\020FileInfoResponse\022\020\n\010fileName\030\001 \001(\t" +
      "\022\020\n\010filePath\030\002 \001(\t\022;\n\004type\030\003 \001(\0162-.org.o" +
      "pendedup.grpc.FileInfoResponse.fileType\022" +
      "\020\n\010sdfsPath\030\004 \001(\t\022\r\n\005atime\030\005 \001(\003\022\r\n\005mtim" +
      "e\030\006 \001(\003\022\r\n\005ctime\030\007 \001(\003\022\016\n\006hidden\030\010 \001(\010\022\014" +
      "\n\004size\030\t \001(\003\022\014\n\004open\030\n \001(\010\022\021\n\tfileGuild\030" +
      "\013 \001(\t\022\017\n\007mapGuid\030\014 \001(\t\022\022\n\nlocalOwner\030\r \001" +
      "(\010\022\017\n\007execute\030\016 \001(\010\022\014\n\004read\030\017 \001(\010\022\r\n\005wri" +
      "te\030\020 \001(\010\022\021\n\timporting\030\021 \001(\010\022\017\n\007symlink\030\022" +
      " \001(\010\022:\n\016fileAttributes\030\023 \003(\0132\".org.opend" +
      "edup.grpc.FileAttributes\022\n\n\002id\030\024 \001(\t\0223\n\005" +
      "files\030\025 \003(\0132$.org.opendedup.grpc.FileInf" +
      "oResponse\022\022\n\nparentPath\030\026 \001(\t\022\020\n\010volumei" +
      "d\030\027 \001(\t\0228\n\tioMonitor\030\030 \001(\0132%.org.opended" +
      "up.grpc.IOMonitorResponse\022\023\n\013symlinkPath" +
      "\030\031 \001(\t\022\020\n\010group_id\030\032 \001(\003\022\017\n\007user_id\030\033 \001(" +
      "\003\022\023\n\013permissions\030\034 \001(\005\022\020\n\010hashcode\030\035 \001(\003" +
      "\022\025\n\rretentionLock\030\036 \001(\003\022\022\n\nattributes\030\037 " +
      "\001(\003\022\017\n\007version\030  \001(\t\022\014\n\004mode\030! \001(\005\022\027\n\017de" +
      "lete_on_close\030\" \001(\010\"\035\n\010fileType\022\010\n\004FILE\020" +
      "\000\022\007\n\003DIR\020\001\"\347\002\n\021IOMonitorResponse\022\033\n\023virt" +
      "ualBytesWritten\030\001 \001(\003\022\032\n\022actualBytesWrit" +
      "ten\030\002 \001(\003\022\021\n\tbytesRead\030\003 \001(\003\022\027\n\017duplicat" +
      "eBlocks\030\004 \001(\003\022\021\n\twriteOpts\030\005 \001(\003\022\020\n\010read" +
      "Opts\030\006 \001(\003\022\022\n\nmaxReadOps\030\007 \001(\003\022\023\n\013maxWri" +
      "teOps\030\010 \001(\003\022\017\n\007maxIops\030\t \001(\003\022\023\n\013maxReadM" +
      "bps\030\n \001(\003\022\024\n\014maxWriteMbps\030\013 \001(\003\022\017\n\007maxMb" +
      "ps\030\014 \001(\003\022\r\n\005ioQos\030\r \001(\005\022\021\n\tioProfile\030\016 \001" +
      "(\t\022\017\n\007maxRbps\030\017 \001(\003\022\017\n\007maxWbps\030\020 \001(\003\022\016\n\006" +
      "maxBps\030\021 \001(\003\"f\n\026WFileAttributesRequest\022:" +
      "\n\016fileAttributes\030\001 \003(\0132\".org.opendedup.g" +
      "rpc.FileAttributes\022\020\n\010filePath\030\002 \001(\t\"[\n\027" +
      "WFileAttributesResponse\022\r\n\005error\030\001 \001(\t\0221" +
      "\n\terrorCode\030\002 \001(\0162\036.org.opendedup.grpc.e" +
      "rrorCodes\"*\n\026RFileAttributesRequest\022\020\n\010f" +
      "ilePath\030\001 \001(\t\"\227\001\n\027RFileAttributesRespons" +
      "e\022:\n\016fileAttributes\030\001 \003(\0132\".org.opendedu" +
      "p.grpc.FileAttributes\022\r\n\005error\030\002 \001(\t\0221\n\t" +
      "errorCode\030\003 \001(\0162\036.org.opendedup.grpc.err" +
      "orCodes\",\n\016FileAttributes\022\013\n\003key\030\001 \001(\t\022\r" +
      "\n\005value\030\002 \001(\t*\315\001\n\nerrorCodes\022\t\n\005NOERR\020\000\022" +
      "\n\n\006ENOENT\020\002\022\007\n\003EIO\020\005\022\n\n\006EAGAIN\020\013\022\n\n\006EEXI" +
      "ST\020\021\022\013\n\007ENOTDIR\020\024\022\013\n\007ENODATA\020=\022\013\n\007ENAVAI" +
      "L\020w\022\t\n\005EPERM\020\001\022\n\n\006ENOSPC\020\034\022\n\n\006EACCES\020\r\022\r" +
      "\n\tENOTEMPTY\020\'\022\n\n\006ENOSYS\020&\022\n\n\006ENODEV\020\023\022\n\n" +
      "\006EBADFD\020M\022\n\n\006EISDIR\020\025B2P\001Z.github.com/op" +
      "endedup/sdfs-client-go/sdfs/;sdfsb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_opendedup_grpc_FileInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_opendedup_grpc_FileInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_FileInfoRequest_descriptor,
        new java.lang.String[] { "FileName", "Compact", "NumberOfFiles", "ListGuid", });
    internal_static_org_opendedup_grpc_FileMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_opendedup_grpc_FileMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_FileMessageResponse_descriptor,
        new java.lang.String[] { "Error", "ListGuid", "Response", "ErrorCode", "MaxNumberOfFiles", });
    internal_static_org_opendedup_grpc_FileInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_opendedup_grpc_FileInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_FileInfoResponse_descriptor,
        new java.lang.String[] { "FileName", "FilePath", "Type", "SdfsPath", "Atime", "Mtime", "Ctime", "Hidden", "Size", "Open", "FileGuild", "MapGuid", "LocalOwner", "Execute", "Read", "Write", "Importing", "Symlink", "FileAttributes", "Id", "Files", "ParentPath", "Volumeid", "IoMonitor", "SymlinkPath", "GroupId", "UserId", "Permissions", "Hashcode", "RetentionLock", "Attributes", "Version", "Mode", "DeleteOnClose", });
    internal_static_org_opendedup_grpc_IOMonitorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_opendedup_grpc_IOMonitorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_IOMonitorResponse_descriptor,
        new java.lang.String[] { "VirtualBytesWritten", "ActualBytesWritten", "BytesRead", "DuplicateBlocks", "WriteOpts", "ReadOpts", "MaxReadOps", "MaxWriteOps", "MaxIops", "MaxReadMbps", "MaxWriteMbps", "MaxMbps", "IoQos", "IoProfile", "MaxRbps", "MaxWbps", "MaxBps", });
    internal_static_org_opendedup_grpc_WFileAttributesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_opendedup_grpc_WFileAttributesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_WFileAttributesRequest_descriptor,
        new java.lang.String[] { "FileAttributes", "FilePath", });
    internal_static_org_opendedup_grpc_WFileAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_opendedup_grpc_WFileAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_WFileAttributesResponse_descriptor,
        new java.lang.String[] { "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_RFileAttributesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_opendedup_grpc_RFileAttributesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_RFileAttributesRequest_descriptor,
        new java.lang.String[] { "FilePath", });
    internal_static_org_opendedup_grpc_RFileAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_opendedup_grpc_RFileAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_RFileAttributesResponse_descriptor,
        new java.lang.String[] { "FileAttributes", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_FileAttributes_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_opendedup_grpc_FileAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_FileAttributes_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
