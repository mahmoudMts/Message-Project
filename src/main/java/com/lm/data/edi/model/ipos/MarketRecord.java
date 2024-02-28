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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * MarketRecord
 */

@JsonTypeName("marketRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class MarketRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID marketId;

  private UUID submissionId;

  private UUID sectionId;

  private Boolean partialMarketFlag = false;

  private String marketTitle;

  private BigDecimal bureauLinePercent;

  private Integer yearOfAccount;

  private String sectionLead;

  private String facilityNumberAndDate;

  
  private LocalDate policyPeriodFrom;

  @Valid
  private List<@Valid MarketSyndicate> syndicates;

  
  private OffsetDateTime createdDate;

  
  private OffsetDateTime lastUpdatedDate;

  private Boolean recordValid;

  public MarketRecord() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MarketRecord(BigDecimal bureauLinePercent) {
    this.bureauLinePercent = bureauLinePercent;
  }

  public MarketRecord marketId(UUID marketId) {
    this.marketId = marketId;
    return this;
  }

  /**
   * Get marketId
   * @return marketId
  */
  @Valid 

  @JsonProperty("marketId")
  public UUID getMarketId() {
    return marketId;
  }

  public void setMarketId(UUID marketId) {
    this.marketId = marketId;
  }

  public MarketRecord submissionId(UUID submissionId) {
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

  public MarketRecord sectionId(UUID sectionId) {
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

  public MarketRecord partialMarketFlag(Boolean partialMarketFlag) {
    this.partialMarketFlag = partialMarketFlag;
    return this;
  }

  /**
   * Indicates whether this is a partial market record belonging to an Endorsement premium
   * @return partialMarketFlag
  */
  

  @JsonProperty("partialMarketFlag")
  public Boolean getPartialMarketFlag() {
    return partialMarketFlag;
  }

  public void setPartialMarketFlag(Boolean partialMarketFlag) {
    this.partialMarketFlag = partialMarketFlag;
  }

  public MarketRecord marketTitle(String marketTitle) {
    this.marketTitle = marketTitle;
    return this;
  }

  /**
   * Get marketTitle
   * @return marketTitle
  */
  

  @JsonProperty("marketTitle")
  public String getMarketTitle() {
    return marketTitle;
  }

  public void setMarketTitle(String marketTitle) {
    this.marketTitle = marketTitle;
  }

  public MarketRecord bureauLinePercent(BigDecimal bureauLinePercent) {
    this.bureauLinePercent = bureauLinePercent;
    return this;
  }

  /**
   * Get bureauLinePercent
   * @return bureauLinePercent
  */
  @NotNull @Valid 

  @JsonProperty("bureauLinePercent")
  public BigDecimal getBureauLinePercent() {
    return bureauLinePercent;
  }

  public void setBureauLinePercent(BigDecimal bureauLinePercent) {
    this.bureauLinePercent = bureauLinePercent;
  }

  public MarketRecord yearOfAccount(Integer yearOfAccount) {
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

  public MarketRecord sectionLead(String sectionLead) {
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

  public MarketRecord facilityNumberAndDate(String facilityNumberAndDate) {
    this.facilityNumberAndDate = facilityNumberAndDate;
    return this;
  }

  /**
   * Get facilityNumberAndDate
   * @return facilityNumberAndDate
  */
  

  @JsonProperty("facilityNumberAndDate")
  public String getFacilityNumberAndDate() {
    return facilityNumberAndDate;
  }

  public void setFacilityNumberAndDate(String facilityNumberAndDate) {
    this.facilityNumberAndDate = facilityNumberAndDate;
  }

  public MarketRecord policyPeriodFrom(LocalDate policyPeriodFrom) {
    this.policyPeriodFrom = policyPeriodFrom;
    return this;
  }

  /**
   * returned from the section record, only needed in the GET
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

  public MarketRecord syndicates(List<@Valid MarketSyndicate> syndicates) {
    this.syndicates = syndicates;
    return this;
  }

  public MarketRecord addSyndicatesItem(MarketSyndicate syndicatesItem) {
    if (this.syndicates == null) {
      this.syndicates = new ArrayList<>();
    }
    this.syndicates.add(syndicatesItem);
    return this;
  }

  /**
   * Get syndicates
   * @return syndicates
  */
  @Valid 

  @JsonProperty("syndicates")
  public List<@Valid MarketSyndicate> getSyndicates() {
    return syndicates;
  }

  public void setSyndicates(List<@Valid MarketSyndicate> syndicates) {
    this.syndicates = syndicates;
  }

  public MarketRecord createdDate(OffsetDateTime createdDate) {
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

  public MarketRecord lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
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

  public MarketRecord recordValid(Boolean recordValid) {
    this.recordValid = recordValid;
    return this;
  }

  /**
   * Get recordValid
   * @return recordValid
  */
  

  @JsonProperty("recordValid")
  public Boolean getRecordValid() {
    return recordValid;
  }

  public void setRecordValid(Boolean recordValid) {
    this.recordValid = recordValid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketRecord marketRecord = (MarketRecord) o;
    return Objects.equals(this.marketId, marketRecord.marketId) &&
        Objects.equals(this.submissionId, marketRecord.submissionId) &&
        Objects.equals(this.sectionId, marketRecord.sectionId) &&
        Objects.equals(this.partialMarketFlag, marketRecord.partialMarketFlag) &&
        Objects.equals(this.marketTitle, marketRecord.marketTitle) &&
        Objects.equals(this.bureauLinePercent, marketRecord.bureauLinePercent) &&
        Objects.equals(this.yearOfAccount, marketRecord.yearOfAccount) &&
        Objects.equals(this.sectionLead, marketRecord.sectionLead) &&
        Objects.equals(this.facilityNumberAndDate, marketRecord.facilityNumberAndDate) &&
        Objects.equals(this.policyPeriodFrom, marketRecord.policyPeriodFrom) &&
        Objects.equals(this.syndicates, marketRecord.syndicates) &&
        Objects.equals(this.createdDate, marketRecord.createdDate) &&
        Objects.equals(this.lastUpdatedDate, marketRecord.lastUpdatedDate) &&
        Objects.equals(this.recordValid, marketRecord.recordValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, submissionId, sectionId, partialMarketFlag, marketTitle, bureauLinePercent, yearOfAccount, sectionLead, facilityNumberAndDate, policyPeriodFrom, syndicates, createdDate, lastUpdatedDate, recordValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketRecord {\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    partialMarketFlag: ").append(toIndentedString(partialMarketFlag)).append("\n");
    sb.append("    marketTitle: ").append(toIndentedString(marketTitle)).append("\n");
    sb.append("    bureauLinePercent: ").append(toIndentedString(bureauLinePercent)).append("\n");
    sb.append("    yearOfAccount: ").append(toIndentedString(yearOfAccount)).append("\n");
    sb.append("    sectionLead: ").append(toIndentedString(sectionLead)).append("\n");
    sb.append("    facilityNumberAndDate: ").append(toIndentedString(facilityNumberAndDate)).append("\n");
    sb.append("    policyPeriodFrom: ").append(toIndentedString(policyPeriodFrom)).append("\n");
    sb.append("    syndicates: ").append(toIndentedString(syndicates)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
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

