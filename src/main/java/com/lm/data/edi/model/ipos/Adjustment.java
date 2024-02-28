package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * Adjustment
 */

@JsonTypeName("adjustment")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Adjustment implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer daysCredit;

  private BigDecimal rate;

  private Integer noOfAdjustments;

  private String narrative;

  public Adjustment daysCredit(Integer daysCredit) {
    this.daysCredit = daysCredit;
    return this;
  }

  /**
   * Get daysCredit
   * @return daysCredit
  */
  

  @JsonProperty("daysCredit")
  public Integer getDaysCredit() {
    return daysCredit;
  }

  public void setDaysCredit(Integer daysCredit) {
    this.daysCredit = daysCredit;
  }

  public Adjustment rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  @Valid 

  @JsonProperty("rate")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public Adjustment noOfAdjustments(Integer noOfAdjustments) {
    this.noOfAdjustments = noOfAdjustments;
    return this;
  }

  /**
   * Get noOfAdjustments
   * @return noOfAdjustments
  */
  

  @JsonProperty("noOfAdjustments")
  public Integer getNoOfAdjustments() {
    return noOfAdjustments;
  }

  public void setNoOfAdjustments(Integer noOfAdjustments) {
    this.noOfAdjustments = noOfAdjustments;
  }

  public Adjustment narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

  /**
   * Get narrative
   * @return narrative
  */
  

  @JsonProperty("narrative")
  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adjustment adjustment = (Adjustment) o;
    return Objects.equals(this.daysCredit, adjustment.daysCredit) &&
        Objects.equals(this.rate, adjustment.rate) &&
        Objects.equals(this.noOfAdjustments, adjustment.noOfAdjustments) &&
        Objects.equals(this.narrative, adjustment.narrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysCredit, rate, noOfAdjustments, narrative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adjustment {\n");
    sb.append("    daysCredit: ").append(toIndentedString(daysCredit)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    noOfAdjustments: ").append(toIndentedString(noOfAdjustments)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
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

