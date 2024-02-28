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
 * VatDetails
 */

@JsonTypeName("vatDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class VatDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal taxablePremium;

  private BigDecimal taxAmount;

  private String currencyCode;

  public VatDetails taxablePremium(BigDecimal taxablePremium) {
    this.taxablePremium = taxablePremium;
    return this;
  }

  /**
   * amount of the premium that is taxable
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

  public VatDetails taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * amount to be used for the vat calculation
   * @return taxAmount
  */
  @Valid 

  @JsonProperty("taxAmount")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public VatDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * ISO alpha-3 currency code of the amounts
   * @return currencyCode
  */
  
@Pattern(regexp="[A-Z]{3}") 
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatDetails vatDetails = (VatDetails) o;
    return Objects.equals(this.taxablePremium, vatDetails.taxablePremium) &&
        Objects.equals(this.taxAmount, vatDetails.taxAmount) &&
        Objects.equals(this.currencyCode, vatDetails.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxablePremium, taxAmount, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatDetails {\n");
    sb.append("    taxablePremium: ").append(toIndentedString(taxablePremium)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

