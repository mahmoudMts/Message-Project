package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * CorrectionSignings
 */

@JsonTypeName("correctionSignings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class CorrectionSignings implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid PremiumListItem> premiumSigningList = new ArrayList<>();

  private CorrectionTypeEnum correctionType;

  private ReleaseFlagEnum replacementDelinkIndicator;

  private TechnicianPortalBureauEnum bureau;

  private BigDecimal grossAmount;

  private String umr;

  private String workPackageRef;

  private String workflowSubmissionId;

  private String classOfBusiness;

  private Boolean highValuePremium;

  private String contractClassification;

  private String brokerName;

  private String brokerNumber;

  private String brokerPseudonym;

  private String brokerPhone;

  private String brokerEmail;

  public CorrectionSignings() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CorrectionSignings(List<@Valid PremiumListItem> premiumSigningList, CorrectionTypeEnum correctionType, TechnicianPortalBureauEnum bureau, String workPackageRef) {
    this.premiumSigningList = premiumSigningList;
    this.correctionType = correctionType;
    this.bureau = bureau;
    this.workPackageRef = workPackageRef;
  }

  public CorrectionSignings premiumSigningList(List<@Valid PremiumListItem> premiumSigningList) {
    this.premiumSigningList = premiumSigningList;
    return this;
  }

  public CorrectionSignings addPremiumSigningListItem(PremiumListItem premiumSigningListItem) {
    if (this.premiumSigningList == null) {
      this.premiumSigningList = new ArrayList<>();
    }
    this.premiumSigningList.add(premiumSigningListItem);
    return this;
  }

  /**
   * Get premiumSigningList
   * @return premiumSigningList
  */
  @NotNull @Valid 

  @JsonProperty("premiumSigningList")
  public List<@Valid PremiumListItem> getPremiumSigningList() {
    return premiumSigningList;
  }

  public void setPremiumSigningList(List<@Valid PremiumListItem> premiumSigningList) {
    this.premiumSigningList = premiumSigningList;
  }

  public CorrectionSignings correctionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
    return this;
  }

  /**
   * Get correctionType
   * @return correctionType
  */
  @NotNull @Valid 

  @JsonProperty("correctionType")
  public CorrectionTypeEnum getCorrectionType() {
    return correctionType;
  }

  public void setCorrectionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
  }

  public CorrectionSignings replacementDelinkIndicator(ReleaseFlagEnum replacementDelinkIndicator) {
    this.replacementDelinkIndicator = replacementDelinkIndicator;
    return this;
  }

  /**
   * Get replacementDelinkIndicator
   * @return replacementDelinkIndicator
  */
  @Valid 

  @JsonProperty("replacementDelinkIndicator")
  public ReleaseFlagEnum getReplacementDelinkIndicator() {
    return replacementDelinkIndicator;
  }

  public void setReplacementDelinkIndicator(ReleaseFlagEnum replacementDelinkIndicator) {
    this.replacementDelinkIndicator = replacementDelinkIndicator;
  }

  public CorrectionSignings bureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @NotNull @Valid 

  @JsonProperty("bureau")
  public TechnicianPortalBureauEnum getBureau() {
    return bureau;
  }

  public void setBureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
  }

  public CorrectionSignings grossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

  /**
   * Get grossAmount
   * @return grossAmount
  */
  @Valid 

  @JsonProperty("grossAmount")
  public BigDecimal getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }

  public CorrectionSignings umr(String umr) {
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

  public CorrectionSignings workPackageRef(String workPackageRef) {
    this.workPackageRef = workPackageRef;
    return this;
  }

  /**
   * Get workPackageRef
   * @return workPackageRef
  */
  @NotNull 

  @JsonProperty("workPackageRef")
  public String getWorkPackageRef() {
    return workPackageRef;
  }

  public void setWorkPackageRef(String workPackageRef) {
    this.workPackageRef = workPackageRef;
  }

  public CorrectionSignings workflowSubmissionId(String workflowSubmissionId) {
    this.workflowSubmissionId = workflowSubmissionId;
    return this;
  }

  /**
   * Get workflowSubmissionId
   * @return workflowSubmissionId
  */
  

  @JsonProperty("workflowSubmissionId")
  public String getWorkflowSubmissionId() {
    return workflowSubmissionId;
  }

  public void setWorkflowSubmissionId(String workflowSubmissionId) {
    this.workflowSubmissionId = workflowSubmissionId;
  }

  public CorrectionSignings classOfBusiness(String classOfBusiness) {
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

  public CorrectionSignings highValuePremium(Boolean highValuePremium) {
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

  public CorrectionSignings contractClassification(String contractClassification) {
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

  public CorrectionSignings brokerName(String brokerName) {
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

  public CorrectionSignings brokerNumber(String brokerNumber) {
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

  public CorrectionSignings brokerPseudonym(String brokerPseudonym) {
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

  public CorrectionSignings brokerPhone(String brokerPhone) {
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

  public CorrectionSignings brokerEmail(String brokerEmail) {
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
    CorrectionSignings correctionSignings = (CorrectionSignings) o;
    return Objects.equals(this.premiumSigningList, correctionSignings.premiumSigningList) &&
        Objects.equals(this.correctionType, correctionSignings.correctionType) &&
        Objects.equals(this.replacementDelinkIndicator, correctionSignings.replacementDelinkIndicator) &&
        Objects.equals(this.bureau, correctionSignings.bureau) &&
        Objects.equals(this.grossAmount, correctionSignings.grossAmount) &&
        Objects.equals(this.umr, correctionSignings.umr) &&
        Objects.equals(this.workPackageRef, correctionSignings.workPackageRef) &&
        Objects.equals(this.workflowSubmissionId, correctionSignings.workflowSubmissionId) &&
        Objects.equals(this.classOfBusiness, correctionSignings.classOfBusiness) &&
        Objects.equals(this.highValuePremium, correctionSignings.highValuePremium) &&
        Objects.equals(this.contractClassification, correctionSignings.contractClassification) &&
        Objects.equals(this.brokerName, correctionSignings.brokerName) &&
        Objects.equals(this.brokerNumber, correctionSignings.brokerNumber) &&
        Objects.equals(this.brokerPseudonym, correctionSignings.brokerPseudonym) &&
        Objects.equals(this.brokerPhone, correctionSignings.brokerPhone) &&
        Objects.equals(this.brokerEmail, correctionSignings.brokerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumSigningList, correctionType, replacementDelinkIndicator, bureau, grossAmount, umr, workPackageRef, workflowSubmissionId, classOfBusiness, highValuePremium, contractClassification, brokerName, brokerNumber, brokerPseudonym, brokerPhone, brokerEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectionSignings {\n");
    sb.append("    premiumSigningList: ").append(toIndentedString(premiumSigningList)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
    sb.append("    replacementDelinkIndicator: ").append(toIndentedString(replacementDelinkIndicator)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    workPackageRef: ").append(toIndentedString(workPackageRef)).append("\n");
    sb.append("    workflowSubmissionId: ").append(toIndentedString(workflowSubmissionId)).append("\n");
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

