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
 * SigningGetRecord
 */

@JsonTypeName("signingGetRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SigningGetRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID signingId;

  private UUID submissionId;

  private QueryIndicatorEnum queryInd;

  
  private LocalDate presentationDate;

  private Boolean chargeableIndicator;

  private String correctionNarrative;

  
  private OffsetDateTime createdDate;

  
  private OffsetDateTime lastUpdatedDate;

  @Valid
  private List<@Valid SigningPremiumGet> signingPremiums;

  public SigningGetRecord signingId(UUID signingId) {
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

  public SigningGetRecord submissionId(UUID submissionId) {
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

  public SigningGetRecord queryInd(QueryIndicatorEnum queryInd) {
    this.queryInd = queryInd;
    return this;
  }

  /**
   * Get queryInd
   * @return queryInd
  */
  @Valid 

  @JsonProperty("queryInd")
  public QueryIndicatorEnum getQueryInd() {
    return queryInd;
  }

  public void setQueryInd(QueryIndicatorEnum queryInd) {
    this.queryInd = queryInd;
  }

  public SigningGetRecord presentationDate(LocalDate presentationDate) {
    this.presentationDate = presentationDate;
    return this;
  }

  /**
   * Get presentationDate
   * @return presentationDate
  */
  @Valid 

  @JsonProperty("presentationDate")
  public LocalDate getPresentationDate() {
    return presentationDate;
  }

  public void setPresentationDate(LocalDate presentationDate) {
    this.presentationDate = presentationDate;
  }

  public SigningGetRecord chargeableIndicator(Boolean chargeableIndicator) {
    this.chargeableIndicator = chargeableIndicator;
    return this;
  }

  /**
   * Get chargeableIndicator
   * @return chargeableIndicator
  */
  

  @JsonProperty("chargeableIndicator")
  public Boolean getChargeableIndicator() {
    return chargeableIndicator;
  }

  public void setChargeableIndicator(Boolean chargeableIndicator) {
    this.chargeableIndicator = chargeableIndicator;
  }

  public SigningGetRecord correctionNarrative(String correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
    return this;
  }

  /**
   * Get correctionNarrative
   * @return correctionNarrative
  */
  

  @JsonProperty("correctionNarrative")
  public String getCorrectionNarrative() {
    return correctionNarrative;
  }

  public void setCorrectionNarrative(String correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
  }

  public SigningGetRecord createdDate(OffsetDateTime createdDate) {
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

  public SigningGetRecord lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
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

  public SigningGetRecord signingPremiums(List<@Valid SigningPremiumGet> signingPremiums) {
    this.signingPremiums = signingPremiums;
    return this;
  }

  public SigningGetRecord addSigningPremiumsItem(SigningPremiumGet signingPremiumsItem) {
    if (this.signingPremiums == null) {
      this.signingPremiums = new ArrayList<>();
    }
    this.signingPremiums.add(signingPremiumsItem);
    return this;
  }

  /**
   * Get signingPremiums
   * @return signingPremiums
  */
  @Valid 

  @JsonProperty("signingPremiums")
  public List<@Valid SigningPremiumGet> getSigningPremiums() {
    return signingPremiums;
  }

  public void setSigningPremiums(List<@Valid SigningPremiumGet> signingPremiums) {
    this.signingPremiums = signingPremiums;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningGetRecord signingGetRecord = (SigningGetRecord) o;
    return Objects.equals(this.signingId, signingGetRecord.signingId) &&
        Objects.equals(this.submissionId, signingGetRecord.submissionId) &&
        Objects.equals(this.queryInd, signingGetRecord.queryInd) &&
        Objects.equals(this.presentationDate, signingGetRecord.presentationDate) &&
        Objects.equals(this.chargeableIndicator, signingGetRecord.chargeableIndicator) &&
        Objects.equals(this.correctionNarrative, signingGetRecord.correctionNarrative) &&
        Objects.equals(this.createdDate, signingGetRecord.createdDate) &&
        Objects.equals(this.lastUpdatedDate, signingGetRecord.lastUpdatedDate) &&
        Objects.equals(this.signingPremiums, signingGetRecord.signingPremiums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingId, submissionId, queryInd, presentationDate, chargeableIndicator, correctionNarrative, createdDate, lastUpdatedDate, signingPremiums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningGetRecord {\n");
    sb.append("    signingId: ").append(toIndentedString(signingId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    queryInd: ").append(toIndentedString(queryInd)).append("\n");
    sb.append("    presentationDate: ").append(toIndentedString(presentationDate)).append("\n");
    sb.append("    chargeableIndicator: ").append(toIndentedString(chargeableIndicator)).append("\n");
    sb.append("    correctionNarrative: ").append(toIndentedString(correctionNarrative)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    signingPremiums: ").append(toIndentedString(signingPremiums)).append("\n");
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

