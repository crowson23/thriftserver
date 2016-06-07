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
public class ResponseQuota implements org.apache.thrift.TBase<ResponseQuota, ResponseQuota._Fields>, java.io.Serializable, Cloneable, Comparable<ResponseQuota> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResponseQuota");

  private static final org.apache.thrift.protocol.TField QUOTA_FIELD_DESC = new org.apache.thrift.protocol.TField("quota", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SOLUTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("solutionId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("updateTime", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResponseQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResponseQuotaTupleSchemeFactory());
  }

  public long quota; // required
  public long solutionId; // required
  public long updateTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUOTA((short)1, "quota"),
    SOLUTION_ID((short)2, "solutionId"),
    UPDATE_TIME((short)3, "updateTime");

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
        case 1: // QUOTA
          return QUOTA;
        case 2: // SOLUTION_ID
          return SOLUTION_ID;
        case 3: // UPDATE_TIME
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
  private static final int __QUOTA_ISSET_ID = 0;
  private static final int __SOLUTIONID_ISSET_ID = 1;
  private static final int __UPDATETIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUOTA, new org.apache.thrift.meta_data.FieldMetaData("quota", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SOLUTION_ID, new org.apache.thrift.meta_data.FieldMetaData("solutionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UPDATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("updateTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResponseQuota.class, metaDataMap);
  }

  public ResponseQuota() {
    this.quota = 0L;

    this.solutionId = 0L;

    this.updateTime = 0L;

  }

  public ResponseQuota(
    long quota,
    long solutionId,
    long updateTime)
  {
    this();
    this.quota = quota;
    setQuotaIsSet(true);
    this.solutionId = solutionId;
    setSolutionIdIsSet(true);
    this.updateTime = updateTime;
    setUpdateTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResponseQuota(ResponseQuota other) {
    __isset_bitfield = other.__isset_bitfield;
    this.quota = other.quota;
    this.solutionId = other.solutionId;
    this.updateTime = other.updateTime;
  }

  public ResponseQuota deepCopy() {
    return new ResponseQuota(this);
  }

  @Override
  public void clear() {
    this.quota = 0L;

    this.solutionId = 0L;

    this.updateTime = 0L;

  }

  public long getQuota() {
    return this.quota;
  }

  public ResponseQuota setQuota(long quota) {
    this.quota = quota;
    setQuotaIsSet(true);
    return this;
  }

  public void unsetQuota() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUOTA_ISSET_ID);
  }

  /** Returns true if field quota is set (has been assigned a value) and false otherwise */
  public boolean isSetQuota() {
    return EncodingUtils.testBit(__isset_bitfield, __QUOTA_ISSET_ID);
  }

  public void setQuotaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUOTA_ISSET_ID, value);
  }

  public long getSolutionId() {
    return this.solutionId;
  }

  public ResponseQuota setSolutionId(long solutionId) {
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

  public ResponseQuota setUpdateTime(long updateTime) {
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
    case QUOTA:
      if (value == null) {
        unsetQuota();
      } else {
        setQuota((Long)value);
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
    case QUOTA:
      return getQuota();

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
    case QUOTA:
      return isSetQuota();
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
    if (that instanceof ResponseQuota)
      return this.equals((ResponseQuota)that);
    return false;
  }

  public boolean equals(ResponseQuota that) {
    if (that == null)
      return false;

    boolean this_present_quota = true;
    boolean that_present_quota = true;
    if (this_present_quota || that_present_quota) {
      if (!(this_present_quota && that_present_quota))
        return false;
      if (this.quota != that.quota)
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

    boolean present_quota = true;
    list.add(present_quota);
    if (present_quota)
      list.add(quota);

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
  public int compareTo(ResponseQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuota()).compareTo(other.isSetQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuota()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.quota, other.quota);
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
    StringBuilder sb = new StringBuilder("ResponseQuota(");
    boolean first = true;

    sb.append("quota:");
    sb.append(this.quota);
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

  private static class ResponseQuotaStandardSchemeFactory implements SchemeFactory {
    public ResponseQuotaStandardScheme getScheme() {
      return new ResponseQuotaStandardScheme();
    }
  }

  private static class ResponseQuotaStandardScheme extends StandardScheme<ResponseQuota> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResponseQuota struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUOTA
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.quota = iprot.readI64();
              struct.setQuotaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOLUTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.solutionId = iprot.readI64();
              struct.setSolutionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATE_TIME
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResponseQuota struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(QUOTA_FIELD_DESC);
      oprot.writeI64(struct.quota);
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

  private static class ResponseQuotaTupleSchemeFactory implements SchemeFactory {
    public ResponseQuotaTupleScheme getScheme() {
      return new ResponseQuotaTupleScheme();
    }
  }

  private static class ResponseQuotaTupleScheme extends TupleScheme<ResponseQuota> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResponseQuota struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetQuota()) {
        optionals.set(0);
      }
      if (struct.isSetSolutionId()) {
        optionals.set(1);
      }
      if (struct.isSetUpdateTime()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetQuota()) {
        oprot.writeI64(struct.quota);
      }
      if (struct.isSetSolutionId()) {
        oprot.writeI64(struct.solutionId);
      }
      if (struct.isSetUpdateTime()) {
        oprot.writeI64(struct.updateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResponseQuota struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.quota = iprot.readI64();
        struct.setQuotaIsSet(true);
      }
      if (incoming.get(1)) {
        struct.solutionId = iprot.readI64();
        struct.setSolutionIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.updateTime = iprot.readI64();
        struct.setUpdateTimeIsSet(true);
      }
    }
  }

}
