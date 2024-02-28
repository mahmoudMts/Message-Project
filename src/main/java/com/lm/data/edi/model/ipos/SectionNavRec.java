package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SectionNavRec
 */

@JsonTypeName("sectionNavRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SectionNavRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID sectionId;

  private UUID submissionId;

  private Integer sectionNumber;

  private String sectionTitle;

  private UUID replacesId;

  private Boolean recordValid;

  @Valid
  private List<@Valid PremiumNavRec> premiums;

  public SectionNavRec sectionId(UUID sectionId) {
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

  public SectionNavRec submissionId(UUID submissionId) {
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

  public SectionNavRec sectionNumber(Integer sectionNumber) {
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

  public SectionNavRec sectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
    return this;
  }

  /**
   * Get sectionTitle
   * @return sectionTitle
  */
  

  @JsonProperty("sectionTitle")
  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  public SectionNavRec replacesId(UUID replacesId) {
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

  public SectionNavRec recordValid(Boolean recordValid) {
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

  public SectionNavRec premiums(List<@Valid PremiumNavRec> premiums) {
    this.premiums = premiums;
    return this;
  }

  public SectionNavRec addPremiumsItem(PremiumNavRec premiumsItem) {
    if (this.premiums == null) {
      this.premiums = new ArrayList<>();
    }
    this.premiums.add(premiumsItem);
    return this;
  }

  /**
   * Get premiums
   * @return premiums
  */
  @Valid 

  @JsonProperty("premiums")
  public List<@Valid PremiumNavRec> getPremiums() {
    return premiums;
  }

  public void setPremiums(List<@Valid PremiumNavRec> premiums) {
    this.premiums = premiums;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionNavRec sectionNavRec = (SectionNavRec) o;
    return Objects.equals(this.sectionId, sectionNavRec.sectionId) &&
        Objects.equals(this.submissionId, sectionNavRec.submissionId) &&
        Objects.equals(this.sectionNumber, sectionNavRec.sectionNumber) &&
        Objects.equals(this.sectionTitle, sectionNavRec.sectionTitle) &&
        Objects.equals(this.replacesId, sectionNavRec.replacesId) &&
        Objects.equals(this.recordValid, sectionNavRec.recordValid) &&
        Objects.equals(this.premiums, sectionNavRec.premiums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, submissionId, sectionNumber, sectionTitle, replacesId, recordValid, premiums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionNavRec {\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sectionTitle: ").append(toIndentedString(sectionTitle)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
    sb.append("    premiums: ").append(toIndentedString(premiums)).append("\n");
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

