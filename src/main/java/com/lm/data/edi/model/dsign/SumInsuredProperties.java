package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SumInsuredProperties
 */
@Data
@EqualsAndHashCode
@ToString
@SuperBuilder
public class SumInsuredProperties   {

  @JsonProperty("total")
  @Pattern(regexp = "[0-9]{0,13}(?:[.][0-9]{2})")
  @NotNull
  private String total = null;

  @JsonProperty("currencyCodeISO")
  @Pattern(regexp = "[A-Z]{3}")
  private String currencyCodeISO;

  @JsonProperty("currencyCodeILU")
  @Size(max=3)
  private String currencyCodeILU;

  @JsonProperty("sumInsuredIncreasedIndicator")
  private SumInsuredIncreasedIndicator sumInsuredIncreasedIndicator;

  @JsonProperty("nonStandardIndicator")
  private NonStandardIndicator nonStandardIndicator;
  /**
   * An indicator for if the sum insured is increasing. Used only for originalSumInsuredTotal
   */ public enum NonStandardIndicator {

    Y("Y"),
    N("N");
    private final String value;
    private final static Map<String, SumInsuredProperties.NonStandardIndicator> CONSTANTS = new HashMap<String, SumInsuredProperties.NonStandardIndicator>();

    static {
      for (SumInsuredProperties.NonStandardIndicator c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private NonStandardIndicator(String value) {
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
    public static SumInsuredProperties.NonStandardIndicator fromValue(String value) {
      SumInsuredProperties.NonStandardIndicator constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

  public enum SumInsuredIncreasedIndicator {

    Y("Y"),
    N("N");
    private final String value;
    private final static Map<String, SumInsuredIncreasedIndicator> CONSTANTS = new HashMap<String, SumInsuredIncreasedIndicator>();

    static {
      for (SumInsuredProperties.SumInsuredIncreasedIndicator c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private SumInsuredIncreasedIndicator(String value) {
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
    public static SumInsuredProperties.SumInsuredIncreasedIndicator fromValue(String value) {
      SumInsuredProperties.SumInsuredIncreasedIndicator constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

}
