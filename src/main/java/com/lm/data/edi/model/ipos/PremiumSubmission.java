package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumSubmission
 */

@JsonTypeName("premiumSubmission")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumSubmission implements Serializable {

  private static final long serialVersionUID = 1L;

  private SubmissionRecord submission;

  private SectionDetail sectionDetail;

  private PremiumDetail premiumDetail;

  private MarketRecord marketDetail;

  private SigningGetRecord signingRecord;

  public PremiumSubmission submission(SubmissionRecord submission) {
    this.submission = submission;
    return this;
  }

  /**
   * Get submission
   * @return submission
  */
  @Valid 

  @JsonProperty("submission")
  public SubmissionRecord getSubmission() {
    return submission;
  }

  public void setSubmission(SubmissionRecord submission) {
    this.submission = submission;
  }

  public PremiumSubmission sectionDetail(SectionDetail sectionDetail) {
    this.sectionDetail = sectionDetail;
    return this;
  }

  /**
   * Get sectionDetail
   * @return sectionDetail
  */
  @Valid 

  @JsonProperty("sectionDetail")
  public SectionDetail getSectionDetail() {
    return sectionDetail;
  }

  public void setSectionDetail(SectionDetail sectionDetail) {
    this.sectionDetail = sectionDetail;
  }

  public PremiumSubmission premiumDetail(PremiumDetail premiumDetail) {
    this.premiumDetail = premiumDetail;
    return this;
  }

  /**
   * Get premiumDetail
   * @return premiumDetail
  */
  @Valid 

  @JsonProperty("premiumDetail")
  public PremiumDetail getPremiumDetail() {
    return premiumDetail;
  }

  public void setPremiumDetail(PremiumDetail premiumDetail) {
    this.premiumDetail = premiumDetail;
  }

  public PremiumSubmission marketDetail(MarketRecord marketDetail) {
    this.marketDetail = marketDetail;
    return this;
  }

  /**
   * Get marketDetail
   * @return marketDetail
  */
  @Valid 

  @JsonProperty("marketDetail")
  public MarketRecord getMarketDetail() {
    return marketDetail;
  }

  public void setMarketDetail(MarketRecord marketDetail) {
    this.marketDetail = marketDetail;
  }

  public PremiumSubmission signingRecord(SigningGetRecord signingRecord) {
    this.signingRecord = signingRecord;
    return this;
  }

  /**
   * Get signingRecord
   * @return signingRecord
  */
  @Valid 

  @JsonProperty("signingRecord")
  public SigningGetRecord getSigningRecord() {
    return signingRecord;
  }

  public void setSigningRecord(SigningGetRecord signingRecord) {
    this.signingRecord = signingRecord;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumSubmission premiumSubmission = (PremiumSubmission) o;
    return Objects.equals(this.submission, premiumSubmission.submission) &&
        Objects.equals(this.sectionDetail, premiumSubmission.sectionDetail) &&
        Objects.equals(this.premiumDetail, premiumSubmission.premiumDetail) &&
        Objects.equals(this.marketDetail, premiumSubmission.marketDetail) &&
        Objects.equals(this.signingRecord, premiumSubmission.signingRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submission, sectionDetail, premiumDetail, marketDetail, signingRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumSubmission {\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    sectionDetail: ").append(toIndentedString(sectionDetail)).append("\n");
    sb.append("    premiumDetail: ").append(toIndentedString(premiumDetail)).append("\n");
    sb.append("    marketDetail: ").append(toIndentedString(marketDetail)).append("\n");
    sb.append("    signingRecord: ").append(toIndentedString(signingRecord)).append("\n");
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

