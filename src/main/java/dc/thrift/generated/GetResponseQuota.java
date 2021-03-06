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
public class GetResponseQuota implements org.apache.thrift.TBase<GetResponseQuota, GetResponseQuota._Fields>, java.io.Serializable, Cloneable, Comparable<GetResponseQuota> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetResponseQuota");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESPONSE_QUOTA_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("responseQuotaList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetResponseQuotaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetResponseQuotaTupleSchemeFactory());
  }

  /**
   * 
   * @see Status
   */
  public Status status; // required
  public List<ResponseQuota> responseQuotaList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see Status
     */
    STATUS((short)1, "status"),
    RESPONSE_QUOTA_LIST((short)2, "responseQuotaList");

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
        case 1: // STATUS
          return STATUS;
        case 2: // RESPONSE_QUOTA_LIST
          return RESPONSE_QUOTA_LIST;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Status.class)));
    tmpMap.put(_Fields.RESPONSE_QUOTA_LIST, new org.apache.thrift.meta_data.FieldMetaData("responseQuotaList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ResponseQuota.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetResponseQuota.class, metaDataMap);
  }

  public GetResponseQuota() {
    this.status = dc.thrift.generated.Status.ERROR_UNINITIALIZED;

  }

  public GetResponseQuota(
    Status status,
    List<ResponseQuota> responseQuotaList)
  {
    this();
    this.status = status;
    this.responseQuotaList = responseQuotaList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetResponseQuota(GetResponseQuota other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetResponseQuotaList()) {
      List<ResponseQuota> __this__responseQuotaList = new ArrayList<ResponseQuota>(other.responseQuotaList.size());
      for (ResponseQuota other_element : other.responseQuotaList) {
        __this__responseQuotaList.add(new ResponseQuota(other_element));
      }
      this.responseQuotaList = __this__responseQuotaList;
    }
  }

  public GetResponseQuota deepCopy() {
    return new GetResponseQuota(this);
  }

  @Override
  public void clear() {
    this.status = dc.thrift.generated.Status.ERROR_UNINITIALIZED;

    this.responseQuotaList = null;
  }

  /**
   * 
   * @see Status
   */
  public Status getStatus() {
    return this.status;
  }

  /**
   * 
   * @see Status
   */
  public GetResponseQuota setStatus(Status status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getResponseQuotaListSize() {
    return (this.responseQuotaList == null) ? 0 : this.responseQuotaList.size();
  }

  public java.util.Iterator<ResponseQuota> getResponseQuotaListIterator() {
    return (this.responseQuotaList == null) ? null : this.responseQuotaList.iterator();
  }

  public void addToResponseQuotaList(ResponseQuota elem) {
    if (this.responseQuotaList == null) {
      this.responseQuotaList = new ArrayList<ResponseQuota>();
    }
    this.responseQuotaList.add(elem);
  }

  public List<ResponseQuota> getResponseQuotaList() {
    return this.responseQuotaList;
  }

  public GetResponseQuota setResponseQuotaList(List<ResponseQuota> responseQuotaList) {
    this.responseQuotaList = responseQuotaList;
    return this;
  }

  public void unsetResponseQuotaList() {
    this.responseQuotaList = null;
  }

  /** Returns true if field responseQuotaList is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseQuotaList() {
    return this.responseQuotaList != null;
  }

  public void setResponseQuotaListIsSet(boolean value) {
    if (!value) {
      this.responseQuotaList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Status)value);
      }
      break;

    case RESPONSE_QUOTA_LIST:
      if (value == null) {
        unsetResponseQuotaList();
      } else {
        setResponseQuotaList((List<ResponseQuota>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case RESPONSE_QUOTA_LIST:
      return getResponseQuotaList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case RESPONSE_QUOTA_LIST:
      return isSetResponseQuotaList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetResponseQuota)
      return this.equals((GetResponseQuota)that);
    return false;
  }

  public boolean equals(GetResponseQuota that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_responseQuotaList = true && this.isSetResponseQuotaList();
    boolean that_present_responseQuotaList = true && that.isSetResponseQuotaList();
    if (this_present_responseQuotaList || that_present_responseQuotaList) {
      if (!(this_present_responseQuotaList && that_present_responseQuotaList))
        return false;
      if (!this.responseQuotaList.equals(that.responseQuotaList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_responseQuotaList = true && (isSetResponseQuotaList());
    list.add(present_responseQuotaList);
    if (present_responseQuotaList)
      list.add(responseQuotaList);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetResponseQuota other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseQuotaList()).compareTo(other.isSetResponseQuotaList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseQuotaList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseQuotaList, other.responseQuotaList);
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
    StringBuilder sb = new StringBuilder("GetResponseQuota(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("responseQuotaList:");
    if (this.responseQuotaList == null) {
      sb.append("null");
    } else {
      sb.append(this.responseQuotaList);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetResponseQuotaStandardSchemeFactory implements SchemeFactory {
    public GetResponseQuotaStandardScheme getScheme() {
      return new GetResponseQuotaStandardScheme();
    }
  }

  private static class GetResponseQuotaStandardScheme extends StandardScheme<GetResponseQuota> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetResponseQuota struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = dc.thrift.generated.Status.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESPONSE_QUOTA_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.responseQuotaList = new ArrayList<ResponseQuota>(_list8.size);
                ResponseQuota _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new ResponseQuota();
                  _elem9.read(iprot);
                  struct.responseQuotaList.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setResponseQuotaListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetResponseQuota struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.responseQuotaList != null) {
        oprot.writeFieldBegin(RESPONSE_QUOTA_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.responseQuotaList.size()));
          for (ResponseQuota _iter11 : struct.responseQuotaList)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetResponseQuotaTupleSchemeFactory implements SchemeFactory {
    public GetResponseQuotaTupleScheme getScheme() {
      return new GetResponseQuotaTupleScheme();
    }
  }

  private static class GetResponseQuotaTupleScheme extends TupleScheme<GetResponseQuota> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetResponseQuota struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetResponseQuotaList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetResponseQuotaList()) {
        {
          oprot.writeI32(struct.responseQuotaList.size());
          for (ResponseQuota _iter12 : struct.responseQuotaList)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetResponseQuota struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = dc.thrift.generated.Status.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.responseQuotaList = new ArrayList<ResponseQuota>(_list13.size);
          ResponseQuota _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new ResponseQuota();
            _elem14.read(iprot);
            struct.responseQuotaList.add(_elem14);
          }
        }
        struct.setResponseQuotaListIsSet(true);
      }
    }
  }

}

