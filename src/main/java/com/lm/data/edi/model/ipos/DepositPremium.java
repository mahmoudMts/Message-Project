package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * DepositPremium
 */

@JsonTypeName("depositPremium")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class DepositPremium implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal amount;

  private String percentage;

  private BigDecimal rateOfExchange;

  private String details;

  private BigDecimal totalMinPremAmt;

  public DepositPremium amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 

  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public DepositPremium percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  
@Pattern(regexp="\\d+(?:\\.\\d+)?") 
  @JsonProperty("percentage")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public DepositPremium rateOfExchange(BigDecimal rateOfExchange) {
    this.rateOfExchange = rateOfExchange;
    return this;
  }

  /**
   * Get rateOfExchange
   * @return rateOfExchange
  */
  @Valid 

  @JsonProperty("rateOfExchange")
  public BigDecimal getRateOfExchange() {
    return rateOfExchange;
  }

  public void setRateOfExchange(BigDecimal rateOfExchange) {
    this.rateOfExchange = rateOfExchange;
  }

  public DepositPremium details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  

  @JsonProperty("details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public DepositPremium totalMinPremAmt(BigDecimal totalMinPremAmt) {
    this.totalMinPremAmt = totalMinPremAmt;
    return this;
  }

  /**
   * Get totalMinPremAmt
   * @return totalMinPremAmt
  */
  @Valid 

  @JsonProperty("totalMinPremAmt")
  public BigDecimal getTotalMinPremAmt() {
    return totalMinPremAmt;
  }

  public void setTotalMinPremAmt(BigDecimal totalMinPremAmt) {
    this.totalMinPremAmt = totalMinPremAmt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositPremium depositPremium = (DepositPremium) o;
    return Objects.equals(this.amount, depositPremium.amount) &&
        Objects.equals(this.percentage, depositPremium.percentage) &&
        Objects.equals(this.rateOfExchange, depositPremium.rateOfExchange) &&
        Objects.equals(this.details, depositPremium.details) &&
        Objects.equals(this.totalMinPremAmt, depositPremium.totalMinPremAmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, percentage, rateOfExchange, details, totalMinPremAmt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositPremium {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    rateOfExchange: ").append(toIndentedString(rateOfExchange)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    totalMinPremAmt: ").append(toIndentedString(totalMinPremAmt)).append("\n");
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

