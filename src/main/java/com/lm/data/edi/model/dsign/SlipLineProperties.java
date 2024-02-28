package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * SlipLineProperties
 */
@Data
@EqualsAndHashCode
@ToString
@SuperBuilder
public class SlipLineProperties   {
  @JsonProperty("slipOrder")
  private Double slipOrder;

  @JsonProperty("revisedSlipOrder")
  private Double revisedSlipOrder;

  @JsonProperty("nonStandardSlipOrder")
  private NonStandardSlipOrder nonStandardSlipOrder;

  /**
   * Indicates the Slip Order is nonstandard. Values - Y- Yes, N- No
   */
  public enum NonStandardSlipOrder {

    Y("Y"),
    N("N");
    private final String value;
    private final static Map<String, NonStandardSlipOrder> CONSTANTS = new HashMap<String, NonStandardSlipOrder>();

    static {
      for (SlipLineProperties.NonStandardSlipOrder c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private NonStandardSlipOrder(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return this.value;
    }

    @JsonValue
    public String value() {
      return this.value;
    }

    @JsonCreator
    public static SlipLineProperties.NonStandardSlipOrder fromValue(String value) {
      SlipLineProperties.NonStandardSlipOrder constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

}
