package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * GetRiskValidationData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class GetRiskValidationData implements Serializable {

  private static final long serialVersionUID = 1L;

  private String premiumId;

  private Reinsurer reinsurer;

  private String brokerName;

  private String brokerRef;

  private String originalCurrency;

  private String referenceCurrency;

  private BigDecimal premiumAmount;

  private String brokerage;

  private AmountItem deductions;

  private LocalDate contractStartDate;

  private LocalDate contractEndDate;

  private String yearofAccount;

  public GetRiskValidationData premiumId(String premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * Get premiumId
   * @return premiumId
  */
  

  @JsonProperty("premiumId")
  public String getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(String premiumId) {
    this.premiumId = premiumId;
  }

  public GetRiskValidationData reinsurer(Reinsurer reinsurer) {
    this.reinsurer = reinsurer;
    return this;
  }

  /**
   * Get reinsurer
   * @return reinsurer
  */
  @Valid 

  @JsonProperty("reinsurer")
  public Reinsurer getReinsurer() {
    return reinsurer;
  }

  public void setReinsurer(Reinsurer reinsurer) {
    this.reinsurer = reinsurer;
  }

  public GetRiskValidationData brokerName(String brokerName) {
    this.brokerName = brokerName;
    return this;
  }

  /**
   * Get brokerName
   * @return brokerName
  */
  

  @JsonProperty("brokerName")
  public String getBrokerName() {
    return brokerName;
  }

  public void setBrokerName(String brokerName) {
    this.brokerName = brokerName;
  }

  public GetRiskValidationData brokerRef(String brokerRef) {
    this.brokerRef = brokerRef;
    return this;
  }

  /**
   * Get brokerRef
   * @return brokerRef
  */
  

  @JsonProperty("brokerRef")
  public String getBrokerRef() {
    return brokerRef;
  }

  public void setBrokerRef(String brokerRef) {
    this.brokerRef = brokerRef;
  }

  public GetRiskValidationData originalCurrency(String originalCurrency) {
    this.originalCurrency = originalCurrency;
    return this;
  }

  /**
   * Get originalCurrency
   * @return originalCurrency
  */
  

  @JsonProperty("originalCurrency")
  public String getOriginalCurrency() {
    return originalCurrency;
  }

  public void setOriginalCurrency(String originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public GetRiskValidationData referenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
    return this;
  }

  /**
   * Get referenceCurrency
   * @return referenceCurrency
  */
  

  @JsonProperty("referenceCurrency")
  public String getReferenceCurrency() {
    return referenceCurrency;
  }

  public void setReferenceCurrency(String referenceCurrency) {
    this.referenceCurrency = referenceCurrency;
  }

  public GetRiskValidationData premiumAmount(BigDecimal premiumAmount) {
    this.premiumAmount = premiumAmount;
    return this;
  }

  /**
   * Get premiumAmount
   * @return premiumAmount
  */
  @Valid 

  @JsonProperty("premiumAmount")
  public BigDecimal getPremiumAmount() {
    return premiumAmount;
  }

  public void setPremiumAmount(BigDecimal premiumAmount) {
    this.premiumAmount = premiumAmount;
  }

  public GetRiskValidationData brokerage(String brokerage) {
    this.brokerage = brokerage;
    return this;
  }

  /**
   * Get brokerage
   * @return brokerage
  */
  

  @JsonProperty("brokerage")
  public String getBrokerage() {
    return brokerage;
  }

  public void setBrokerage(String brokerage) {
    this.brokerage = brokerage;
  }

  public GetRiskValidationData deductions(AmountItem deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * Get deductions
   * @return deductions
  */
  @Valid 

  @JsonProperty("deductions")
  public AmountItem getDeductions() {
    return deductions;
  }

  public void setDeductions(AmountItem deductions) {
    this.deductions = deductions;
  }

  public GetRiskValidationData contractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = contractStartDate;
    return this;
  }

  /**
   * Get contractStartDate
   * @return contractStartDate
  */
  @Valid 

  @JsonProperty("contractStartDate")
  public LocalDate getContractStartDate() {
    return contractStartDate;
  }

  public void setContractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = contractStartDate;
  }

  public GetRiskValidationData contractEndDate(LocalDate contractEndDate) {
    this.contractEndDate = contractEndDate;
    return this;
  }

  /**
   * Get contractEndDate
   * @return contractEndDate
  */
  @Valid 

  @JsonProperty("contractEndDate")
  public LocalDate getContractEndDate() {
    return contractEndDate;
  }

  public void setContractEndDate(LocalDate contractEndDate) {
    this.contractEndDate = contractEndDate;
  }

  public GetRiskValidationData yearofAccount(String yearofAccount) {
    this.yearofAccount = yearofAccount;
    return this;
  }

  /**
   * Get yearofAccount
   * @return yearofAccount
  */
  
@Pattern(regexp="[0-9]{4}") 
  @JsonProperty("yearofAccount")
  public String getYearofAccount() {
    return yearofAccount;
  }

  public void setYearofAccount(String yearofAccount) {
    this.yearofAccount = yearofAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRiskValidationData getRiskValidationData = (GetRiskValidationData) o;
    return Objects.equals(this.premiumId, getRiskValidationData.premiumId) &&
        Objects.equals(this.reinsurer, getRiskValidationData.reinsurer) &&
        Objects.equals(this.brokerName, getRiskValidationData.brokerName) &&
        Objects.equals(this.brokerRef, getRiskValidationData.brokerRef) &&
        Objects.equals(this.originalCurrency, getRiskValidationData.originalCurrency) &&
        Objects.equals(this.referenceCurrency, getRiskValidationData.referenceCurrency) &&
        Objects.equals(this.premiumAmount, getRiskValidationData.premiumAmount) &&
        Objects.equals(this.brokerage, getRiskValidationData.brokerage) &&
        Objects.equals(this.deductions, getRiskValidationData.deductions) &&
        Objects.equals(this.contractStartDate, getRiskValidationData.contractStartDate) &&
        Objects.equals(this.contractEndDate, getRiskValidationData.contractEndDate) &&
        Objects.equals(this.yearofAccount, getRiskValidationData.yearofAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, reinsurer, brokerName, brokerRef, originalCurrency, referenceCurrency, premiumAmount, brokerage, deductions, contractStartDate, contractEndDate, yearofAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRiskValidationData {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    reinsurer: ").append(toIndentedString(reinsurer)).append("\n");
    sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
    sb.append("    brokerRef: ").append(toIndentedString(brokerRef)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    referenceCurrency: ").append(toIndentedString(referenceCurrency)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
    sb.append("    brokerage: ").append(toIndentedString(brokerage)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    yearofAccount: ").append(toIndentedString(yearofAccount)).append("\n");
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

