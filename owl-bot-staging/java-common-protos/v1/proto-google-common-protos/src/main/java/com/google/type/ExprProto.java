// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/expr.proto

package com.google.type;

public final class ExprProto {
  private ExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_type_Expr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_type_Expr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026google/type/expr.proto\022\013google.type\"P\n" +
      "\004Expr\022\022\n\nexpression\030\001 \001(\t\022\r\n\005title\030\002 \001(\t" +
      "\022\023\n\013description\030\003 \001(\t\022\020\n\010location\030\004 \001(\tB" +
      "Z\n\017com.google.typeB\tExprProtoP\001Z4google." +
      "golang.org/genproto/googleapis/type/expr" +
      ";expr\242\002\003GTPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_type_Expr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_type_Expr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_type_Expr_descriptor,
        new java.lang.String[] { "Expression", "Title", "Description", "Location", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
