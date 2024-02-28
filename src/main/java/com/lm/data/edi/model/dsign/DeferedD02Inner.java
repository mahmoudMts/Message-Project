package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * DeferedD02Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class DeferedD02Inner   {
  @JsonProperty("D02D03D04D05CommonContainers")
  private D02D03D04D05InCommon d02D03D04D05CommonContainers;

  @JsonProperty("paymentMethodIndicator")
  private PaymentMethodIndicator paymentMethodIndicator;

  @JsonProperty("dueDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private String dueDate;

  @JsonProperty("premiumProportionOriginalCurrency")
  @Pattern(regexp ="-?[0-9]+(?:[.][0-9]{2})?")
  @NotNull
  private String premiumProportionOriginalCurrency;

  @JsonProperty("premiumProportionSettlementCurrency")
  @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
  @NotNull
  private String premiumProportionSettlementCurrency;

  /**
   * The method of payment which will be applied to the premium, in accordance with the terms of the slip, C-Cash, D- Deferred, R- Reserve
   */
  public enum PaymentMethodIndicator {

    C("C"),
    D("D"),
    R("R");
    private final String value;
    private final static Map<String, PaymentMethodIndicator> CONSTANTS = new HashMap<String, PaymentMethodIndicator>();

    static {
      for (DeferedD02Inner.PaymentMethodIndicator c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private PaymentMethodIndicator(String value) {
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
    public static DeferedD02Inner.PaymentMethodIndicator fromValue(String value) {
      DeferedD02Inner.PaymentMethodIndicator constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }


}
