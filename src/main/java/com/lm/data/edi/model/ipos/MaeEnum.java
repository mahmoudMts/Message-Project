package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets maeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum MaeEnum {
  
  FEES_AND_EXPENSES("Fees and Expenses"),
  
  BROKERAGE_AND_COMMISSION("Brokerage and Commission"),
  
  TAX_ADJUSTMENT_NON_CTS("Tax Adjustment - Non Cts");

  private String value;

  MaeEnum(String value) {
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
  public static MaeEnum fromValue(String value) {
    for (MaeEnum b : MaeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

