package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets typeOfLlyodsPremiums
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum TypeOfLlyodsPremiums {
  
  PREMIUM("premium"),
  
  LM_RETURN_PREMIUM_RP("lm_return_premium_rp"),
  
  LM_ADDITIONAL_PREMIUM_AP("lm_additional_premium_ap");

  private String value;

  TypeOfLlyodsPremiums(String value) {
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
  public static TypeOfLlyodsPremiums fromValue(String value) {
    for (TypeOfLlyodsPremiums b : TypeOfLlyodsPremiums.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

