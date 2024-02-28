package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CommunicationContactNumbers
 */

@JsonTypeName("communication_contactNumbers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class CommunicationContactNumbers implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * This is the type of phone number provided (ie mobile, fax, phone, etc)
   */
  public enum PhoneTypeCodeEnum {
    PHONE("Phone"),
    
    FAX("Fax");

    private String value;

    PhoneTypeCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PhoneTypeCodeEnum fromValue(String value) {
      for (PhoneTypeCodeEnum b : PhoneTypeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PhoneTypeCodeEnum phoneTypeCode;

  private String phoneNumber;

  public CommunicationContactNumbers phoneTypeCode(PhoneTypeCodeEnum phoneTypeCode) {
    this.phoneTypeCode = phoneTypeCode;
    return this;
  }

  /**
   * This is the type of phone number provided (ie mobile, fax, phone, etc)
   * @return phoneTypeCode
  */
  

  @JsonProperty("phoneTypeCode")
  public PhoneTypeCodeEnum getPhoneTypeCode() {
    return phoneTypeCode;
  }

  public void setPhoneTypeCode(PhoneTypeCodeEnum phoneTypeCode) {
    this.phoneTypeCode = phoneTypeCode;
  }

  public CommunicationContactNumbers phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * This is the number used for the associated communication
   * @return phoneNumber
  */
  

  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommunicationContactNumbers communicationContactNumbers = (CommunicationContactNumbers) o;
    return Objects.equals(this.phoneTypeCode, communicationContactNumbers.phoneTypeCode) &&
        Objects.equals(this.phoneNumber, communicationContactNumbers.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneTypeCode, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunicationContactNumbers {\n");
    sb.append("    phoneTypeCode: ").append(toIndentedString(phoneTypeCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

