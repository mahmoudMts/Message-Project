package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AdjustmentD02Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class AdjustmentD02Inner   {
  @JsonProperty("D02D03D04D05CommonContainers")
  @Valid
  @NotNull
  private D02D03D04D05InCommon d02D03D04D05CommonContainers;

  @JsonProperty("coInsuranceIndicator")
  private CoInsuranceIndicator coInsuranceIndicator;

  @JsonProperty("cedentPremiumPaid")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String cedentPremiumPaid;

  @JsonProperty("exchangeRateMinimumPremiumISO")
  @Size(max=3)
  private String exchangeRateMinimumPremiumISO;

  @JsonProperty("reappointedPremiumRateOfExchange")
  @Pattern(regexp="-?[0-9]{1,8}(?:[.][0-9]{1,7})?")
  private String reappointedPremiumRateOfExchange;

  @JsonProperty("adjustedAmount")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String adjustedAmount;

  @JsonProperty("previouslyPaid")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String previouslyPaid;

  @JsonProperty("adjustmentDue")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String adjustmentDue;

  @JsonProperty("minimumReapointedAmount")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String minimumReapointedAmount;

  @JsonProperty("adjustmentDataIndicator")
  private AdjustmentDataIndicator adjustmentDataIndicator;

  @JsonProperty("adjustedRate")
  @Pattern(regexp="-?[0-9]{1,2}(?:[.][0-9]{1,7})?")
  private String adjustedRate;

  @JsonProperty("originalCurrencyISO")
  @Size(max=3)
  private String originalCurrencyISO;

  @JsonProperty("minimumPremium")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String minimumPremium;

  @JsonProperty("depositPremium")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String depositPremium;

  @JsonProperty("exchangeRateMinimumPremium")
  private Double exchangeRateMinimumPremium;

  @JsonProperty("minimumPremiumTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String minimumPremiumTotal;

  @JsonProperty("minimumAndDepositPremiumNarrative")
  @Size(max=100)
  private String minimumAndDepositPremiumNarrative;

  /**
   * XL Adjustment data is present, Values Y- Yes, there is Adjustment data,N- No
   */
  public enum AdjustmentDataIndicator {

    Y("Y"),
    N("N");
    private final String value;
    private final static Map<String, AdjustmentDataIndicator> CONSTANTS = new HashMap<String, AdjustmentDataIndicator>();

    static {
      for (AdjustmentD02Inner.AdjustmentDataIndicator c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private AdjustmentDataIndicator(String value) {
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
    public static AdjustmentD02Inner.AdjustmentDataIndicator fromValue(String value) {
      AdjustmentD02Inner.AdjustmentDataIndicator constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }


  /**
   * An indicator to denote whether or not co-reinsurance is in effect. If it is, then the slip order percentages cannot be applied in calculating the Actual Premium Due. 'Y' - Co-reinsurance is in effect, 'N' - There is no Co-reinsurance
   */
  public enum CoInsuranceIndicator {

    Y("Y"),
    N("N");
    private final String value;
    private final static Map<String, AdjustmentD02Inner.CoInsuranceIndicator> CONSTANTS = new HashMap<String, AdjustmentD02Inner.CoInsuranceIndicator>();

    static {
      for (AdjustmentD02Inner.CoInsuranceIndicator c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private CoInsuranceIndicator(String value) {
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
    public static AdjustmentD02Inner.CoInsuranceIndicator fromValue(String value) {
      AdjustmentD02Inner.CoInsuranceIndicator constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }


}
