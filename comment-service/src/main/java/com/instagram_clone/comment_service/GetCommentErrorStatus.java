// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comment_service.proto

package com.instagram_clone.comment_service;

/**
 * Protobuf enum {@code Comment.GetCommentErrorStatus}
 */
public enum GetCommentErrorStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GET_SERVER_ERROR = 0;</code>
   */
  GET_SERVER_ERROR(0),
  /**
   * <code>NOT_FOUND = 1;</code>
   */
  NOT_FOUND(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GET_SERVER_ERROR = 0;</code>
   */
  public static final int GET_SERVER_ERROR_VALUE = 0;
  /**
   * <code>NOT_FOUND = 1;</code>
   */
  public static final int NOT_FOUND_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GetCommentErrorStatus valueOf(int value) {
    return forNumber(value);
  }

  public static GetCommentErrorStatus forNumber(int value) {
    switch (value) {
      case 0: return GET_SERVER_ERROR;
      case 1: return NOT_FOUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GetCommentErrorStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GetCommentErrorStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GetCommentErrorStatus>() {
          public GetCommentErrorStatus findValueByNumber(int number) {
            return GetCommentErrorStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.instagram_clone.comment_service.HelloWorldProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final GetCommentErrorStatus[] VALUES = values();

  public static GetCommentErrorStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GetCommentErrorStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Comment.GetCommentErrorStatus)
}
