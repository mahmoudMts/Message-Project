package com.lm.data.edi.model.ipos;

import java.io.Serializable;
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
 * IndexingTableRec
 */

@JsonTypeName("indexingTableRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IndexingTableRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumid;

  private TypeOfTransactionType transactiontype;

  private String umr;

  private String brokerName;

  private String brokerNumber;

  private String brokerRef1;

  private String brokerRef2;

  private UUID brokerPartyDomainId;

  private OffsetDateTime bsd;

  private String bsnd;

  private TechnicianPortalBureauEnum bureau;

  private String workPackageRef;

  @Valid
  private List<@Valid MarketSyndicate> carriers;

  private String contractClassification;

  private OffsetDateTime csd;

  private String csnd;

  private String obsnd;

  private String ocsnd;

  private PremiumSource premiumSource = PremiumSource.TECHNICIANPORTAL;

  private ReleaseFlagEnum releaseFlag;

  private ReleasedForSettlementEnum releasedForSettlement;

  private LocalDate settlementDueDate;

  private TypeOfCurrency settlementCurrency;

  private String status;

  private UUID replacesId;

  private CorrectionTypeEnum correctionType;

  public IndexingTableRec premiumid(UUID premiumid) {
    this.premiumid = premiumid;
    return this;
  }

  /**
   * Get premiumid
   * @return premiumid
  */
  @Valid 

  @JsonProperty("premiumid")
  public UUID getPremiumid() {
    return premiumid;
  }

  public void setPremiumid(UUID premiumid) {
    this.premiumid = premiumid;
  }

  public IndexingTableRec transactiontype(TypeOfTransactionType transactiontype) {
    this.transactiontype = transactiontype;
    return this;
  }

  /**
   * Get transactiontype
   * @return transactiontype
  */
  @Valid 

  @JsonProperty("transactiontype")
  public TypeOfTransactionType getTransactiontype() {
    return transactiontype;
  }

  public void setTransactiontype(TypeOfTransactionType transactiontype) {
    this.transactiontype = transactiontype;
  }

  public IndexingTableRec umr(String umr) {
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

  public IndexingTableRec brokerName(String brokerName) {
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

  public IndexingTableRec brokerNumber(String brokerNumber) {
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

  public IndexingTableRec brokerRef1(String brokerRef1) {
    this.brokerRef1 = brokerRef1;
    return this;
  }

  /**
   * Get brokerRef1
   * @return brokerRef1
  */
  

  @JsonProperty("brokerRef1")
  public String getBrokerRef1() {
    return brokerRef1;
  }

  public void setBrokerRef1(String brokerRef1) {
    this.brokerRef1 = brokerRef1;
  }

  public IndexingTableRec brokerRef2(String brokerRef2) {
    this.brokerRef2 = brokerRef2;
    return this;
  }

  /**
   * Get brokerRef2
   * @return brokerRef2
  */
  

  @JsonProperty("brokerRef2")
  public String getBrokerRef2() {
    return brokerRef2;
  }

  public void setBrokerRef2(String brokerRef2) {
    this.brokerRef2 = brokerRef2;
  }

  public IndexingTableRec brokerPartyDomainId(UUID brokerPartyDomainId) {
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

  public IndexingTableRec bsd(OffsetDateTime bsd) {
    this.bsd = bsd;
    return this;
  }

  /**
   * Get bsd
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

  public IndexingTableRec bsnd(String bsnd) {
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

  public IndexingTableRec bureau(TechnicianPortalBureauEnum bureau) {
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

  public IndexingTableRec workPackageRef(String workPackageRef) {
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

  public IndexingTableRec carriers(List<@Valid MarketSyndicate> carriers) {
    this.carriers = carriers;
    return this;
  }

  public IndexingTableRec addCarriersItem(MarketSyndicate carriersItem) {
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
  public List<@Valid MarketSyndicate> getCarriers() {
    return carriers;
  }

  public void setCarriers(List<@Valid MarketSyndicate> carriers) {
    this.carriers = carriers;
  }

  public IndexingTableRec contractClassification(String contractClassification) {
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

  public IndexingTableRec csd(OffsetDateTime csd) {
    this.csd = csd;
    return this;
  }

  /**
   * Get csd
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

  public IndexingTableRec csnd(String csnd) {
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

  public IndexingTableRec obsnd(String obsnd) {
    this.obsnd = obsnd;
    return this;
  }

  /**
   * Get obsnd
   * @return obsnd
  */
  

  @JsonProperty("obsnd")
  public String getObsnd() {
    return obsnd;
  }

  public void setObsnd(String obsnd) {
    this.obsnd = obsnd;
  }

  public IndexingTableRec ocsnd(String ocsnd) {
    this.ocsnd = ocsnd;
    return this;
  }

  /**
   * Get ocsnd
   * @return ocsnd
  */
  

  @JsonProperty("ocsnd")
  public String getOcsnd() {
    return ocsnd;
  }

  public void setOcsnd(String ocsnd) {
    this.ocsnd = ocsnd;
  }

  public IndexingTableRec premiumSource(PremiumSource premiumSource) {
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

  public IndexingTableRec releaseFlag(ReleaseFlagEnum releaseFlag) {
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

  public IndexingTableRec releasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
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

  public IndexingTableRec settlementDueDate(LocalDate settlementDueDate) {
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

  public IndexingTableRec settlementCurrency(TypeOfCurrency settlementCurrency) {
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

  public IndexingTableRec status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IndexingTableRec replacesId(UUID replacesId) {
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

  public IndexingTableRec correctionType(CorrectionTypeEnum correctionType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexingTableRec indexingTableRec = (IndexingTableRec) o;
    return Objects.equals(this.premiumid, indexingTableRec.premiumid) &&
        Objects.equals(this.transactiontype, indexingTableRec.transactiontype) &&
        Objects.equals(this.umr, indexingTableRec.umr) &&
        Objects.equals(this.brokerName, indexingTableRec.brokerName) &&
        Objects.equals(this.brokerNumber, indexingTableRec.brokerNumber) &&
        Objects.equals(this.brokerRef1, indexingTableRec.brokerRef1) &&
        Objects.equals(this.brokerRef2, indexingTableRec.brokerRef2) &&
        Objects.equals(this.brokerPartyDomainId, indexingTableRec.brokerPartyDomainId) &&
        Objects.equals(this.bsd, indexingTableRec.bsd) &&
        Objects.equals(this.bsnd, indexingTableRec.bsnd) &&
        Objects.equals(this.bureau, indexingTableRec.bureau) &&
        Objects.equals(this.workPackageRef, indexingTableRec.workPackageRef) &&
        Objects.equals(this.carriers, indexingTableRec.carriers) &&
        Objects.equals(this.contractClassification, indexingTableRec.contractClassification) &&
        Objects.equals(this.csd, indexingTableRec.csd) &&
        Objects.equals(this.csnd, indexingTableRec.csnd) &&
        Objects.equals(this.obsnd, indexingTableRec.obsnd) &&
        Objects.equals(this.ocsnd, indexingTableRec.ocsnd) &&
        Objects.equals(this.premiumSource, indexingTableRec.premiumSource) &&
        Objects.equals(this.releaseFlag, indexingTableRec.releaseFlag) &&
        Objects.equals(this.releasedForSettlement, indexingTableRec.releasedForSettlement) &&
        Objects.equals(this.settlementDueDate, indexingTableRec.settlementDueDate) &&
        Objects.equals(this.settlementCurrency, indexingTableRec.settlementCurrency) &&
        Objects.equals(this.status, indexingTableRec.status) &&
        Objects.equals(this.replacesId, indexingTableRec.replacesId) &&
        Objects.equals(this.correctionType, indexingTableRec.correctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumid, transactiontype, umr, brokerName, brokerNumber, brokerRef1, brokerRef2, brokerPartyDomainId, bsd, bsnd, bureau, workPackageRef, carriers, contractClassification, csd, csnd, obsnd, ocsnd, premiumSource, releaseFlag, releasedForSettlement, settlementDueDate, settlementCurrency, status, replacesId, correctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexingTableRec {\n");
    sb.append("    premiumid: ").append(toIndentedString(premiumid)).append("\n");
    sb.append("    transactiontype: ").append(toIndentedString(transactiontype)).append("\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
    sb.append("    brokerNumber: ").append(toIndentedString(brokerNumber)).append("\n");
    sb.append("    brokerRef1: ").append(toIndentedString(brokerRef1)).append("\n");
    sb.append("    brokerRef2: ").append(toIndentedString(brokerRef2)).append("\n");
    sb.append("    brokerPartyDomainId: ").append(toIndentedString(brokerPartyDomainId)).append("\n");
    sb.append("    bsd: ").append(toIndentedString(bsd)).append("\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    workPackageRef: ").append(toIndentedString(workPackageRef)).append("\n");
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
    sb.append("    contractClassification: ").append(toIndentedString(contractClassification)).append("\n");
    sb.append("    csd: ").append(toIndentedString(csd)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    ocsnd: ").append(toIndentedString(ocsnd)).append("\n");
    sb.append("    premiumSource: ").append(toIndentedString(premiumSource)).append("\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    releasedForSettlement: ").append(toIndentedString(releasedForSettlement)).append("\n");
    sb.append("    settlementDueDate: ").append(toIndentedString(settlementDueDate)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
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

