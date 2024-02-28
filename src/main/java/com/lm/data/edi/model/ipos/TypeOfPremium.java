package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets typeOfPremium
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum TypeOfPremium {
  
  ORIGINAL_PREMIUM("Original_Premium"),
  
  ADDITIONAL_PREMIUM("Additional_Premium"),
  
  RETURN_PREMIUM("Return_Premium"),
  
  ADJUSTMENT_AP("Adjustment_AP"),
  
  ADJUSTMENT_RP("Adjustment_RP");

  private String value;

  TypeOfPremium(String value) {
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
  public static TypeOfPremium fromValue(String value) {
    for (TypeOfPremium b : TypeOfPremium.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

