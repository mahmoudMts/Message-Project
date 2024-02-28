package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * HeaderDetails
 */

@JsonTypeName("headerDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class HeaderDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private String umr;

  private String workPackageRef;

  private String classOfBusiness;

  private Boolean highValuePremium;

  private String contractClassification;

  private String brokerName;

  private String brokerNumber;

  private String brokerPseudonym;

  private String brokerPhone;

  private String brokerEmail;

  public HeaderDetails umr(String umr) {
    this.umr = umr;
    return this;
  }

  /**
   * Get umr
   * @return umr
  */
  

  @JsonProperty("umr")
  public String getUmr() {
    return umr;
  }

  public void setUmr(String umr) {
    this.umr = umr;
  }

  public HeaderDetails workPackageRef(String workPackageRef) {
    this.workPackageRef = workPackageRef;
    return this;
  }

  /**
   * Get workPackageRef
   * @return workPackageRef
  */
  

  @JsonProperty("workPackageRef")
  public String getWorkPackageRef() {
    return workPackageRef;
  }

  public void setWorkPackageRef(String workPackageRef) {
    this.workPackageRef = workPackageRef;
  }

  public HeaderDetails classOfBusiness(String classOfBusiness) {
    this.classOfBusiness = classOfBusiness;
    return this;
  }

  /**
   * Get classOfBusiness
   * @return classOfBusiness
  */
  

  @JsonProperty("classOfBusiness")
  public String getClassOfBusiness() {
    return classOfBusiness;
  }

  public void setClassOfBusiness(String classOfBusiness) {
    this.classOfBusiness = classOfBusiness;
  }

  public HeaderDetails highValuePremium(Boolean highValuePremium) {
    this.highValuePremium = highValuePremium;
    return this;
  }

  /**
   * Get highValuePremium
   * @return highValuePremium
  */
  

  @JsonProperty("highValuePremium")
  public Boolean getHighValuePremium() {
    return highValuePremium;
  }

  public void setHighValuePremium(Boolean highValuePremium) {
    this.highValuePremium = highValuePremium;
  }

  public HeaderDetails contractClassification(String contractClassification) {
    this.contractClassification = contractClassification;
    return this;
  }

  /**
   * Get contractClassification
   * @return contractClassification
  */
  

  @JsonProperty("contractClassification")
  public String getContractClassification() {
    return contractClassification;
  }

  public void setContractClassification(String contractClassification) {
    this.contractClassification = contractClassification;
  }

  public HeaderDetails brokerName(String brokerName) {
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

  public HeaderDetails brokerNumber(String brokerNumber) {
    this.brokerNumber = brokerNumber;
    return this;
  }

  /**
   * Get brokerNumber
   * @return brokerNumber
  */
  

  @JsonProperty("brokerNumber")
  public String getBrokerNumber() {
    return brokerNumber;
  }

  public void setBrokerNumber(String brokerNumber) {
    this.brokerNumber = brokerNumber;
  }

  public HeaderDetails brokerPseudonym(String brokerPseudonym) {
    this.brokerPseudonym = brokerPseudonym;
    return this;
  }

  /**
   * Get brokerPseudonym
   * @return brokerPseudonym
  */
  

  @JsonProperty("brokerPseudonym")
  public String getBrokerPseudonym() {
    return brokerPseudonym;
  }

  public void setBrokerPseudonym(String brokerPseudonym) {
    this.brokerPseudonym = brokerPseudonym;
  }

  public HeaderDetails brokerPhone(String brokerPhone) {
    this.brokerPhone = brokerPhone;
    return this;
  }

  /**
   * Get brokerPhone
   * @return brokerPhone
  */
  

  @JsonProperty("brokerPhone")
  public String getBrokerPhone() {
    return brokerPhone;
  }

  public void setBrokerPhone(String brokerPhone) {
    this.brokerPhone = brokerPhone;
  }

  public HeaderDetails brokerEmail(String brokerEmail) {
    this.brokerEmail = brokerEmail;
    return this;
  }

  /**
   * Get brokerEmail
   * @return brokerEmail
  */
  

  @JsonProperty("brokerEmail")
  public String getBrokerEmail() {
    return brokerEmail;
  }

  public void setBrokerEmail(String brokerEmail) {
    this.brokerEmail = brokerEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderDetails headerDetails = (HeaderDetails) o;
    return Objects.equals(this.umr, headerDetails.umr) &&
        Objects.equals(this.workPackageRef, headerDetails.workPackageRef) &&
        Objects.equals(this.classOfBusiness, headerDetails.classOfBusiness) &&
        Objects.equals(this.highValuePremium, headerDetails.highValuePremium) &&
        Objects.equals(this.contractClassification, headerDetails.contractClassification) &&
        Objects.equals(this.brokerName, headerDetails.brokerName) &&
        Objects.equals(this.brokerNumber, headerDetails.brokerNumber) &&
        Objects.equals(this.brokerPseudonym, headerDetails.brokerPseudonym) &&
        Objects.equals(this.brokerPhone, headerDetails.brokerPhone) &&
        Objects.equals(this.brokerEmail, headerDetails.brokerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(umr, workPackageRef, classOfBusiness, highValuePremium, contractClassification, brokerName, brokerNumber, brokerPseudonym, brokerPhone, brokerEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderDetails {\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    workPackageRef: ").append(toIndentedString(workPackageRef)).append("\n");
    sb.append("    classOfBusiness: ").append(toIndentedString(classOfBusiness)).append("\n");
    sb.append("    highValuePremium: ").append(toIndentedString(highValuePremium)).append("\n");
    sb.append("    contractClassification: ").append(toIndentedString(contractClassification)).append("\n");
    sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
    sb.append("    brokerNumber: ").append(toIndentedString(brokerNumber)).append("\n");
    sb.append("    brokerPseudonym: ").append(toIndentedString(brokerPseudonym)).append("\n");
    sb.append("    brokerPhone: ").append(toIndentedString(brokerPhone)).append("\n");
    sb.append("    brokerEmail: ").append(toIndentedString(brokerEmail)).append("\n");
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

