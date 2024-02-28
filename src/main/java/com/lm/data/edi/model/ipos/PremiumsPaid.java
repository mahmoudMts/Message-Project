package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Returns the premium paid status indicator
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumsPaid implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Indicator whether the premiums have been paid. Y means all Premiums have been fully paid, P means Partially paid, N means no payments have been made
   */
  public enum PremiumPaidIndicatorEnum {
    Y("Y"),
    
    P("P"),
    
    N("N");

    private String value;

    PremiumPaidIndicatorEnum(String value) {
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
    public static PremiumPaidIndicatorEnum fromValue(String value) {
      for (PremiumPaidIndicatorEnum b : PremiumPaidIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PremiumPaidIndicatorEnum premiumPaidIndicator;

  public PremiumsPaid premiumPaidIndicator(PremiumPaidIndicatorEnum premiumPaidIndicator) {
    this.premiumPaidIndicator = premiumPaidIndicator;
    return this;
  }

  /**
   * Indicator whether the premiums have been paid. Y means all Premiums have been fully paid, P means Partially paid, N means no payments have been made
   * @return premiumPaidIndicator
  */
  

  @JsonProperty("premiumPaidIndicator")
  public PremiumPaidIndicatorEnum getPremiumPaidIndicator() {
    return premiumPaidIndicator;
  }

  public void setPremiumPaidIndicator(PremiumPaidIndicatorEnum premiumPaidIndicator) {
    this.premiumPaidIndicator = premiumPaidIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumsPaid premiumsPaid = (PremiumsPaid) o;
    return Objects.equals(this.premiumPaidIndicator, premiumsPaid.premiumPaidIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumPaidIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumsPaid {\n");
    sb.append("    premiumPaidIndicator: ").append(toIndentedString(premiumPaidIndicator)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

