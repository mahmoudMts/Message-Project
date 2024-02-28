package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionRecord
 */

@JsonTypeName("submissionRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID submissionId;

  private TechnicianPortalBureauEnum bureau;

  private TypeOfTransactionType transactionType;

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

  private SubmissionStatuses status;

  private UUID brokerPartyDomainId;

  private UUID brokerMarketId;

  
  private OffsetDateTime createdDate;

  
  private OffsetDateTime lastUpdatedDate;

  private CorrectionTypeEnum correctionType;

  private PortalWorkflowStatus portalWorkflowStatus = PortalWorkflowStatus.IN_PROGRESS;

  public SubmissionRecord submissionId(UUID submissionId) {
    this.submissionId = submissionId;
    return this;
  }

  /**
   * key of the record
   * @return submissionId
  */
  @Valid 

  @JsonProperty("submissionId")
  public UUID getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(UUID submissionId) {
    this.submissionId = submissionId;
  }

  public SubmissionRecord bureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @Valid 

  @JsonProperty("bureau")
  public TechnicianPortalBureauEnum getBureau() {
    return bureau;
  }

  public void setBureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
  }

  public SubmissionRecord transactionType(TypeOfTransactionType transactionType) {
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

  public SubmissionRecord grossAmount(BigDecimal grossAmount) {
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

  public SubmissionRecord umr(String umr) {
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

  public SubmissionRecord workPackageRef(String workPackageRef) {
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

  public SubmissionRecord workflowSubmissionId(String workflowSubmissionId) {
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

  public SubmissionRecord classOfBusiness(String classOfBusiness) {
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

  public SubmissionRecord highValuePremium(Boolean highValuePremium) {
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

  public SubmissionRecord contractClassification(String contractClassification) {
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

  public SubmissionRecord brokerName(String brokerName) {
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

  public SubmissionRecord brokerNumber(String brokerNumber) {
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

  public SubmissionRecord brokerPseudonym(String brokerPseudonym) {
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

  public SubmissionRecord brokerPhone(String brokerPhone) {
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

  public SubmissionRecord brokerEmail(String brokerEmail) {
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

  public SubmissionRecord status(SubmissionStatuses status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 

  @JsonProperty("status")
  public SubmissionStatuses getStatus() {
    return status;
  }

  public void setStatus(SubmissionStatuses status) {
    this.status = status;
  }

  public SubmissionRecord brokerPartyDomainId(UUID brokerPartyDomainId) {
    this.brokerPartyDomainId = brokerPartyDomainId;
    return this;
  }

  /**
   * Get brokerPartyDomainId
   * @return brokerPartyDomainId
  */
  @Valid 

  @JsonProperty("brokerPartyDomainId")
  public UUID getBrokerPartyDomainId() {
    return brokerPartyDomainId;
  }

  public void setBrokerPartyDomainId(UUID brokerPartyDomainId) {
    this.brokerPartyDomainId = brokerPartyDomainId;
  }

  public SubmissionRecord brokerMarketId(UUID brokerMarketId) {
    this.brokerMarketId = brokerMarketId;
    return this;
  }

  /**
   * Get brokerMarketId
   * @return brokerMarketId
  */
  @Valid 

  @JsonProperty("brokerMarketId")
  public UUID getBrokerMarketId() {
    return brokerMarketId;
  }

  public void setBrokerMarketId(UUID brokerMarketId) {
    this.brokerMarketId = brokerMarketId;
  }

  public SubmissionRecord createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 

  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public SubmissionRecord lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  */
  @Valid 

  @JsonProperty("lastUpdatedDate")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public SubmissionRecord correctionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
    return this;
  }

  /**
   * Get correctionType
   * @return correctionType
  */
  @Valid 

  @JsonProperty("correctionType")
  public CorrectionTypeEnum getCorrectionType() {
    return correctionType;
  }

  public void setCorrectionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
  }

  public SubmissionRecord portalWorkflowStatus(PortalWorkflowStatus portalWorkflowStatus) {
    this.portalWorkflowStatus = portalWorkflowStatus;
    return this;
  }

  /**
   * Get portalWorkflowStatus
   * @return portalWorkflowStatus
  */
  @Valid 

  @JsonProperty("portalWorkflowStatus")
  public PortalWorkflowStatus getPortalWorkflowStatus() {
    return portalWorkflowStatus;
  }

  public void setPortalWorkflowStatus(PortalWorkflowStatus portalWorkflowStatus) {
    this.portalWorkflowStatus = portalWorkflowStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionRecord submissionRecord = (SubmissionRecord) o;
    return Objects.equals(this.submissionId, submissionRecord.submissionId) &&
        Objects.equals(this.bureau, submissionRecord.bureau) &&
        Objects.equals(this.transactionType, submissionRecord.transactionType) &&
        Objects.equals(this.grossAmount, submissionRecord.grossAmount) &&
        Objects.equals(this.umr, submissionRecord.umr) &&
        Objects.equals(this.workPackageRef, submissionRecord.workPackageRef) &&
        Objects.equals(this.workflowSubmissionId, submissionRecord.workflowSubmissionId) &&
        Objects.equals(this.classOfBusiness, submissionRecord.classOfBusiness) &&
        Objects.equals(this.highValuePremium, submissionRecord.highValuePremium) &&
        Objects.equals(this.contractClassification, submissionRecord.contractClassification) &&
        Objects.equals(this.brokerName, submissionRecord.brokerName) &&
        Objects.equals(this.brokerNumber, submissionRecord.brokerNumber) &&
        Objects.equals(this.brokerPseudonym, submissionRecord.brokerPseudonym) &&
        Objects.equals(this.brokerPhone, submissionRecord.brokerPhone) &&
        Objects.equals(this.brokerEmail, submissionRecord.brokerEmail) &&
        Objects.equals(this.status, submissionRecord.status) &&
        Objects.equals(this.brokerPartyDomainId, submissionRecord.brokerPartyDomainId) &&
        Objects.equals(this.brokerMarketId, submissionRecord.brokerMarketId) &&
        Objects.equals(this.createdDate, submissionRecord.createdDate) &&
        Objects.equals(this.lastUpdatedDate, submissionRecord.lastUpdatedDate) &&
        Objects.equals(this.correctionType, submissionRecord.correctionType) &&
        Objects.equals(this.portalWorkflowStatus, submissionRecord.portalWorkflowStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, bureau, transactionType, grossAmount, umr, workPackageRef, workflowSubmissionId, classOfBusiness, highValuePremium, contractClassification, brokerName, brokerNumber, brokerPseudonym, brokerPhone, brokerEmail, status, brokerPartyDomainId, brokerMarketId, createdDate, lastUpdatedDate, correctionType, portalWorkflowStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionRecord {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    brokerPartyDomainId: ").append(toIndentedString(brokerPartyDomainId)).append("\n");
    sb.append("    brokerMarketId: ").append(toIndentedString(brokerMarketId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
    sb.append("    portalWorkflowStatus: ").append(toIndentedString(portalWorkflowStatus)).append("\n");
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

