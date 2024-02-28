package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumSummaryRec
 */

@JsonTypeName("premiumSummaryRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumSummaryRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID sectionId;

  private Integer premiumNumber;

  private TypeOfTransactionType transactionType;

  private TypeOfCountry splitsCountry;

  private TypeOfCountry countryOfOrigin;

  private String premiumNarrative;

  private TypeOfCurrency originalCurrency;

  private BigDecimal grossPremium;

  private BigDecimal grossPremiumPercent;

  private BigDecimal ukIPTAmount;

  private BigDecimal ukIPTRate;

  private BigDecimal overseasAddedTaxAmount;

  private BigDecimal brokerageRate;

  private BigDecimal deductableTaxRate;

  private BigDecimal otherDeductionsRate;

  private String obsnd;

  private String ocsnd;

  private UUID originalSectionId;

  private UUID originalPremiumId;

  private UUID replacesId;

  public PremiumSummaryRec() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PremiumSummaryRec(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public PremiumSummaryRec premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * Get premiumId
   * @return premiumId
  */
  @Valid 

  @JsonProperty("premiumId")
  public UUID getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(UUID premiumId) {
    this.premiumId = premiumId;
  }

  public PremiumSummaryRec sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Get sectionId
   * @return sectionId
  */
  @Valid 

  @JsonProperty("sectionId")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public PremiumSummaryRec premiumNumber(Integer premiumNumber) {
    this.premiumNumber = premiumNumber;
    return this;
  }

  /**
   * Get premiumNumber
   * @return premiumNumber
  */
  

  @JsonProperty("premiumNumber")
  public Integer getPremiumNumber() {
    return premiumNumber;
  }

  public void setPremiumNumber(Integer premiumNumber) {
    this.premiumNumber = premiumNumber;
  }

  public PremiumSummaryRec transactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @Valid 

  @JsonProperty("transactionType")
  public TypeOfTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public PremiumSummaryRec splitsCountry(TypeOfCountry splitsCountry) {
    this.splitsCountry = splitsCountry;
    return this;
  }

  /**
   * Get splitsCountry
   * @return splitsCountry
  */
  @Valid 

  @JsonProperty("splitsCountry")
  public TypeOfCountry getSplitsCountry() {
    return splitsCountry;
  }

  public void setSplitsCountry(TypeOfCountry splitsCountry) {
    this.splitsCountry = splitsCountry;
  }

  public PremiumSummaryRec countryOfOrigin(TypeOfCountry countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

  /**
   * Get countryOfOrigin
   * @return countryOfOrigin
  */
  @Valid 

  @JsonProperty("countryOfOrigin")
  public TypeOfCountry getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(TypeOfCountry countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public PremiumSummaryRec premiumNarrative(String premiumNarrative) {
    this.premiumNarrative = premiumNarrative;
    return this;
  }

  /**
   * Get premiumNarrative
   * @return premiumNarrative
  */
  

  @JsonProperty("premiumNarrative")
  public String getPremiumNarrative() {
    return premiumNarrative;
  }

  public void setPremiumNarrative(String premiumNarrative) {
    this.premiumNarrative = premiumNarrative;
  }

  public PremiumSummaryRec originalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
    return this;
  }

  /**
   * Get originalCurrency
   * @return originalCurrency
  */
  @NotNull @Valid 

  @JsonProperty("originalCurrency")
  public TypeOfCurrency getOriginalCurrency() {
    return originalCurrency;
  }

  public void setOriginalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public PremiumSummaryRec grossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
    return this;
  }

  /**
   * Get grossPremium
   * @return grossPremium
  */
  @Valid 

  @JsonProperty("grossPremium")
  public BigDecimal getGrossPremium() {
    return grossPremium;
  }

  public void setGrossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
  }

  public PremiumSummaryRec grossPremiumPercent(BigDecimal grossPremiumPercent) {
    this.grossPremiumPercent = grossPremiumPercent;
    return this;
  }

  /**
   * Get grossPremiumPercent
   * @return grossPremiumPercent
  */
  @Valid 

  @JsonProperty("grossPremiumPercent")
  public BigDecimal getGrossPremiumPercent() {
    return grossPremiumPercent;
  }

  public void setGrossPremiumPercent(BigDecimal grossPremiumPercent) {
    this.grossPremiumPercent = grossPremiumPercent;
  }

  public PremiumSummaryRec ukIPTAmount(BigDecimal ukIPTAmount) {
    this.ukIPTAmount = ukIPTAmount;
    return this;
  }

  /**
   * Get ukIPTAmount
   * @return ukIPTAmount
  */
  @Valid 

  @JsonProperty("ukIPTAmount")
  public BigDecimal getUkIPTAmount() {
    return ukIPTAmount;
  }

  public void setUkIPTAmount(BigDecimal ukIPTAmount) {
    this.ukIPTAmount = ukIPTAmount;
  }

  public PremiumSummaryRec ukIPTRate(BigDecimal ukIPTRate) {
    this.ukIPTRate = ukIPTRate;
    return this;
  }

  /**
   * Get ukIPTRate
   * @return ukIPTRate
  */
  @Valid 

  @JsonProperty("ukIPTRate")
  public BigDecimal getUkIPTRate() {
    return ukIPTRate;
  }

  public void setUkIPTRate(BigDecimal ukIPTRate) {
    this.ukIPTRate = ukIPTRate;
  }

  public PremiumSummaryRec overseasAddedTaxAmount(BigDecimal overseasAddedTaxAmount) {
    this.overseasAddedTaxAmount = overseasAddedTaxAmount;
    return this;
  }

  /**
   * Get overseasAddedTaxAmount
   * @return overseasAddedTaxAmount
  */
  @Valid 

  @JsonProperty("overseasAddedTaxAmount")
  public BigDecimal getOverseasAddedTaxAmount() {
    return overseasAddedTaxAmount;
  }

  public void setOverseasAddedTaxAmount(BigDecimal overseasAddedTaxAmount) {
    this.overseasAddedTaxAmount = overseasAddedTaxAmount;
  }

  public PremiumSummaryRec brokerageRate(BigDecimal brokerageRate) {
    this.brokerageRate = brokerageRate;
    return this;
  }

  /**
   * Get brokerageRate
   * @return brokerageRate
  */
  @Valid 

  @JsonProperty("brokerageRate")
  public BigDecimal getBrokerageRate() {
    return brokerageRate;
  }

  public void setBrokerageRate(BigDecimal brokerageRate) {
    this.brokerageRate = brokerageRate;
  }

  public PremiumSummaryRec deductableTaxRate(BigDecimal deductableTaxRate) {
    this.deductableTaxRate = deductableTaxRate;
    return this;
  }

  /**
   * Get deductableTaxRate
   * @return deductableTaxRate
  */
  @Valid 

  @JsonProperty("deductableTaxRate")
  public BigDecimal getDeductableTaxRate() {
    return deductableTaxRate;
  }

  public void setDeductableTaxRate(BigDecimal deductableTaxRate) {
    this.deductableTaxRate = deductableTaxRate;
  }

  public PremiumSummaryRec otherDeductionsRate(BigDecimal otherDeductionsRate) {
    this.otherDeductionsRate = otherDeductionsRate;
    return this;
  }

  /**
   * Get otherDeductionsRate
   * @return otherDeductionsRate
  */
  @Valid 

  @JsonProperty("otherDeductionsRate")
  public BigDecimal getOtherDeductionsRate() {
    return otherDeductionsRate;
  }

  public void setOtherDeductionsRate(BigDecimal otherDeductionsRate) {
    this.otherDeductionsRate = otherDeductionsRate;
  }

  public PremiumSummaryRec obsnd(String obsnd) {
    this.obsnd = obsnd;
    return this;
  }

  /**
   * the original broker signing number and date, maps to section level
   * @return obsnd
  */
  

  @JsonProperty("obsnd")
  public String getObsnd() {
    return obsnd;
  }

  public void setObsnd(String obsnd) {
    this.obsnd = obsnd;
  }

  public PremiumSummaryRec ocsnd(String ocsnd) {
    this.ocsnd = ocsnd;
    return this;
  }

  /**
   * the original carrier signing number and date, maps to premium level
   * @return ocsnd
  */
  

  @JsonProperty("ocsnd")
  public String getOcsnd() {
    return ocsnd;
  }

  public void setOcsnd(String ocsnd) {
    this.ocsnd = ocsnd;
  }

  public PremiumSummaryRec originalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
    return this;
  }

  /**
   * the sectionId of the original premium record linked to an AP/RP
   * @return originalSectionId
  */
  @Valid 

  @JsonProperty("originalSectionId")
  public UUID getOriginalSectionId() {
    return originalSectionId;
  }

  public void setOriginalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
  }

  public PremiumSummaryRec originalPremiumId(UUID originalPremiumId) {
    this.originalPremiumId = originalPremiumId;
    return this;
  }

  /**
   * the premiumId of the original premium record linked to an AP/RP
   * @return originalPremiumId
  */
  @Valid 

  @JsonProperty("originalPremiumId")
  public UUID getOriginalPremiumId() {
    return originalPremiumId;
  }

  public void setOriginalPremiumId(UUID originalPremiumId) {
    this.originalPremiumId = originalPremiumId;
  }

  public PremiumSummaryRec replacesId(UUID replacesId) {
    this.replacesId = replacesId;
    return this;
  }

  /**
   * Get replacesId
   * @return replacesId
  */
  @Valid 

  @JsonProperty("replacesId")
  public UUID getReplacesId() {
    return replacesId;
  }

  public void setReplacesId(UUID replacesId) {
    this.replacesId = replacesId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumSummaryRec premiumSummaryRec = (PremiumSummaryRec) o;
    return Objects.equals(this.premiumId, premiumSummaryRec.premiumId) &&
        Objects.equals(this.sectionId, premiumSummaryRec.sectionId) &&
        Objects.equals(this.premiumNumber, premiumSummaryRec.premiumNumber) &&
        Objects.equals(this.transactionType, premiumSummaryRec.transactionType) &&
        Objects.equals(this.splitsCountry, premiumSummaryRec.splitsCountry) &&
        Objects.equals(this.countryOfOrigin, premiumSummaryRec.countryOfOrigin) &&
        Objects.equals(this.premiumNarrative, premiumSummaryRec.premiumNarrative) &&
        Objects.equals(this.originalCurrency, premiumSummaryRec.originalCurrency) &&
        Objects.equals(this.grossPremium, premiumSummaryRec.grossPremium) &&
        Objects.equals(this.grossPremiumPercent, premiumSummaryRec.grossPremiumPercent) &&
        Objects.equals(this.ukIPTAmount, premiumSummaryRec.ukIPTAmount) &&
        Objects.equals(this.ukIPTRate, premiumSummaryRec.ukIPTRate) &&
        Objects.equals(this.overseasAddedTaxAmount, premiumSummaryRec.overseasAddedTaxAmount) &&
        Objects.equals(this.brokerageRate, premiumSummaryRec.brokerageRate) &&
        Objects.equals(this.deductableTaxRate, premiumSummaryRec.deductableTaxRate) &&
        Objects.equals(this.otherDeductionsRate, premiumSummaryRec.otherDeductionsRate) &&
        Objects.equals(this.obsnd, premiumSummaryRec.obsnd) &&
        Objects.equals(this.ocsnd, premiumSummaryRec.ocsnd) &&
        Objects.equals(this.originalSectionId, premiumSummaryRec.originalSectionId) &&
        Objects.equals(this.originalPremiumId, premiumSummaryRec.originalPremiumId) &&
        Objects.equals(this.replacesId, premiumSummaryRec.replacesId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, sectionId, premiumNumber, transactionType, splitsCountry, countryOfOrigin, premiumNarrative, originalCurrency, grossPremium, grossPremiumPercent, ukIPTAmount, ukIPTRate, overseasAddedTaxAmount, brokerageRate, deductableTaxRate, otherDeductionsRate, obsnd, ocsnd, originalSectionId, originalPremiumId, replacesId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumSummaryRec {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    premiumNumber: ").append(toIndentedString(premiumNumber)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    splitsCountry: ").append(toIndentedString(splitsCountry)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    premiumNarrative: ").append(toIndentedString(premiumNarrative)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    grossPremium: ").append(toIndentedString(grossPremium)).append("\n");
    sb.append("    grossPremiumPercent: ").append(toIndentedString(grossPremiumPercent)).append("\n");
    sb.append("    ukIPTAmount: ").append(toIndentedString(ukIPTAmount)).append("\n");
    sb.append("    ukIPTRate: ").append(toIndentedString(ukIPTRate)).append("\n");
    sb.append("    overseasAddedTaxAmount: ").append(toIndentedString(overseasAddedTaxAmount)).append("\n");
    sb.append("    brokerageRate: ").append(toIndentedString(brokerageRate)).append("\n");
    sb.append("    deductableTaxRate: ").append(toIndentedString(deductableTaxRate)).append("\n");
    sb.append("    otherDeductionsRate: ").append(toIndentedString(otherDeductionsRate)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    ocsnd: ").append(toIndentedString(ocsnd)).append("\n");
    sb.append("    originalSectionId: ").append(toIndentedString(originalSectionId)).append("\n");
    sb.append("    originalPremiumId: ").append(toIndentedString(originalPremiumId)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
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

