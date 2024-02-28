package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * PeriodProperties
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class PeriodProperties   {

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("nonStandardPolicyPeriod")
  private NonStandardPolicyPeriodEnum nonStandardPolicyPeriod;
  /**
   * Indicates if the Period Dates are non-standard, Y - If ‘Y’ ‘to’ and ‘from’ dates may be Zero. Values - Y- Yes, N- No, P-Dates prior to 1/12/1984
   */
  public enum NonStandardPolicyPeriodEnum {
    Y("Y"),
    
    N("N"),
    
    P("P");

    private String value;

    NonStandardPolicyPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NonStandardPolicyPeriodEnum fromValue(String text) {
      for (NonStandardPolicyPeriodEnum b : NonStandardPolicyPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }



}
