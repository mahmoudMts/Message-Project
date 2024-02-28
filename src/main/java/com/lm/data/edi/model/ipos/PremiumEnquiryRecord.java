package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumEnquiryRecord
 */

@JsonTypeName("premiumEnquiryRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumEnquiryRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID submissionId;

  private SubmissionStatuses submissionStatus;

  private Integer sectionNumber;

  private Bureau bureau;

  private String umr;

  private String workPackageRef;

  private String riskCode;

  private String premiumNarrative;

  
  private LocalDate policyPeriodFrom;

  
  private LocalDate policyPeriodTo;

  private String insuredName;

  private String reinsuredName;

  private TypeOfTransactionType transactionType;

  private TypeOfCurrency originalCurrency;

  private TypeOfCurrency settlementCurrency;

  private Integer yearOfAccount;

  private String transactionStatus;

  private String bsnd;

  private String csnd;

  private String brokerNumber;

  private String brokerContact;

  private ReleaseFlagEnum releaseFlag;

  private ReleasedForSettlementEnum releasedForSettlement;

  private OffsetDateTime releasedOnDate;

  
  private LocalDate releaseDate;

  private String releaseByUserId;

  private Boolean fromEnquiryFlag = true;

  private String premiumStatus;

  private CorrectionNarrativeEnum correctionNarrative;

  private PremiumSource premiumSource = PremiumSource.TECHNICIANPORTAL;

  private NaicSlReportingStatus naicInfoStatus;

  @Valid
  private List<@Valid UsSurplusLineBroker> usSurplusInfoStatus;

  
  private LocalDate settlementDueDate;

  private BigDecimal netAmount;

  private String obsnd;

  private String brokerEmail;

  private BigDecimal exchangeRate;

  private BigDecimal netPremium;

  private String brokerReference1;

  private String brokerReference2;

  public PremiumEnquiryRecord premiumId(UUID premiumId) {
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

  public PremiumEnquiryRecord submissionId(UUID submissionId) {
    this.submissionId = submissionId;
    return this;
  }

  /**
   * Get submissionId
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

  public PremiumEnquiryRecord submissionStatus(SubmissionStatuses submissionStatus) {
    this.submissionStatus = submissionStatus;
    return this;
  }

  /**
   * Get submissionStatus
   * @return submissionStatus
  */
  @Valid 

  @JsonProperty("submissionStatus")
  public SubmissionStatuses getSubmissionStatus() {
    return submissionStatus;
  }

  public void setSubmissionStatus(SubmissionStatuses submissionStatus) {
    this.submissionStatus = submissionStatus;
  }

  public PremiumEnquiryRecord sectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

  /**
   * Get sectionNumber
   * @return sectionNumber
  */
  

  @JsonProperty("sectionNumber")
  public Integer getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public PremiumEnquiryRecord bureau(Bureau bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @Valid 

  @JsonProperty("bureau")
  public Bureau getBureau() {
    return bureau;
  }

  public void setBureau(Bureau bureau) {
    this.bureau = bureau;
  }

  public PremiumEnquiryRecord umr(String umr) {
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

  public PremiumEnquiryRecord workPackageRef(String workPackageRef) {
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

  public PremiumEnquiryRecord riskCode(String riskCode) {
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

  public PremiumEnquiryRecord premiumNarrative(String premiumNarrative) {
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

  public PremiumEnquiryRecord policyPeriodFrom(LocalDate policyPeriodFrom) {
    this.policyPeriodFrom = policyPeriodFrom;
    return this;
  }

  /**
   * Get policyPeriodFrom
   * @return policyPeriodFrom
  */
  @Valid 

  @JsonProperty("policyPeriodFrom")
  public LocalDate getPolicyPeriodFrom() {
    return policyPeriodFrom;
  }

  public void setPolicyPeriodFrom(LocalDate policyPeriodFrom) {
    this.policyPeriodFrom = policyPeriodFrom;
  }

  public PremiumEnquiryRecord policyPeriodTo(LocalDate policyPeriodTo) {
    this.policyPeriodTo = policyPeriodTo;
    return this;
  }

  /**
   * Get policyPeriodTo
   * @return policyPeriodTo
  */
  @Valid 

  @JsonProperty("policyPeriodTo")
  public LocalDate getPolicyPeriodTo() {
    return policyPeriodTo;
  }

  public void setPolicyPeriodTo(LocalDate policyPeriodTo) {
    this.policyPeriodTo = policyPeriodTo;
  }

  public PremiumEnquiryRecord insuredName(String insuredName) {
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

  public PremiumEnquiryRecord reinsuredName(String reinsuredName) {
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

  public PremiumEnquiryRecord transactionType(TypeOfTransactionType transactionType) {
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

  public PremiumEnquiryRecord originalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
    return this;
  }

  /**
   * Get originalCurrency
   * @return originalCurrency
  */
  @Valid 

  @JsonProperty("originalCurrency")
  public TypeOfCurrency getOriginalCurrency() {
    return originalCurrency;
  }

  public void setOriginalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public PremiumEnquiryRecord settlementCurrency(TypeOfCurrency settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

  /**
   * Get settlementCurrency
   * @return settlementCurrency
  */
  @Valid 

  @JsonProperty("settlementCurrency")
  public TypeOfCurrency getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(TypeOfCurrency settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public PremiumEnquiryRecord yearOfAccount(Integer yearOfAccount) {
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

  public PremiumEnquiryRecord transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  */
  

  @JsonProperty("transactionStatus")
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PremiumEnquiryRecord bsnd(String bsnd) {
    this.bsnd = bsnd;
    return this;
  }

  /**
   * Get bsnd
   * @return bsnd
  */
  

  @JsonProperty("bsnd")
  public String getBsnd() {
    return bsnd;
  }

  public void setBsnd(String bsnd) {
    this.bsnd = bsnd;
  }

  public PremiumEnquiryRecord csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * Get csnd
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public PremiumEnquiryRecord brokerNumber(String brokerNumber) {
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

  public PremiumEnquiryRecord brokerContact(String brokerContact) {
    this.brokerContact = brokerContact;
    return this;
  }

  /**
   * Get brokerContact
   * @return brokerContact
  */
  

  @JsonProperty("brokerContact")
  public String getBrokerContact() {
    return brokerContact;
  }

  public void setBrokerContact(String brokerContact) {
    this.brokerContact = brokerContact;
  }

  public PremiumEnquiryRecord releaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
    return this;
  }

  /**
   * Get releaseFlag
   * @return releaseFlag
  */
  @Valid 

  @JsonProperty("releaseFlag")
  public ReleaseFlagEnum getReleaseFlag() {
    return releaseFlag;
  }

  public void setReleaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
  }

  public PremiumEnquiryRecord releasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
    return this;
  }

  /**
   * Get releasedForSettlement
   * @return releasedForSettlement
  */
  @Valid 

  @JsonProperty("releasedForSettlement")
  public ReleasedForSettlementEnum getReleasedForSettlement() {
    return releasedForSettlement;
  }

  public void setReleasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
  }

  public PremiumEnquiryRecord releasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
    return this;
  }

  /**
   * Get releasedOnDate
   * @return releasedOnDate
  */
  @Valid 

  @JsonProperty("releasedOnDate")
  public OffsetDateTime getReleasedOnDate() {
    return releasedOnDate;
  }

  public void setReleasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
  }

  public PremiumEnquiryRecord releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @Valid 

  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public PremiumEnquiryRecord releaseByUserId(String releaseByUserId) {
    this.releaseByUserId = releaseByUserId;
    return this;
  }

  /**
   * Get releaseByUserId
   * @return releaseByUserId
  */
  

  @JsonProperty("releaseByUserId")
  public String getReleaseByUserId() {
    return releaseByUserId;
  }

  public void setReleaseByUserId(String releaseByUserId) {
    this.releaseByUserId = releaseByUserId;
  }

  public PremiumEnquiryRecord fromEnquiryFlag(Boolean fromEnquiryFlag) {
    this.fromEnquiryFlag = fromEnquiryFlag;
    return this;
  }

  /**
   * Get fromEnquiryFlag
   * @return fromEnquiryFlag
  */
  

  @JsonProperty("fromEnquiryFlag")
  public Boolean getFromEnquiryFlag() {
    return fromEnquiryFlag;
  }

  public void setFromEnquiryFlag(Boolean fromEnquiryFlag) {
    this.fromEnquiryFlag = fromEnquiryFlag;
  }

  public PremiumEnquiryRecord premiumStatus(String premiumStatus) {
    this.premiumStatus = premiumStatus;
    return this;
  }

  /**
   * The status column from the premium record on the technician_portal table
   * @return premiumStatus
  */
  

  @JsonProperty("premiumStatus")
  public String getPremiumStatus() {
    return premiumStatus;
  }

  public void setPremiumStatus(String premiumStatus) {
    this.premiumStatus = premiumStatus;
  }

  public PremiumEnquiryRecord correctionNarrative(CorrectionNarrativeEnum correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
    return this;
  }

  /**
   * Get correctionNarrative
   * @return correctionNarrative
  */
  @Valid 

  @JsonProperty("correctionNarrative")
  public CorrectionNarrativeEnum getCorrectionNarrative() {
    return correctionNarrative;
  }

  public void setCorrectionNarrative(CorrectionNarrativeEnum correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
  }

  public PremiumEnquiryRecord premiumSource(PremiumSource premiumSource) {
    this.premiumSource = premiumSource;
    return this;
  }

  /**
   * Get premiumSource
   * @return premiumSource
  */
  @Valid 

  @JsonProperty("premiumSource")
  public PremiumSource getPremiumSource() {
    return premiumSource;
  }

  public void setPremiumSource(PremiumSource premiumSource) {
    this.premiumSource = premiumSource;
  }

  public PremiumEnquiryRecord naicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
    return this;
  }

  /**
   * Get naicInfoStatus
   * @return naicInfoStatus
  */
  @Valid 

  @JsonProperty("naicInfoStatus")
  public NaicSlReportingStatus getNaicInfoStatus() {
    return naicInfoStatus;
  }

  public void setNaicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
  }

  public PremiumEnquiryRecord usSurplusInfoStatus(List<@Valid UsSurplusLineBroker> usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
    return this;
  }

  public PremiumEnquiryRecord addUsSurplusInfoStatusItem(UsSurplusLineBroker usSurplusInfoStatusItem) {
    if (this.usSurplusInfoStatus == null) {
      this.usSurplusInfoStatus = new ArrayList<>();
    }
    this.usSurplusInfoStatus.add(usSurplusInfoStatusItem);
    return this;
  }

  /**
   * Get usSurplusInfoStatus
   * @return usSurplusInfoStatus
  */
  @Valid 

  @JsonProperty("usSurplusInfoStatus")
  public List<@Valid UsSurplusLineBroker> getUsSurplusInfoStatus() {
    return usSurplusInfoStatus;
  }

  public void setUsSurplusInfoStatus(List<@Valid UsSurplusLineBroker> usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
  }

  public PremiumEnquiryRecord settlementDueDate(LocalDate settlementDueDate) {
    this.settlementDueDate = settlementDueDate;
    return this;
  }

  /**
   * Get settlementDueDate
   * @return settlementDueDate
  */
  @Valid 

  @JsonProperty("settlementDueDate")
  public LocalDate getSettlementDueDate() {
    return settlementDueDate;
  }

  public void setSettlementDueDate(LocalDate settlementDueDate) {
    this.settlementDueDate = settlementDueDate;
  }

  public PremiumEnquiryRecord netAmount(BigDecimal netAmount) {
    this.netAmount = netAmount;
    return this;
  }

  /**
   * Get netAmount
   * @return netAmount
  */
  @Valid 

  @JsonProperty("netAmount")
  public BigDecimal getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(BigDecimal netAmount) {
    this.netAmount = netAmount;
  }

  public PremiumEnquiryRecord obsnd(String obsnd) {
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

  public PremiumEnquiryRecord brokerEmail(String brokerEmail) {
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

  public PremiumEnquiryRecord exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
   * @return exchangeRate
  */
  @Valid 

  @JsonProperty("exchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public PremiumEnquiryRecord netPremium(BigDecimal netPremium) {
    this.netPremium = netPremium;
    return this;
  }

  /**
   * Get netPremium
   * @return netPremium
  */
  @Valid 

  @JsonProperty("netPremium")
  public BigDecimal getNetPremium() {
    return netPremium;
  }

  public void setNetPremium(BigDecimal netPremium) {
    this.netPremium = netPremium;
  }

  public PremiumEnquiryRecord brokerReference1(String brokerReference1) {
    this.brokerReference1 = brokerReference1;
    return this;
  }

  /**
   * Get brokerReference1
   * @return brokerReference1
  */
  

  @JsonProperty("brokerReference1")
  public String getBrokerReference1() {
    return brokerReference1;
  }

  public void setBrokerReference1(String brokerReference1) {
    this.brokerReference1 = brokerReference1;
  }

  public PremiumEnquiryRecord brokerReference2(String brokerReference2) {
    this.brokerReference2 = brokerReference2;
    return this;
  }

  /**
   * Get brokerReference2
   * @return brokerReference2
  */
  

  @JsonProperty("brokerReference2")
  public String getBrokerReference2() {
    return brokerReference2;
  }

  public void setBrokerReference2(String brokerReference2) {
    this.brokerReference2 = brokerReference2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumEnquiryRecord premiumEnquiryRecord = (PremiumEnquiryRecord) o;
    return Objects.equals(this.premiumId, premiumEnquiryRecord.premiumId) &&
        Objects.equals(this.submissionId, premiumEnquiryRecord.submissionId) &&
        Objects.equals(this.submissionStatus, premiumEnquiryRecord.submissionStatus) &&
        Objects.equals(this.sectionNumber, premiumEnquiryRecord.sectionNumber) &&
        Objects.equals(this.bureau, premiumEnquiryRecord.bureau) &&
        Objects.equals(this.umr, premiumEnquiryRecord.umr) &&
        Objects.equals(this.workPackageRef, premiumEnquiryRecord.workPackageRef) &&
        Objects.equals(this.riskCode, premiumEnquiryRecord.riskCode) &&
        Objects.equals(this.premiumNarrative, premiumEnquiryRecord.premiumNarrative) &&
        Objects.equals(this.policyPeriodFrom, premiumEnquiryRecord.policyPeriodFrom) &&
        Objects.equals(this.policyPeriodTo, premiumEnquiryRecord.policyPeriodTo) &&
        Objects.equals(this.insuredName, premiumEnquiryRecord.insuredName) &&
        Objects.equals(this.reinsuredName, premiumEnquiryRecord.reinsuredName) &&
        Objects.equals(this.transactionType, premiumEnquiryRecord.transactionType) &&
        Objects.equals(this.originalCurrency, premiumEnquiryRecord.originalCurrency) &&
        Objects.equals(this.settlementCurrency, premiumEnquiryRecord.settlementCurrency) &&
        Objects.equals(this.yearOfAccount, premiumEnquiryRecord.yearOfAccount) &&
        Objects.equals(this.transactionStatus, premiumEnquiryRecord.transactionStatus) &&
        Objects.equals(this.bsnd, premiumEnquiryRecord.bsnd) &&
        Objects.equals(this.csnd, premiumEnquiryRecord.csnd) &&
        Objects.equals(this.brokerNumber, premiumEnquiryRecord.brokerNumber) &&
        Objects.equals(this.brokerContact, premiumEnquiryRecord.brokerContact) &&
        Objects.equals(this.releaseFlag, premiumEnquiryRecord.releaseFlag) &&
        Objects.equals(this.releasedForSettlement, premiumEnquiryRecord.releasedForSettlement) &&
        Objects.equals(this.releasedOnDate, premiumEnquiryRecord.releasedOnDate) &&
        Objects.equals(this.releaseDate, premiumEnquiryRecord.releaseDate) &&
        Objects.equals(this.releaseByUserId, premiumEnquiryRecord.releaseByUserId) &&
        Objects.equals(this.fromEnquiryFlag, premiumEnquiryRecord.fromEnquiryFlag) &&
        Objects.equals(this.premiumStatus, premiumEnquiryRecord.premiumStatus) &&
        Objects.equals(this.correctionNarrative, premiumEnquiryRecord.correctionNarrative) &&
        Objects.equals(this.premiumSource, premiumEnquiryRecord.premiumSource) &&
        Objects.equals(this.naicInfoStatus, premiumEnquiryRecord.naicInfoStatus) &&
        Objects.equals(this.usSurplusInfoStatus, premiumEnquiryRecord.usSurplusInfoStatus) &&
        Objects.equals(this.settlementDueDate, premiumEnquiryRecord.settlementDueDate) &&
        Objects.equals(this.netAmount, premiumEnquiryRecord.netAmount) &&
        Objects.equals(this.obsnd, premiumEnquiryRecord.obsnd) &&
        Objects.equals(this.brokerEmail, premiumEnquiryRecord.brokerEmail) &&
        Objects.equals(this.exchangeRate, premiumEnquiryRecord.exchangeRate) &&
        Objects.equals(this.netPremium, premiumEnquiryRecord.netPremium) &&
        Objects.equals(this.brokerReference1, premiumEnquiryRecord.brokerReference1) &&
        Objects.equals(this.brokerReference2, premiumEnquiryRecord.brokerReference2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, submissionId, submissionStatus, sectionNumber, bureau, umr, workPackageRef, riskCode, premiumNarrative, policyPeriodFrom, policyPeriodTo, insuredName, reinsuredName, transactionType, originalCurrency, settlementCurrency, yearOfAccount, transactionStatus, bsnd, csnd, brokerNumber, brokerContact, releaseFlag, releasedForSettlement, releasedOnDate, releaseDate, releaseByUserId, fromEnquiryFlag, premiumStatus, correctionNarrative, premiumSource, naicInfoStatus, usSurplusInfoStatus, settlementDueDate, netAmount, obsnd, brokerEmail, exchangeRate, netPremium, brokerReference1, brokerReference2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumEnquiryRecord {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    submissionStatus: ").append(toIndentedString(submissionStatus)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    workPackageRef: ").append(toIndentedString(workPackageRef)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    premiumNarrative: ").append(toIndentedString(premiumNarrative)).append("\n");
    sb.append("    policyPeriodFrom: ").append(toIndentedString(policyPeriodFrom)).append("\n");
    sb.append("    policyPeriodTo: ").append(toIndentedString(policyPeriodTo)).append("\n");
    sb.append("    insuredName: ").append(toIndentedString(insuredName)).append("\n");
    sb.append("    reinsuredName: ").append(toIndentedString(reinsuredName)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    yearOfAccount: ").append(toIndentedString(yearOfAccount)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    brokerNumber: ").append(toIndentedString(brokerNumber)).append("\n");
    sb.append("    brokerContact: ").append(toIndentedString(brokerContact)).append("\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    releasedForSettlement: ").append(toIndentedString(releasedForSettlement)).append("\n");
    sb.append("    releasedOnDate: ").append(toIndentedString(releasedOnDate)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseByUserId: ").append(toIndentedString(releaseByUserId)).append("\n");
    sb.append("    fromEnquiryFlag: ").append(toIndentedString(fromEnquiryFlag)).append("\n");
    sb.append("    premiumStatus: ").append(toIndentedString(premiumStatus)).append("\n");
    sb.append("    correctionNarrative: ").append(toIndentedString(correctionNarrative)).append("\n");
    sb.append("    premiumSource: ").append(toIndentedString(premiumSource)).append("\n");
    sb.append("    naicInfoStatus: ").append(toIndentedString(naicInfoStatus)).append("\n");
    sb.append("    usSurplusInfoStatus: ").append(toIndentedString(usSurplusInfoStatus)).append("\n");
    sb.append("    settlementDueDate: ").append(toIndentedString(settlementDueDate)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    brokerEmail: ").append(toIndentedString(brokerEmail)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    netPremium: ").append(toIndentedString(netPremium)).append("\n");
    sb.append("    brokerReference1: ").append(toIndentedString(brokerReference1)).append("\n");
    sb.append("    brokerReference2: ").append(toIndentedString(brokerReference2)).append("\n");
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

