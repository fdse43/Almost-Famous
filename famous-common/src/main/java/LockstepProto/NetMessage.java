// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

/**
 * Protobuf enum {@code LockstepProto.NetMessage}
 */
public enum NetMessage
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NET_MESSAGE_DEFAULT = 0;</code>
   */
  NET_MESSAGE_DEFAULT(0),
  /**
   * <code>C2S_HeartBeat = 1;</code>
   */
  C2S_HeartBeat(1),
  /**
   * <code>S2C_HeartBeat = 2;</code>
   */
  S2C_HeartBeat(2),
  /**
   * <code>C2S_LockStepInit = 13;</code>
   */
  C2S_LockStepInit(13),
  /**
   * <code>S2C_LockStepInit = 14;</code>
   */
  S2C_LockStepInit(14),
  /**
   * <code>C2S_LockStep = 15;</code>
   */
  C2S_LockStep(15),
  /**
   * <code>S2C_LockStep = 16;</code>
   */
  S2C_LockStep(16),
  /**
   * <code>C2S_Match = 17;</code>
   */
  C2S_Match(17),
  /**
   * <code>S2C_Match = 18;</code>
   */
  S2C_Match(18),
  /**
   * <pre>
   *是否准备好
   * </pre>
   *
   * <code>C2S_State = 19;</code>
   */
  C2S_State(19),
  /**
   * <code>S2C_State = 20;</code>
   */
  S2C_State(20),
  /**
   * <pre>
   *检测是否需要重连
   * </pre>
   *
   * <code>C2S_Reconnect = 21;</code>
   */
  C2S_Reconnect(21),
  /**
   * <code>S2C_Reconnect = 22;</code>
   */
  S2C_Reconnect(22),
  /**
   * <pre>
   *获取指定范围的帧
   * </pre>
   *
   * <code>C2S_PullFrame = 23;</code>
   */
  C2S_PullFrame(23),
  /**
   * <code>S2C_PullFrame = 24;</code>
   */
  S2C_PullFrame(24),
  /**
   * <pre>
   *战斗结束
   * </pre>
   *
   * <code>C2S_BattleEnd = 25;</code>
   */
  C2S_BattleEnd(25),
  /**
   * <code>S2C_BattleEnd = 26;</code>
   */
  S2C_BattleEnd(26),
  /**
   * <pre>
   *匹配取消
   * </pre>
   *
   * <code>C2S_MatchCancel = 27;</code>
   */
  C2S_MatchCancel(27),
  /**
   * <code>S2C_MatchCancel = 28;</code>
   */
  S2C_MatchCancel(28),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NET_MESSAGE_DEFAULT = 0;</code>
   */
  public static final int NET_MESSAGE_DEFAULT_VALUE = 0;
  /**
   * <code>C2S_HeartBeat = 1;</code>
   */
  public static final int C2S_HeartBeat_VALUE = 1;
  /**
   * <code>S2C_HeartBeat = 2;</code>
   */
  public static final int S2C_HeartBeat_VALUE = 2;
  /**
   * <code>C2S_LockStepInit = 13;</code>
   */
  public static final int C2S_LockStepInit_VALUE = 13;
  /**
   * <code>S2C_LockStepInit = 14;</code>
   */
  public static final int S2C_LockStepInit_VALUE = 14;
  /**
   * <code>C2S_LockStep = 15;</code>
   */
  public static final int C2S_LockStep_VALUE = 15;
  /**
   * <code>S2C_LockStep = 16;</code>
   */
  public static final int S2C_LockStep_VALUE = 16;
  /**
   * <code>C2S_Match = 17;</code>
   */
  public static final int C2S_Match_VALUE = 17;
  /**
   * <code>S2C_Match = 18;</code>
   */
  public static final int S2C_Match_VALUE = 18;
  /**
   * <pre>
   *是否准备好
   * </pre>
   *
   * <code>C2S_State = 19;</code>
   */
  public static final int C2S_State_VALUE = 19;
  /**
   * <code>S2C_State = 20;</code>
   */
  public static final int S2C_State_VALUE = 20;
  /**
   * <pre>
   *检测是否需要重连
   * </pre>
   *
   * <code>C2S_Reconnect = 21;</code>
   */
  public static final int C2S_Reconnect_VALUE = 21;
  /**
   * <code>S2C_Reconnect = 22;</code>
   */
  public static final int S2C_Reconnect_VALUE = 22;
  /**
   * <pre>
   *获取指定范围的帧
   * </pre>
   *
   * <code>C2S_PullFrame = 23;</code>
   */
  public static final int C2S_PullFrame_VALUE = 23;
  /**
   * <code>S2C_PullFrame = 24;</code>
   */
  public static final int S2C_PullFrame_VALUE = 24;
  /**
   * <pre>
   *战斗结束
   * </pre>
   *
   * <code>C2S_BattleEnd = 25;</code>
   */
  public static final int C2S_BattleEnd_VALUE = 25;
  /**
   * <code>S2C_BattleEnd = 26;</code>
   */
  public static final int S2C_BattleEnd_VALUE = 26;
  /**
   * <pre>
   *匹配取消
   * </pre>
   *
   * <code>C2S_MatchCancel = 27;</code>
   */
  public static final int C2S_MatchCancel_VALUE = 27;
  /**
   * <code>S2C_MatchCancel = 28;</code>
   */
  public static final int S2C_MatchCancel_VALUE = 28;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static NetMessage valueOf(int value) {
    return forNumber(value);
  }

  public static NetMessage forNumber(int value) {
    switch (value) {
      case 0: return NET_MESSAGE_DEFAULT;
      case 1: return C2S_HeartBeat;
      case 2: return S2C_HeartBeat;
      case 13: return C2S_LockStepInit;
      case 14: return S2C_LockStepInit;
      case 15: return C2S_LockStep;
      case 16: return S2C_LockStep;
      case 17: return C2S_Match;
      case 18: return S2C_Match;
      case 19: return C2S_State;
      case 20: return S2C_State;
      case 21: return C2S_Reconnect;
      case 22: return S2C_Reconnect;
      case 23: return C2S_PullFrame;
      case 24: return S2C_PullFrame;
      case 25: return C2S_BattleEnd;
      case 26: return S2C_BattleEnd;
      case 27: return C2S_MatchCancel;
      case 28: return S2C_MatchCancel;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NetMessage>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
          NetMessage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NetMessage>() {
          public NetMessage findValueByNumber(int number) {
            return NetMessage.forNumber(number);
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
    return LockstepProto.NetMessageOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final NetMessage[] VALUES = values();

  public static NetMessage valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NetMessage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:LockstepProto.NetMessage)
}

