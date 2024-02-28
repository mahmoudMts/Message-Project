package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets typeOfRefPremiums
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum TypeOfRefPremiums {
  
  PREMIUM("premium"),
  
  LM_RETURN_PREMIUM_RP("lm_return_premium_rp"),
  
  LM_ADDITIONAL_PREMIUM_AP("lm_additional_premium_ap"),
  
  LM_ADJUSTMENT_AP("lm_adjustment_ap"),
  
  LM_ADJUSTMENT_RP("lm_adjustment_rp");

  private String value;

  TypeOfRefPremiums(String value) {
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
  public static TypeOfRefPremiums fromValue(String value) {
    for (TypeOfRefPremiums b : TypeOfRefPremiums.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

