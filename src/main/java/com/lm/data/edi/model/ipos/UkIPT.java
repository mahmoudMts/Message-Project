package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * UkIPT
 */

@JsonTypeName("ukIPT")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UkIPT implements Serializable {

  private static final long serialVersionUID = 1L;

  private PartWholeEnum partWhole;

  private BigDecimal rate;

  private BigDecimal taxablePremium;

  private BigDecimal amount;

  public UkIPT partWhole(PartWholeEnum partWhole) {
    this.partWhole = partWhole;
    return this;
  }

  /**
   * Get partWhole
   * @return partWhole
  */
  @Valid 

  @JsonProperty("partWhole")
  public PartWholeEnum getPartWhole() {
    return partWhole;
  }

  public void setPartWhole(PartWholeEnum partWhole) {
    this.partWhole = partWhole;
  }

  public UkIPT rate(BigDecimal rate) {
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

  public UkIPT taxablePremium(BigDecimal taxablePremium) {
    this.taxablePremium = taxablePremium;
    return this;
  }

  /**
   * Get taxablePremium
   * @return taxablePremium
  */
  @Valid 

  @JsonProperty("taxablePremium")
  public BigDecimal getTaxablePremium() {
    return taxablePremium;
  }

  public void setTaxablePremium(BigDecimal taxablePremium) {
    this.taxablePremium = taxablePremium;
  }

  public UkIPT amount(BigDecimal amount) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UkIPT ukIPT = (UkIPT) o;
    return Objects.equals(this.partWhole, ukIPT.partWhole) &&
        Objects.equals(this.rate, ukIPT.rate) &&
        Objects.equals(this.taxablePremium, ukIPT.taxablePremium) &&
        Objects.equals(this.amount, ukIPT.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partWhole, rate, taxablePremium, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UkIPT {\n");
    sb.append("    partWhole: ").append(toIndentedString(partWhole)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    taxablePremium: ").append(toIndentedString(taxablePremium)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

