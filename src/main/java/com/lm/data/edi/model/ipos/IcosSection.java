package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * IcosSection
 */

@JsonTypeName("icosSection")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IcosSection implements Serializable {

  private static final long serialVersionUID = 1L;

  private String riskCode;

  private String insuredName;

  private String reinsuredName;

  private PeriodWithNarrative policyPeriod;

  @Valid
  private List<@Valid SumInsured> sumInsured;

  private Integer yearOfAccount;

  private Integer uwYear;

  private BigDecimal slipOrder1;

  private BigDecimal slipOrder2;

  private String sectionLead;

  @Valid
  private List<@Valid IcosCarriers> carriers;

  @Valid
  private List<@Valid IcosSigning> signings;

  public IcosSection riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * Get riskCode
   * @return riskCode
  */
  

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  public IcosSection insuredName(String insuredName) {
    this.insuredName = insuredName;
    return this;
  }

  /**
   * Get insuredName
   * @return insuredName
  */
  

  @JsonProperty("insuredName")
  public String getInsuredName() {
    return insuredName;
  }

  public void setInsuredName(String insuredName) {
    this.insuredName = insuredName;
  }

  public IcosSection reinsuredName(String reinsuredName) {
    this.reinsuredName = reinsuredName;
    return this;
  }

  /**
   * Get reinsuredName
   * @return reinsuredName
  */
  

  @JsonProperty("reinsuredName")
  public String getReinsuredName() {
    return reinsuredName;
  }

  public void setReinsuredName(String reinsuredName) {
    this.reinsuredName = reinsuredName;
  }

  public IcosSection policyPeriod(PeriodWithNarrative policyPeriod) {
    this.policyPeriod = policyPeriod;
    return this;
  }

  /**
   * Get policyPeriod
   * @return policyPeriod
  */
  @Valid 

  @JsonProperty("policyPeriod")
  public PeriodWithNarrative getPolicyPeriod() {
    return policyPeriod;
  }

  public void setPolicyPeriod(PeriodWithNarrative policyPeriod) {
    this.policyPeriod = policyPeriod;
  }

  public IcosSection sumInsured(List<@Valid SumInsured> sumInsured) {
    this.sumInsured = sumInsured;
    return this;
  }

  public IcosSection addSumInsuredItem(SumInsured sumInsuredItem) {
    if (this.sumInsured == null) {
      this.sumInsured = new ArrayList<>();
    }
    this.sumInsured.add(sumInsuredItem);
    return this;
  }

  /**
   * Get sumInsured
   * @return sumInsured
  */
  @Valid 

  @JsonProperty("sumInsured")
  public List<@Valid SumInsured> getSumInsured() {
    return sumInsured;
  }

  public void setSumInsured(List<@Valid SumInsured> sumInsured) {
    this.sumInsured = sumInsured;
  }

  public IcosSection yearOfAccount(Integer yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
    return this;
  }

  /**
   * Get yearOfAccount
   * @return yearOfAccount
  */
  

  @JsonProperty("yearOfAccount")
  public Integer getYearOfAccount() {
    return yearOfAccount;
  }

  public void setYearOfAccount(Integer yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
  }

  public IcosSection uwYear(Integer uwYear) {
    this.uwYear = uwYear;
    return this;
  }

  /**
   * Get uwYear
   * @return uwYear
  */
  

  @JsonProperty("uwYear")
  public Integer getUwYear() {
    return uwYear;
  }

  public void setUwYear(Integer uwYear) {
    this.uwYear = uwYear;
  }

  public IcosSection slipOrder1(BigDecimal slipOrder1) {
    this.slipOrder1 = slipOrder1;
    return this;
  }

  /**
   * Get slipOrder1
   * @return slipOrder1
  */
  @Valid 

  @JsonProperty("slipOrder1")
  public BigDecimal getSlipOrder1() {
    return slipOrder1;
  }

  public void setSlipOrder1(BigDecimal slipOrder1) {
    this.slipOrder1 = slipOrder1;
  }

  public IcosSection slipOrder2(BigDecimal slipOrder2) {
    this.slipOrder2 = slipOrder2;
    return this;
  }

  /**
   * Get slipOrder2
   * @return slipOrder2
  */
  @Valid 

  @JsonProperty("slipOrder2")
  public BigDecimal getSlipOrder2() {
    return slipOrder2;
  }

  public void setSlipOrder2(BigDecimal slipOrder2) {
    this.slipOrder2 = slipOrder2;
  }

  public IcosSection sectionLead(String sectionLead) {
    this.sectionLead = sectionLead;
    return this;
  }

  /**
   * Get sectionLead
   * @return sectionLead
  */
  

  @JsonProperty("sectionLead")
  public String getSectionLead() {
    return sectionLead;
  }

  public void setSectionLead(String sectionLead) {
    this.sectionLead = sectionLead;
  }

  public IcosSection carriers(List<@Valid IcosCarriers> carriers) {
    this.carriers = carriers;
    return this;
  }

  public IcosSection addCarriersItem(IcosCarriers carriersItem) {
    if (this.carriers == null) {
      this.carriers = new ArrayList<>();
    }
    this.carriers.add(carriersItem);
    return this;
  }

  /**
   * Get carriers
   * @return carriers
  */
  @Valid 

  @JsonProperty("carriers")
  public List<@Valid IcosCarriers> getCarriers() {
    return carriers;
  }

  public void setCarriers(List<@Valid IcosCarriers> carriers) {
    this.carriers = carriers;
  }

  public IcosSection signings(List<@Valid IcosSigning> signings) {
    this.signings = signings;
    return this;
  }

  public IcosSection addSigningsItem(IcosSigning signingsItem) {
    if (this.signings == null) {
      this.signings = new ArrayList<>();
    }
    this.signings.add(signingsItem);
    return this;
  }

  /**
   * Get signings
   * @return signings
  */
  @Valid 

  @JsonProperty("signings")
  public List<@Valid IcosSigning> getSignings() {
    return signings;
  }

  public void setSignings(List<@Valid IcosSigning> signings) {
    this.signings = signings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcosSection icosSection = (IcosSection) o;
    return Objects.equals(this.riskCode, icosSection.riskCode) &&
        Objects.equals(this.insuredName, icosSection.insuredName) &&
        Objects.equals(this.reinsuredName, icosSection.reinsuredName) &&
        Objects.equals(this.policyPeriod, icosSection.policyPeriod) &&
        Objects.equals(this.sumInsured, icosSection.sumInsured) &&
        Objects.equals(this.yearOfAccount, icosSection.yearOfAccount) &&
        Objects.equals(this.uwYear, icosSection.uwYear) &&
        Objects.equals(this.slipOrder1, icosSection.slipOrder1) &&
        Objects.equals(this.slipOrder2, icosSection.slipOrder2) &&
        Objects.equals(this.sectionLead, icosSection.sectionLead) &&
        Objects.equals(this.carriers, icosSection.carriers) &&
        Objects.equals(this.signings, icosSection.signings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCode, insuredName, reinsuredName, policyPeriod, sumInsured, yearOfAccount, uwYear, slipOrder1, slipOrder2, sectionLead, carriers, signings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcosSection {\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    insuredName: ").append(toIndentedString(insuredName)).append("\n");
    sb.append("    reinsuredName: ").append(toIndentedString(reinsuredName)).append("\n");
    sb.append("    policyPeriod: ").append(toIndentedString(policyPeriod)).append("\n");
    sb.append("    sumInsured: ").append(toIndentedString(sumInsured)).append("\n");
    sb.append("    yearOfAccount: ").append(toIndentedString(yearOfAccount)).append("\n");
    sb.append("    uwYear: ").append(toIndentedString(uwYear)).append("\n");
    sb.append("    slipOrder1: ").append(toIndentedString(slipOrder1)).append("\n");
    sb.append("    slipOrder2: ").append(toIndentedString(slipOrder2)).append("\n");
    sb.append("    sectionLead: ").append(toIndentedString(sectionLead)).append("\n");
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
    sb.append("    signings: ").append(toIndentedString(signings)).append("\n");
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

