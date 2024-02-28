package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * AdditionalTaxDetails
 */

@JsonTypeName("additionalTaxDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class AdditionalTaxDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private String taxNarrative;

  private String taxReferenceNumber;

  private BigDecimal taxablePremiumBD;

  private Boolean detailsTBC;

  public AdditionalTaxDetails taxNarrative(String taxNarrative) {
    this.taxNarrative = taxNarrative;
    return this;
  }

  /**
   * Get taxNarrative
   * @return taxNarrative
  */
  

  @JsonProperty("taxNarrative")
  public String getTaxNarrative() {
    return taxNarrative;
  }

  public void setTaxNarrative(String taxNarrative) {
    this.taxNarrative = taxNarrative;
  }

  public AdditionalTaxDetails taxReferenceNumber(String taxReferenceNumber) {
    this.taxReferenceNumber = taxReferenceNumber;
    return this;
  }

  /**
   * Get taxReferenceNumber
   * @return taxReferenceNumber
  */
  

  @JsonProperty("taxReferenceNumber")
  public String getTaxReferenceNumber() {
    return taxReferenceNumber;
  }

  public void setTaxReferenceNumber(String taxReferenceNumber) {
    this.taxReferenceNumber = taxReferenceNumber;
  }

  public AdditionalTaxDetails taxablePremiumBD(BigDecimal taxablePremiumBD) {
    this.taxablePremiumBD = taxablePremiumBD;
    return this;
  }

  /**
   * Get taxablePremiumBD
   * @return taxablePremiumBD
  */
  @Valid 

  @JsonProperty("taxablePremiumBD")
  public BigDecimal getTaxablePremiumBD() {
    return taxablePremiumBD;
  }

  public void setTaxablePremiumBD(BigDecimal taxablePremiumBD) {
    this.taxablePremiumBD = taxablePremiumBD;
  }

  public AdditionalTaxDetails detailsTBC(Boolean detailsTBC) {
    this.detailsTBC = detailsTBC;
    return this;
  }

  /**
   * Get detailsTBC
   * @return detailsTBC
  */
  

  @JsonProperty("detailsTBC")
  public Boolean getDetailsTBC() {
    return detailsTBC;
  }

  public void setDetailsTBC(Boolean detailsTBC) {
    this.detailsTBC = detailsTBC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalTaxDetails additionalTaxDetails = (AdditionalTaxDetails) o;
    return Objects.equals(this.taxNarrative, additionalTaxDetails.taxNarrative) &&
        Objects.equals(this.taxReferenceNumber, additionalTaxDetails.taxReferenceNumber) &&
        Objects.equals(this.taxablePremiumBD, additionalTaxDetails.taxablePremiumBD) &&
        Objects.equals(this.detailsTBC, additionalTaxDetails.detailsTBC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxNarrative, taxReferenceNumber, taxablePremiumBD, detailsTBC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalTaxDetails {\n");
    sb.append("    taxNarrative: ").append(toIndentedString(taxNarrative)).append("\n");
    sb.append("    taxReferenceNumber: ").append(toIndentedString(taxReferenceNumber)).append("\n");
    sb.append("    taxablePremiumBD: ").append(toIndentedString(taxablePremiumBD)).append("\n");
    sb.append("    detailsTBC: ").append(toIndentedString(detailsTBC)).append("\n");
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

