package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * IllinoisPremium
 */

@JsonTypeName("illinoisPremium")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IllinoisPremium implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal premiumInOriginalCurr;

  private BigDecimal brokeragePercentage;

  public IllinoisPremium premiumInOriginalCurr(BigDecimal premiumInOriginalCurr) {
    this.premiumInOriginalCurr = premiumInOriginalCurr;
    return this;
  }

  /**
   * Get premiumInOriginalCurr
   * @return premiumInOriginalCurr
  */
  @Valid 

  @JsonProperty("premiumInOriginalCurr")
  public BigDecimal getPremiumInOriginalCurr() {
    return premiumInOriginalCurr;
  }

  public void setPremiumInOriginalCurr(BigDecimal premiumInOriginalCurr) {
    this.premiumInOriginalCurr = premiumInOriginalCurr;
  }

  public IllinoisPremium brokeragePercentage(BigDecimal brokeragePercentage) {
    this.brokeragePercentage = brokeragePercentage;
    return this;
  }

  /**
   * Get brokeragePercentage
   * @return brokeragePercentage
  */
  @Valid 

  @JsonProperty("brokeragePercentage")
  public BigDecimal getBrokeragePercentage() {
    return brokeragePercentage;
  }

  public void setBrokeragePercentage(BigDecimal brokeragePercentage) {
    this.brokeragePercentage = brokeragePercentage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IllinoisPremium illinoisPremium = (IllinoisPremium) o;
    return Objects.equals(this.premiumInOriginalCurr, illinoisPremium.premiumInOriginalCurr) &&
        Objects.equals(this.brokeragePercentage, illinoisPremium.brokeragePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumInOriginalCurr, brokeragePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IllinoisPremium {\n");
    sb.append("    premiumInOriginalCurr: ").append(toIndentedString(premiumInOriginalCurr)).append("\n");
    sb.append("    brokeragePercentage: ").append(toIndentedString(brokeragePercentage)).append("\n");
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

