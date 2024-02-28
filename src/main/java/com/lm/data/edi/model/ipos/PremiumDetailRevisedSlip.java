package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumDetailRevisedSlip
 */

@JsonTypeName("premiumDetail_revisedSlip")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumDetailRevisedSlip implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal order1;

  private BigDecimal order2;

  private String narrative;

  public PremiumDetailRevisedSlip order1(BigDecimal order1) {
    this.order1 = order1;
    return this;
  }

  /**
   * Get order1
   * @return order1
  */
  @Valid 

  @JsonProperty("order1")
  public BigDecimal getOrder1() {
    return order1;
  }

  public void setOrder1(BigDecimal order1) {
    this.order1 = order1;
  }

  public PremiumDetailRevisedSlip order2(BigDecimal order2) {
    this.order2 = order2;
    return this;
  }

  /**
   * Get order2
   * @return order2
  */
  @Valid 

  @JsonProperty("order2")
  public BigDecimal getOrder2() {
    return order2;
  }

  public void setOrder2(BigDecimal order2) {
    this.order2 = order2;
  }

  public PremiumDetailRevisedSlip narrative(String narrative) {
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
    PremiumDetailRevisedSlip premiumDetailRevisedSlip = (PremiumDetailRevisedSlip) o;
    return Objects.equals(this.order1, premiumDetailRevisedSlip.order1) &&
        Objects.equals(this.order2, premiumDetailRevisedSlip.order2) &&
        Objects.equals(this.narrative, premiumDetailRevisedSlip.narrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order1, order2, narrative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumDetailRevisedSlip {\n");
    sb.append("    order1: ").append(toIndentedString(order1)).append("\n");
    sb.append("    order2: ").append(toIndentedString(order2)).append("\n");
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

