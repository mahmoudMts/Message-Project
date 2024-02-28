package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ContractDetails
 */

@JsonTypeName("contractDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ContractDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private String mrcType;

  private String insuredName;

  private String reinsuredName;

  private PeriodWithNarrative policyPeriod;

  private String interest;

  private String inceptionExpiryTime;

  private Boolean crossRefIndicator;

  private String coverBasis;

  public ContractDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContractDetails(String mrcType, String interest) {
    this.mrcType = mrcType;
    this.interest = interest;
  }

  public ContractDetails mrcType(String mrcType) {
    this.mrcType = mrcType;
    return this;
  }

  /**
   * Get mrcType
   * @return mrcType
  */
  @NotNull 

  @JsonProperty("mrcType")
  public String getMrcType() {
    return mrcType;
  }

  public void setMrcType(String mrcType) {
    this.mrcType = mrcType;
  }

  public ContractDetails insuredName(String insuredName) {
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

  public ContractDetails reinsuredName(String reinsuredName) {
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

  public ContractDetails policyPeriod(PeriodWithNarrative policyPeriod) {
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

  public ContractDetails interest(String interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   * @return interest
  */
  @NotNull 

  @JsonProperty("interest")
  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public ContractDetails inceptionExpiryTime(String inceptionExpiryTime) {
    this.inceptionExpiryTime = inceptionExpiryTime;
    return this;
  }

  /**
   * Get inceptionExpiryTime
   * @return inceptionExpiryTime
  */
  

  @JsonProperty("inceptionExpiryTime")
  public String getInceptionExpiryTime() {
    return inceptionExpiryTime;
  }

  public void setInceptionExpiryTime(String inceptionExpiryTime) {
    this.inceptionExpiryTime = inceptionExpiryTime;
  }

  public ContractDetails crossRefIndicator(Boolean crossRefIndicator) {
    this.crossRefIndicator = crossRefIndicator;
    return this;
  }

  /**
   * Get crossRefIndicator
   * @return crossRefIndicator
  */
  

  @JsonProperty("crossRefIndicator")
  public Boolean getCrossRefIndicator() {
    return crossRefIndicator;
  }

  public void setCrossRefIndicator(Boolean crossRefIndicator) {
    this.crossRefIndicator = crossRefIndicator;
  }

  public ContractDetails coverBasis(String coverBasis) {
    this.coverBasis = coverBasis;
    return this;
  }

  /**
   * Get coverBasis
   * @return coverBasis
  */
  

  @JsonProperty("coverBasis")
  public String getCoverBasis() {
    return coverBasis;
  }

  public void setCoverBasis(String coverBasis) {
    this.coverBasis = coverBasis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractDetails contractDetails = (ContractDetails) o;
    return Objects.equals(this.mrcType, contractDetails.mrcType) &&
        Objects.equals(this.insuredName, contractDetails.insuredName) &&
        Objects.equals(this.reinsuredName, contractDetails.reinsuredName) &&
        Objects.equals(this.policyPeriod, contractDetails.policyPeriod) &&
        Objects.equals(this.interest, contractDetails.interest) &&
        Objects.equals(this.inceptionExpiryTime, contractDetails.inceptionExpiryTime) &&
        Objects.equals(this.crossRefIndicator, contractDetails.crossRefIndicator) &&
        Objects.equals(this.coverBasis, contractDetails.coverBasis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrcType, insuredName, reinsuredName, policyPeriod, interest, inceptionExpiryTime, crossRefIndicator, coverBasis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractDetails {\n");
    sb.append("    mrcType: ").append(toIndentedString(mrcType)).append("\n");
    sb.append("    insuredName: ").append(toIndentedString(insuredName)).append("\n");
    sb.append("    reinsuredName: ").append(toIndentedString(reinsuredName)).append("\n");
    sb.append("    policyPeriod: ").append(toIndentedString(policyPeriod)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    inceptionExpiryTime: ").append(toIndentedString(inceptionExpiryTime)).append("\n");
    sb.append("    crossRefIndicator: ").append(toIndentedString(crossRefIndicator)).append("\n");
    sb.append("    coverBasis: ").append(toIndentedString(coverBasis)).append("\n");
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

