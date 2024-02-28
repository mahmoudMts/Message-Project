package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SectionSummaryRec
 */

@JsonTypeName("sectionSummaryRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SectionSummaryRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID sectionId;

  private UUID submissionId;

  private Integer sectionNumber;

  private String sectionTitle;

  private String riskCode;

  @Valid
  private List<@Valid PremiumSummaryRec> ops;

  public SectionSummaryRec() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SectionSummaryRec(Integer sectionNumber, String sectionTitle, String riskCode) {
    this.sectionNumber = sectionNumber;
    this.sectionTitle = sectionTitle;
    this.riskCode = riskCode;
  }

  public SectionSummaryRec sectionId(UUID sectionId) {
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

  public SectionSummaryRec submissionId(UUID submissionId) {
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

  public SectionSummaryRec sectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

  /**
   * Get sectionNumber
   * @return sectionNumber
  */
  @NotNull 

  @JsonProperty("sectionNumber")
  public Integer getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public SectionSummaryRec sectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
    return this;
  }

  /**
   * Get sectionTitle
   * @return sectionTitle
  */
  @NotNull 

  @JsonProperty("sectionTitle")
  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  public SectionSummaryRec riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * Get riskCode
   * @return riskCode
  */
  @NotNull 

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  public SectionSummaryRec ops(List<@Valid PremiumSummaryRec> ops) {
    this.ops = ops;
    return this;
  }

  public SectionSummaryRec addOpsItem(PremiumSummaryRec opsItem) {
    if (this.ops == null) {
      this.ops = new ArrayList<>();
    }
    this.ops.add(opsItem);
    return this;
  }

  /**
   * Get ops
   * @return ops
  */
  @Valid 

  @JsonProperty("ops")
  public List<@Valid PremiumSummaryRec> getOps() {
    return ops;
  }

  public void setOps(List<@Valid PremiumSummaryRec> ops) {
    this.ops = ops;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionSummaryRec sectionSummaryRec = (SectionSummaryRec) o;
    return Objects.equals(this.sectionId, sectionSummaryRec.sectionId) &&
        Objects.equals(this.submissionId, sectionSummaryRec.submissionId) &&
        Objects.equals(this.sectionNumber, sectionSummaryRec.sectionNumber) &&
        Objects.equals(this.sectionTitle, sectionSummaryRec.sectionTitle) &&
        Objects.equals(this.riskCode, sectionSummaryRec.riskCode) &&
        Objects.equals(this.ops, sectionSummaryRec.ops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, submissionId, sectionNumber, sectionTitle, riskCode, ops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionSummaryRec {\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sectionTitle: ").append(toIndentedString(sectionTitle)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
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

