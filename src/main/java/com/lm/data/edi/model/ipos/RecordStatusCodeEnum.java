package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets recordStatusCodeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum RecordStatusCodeEnum {
  
  ACTIVE("Active"),
  
  CANCELLED("Cancelled"),
  
  AMENDED("Amended"),
  
  CORRECTED("Corrected"),
  
  SIGNED("Signed"),
  
  REJECTED("Rejected"),
  
  WITHDRAWN("Withdrawn");

  private String value;

  RecordStatusCodeEnum(String value) {
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
  public static RecordStatusCodeEnum fromValue(String value) {
    for (RecordStatusCodeEnum b : RecordStatusCodeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

