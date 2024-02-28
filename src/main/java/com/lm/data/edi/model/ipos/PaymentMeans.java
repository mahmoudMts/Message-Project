package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The payment method to be used for this settlement. For Lloyd's this must always appear at transaction level. For Company, this must be at line item level and overrides parties response (preference).
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-31T21:13:13.176635500+05:30[Asia/Calcutta]")
public enum PaymentMeans {
  
  CENTRALLY_SETTLED("CENTRALLY_SETTLED"),
  
  VITESSE_IMMEDIATE("VITESSE_IMMEDIATE"),
  
  VITESSE_DEFERRED("VITESSE_DEFERRED"),
  
  NONE("NONE");

  private String value;

  PaymentMeans(String value) {
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
  public static PaymentMeans fromValue(String value) {
    for (PaymentMeans b : PaymentMeans.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

