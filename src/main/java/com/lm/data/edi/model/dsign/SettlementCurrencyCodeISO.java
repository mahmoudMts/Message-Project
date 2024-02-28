package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The ISO code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. TBC the Settlement curencies used (Obsolete currencies removed-ITL, DEM, FRF, NLG). Note that if JPY- no decimal point is used.
 */
public enum SettlementCurrencyCodeISO {
  GBP("GBP"),
    USD("USD"),
    CAD("CAD"),
    JPY("JPY"),
    AUD("AUD"),
    EUR("EUR"),
    SEK("SEK"),
    NOK("NOK"),
    HKD("HKD"),
    DKK("DKK"),
    CHF("CHF"),
    ZAR("ZAR"),
    SGD("SGD"),
    NZD("NZD");

  private String value;

  SettlementCurrencyCodeISO(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SettlementCurrencyCodeISO fromValue(String text) {
    for (SettlementCurrencyCodeISO b : SettlementCurrencyCodeISO.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
