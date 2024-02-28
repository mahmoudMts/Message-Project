package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets typeOfUpdateEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum TypeOfUpdateEnum {
  
  SECTION_DETAILS("Section_Details"),
  
  PREMIUM_DETAILS("Premium_Details"),
  
  MARKET_DETAILS("Market_Details"),
  
  SIGNING_DETAILS("Signing_Details"),
  
  ADDITIONAL_PREMIUM("Additional_Premium"),
  
  RETURN_PREMIUM("Return_Premium"),
  
  ADJUSTMENT_AP("Adjustment_AP"),
  
  ADJUSTMENT_RP("Adjustment_RP"),
  
  AUTORI_SIGNING_DETAILS("AutoRI_Signing_Details");

  private String value;

  TypeOfUpdateEnum(String value) {
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
  public static TypeOfUpdateEnum fromValue(String value) {
    for (TypeOfUpdateEnum b : TypeOfUpdateEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

