package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets settlementStatusEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum SettlementStatusEnum {
  
  NONE("None"),
  
  SETTLED("Settled"),
  
  SETTLED_DIRECT("Settled Direct"),
  
  SETTLEMENT_FAILED("Settlement Failed"),
  
  SETTLEMENT_REQUESTED("Settlement Requested");

  private String value;

  SettlementStatusEnum(String value) {
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
  public static SettlementStatusEnum fromValue(String value) {
    for (SettlementStatusEnum b : SettlementStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

