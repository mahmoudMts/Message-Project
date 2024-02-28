package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The old ILU style currency code of the currency in which settlement of the transaction will be made between Brokers, Underwriters and the Bureau. Replaced by settlementCurrencyISOCode. Obsolete currencies are removed-LRE, DMK, NXF, DFL so actual number of currencies is 14.
 */
public enum SettlementCurrencyCodeILU {
  DOLLAR("$"),
    US_("US$"),
    C_("C$"),
    YEN("YEN"),
    AU_("AU$"),
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

  SettlementCurrencyCodeILU(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SettlementCurrencyCodeILU fromValue(String text) {
    for (SettlementCurrencyCodeILU b : SettlementCurrencyCodeILU.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
