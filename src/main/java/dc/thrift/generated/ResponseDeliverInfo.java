/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dc.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-06")
public class ResponseDeliverInfo implements org.apache.thrift.TBase<ResponseDeliverInfo, ResponseDeliverInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ResponseDeliverInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResponseDeliverInfo");

  private static final org.apache.thrift.protocol.TField BID_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("bidCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField IMPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("impression", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CLICK_FIELD_DESC = new org.apache.thrift.protocol.TField("click", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SOLUTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("solutionId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResponseDeliverInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResponseDeliverInfoTupleSchemeFactory());
  }

  public long bidCount; // required
  public long impression; // required
  public long click; // required
  public long solutionId; // required
  public long updateTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BID_COUNT((short)1, "bidCount"),
    IMPRESSION((short)2, "impression"),
    CLICK((short)3, "click"),
    SOLUTION_ID((short)4, "solutionId"),
    UPDATE_TIME((short)5, "updateTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BID_COUNT
          return BID_COUNT;
        case 2: // IMPRESSION
          return IMPRESSION;
        case 3: // CLICK
          return CLICK;
        case 4: // SOLUTION_ID
          return SOLUTION_ID;
        case 5: // UPDATE_TIME
          return UPDATE_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BIDCOUNT_ISSET_ID = 0;
  private static final int __IMPRESSION_ISSET_ID = 1;
  private static final int __CLICK_ISSET_ID = 2;
  private static final int __SOLUTIONID_ISSET_ID = 3;
  private static final int __UPDATETIME_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BID_COUNT, new org.apache.thrift.meta_data.FieldMetaData("bidCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IMPRESSION, new org.apache.thrift.meta_data.FieldMetaData("impression", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CLICK, new org.apache.thrift.meta_data.FieldMetaData("click", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SOLUTION_ID, new org.apache.thrift.meta_data.FieldMetaData("solutionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResponseDeliverInfo.class, metaDataMap);
  }

  public ResponseDeliverInfo() {
    this.bidCount = 0L;

    this.impression = 0L;

    this.click = 0L;

    this.solutionId = 0L;

    this.updateTime = 0L;

  }

  public ResponseDeliverInfo(
    long bidCount,
    long impression,
    long click,
    long solutionId,
    long updateTime)
  {
    this();
    this.bidCount = bidCount;
    setBidCountIsSet(true);
    this.impression = impression;
    setImpressionIsSet(true);
    this.click = click;
    setClickIsSet(true);
    this.solutionId = solutionId;
    setSolutionIdIsSet(true);
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResponseDeliverInfo(ResponseDeliverInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bidCount = other.bidCount;
    this.impression = other.impression;
    this.click = other.click;
    this.solutionId = other.solutionId;
    this.updateTime = other.updateTime;
  }

  public ResponseDeliverInfo deepCopy() {
    return new ResponseDeliverInfo(this);
  }

  @Override
  public void clear() {
    this.bidCount = 0L;

    this.impression = 0L;

    this.click = 0L;

    this.solutionId = 0L;

    this.updateTime = 0L;

  }

  public long getBidCount() {
    return this.bidCount;
  }

  public ResponseDeliverInfo setBidCount(long bidCount) {
    this.bidCount = bidCount;
    setBidCountIsSet(true);
    return this;
  }

  public void unsetBidCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BIDCOUNT_ISSET_ID);
  }

  /** Returns true if field bidCount is set (has been assigned a value) and false otherwise */
  public boolean isSetBidCount() {
    return EncodingUtils.testBit(__isset_bitfield, __BIDCOUNT_ISSET_ID);
  }

  public void setBidCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BIDCOUNT_ISSET_ID, value);
  }

  public long getImpression() {
    return this.impression;
  }

  public ResponseDeliverInfo setImpression(long impression) {
    this.impression = impression;
    setImpressionIsSet(true);
    return this;
  }

  public void unsetImpression() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IMPRESSION_ISSET_ID);
  }

  /** Returns true if field impression is set (has been assigned a value) and false otherwise */
  public boolean isSetImpression() {
    return EncodingUtils.testBit(__isset_bitfield, __IMPRESSION_ISSET_ID);
  }

  public void setImpressionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IMPRESSION_ISSET_ID, value);
  }

  public long getClick() {
    return this.click;
  }

  public ResponseDeliverInfo setClick(long click) {
    this.click = click;
    setClickIsSet(true);
    return this;
  }

  public void unsetClick() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLICK_ISSET_ID);
  }

  /** Returns true if field click is set (has been assigned a value) and false otherwise */
  public boolean isSetClick() {
    return EncodingUtils.testBit(__isset_bitfield, __CLICK_ISSET_ID);
  }

  public void setClickIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLICK_ISSET_ID, value);
  }

  public long getSolutionId() {
    return this.solutionId;
  }

  public ResponseDeliverInfo setSolutionId(long solutionId) {
    this.solutionId = solutionId;
    setSolutionIdIsSet(true);
    return this;
  }

  public void unsetSolutionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SOLUTIONID_ISSET_ID);
  }

  /** Returns true if field solutionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSolutionId() {
    return EncodingUtils.testBit(__isset_bitfield, __SOLUTIONID_ISSET_ID);
  }

  public void setSolutionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SOLUTIONID_ISSET_ID, value);
  }

  public long getUpdateTime() {
    return this.updateTime;
  }

  public ResponseDeliverInfo setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
    return this;
  }

  public void unsetUpdateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  /** Returns true if field updateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPDATETIME_ISSET_ID);
  }

  public void setUpdateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPDATETIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BID_COUNT:
      if (value == null) {
        unsetBidCount();
      } else {
        setBidCount((Long)value);
      }
      break;

    case IMPRESSION:
      if (value == null) {
        unsetImpression();
      } else {
        setImpression((Long)value);
      }
      break;

    case CLICK:
      if (value == null) {
        unsetClick();
      } else {
        setClick((Long)value);
      }
      break;

    case SOLUTION_ID:
      if (value == null) {
        unsetSolutionId();
      } else {
        setSolutionId((Long)value);
      }
      break;

    case UPDATE_TIME:
      if (value == null) {
        unsetUpdateTime();
      } else {
        setUpdateTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BID_COUNT:
      return getBidCount();

    case IMPRESSION:
      return getImpression();

    case CLICK:
      return getClick();

    case SOLUTION_ID:
      return getSolutionId();

    case UPDATE_TIME:
      return getUpdateTime();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BID_COUNT:
      return isSetBidCount();
    case IMPRESSION:
      return isSetImpression();
    case CLICK:
      return isSetClick();
    case SOLUTION_ID:
      return isSetSolutionId();
    case UPDATE_TIME:
      return isSetUpdateTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResponseDeliverInfo)
      return this.equals((ResponseDeliverInfo)that);
    return false;
  }

  public boolean equals(ResponseDeliverInfo that) {
    if (that == null)
      return false;

    boolean this_present_bidCount = true;
    boolean that_present_bidCount = true;
    if (this_present_bidCount || that_present_bidCount) {
      if (!(this_present_bidCount && that_present_bidCount))
        return false;
      if (this.bidCount != that.bidCount)
        return false;
    }

    boolean this_present_impression = true;
    boolean that_present_impression = true;
    if (this_present_impression || that_present_impression) {
      if (!(this_present_impression && that_present_impression))
        return false;
      if (this.impression != that.impression)
        return false;
    }

    boolean this_present_click = true;
    boolean that_present_click = true;
    if (this_present_click || that_present_click) {
      if (!(this_present_click && that_present_click))
        return false;
      if (this.click != that.click)
        return false;
    }

    boolean this_present_solutionId = true;
    boolean that_present_solutionId = true;
    if (this_present_solutionId || that_present_solutionId) {
      if (!(this_present_solutionId && that_present_solutionId))
        return false;
      if (this.solutionId != that.solutionId)
        return false;
    }

    boolean this_present_updateTime = true;
    boolean that_present_updateTime = true;
    if (this_present_updateTime || that_present_updateTime) {
      if (!(this_present_updateTime && that_present_updateTime))
        return false;
      if (this.updateTime != that.updateTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bidCount = true;
    list.add(present_bidCount);
    if (present_bidCount)
      list.add(bidCount);

    boolean present_impression = true;
    list.add(present_impression);
    if (present_impression)
      list.add(impression);

    boolean present_click = true;
    list.add(present_click);
    if (present_click)
      list.add(click);

    boolean present_solutionId = true;
    list.add(present_solutionId);
    if (present_solutionId)
      list.add(solutionId);

    boolean present_updateTime = true;
    list.add(present_updateTime);
    if (present_updateTime)
      list.add(updateTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResponseDeliverInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBidCount()).compareTo(other.isSetBidCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBidCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bidCount, other.bidCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImpression()).compareTo(other.isSetImpression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImpression()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.impression, other.impression);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClick()).compareTo(other.isSetClick());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClick()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.click, other.click);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSolutionId()).compareTo(other.isSetSolutionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSolutionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.solutionId, other.solutionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUpdateTime()).compareTo(other.isSetUpdateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateTime, other.updateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ResponseDeliverInfo(");
    boolean first = true;

    sb.append("bidCount:");
    sb.append(this.bidCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("impression:");
    sb.append(this.impression);
    first = false;
    if (!first) sb.append(", ");
    sb.append("click:");
    sb.append(this.click);
    first = false;
    if (!first) sb.append(", ");
    sb.append("solutionId:");
    sb.append(this.solutionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("updateTime:");
    sb.append(this.updateTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResponseDeliverInfoStandardSchemeFactory implements SchemeFactory {
    public ResponseDeliverInfoStandardScheme getScheme() {
      return new ResponseDeliverInfoStandardScheme();
    }
  }

  private static class ResponseDeliverInfoStandardScheme extends StandardScheme<ResponseDeliverInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResponseDeliverInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BID_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.bidCount = iprot.readI64();
              struct.setBidCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IMPRESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.impression = iprot.readI64();
              struct.setImpressionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLICK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.click = iprot.readI64();
              struct.setClickIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SOLUTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.solutionId = iprot.readI64();
              struct.setSolutionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UPDATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.updateTime = iprot.readI64();
              struct.setUpdateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResponseDeliverInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BID_COUNT_FIELD_DESC);
      oprot.writeI64(struct.bidCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IMPRESSION_FIELD_DESC);
      oprot.writeI64(struct.impression);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CLICK_FIELD_DESC);
      oprot.writeI64(struct.click);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SOLUTION_ID_FIELD_DESC);
      oprot.writeI64(struct.solutionId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UPDATE_TIME_FIELD_DESC);
      oprot.writeI64(struct.updateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResponseDeliverInfoTupleSchemeFactory implements SchemeFactory {
    public ResponseDeliverInfoTupleScheme getScheme() {
      return new ResponseDeliverInfoTupleScheme();
    }
  }

  private static class ResponseDeliverInfoTupleScheme extends TupleScheme<ResponseDeliverInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResponseDeliverInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBidCount()) {
        optionals.set(0);
      }
      if (struct.isSetImpression()) {
        optionals.set(1);
      }
      if (struct.isSetClick()) {
        optionals.set(2);
      }
      if (struct.isSetSolutionId()) {
        optionals.set(3);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBidCount()) {
        oprot.writeI64(struct.bidCount);
      }
      if (struct.isSetImpression()) {
        oprot.writeI64(struct.impression);
      }
      if (struct.isSetClick()) {
        oprot.writeI64(struct.click);
      }
      if (struct.isSetSolutionId()) {
        oprot.writeI64(struct.solutionId);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeI64(struct.updateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResponseDeliverInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.bidCount = iprot.readI64();
        struct.setBidCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.impression = iprot.readI64();
        struct.setImpressionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.click = iprot.readI64();
        struct.setClickIsSet(true);
      }
      if (incoming.get(3)) {
        struct.solutionId = iprot.readI64();
        struct.setSolutionIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.updateTime = iprot.readI64();
        struct.setUpdateTimeIsSet(true);
      }
    }
  }

}

