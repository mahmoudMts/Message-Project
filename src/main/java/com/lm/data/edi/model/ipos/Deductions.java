package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * Deductions
 */

@JsonTypeName("deductions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Deductions implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal brokerage;

  private TypeOfBasis brokerageBasis;

  private BigDecimal tax;

  private BasisEnum taxBasis;

  private BigDecimal other;

  private BasisEnum otherBasis;

  private BigDecimal total;

  private Boolean complexDeductionsInd;

  private BigDecimal overseasAddedTaxPrem;

  private Boolean taxIndicator;

  private BigDecimal cedingCommision;

  private String narrative;

  private BigDecimal autoRiCommission;

  public Deductions brokerage(BigDecimal brokerage) {
    this.brokerage = brokerage;
    return this;
  }

  /**
   * Get brokerage
   * @return brokerage
  */
  @Valid 

  @JsonProperty("brokerage")
  public BigDecimal getBrokerage() {
    return brokerage;
  }

  public void setBrokerage(BigDecimal brokerage) {
    this.brokerage = brokerage;
  }

  public Deductions brokerageBasis(TypeOfBasis brokerageBasis) {
    this.brokerageBasis = brokerageBasis;
    return this;
  }

  /**
   * Get brokerageBasis
   * @return brokerageBasis
  */
  @Valid 

  @JsonProperty("brokerageBasis")
  public TypeOfBasis getBrokerageBasis() {
    return brokerageBasis;
  }

  public void setBrokerageBasis(TypeOfBasis brokerageBasis) {
    this.brokerageBasis = brokerageBasis;
  }

  public Deductions tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  */
  @Valid 

  @JsonProperty("tax")
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  public Deductions taxBasis(BasisEnum taxBasis) {
    this.taxBasis = taxBasis;
    return this;
  }

  /**
   * Get taxBasis
   * @return taxBasis
  */
  @Valid 

  @JsonProperty("taxBasis")
  public BasisEnum getTaxBasis() {
    return taxBasis;
  }

  public void setTaxBasis(BasisEnum taxBasis) {
    this.taxBasis = taxBasis;
  }

  public Deductions other(BigDecimal other) {
    this.other = other;
    return this;
  }

  /**
   * Get other
   * @return other
  */
  @Valid 

  @JsonProperty("other")
  public BigDecimal getOther() {
    return other;
  }

  public void setOther(BigDecimal other) {
    this.other = other;
  }

  public Deductions otherBasis(BasisEnum otherBasis) {
    this.otherBasis = otherBasis;
    return this;
  }

  /**
   * Get otherBasis
   * @return otherBasis
  */
  @Valid 

  @JsonProperty("otherBasis")
  public BasisEnum getOtherBasis() {
    return otherBasis;
  }

  public void setOtherBasis(BasisEnum otherBasis) {
    this.otherBasis = otherBasis;
  }

  public Deductions total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @Valid 

  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Deductions complexDeductionsInd(Boolean complexDeductionsInd) {
    this.complexDeductionsInd = complexDeductionsInd;
    return this;
  }

  /**
   * Get complexDeductionsInd
   * @return complexDeductionsInd
  */
  

  @JsonProperty("complexDeductionsInd")
  public Boolean getComplexDeductionsInd() {
    return complexDeductionsInd;
  }

  public void setComplexDeductionsInd(Boolean complexDeductionsInd) {
    this.complexDeductionsInd = complexDeductionsInd;
  }

  public Deductions overseasAddedTaxPrem(BigDecimal overseasAddedTaxPrem) {
    this.overseasAddedTaxPrem = overseasAddedTaxPrem;
    return this;
  }

  /**
   * Get overseasAddedTaxPrem
   * @return overseasAddedTaxPrem
  */
  @Valid 

  @JsonProperty("overseasAddedTaxPrem")
  public BigDecimal getOverseasAddedTaxPrem() {
    return overseasAddedTaxPrem;
  }

  public void setOverseasAddedTaxPrem(BigDecimal overseasAddedTaxPrem) {
    this.overseasAddedTaxPrem = overseasAddedTaxPrem;
  }

  public Deductions taxIndicator(Boolean taxIndicator) {
    this.taxIndicator = taxIndicator;
    return this;
  }

  /**
   * Get taxIndicator
   * @return taxIndicator
  */
  

  @JsonProperty("taxIndicator")
  public Boolean getTaxIndicator() {
    return taxIndicator;
  }

  public void setTaxIndicator(Boolean taxIndicator) {
    this.taxIndicator = taxIndicator;
  }

  public Deductions cedingCommision(BigDecimal cedingCommision) {
    this.cedingCommision = cedingCommision;
    return this;
  }

  /**
   * Get cedingCommision
   * @return cedingCommision
  */
  @Valid 

  @JsonProperty("cedingCommision")
  public BigDecimal getCedingCommision() {
    return cedingCommision;
  }

  public void setCedingCommision(BigDecimal cedingCommision) {
    this.cedingCommision = cedingCommision;
  }

  public Deductions narrative(String narrative) {
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

  public Deductions autoRiCommission(BigDecimal autoRiCommission) {
    this.autoRiCommission = autoRiCommission;
    return this;
  }

  /**
   * Value of the commission applied at the time of creation of premium
   * @return autoRiCommission
  */
  @Valid 

  @JsonProperty("autoRiCommission")
  public BigDecimal getAutoRiCommission() {
    return autoRiCommission;
  }

  public void setAutoRiCommission(BigDecimal autoRiCommission) {
    this.autoRiCommission = autoRiCommission;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deductions deductions = (Deductions) o;
    return Objects.equals(this.brokerage, deductions.brokerage) &&
        Objects.equals(this.brokerageBasis, deductions.brokerageBasis) &&
        Objects.equals(this.tax, deductions.tax) &&
        Objects.equals(this.taxBasis, deductions.taxBasis) &&
        Objects.equals(this.other, deductions.other) &&
        Objects.equals(this.otherBasis, deductions.otherBasis) &&
        Objects.equals(this.total, deductions.total) &&
        Objects.equals(this.complexDeductionsInd, deductions.complexDeductionsInd) &&
        Objects.equals(this.overseasAddedTaxPrem, deductions.overseasAddedTaxPrem) &&
        Objects.equals(this.taxIndicator, deductions.taxIndicator) &&
        Objects.equals(this.cedingCommision, deductions.cedingCommision) &&
        Objects.equals(this.narrative, deductions.narrative) &&
        Objects.equals(this.autoRiCommission, deductions.autoRiCommission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerage, brokerageBasis, tax, taxBasis, other, otherBasis, total, complexDeductionsInd, overseasAddedTaxPrem, taxIndicator, cedingCommision, narrative, autoRiCommission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deductions {\n");
    sb.append("    brokerage: ").append(toIndentedString(brokerage)).append("\n");
    sb.append("    brokerageBasis: ").append(toIndentedString(brokerageBasis)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxBasis: ").append(toIndentedString(taxBasis)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    otherBasis: ").append(toIndentedString(otherBasis)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    complexDeductionsInd: ").append(toIndentedString(complexDeductionsInd)).append("\n");
    sb.append("    overseasAddedTaxPrem: ").append(toIndentedString(overseasAddedTaxPrem)).append("\n");
    sb.append("    taxIndicator: ").append(toIndentedString(taxIndicator)).append("\n");
    sb.append("    cedingCommision: ").append(toIndentedString(cedingCommision)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
    sb.append("    autoRiCommission: ").append(toIndentedString(autoRiCommission)).append("\n");
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

