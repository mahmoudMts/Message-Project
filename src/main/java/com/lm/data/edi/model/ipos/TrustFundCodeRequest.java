package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * The trust fund model  to calculate trustfundcode
 */

@JsonTypeName("trustFundCodeRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TrustFundCodeRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String settlementCurrency;

  
  private LocalDate contractStartDate;

  
  private LocalDate sectionStartDate;

  private String yearOfAccount;

  private String filCode1;

  private String filCode2;

  private String riskCode;

  public TrustFundCodeRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrustFundCodeRequest(String settlementCurrency, LocalDate contractStartDate, LocalDate sectionStartDate, String yearOfAccount, String filCode1, String riskCode) {
    this.settlementCurrency = settlementCurrency;
    this.contractStartDate = contractStartDate;
    this.sectionStartDate = sectionStartDate;
    this.yearOfAccount = yearOfAccount;
    this.filCode1 = filCode1;
    this.riskCode = riskCode;
  }

  public TrustFundCodeRequest settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

  /**
   * Settlement Currency for statements
   * @return settlementCurrency
  */
  @NotNull 
@Size(max=3) 
  @JsonProperty("settlementCurrency")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public TrustFundCodeRequest contractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = contractStartDate;
    return this;
  }

  /**
   * should be the contract startDate
   * @return contractStartDate
  */
  @NotNull @Valid 

  @JsonProperty("contractStartDate")
  public LocalDate getContractStartDate() {
    return contractStartDate;
  }

  public void setContractStartDate(LocalDate contractStartDate) {
    this.contractStartDate = contractStartDate;
  }

  public TrustFundCodeRequest sectionStartDate(LocalDate sectionStartDate) {
    this.sectionStartDate = sectionStartDate;
    return this;
  }

  /**
   * should be the section startDate
   * @return sectionStartDate
  */
  @NotNull @Valid 

  @JsonProperty("sectionStartDate")
  public LocalDate getSectionStartDate() {
    return sectionStartDate;
  }

  public void setSectionStartDate(LocalDate sectionStartDate) {
    this.sectionStartDate = sectionStartDate;
  }

  public TrustFundCodeRequest yearOfAccount(String yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
    return this;
  }

  /**
   * Get yearOfAccount
   * @return yearOfAccount
  */
  @NotNull 

  @JsonProperty("yearOfAccount")
  public String getYearOfAccount() {
    return yearOfAccount;
  }

  public void setYearOfAccount(String yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
  }

  public TrustFundCodeRequest filCode1(String filCode1) {
    this.filCode1 = filCode1;
    return this;
  }

  /**
   * Get filCode1
   * @return filCode1
  */
  @NotNull 

  @JsonProperty("filCode1")
  public String getFilCode1() {
    return filCode1;
  }

  public void setFilCode1(String filCode1) {
    this.filCode1 = filCode1;
  }

  public TrustFundCodeRequest filCode2(String filCode2) {
    this.filCode2 = filCode2;
    return this;
  }

  /**
   * Get filCode2
   * @return filCode2
  */
  

  @JsonProperty("filCode2")
  public String getFilCode2() {
    return filCode2;
  }

  public void setFilCode2(String filCode2) {
    this.filCode2 = filCode2;
  }

  public TrustFundCodeRequest riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * Get riskCode
   * @return riskCode
  */
  @NotNull 

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustFundCodeRequest trustFundCodeRequest = (TrustFundCodeRequest) o;
    return Objects.equals(this.settlementCurrency, trustFundCodeRequest.settlementCurrency) &&
        Objects.equals(this.contractStartDate, trustFundCodeRequest.contractStartDate) &&
        Objects.equals(this.sectionStartDate, trustFundCodeRequest.sectionStartDate) &&
        Objects.equals(this.yearOfAccount, trustFundCodeRequest.yearOfAccount) &&
        Objects.equals(this.filCode1, trustFundCodeRequest.filCode1) &&
        Objects.equals(this.filCode2, trustFundCodeRequest.filCode2) &&
        Objects.equals(this.riskCode, trustFundCodeRequest.riskCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementCurrency, contractStartDate, sectionStartDate, yearOfAccount, filCode1, filCode2, riskCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustFundCodeRequest {\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    sectionStartDate: ").append(toIndentedString(sectionStartDate)).append("\n");
    sb.append("    yearOfAccount: ").append(toIndentedString(yearOfAccount)).append("\n");
    sb.append("    filCode1: ").append(toIndentedString(filCode1)).append("\n");
    sb.append("    filCode2: ").append(toIndentedString(filCode2)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
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

