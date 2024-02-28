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
 * SigningPremiumGet
 */

@JsonTypeName("signingPremiumGet")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SigningPremiumGet implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID signingPremiumId;

  private UUID signingId;

  private UUID sectionId;

  private UUID premiumId;

  private Integer sectionNumber;

  private String riskCode;

  private String premiumNarrative;

  private TypeOfCurrency originalCurrency;

  private BigDecimal premiumNet;

  private TypeOfTransactionType transaction;

  private String bsnd;

  private String csnd;

  private String csn;

  
  private OffsetDateTime csd;

  private Integer csnVersion;

  private String bsn;

  
  private OffsetDateTime bsd;

  private Integer bsnVersion;

  private String signingMessage;

  private String signedByUser;

  private String signedByUserFullName;

  private String signedByUserEmail;

  private String directPremiumBsnd;

  private String directPremiumCsnd;

  private RecordStatusCodeEnum recordStatusCode;

  
  private OffsetDateTime recordStatusDate;

  private String naicInfoStatus;

  private String usSurplusLineInfoStatus;

  public SigningPremiumGet signingPremiumId(UUID signingPremiumId) {
    this.signingPremiumId = signingPremiumId;
    return this;
  }

  /**
   * Get signingPremiumId
   * @return signingPremiumId
  */
  @Valid 

  @JsonProperty("signingPremiumId")
  public UUID getSigningPremiumId() {
    return signingPremiumId;
  }

  public void setSigningPremiumId(UUID signingPremiumId) {
    this.signingPremiumId = signingPremiumId;
  }

  public SigningPremiumGet signingId(UUID signingId) {
    this.signingId = signingId;
    return this;
  }

  /**
   * Get signingId
   * @return signingId
  */
  @Valid 

  @JsonProperty("signingId")
  public UUID getSigningId() {
    return signingId;
  }

  public void setSigningId(UUID signingId) {
    this.signingId = signingId;
  }

  public SigningPremiumGet sectionId(UUID sectionId) {
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

  public SigningPremiumGet premiumId(UUID premiumId) {
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

  public SigningPremiumGet sectionNumber(Integer sectionNumber) {
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

  public SigningPremiumGet riskCode(String riskCode) {
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

  public SigningPremiumGet premiumNarrative(String premiumNarrative) {
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

  public SigningPremiumGet originalCurrency(TypeOfCurrency originalCurrency) {
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

  public SigningPremiumGet premiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
    return this;
  }

  /**
   * Get premiumNet
   * @return premiumNet
  */
  @Valid 

  @JsonProperty("premiumNet")
  public BigDecimal getPremiumNet() {
    return premiumNet;
  }

  public void setPremiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
  }

  public SigningPremiumGet transaction(TypeOfTransactionType transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
  */
  @Valid 

  @JsonProperty("transaction")
  public TypeOfTransactionType getTransaction() {
    return transaction;
  }

  public void setTransaction(TypeOfTransactionType transaction) {
    this.transaction = transaction;
  }

  public SigningPremiumGet bsnd(String bsnd) {
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

  public SigningPremiumGet csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * Carrier signing number and date, e.g. for Lloyds the format is NNNNN DDMMYYYY
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public SigningPremiumGet csn(String csn) {
    this.csn = csn;
    return this;
  }

  /**
   * Carrier signing number, the numeric part of the CSND
   * @return csn
  */
  

  @JsonProperty("csn")
  public String getCsn() {
    return csn;
  }

  public void setCsn(String csn) {
    this.csn = csn;
  }

  public SigningPremiumGet csd(OffsetDateTime csd) {
    this.csd = csd;
    return this;
  }

  /**
   * Carrier signing date, date and timestamp
   * @return csd
  */
  @Valid 

  @JsonProperty("csd")
  public OffsetDateTime getCsd() {
    return csd;
  }

  public void setCsd(OffsetDateTime csd) {
    this.csd = csd;
  }

  public SigningPremiumGet csnVersion(Integer csnVersion) {
    this.csnVersion = csnVersion;
    return this;
  }

  /**
   * Get csnVersion
   * @return csnVersion
  */
  

  @JsonProperty("csnVersion")
  public Integer getCsnVersion() {
    return csnVersion;
  }

  public void setCsnVersion(Integer csnVersion) {
    this.csnVersion = csnVersion;
  }

  public SigningPremiumGet bsn(String bsn) {
    this.bsn = bsn;
    return this;
  }

  /**
   * Broker signing number, the numeric part of the BSND
   * @return bsn
  */
  

  @JsonProperty("bsn")
  public String getBsn() {
    return bsn;
  }

  public void setBsn(String bsn) {
    this.bsn = bsn;
  }

  public SigningPremiumGet bsd(OffsetDateTime bsd) {
    this.bsd = bsd;
    return this;
  }

  /**
   * Broker signing date, date and timestamp
   * @return bsd
  */
  @Valid 

  @JsonProperty("bsd")
  public OffsetDateTime getBsd() {
    return bsd;
  }

  public void setBsd(OffsetDateTime bsd) {
    this.bsd = bsd;
  }

  public SigningPremiumGet bsnVersion(Integer bsnVersion) {
    this.bsnVersion = bsnVersion;
    return this;
  }

  /**
   * Get bsnVersion
   * @return bsnVersion
  */
  

  @JsonProperty("bsnVersion")
  public Integer getBsnVersion() {
    return bsnVersion;
  }

  public void setBsnVersion(Integer bsnVersion) {
    this.bsnVersion = bsnVersion;
  }

  public SigningPremiumGet signingMessage(String signingMessage) {
    this.signingMessage = signingMessage;
    return this;
  }

  /**
   * Get signingMessage
   * @return signingMessage
  */
  

  @JsonProperty("signingMessage")
  public String getSigningMessage() {
    return signingMessage;
  }

  public void setSigningMessage(String signingMessage) {
    this.signingMessage = signingMessage;
  }

  public SigningPremiumGet signedByUser(String signedByUser) {
    this.signedByUser = signedByUser;
    return this;
  }

  /**
   * The id of the user that signed the submission
   * @return signedByUser
  */
  

  @JsonProperty("signedByUser")
  public String getSignedByUser() {
    return signedByUser;
  }

  public void setSignedByUser(String signedByUser) {
    this.signedByUser = signedByUser;
  }

  public SigningPremiumGet signedByUserFullName(String signedByUserFullName) {
    this.signedByUserFullName = signedByUserFullName;
    return this;
  }

  /**
   * The full name of the user that signed the transaction
   * @return signedByUserFullName
  */
  

  @JsonProperty("signedByUserFullName")
  public String getSignedByUserFullName() {
    return signedByUserFullName;
  }

  public void setSignedByUserFullName(String signedByUserFullName) {
    this.signedByUserFullName = signedByUserFullName;
  }

  public SigningPremiumGet signedByUserEmail(String signedByUserEmail) {
    this.signedByUserEmail = signedByUserEmail;
    return this;
  }

  /**
   * The email address of the user that signed the transaction
   * @return signedByUserEmail
  */
  

  @JsonProperty("signedByUserEmail")
  public String getSignedByUserEmail() {
    return signedByUserEmail;
  }

  public void setSignedByUserEmail(String signedByUserEmail) {
    this.signedByUserEmail = signedByUserEmail;
  }

  public SigningPremiumGet directPremiumBsnd(String directPremiumBsnd) {
    this.directPremiumBsnd = directPremiumBsnd;
    return this;
  }

  /**
   * used for a auto RI premium. the broker signing number and date of the direct premium
   * @return directPremiumBsnd
  */
  

  @JsonProperty("directPremiumBsnd")
  public String getDirectPremiumBsnd() {
    return directPremiumBsnd;
  }

  public void setDirectPremiumBsnd(String directPremiumBsnd) {
    this.directPremiumBsnd = directPremiumBsnd;
  }

  public SigningPremiumGet directPremiumCsnd(String directPremiumCsnd) {
    this.directPremiumCsnd = directPremiumCsnd;
    return this;
  }

  /**
   * used for a auto RI premium.the original carrier signing number and date, maps to premium level
   * @return directPremiumCsnd
  */
  

  @JsonProperty("directPremiumCsnd")
  public String getDirectPremiumCsnd() {
    return directPremiumCsnd;
  }

  public void setDirectPremiumCsnd(String directPremiumCsnd) {
    this.directPremiumCsnd = directPremiumCsnd;
  }

  public SigningPremiumGet recordStatusCode(RecordStatusCodeEnum recordStatusCode) {
    this.recordStatusCode = recordStatusCode;
    return this;
  }

  /**
   * Get recordStatusCode
   * @return recordStatusCode
  */
  @Valid 

  @JsonProperty("recordStatusCode")
  public RecordStatusCodeEnum getRecordStatusCode() {
    return recordStatusCode;
  }

  public void setRecordStatusCode(RecordStatusCodeEnum recordStatusCode) {
    this.recordStatusCode = recordStatusCode;
  }

  public SigningPremiumGet recordStatusDate(OffsetDateTime recordStatusDate) {
    this.recordStatusDate = recordStatusDate;
    return this;
  }

  /**
   * Get recordStatusDate
   * @return recordStatusDate
  */
  @Valid 

  @JsonProperty("recordStatusDate")
  public OffsetDateTime getRecordStatusDate() {
    return recordStatusDate;
  }

  public void setRecordStatusDate(OffsetDateTime recordStatusDate) {
    this.recordStatusDate = recordStatusDate;
  }

  public SigningPremiumGet naicInfoStatus(String naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
    return this;
  }

  /**
   * completion status of NAIC
   * @return naicInfoStatus
  */
  

  @JsonProperty("naicInfoStatus")
  public String getNaicInfoStatus() {
    return naicInfoStatus;
  }

  public void setNaicInfoStatus(String naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
  }

  public SigningPremiumGet usSurplusLineInfoStatus(String usSurplusLineInfoStatus) {
    this.usSurplusLineInfoStatus = usSurplusLineInfoStatus;
    return this;
  }

  /**
   * completionstatus of USSL
   * @return usSurplusLineInfoStatus
  */
  

  @JsonProperty("usSurplusLineInfoStatus")
  public String getUsSurplusLineInfoStatus() {
    return usSurplusLineInfoStatus;
  }

  public void setUsSurplusLineInfoStatus(String usSurplusLineInfoStatus) {
    this.usSurplusLineInfoStatus = usSurplusLineInfoStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningPremiumGet signingPremiumGet = (SigningPremiumGet) o;
    return Objects.equals(this.signingPremiumId, signingPremiumGet.signingPremiumId) &&
        Objects.equals(this.signingId, signingPremiumGet.signingId) &&
        Objects.equals(this.sectionId, signingPremiumGet.sectionId) &&
        Objects.equals(this.premiumId, signingPremiumGet.premiumId) &&
        Objects.equals(this.sectionNumber, signingPremiumGet.sectionNumber) &&
        Objects.equals(this.riskCode, signingPremiumGet.riskCode) &&
        Objects.equals(this.premiumNarrative, signingPremiumGet.premiumNarrative) &&
        Objects.equals(this.originalCurrency, signingPremiumGet.originalCurrency) &&
        Objects.equals(this.premiumNet, signingPremiumGet.premiumNet) &&
        Objects.equals(this.transaction, signingPremiumGet.transaction) &&
        Objects.equals(this.bsnd, signingPremiumGet.bsnd) &&
        Objects.equals(this.csnd, signingPremiumGet.csnd) &&
        Objects.equals(this.csn, signingPremiumGet.csn) &&
        Objects.equals(this.csd, signingPremiumGet.csd) &&
        Objects.equals(this.csnVersion, signingPremiumGet.csnVersion) &&
        Objects.equals(this.bsn, signingPremiumGet.bsn) &&
        Objects.equals(this.bsd, signingPremiumGet.bsd) &&
        Objects.equals(this.bsnVersion, signingPremiumGet.bsnVersion) &&
        Objects.equals(this.signingMessage, signingPremiumGet.signingMessage) &&
        Objects.equals(this.signedByUser, signingPremiumGet.signedByUser) &&
        Objects.equals(this.signedByUserFullName, signingPremiumGet.signedByUserFullName) &&
        Objects.equals(this.signedByUserEmail, signingPremiumGet.signedByUserEmail) &&
        Objects.equals(this.directPremiumBsnd, signingPremiumGet.directPremiumBsnd) &&
        Objects.equals(this.directPremiumCsnd, signingPremiumGet.directPremiumCsnd) &&
        Objects.equals(this.recordStatusCode, signingPremiumGet.recordStatusCode) &&
        Objects.equals(this.recordStatusDate, signingPremiumGet.recordStatusDate) &&
        Objects.equals(this.naicInfoStatus, signingPremiumGet.naicInfoStatus) &&
        Objects.equals(this.usSurplusLineInfoStatus, signingPremiumGet.usSurplusLineInfoStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingPremiumId, signingId, sectionId, premiumId, sectionNumber, riskCode, premiumNarrative, originalCurrency, premiumNet, transaction, bsnd, csnd, csn, csd, csnVersion, bsn, bsd, bsnVersion, signingMessage, signedByUser, signedByUserFullName, signedByUserEmail, directPremiumBsnd, directPremiumCsnd, recordStatusCode, recordStatusDate, naicInfoStatus, usSurplusLineInfoStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningPremiumGet {\n");
    sb.append("    signingPremiumId: ").append(toIndentedString(signingPremiumId)).append("\n");
    sb.append("    signingId: ").append(toIndentedString(signingId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    premiumNarrative: ").append(toIndentedString(premiumNarrative)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    premiumNet: ").append(toIndentedString(premiumNet)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    csn: ").append(toIndentedString(csn)).append("\n");
    sb.append("    csd: ").append(toIndentedString(csd)).append("\n");
    sb.append("    csnVersion: ").append(toIndentedString(csnVersion)).append("\n");
    sb.append("    bsn: ").append(toIndentedString(bsn)).append("\n");
    sb.append("    bsd: ").append(toIndentedString(bsd)).append("\n");
    sb.append("    bsnVersion: ").append(toIndentedString(bsnVersion)).append("\n");
    sb.append("    signingMessage: ").append(toIndentedString(signingMessage)).append("\n");
    sb.append("    signedByUser: ").append(toIndentedString(signedByUser)).append("\n");
    sb.append("    signedByUserFullName: ").append(toIndentedString(signedByUserFullName)).append("\n");
    sb.append("    signedByUserEmail: ").append(toIndentedString(signedByUserEmail)).append("\n");
    sb.append("    directPremiumBsnd: ").append(toIndentedString(directPremiumBsnd)).append("\n");
    sb.append("    directPremiumCsnd: ").append(toIndentedString(directPremiumCsnd)).append("\n");
    sb.append("    recordStatusCode: ").append(toIndentedString(recordStatusCode)).append("\n");
    sb.append("    recordStatusDate: ").append(toIndentedString(recordStatusDate)).append("\n");
    sb.append("    naicInfoStatus: ").append(toIndentedString(naicInfoStatus)).append("\n");
    sb.append("    usSurplusLineInfoStatus: ").append(toIndentedString(usSurplusLineInfoStatus)).append("\n");
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

