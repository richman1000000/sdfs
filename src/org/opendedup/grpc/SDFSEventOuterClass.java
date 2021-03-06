// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SDFSEvent.proto

package org.opendedup.grpc;

public final class SDFSEventOuterClass {
  private SDFSEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEvent_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEvent_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEventListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEventListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SDFSEventListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SDFSEventListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017SDFSEvent.proto\022\022org.opendedup.grpc\032\016F" +
      "ileInfo.proto\"\225\003\n\tSDFSEvent\022\021\n\tstartTime" +
      "\030\001 \001(\003\022\017\n\007endTime\030\002 \001(\003\022\r\n\005level\030\003 \001(\t\022\014" +
      "\n\004type\030\004 \001(\t\022\016\n\006target\030\005 \001(\t\022\020\n\010shortMsg" +
      "\030\006 \001(\t\022\017\n\007longMsg\030\007 \001(\t\022\027\n\017percentComple" +
      "te\030\010 \001(\001\022\020\n\010maxCount\030\t \001(\003\022\024\n\014currentCou" +
      "nt\030\n \001(\003\022\014\n\004uuid\030\013 \001(\t\022\022\n\nparentUuid\030\014 \001" +
      "(\t\022\024\n\014extendedInfo\030\r \001(\t\022\024\n\014childrenUUid" +
      "\030\016 \003(\t\022\017\n\007success\030\017 \001(\010\022A\n\nattributes\030\020 " +
      "\003(\0132-.org.opendedup.grpc.SDFSEvent.Attri" +
      "butesEntry\0321\n\017AttributesEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\" \n\020SDFSEventReques" +
      "t\022\014\n\004uuid\030\001 \001(\t\"\203\001\n\021SDFSEventResponse\022\r\n" +
      "\005error\030\001 \001(\t\0221\n\terrorCode\030\002 \001(\0162\036.org.op" +
      "endedup.grpc.errorCodes\022,\n\005event\030\003 \001(\0132\035" +
      ".org.opendedup.grpc.SDFSEvent\"\026\n\024SDFSEve" +
      "ntListRequest\"\210\001\n\025SDFSEventListResponse\022" +
      "\r\n\005error\030\001 \001(\t\0221\n\terrorCode\030\002 \001(\0162\036.org." +
      "opendedup.grpc.errorCodes\022-\n\006events\030\003 \003(" +
      "\0132\035.org.opendedup.grpc.SDFSEvent2\257\002\n\020SDF" +
      "SEventService\022W\n\010GetEvent\022$.org.opendedu" +
      "p.grpc.SDFSEventRequest\032%.org.opendedup." +
      "grpc.SDFSEventResponse\022a\n\nListEvents\022(.o" +
      "rg.opendedup.grpc.SDFSEventListRequest\032)" +
      ".org.opendedup.grpc.SDFSEventListRespons" +
      "e\022_\n\016SubscribeEvent\022$.org.opendedup.grpc" +
      ".SDFSEventRequest\032%.org.opendedup.grpc.S" +
      "DFSEventResponse0\001B2P\001Z.github.com/opend" +
      "edup/sdfs-client-go/sdfs/;sdfsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opendedup.grpc.FileInfo.getDescriptor(),
        });
    internal_static_org_opendedup_grpc_SDFSEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_opendedup_grpc_SDFSEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEvent_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Level", "Type", "Target", "ShortMsg", "LongMsg", "PercentComplete", "MaxCount", "CurrentCount", "Uuid", "ParentUuid", "ExtendedInfo", "ChildrenUUid", "Success", "Attributes", });
    internal_static_org_opendedup_grpc_SDFSEvent_AttributesEntry_descriptor =
      internal_static_org_opendedup_grpc_SDFSEvent_descriptor.getNestedTypes().get(0);
    internal_static_org_opendedup_grpc_SDFSEvent_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEvent_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_org_opendedup_grpc_SDFSEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_opendedup_grpc_SDFSEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEventRequest_descriptor,
        new java.lang.String[] { "Uuid", });
    internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_opendedup_grpc_SDFSEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEventResponse_descriptor,
        new java.lang.String[] { "Error", "ErrorCode", "Event", });
    internal_static_org_opendedup_grpc_SDFSEventListRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_opendedup_grpc_SDFSEventListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEventListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_opendedup_grpc_SDFSEventListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_opendedup_grpc_SDFSEventListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SDFSEventListResponse_descriptor,
        new java.lang.String[] { "Error", "ErrorCode", "Events", });
    org.opendedup.grpc.FileInfo.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
