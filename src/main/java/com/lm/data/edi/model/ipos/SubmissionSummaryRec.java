package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionSummaryRec
 */

@JsonTypeName("submissionSummaryRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionSummaryRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer version;

  private SubmissionSummaryRecord submission;

  @Valid
  private List<@Valid SectionSummaryRec> sections;

  @Valid
  private List<@Valid PremiumSummaryRec> aprps;

  public SubmissionSummaryRec version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Hold the Optimistic locking value for the application records the version number of that item.
   * @return version
  */
  

  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public SubmissionSummaryRec submission(SubmissionSummaryRecord submission) {
    this.submission = submission;
    return this;
  }

  /**
   * Get submission
   * @return submission
  */
  @Valid 

  @JsonProperty("submission")
  public SubmissionSummaryRecord getSubmission() {
    return submission;
  }

  public void setSubmission(SubmissionSummaryRecord submission) {
    this.submission = submission;
  }

  public SubmissionSummaryRec sections(List<@Valid SectionSummaryRec> sections) {
    this.sections = sections;
    return this;
  }

  public SubmissionSummaryRec addSectionsItem(SectionSummaryRec sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

  /**
   * Get sections
   * @return sections
  */
  @Valid 

  @JsonProperty("sections")
  public List<@Valid SectionSummaryRec> getSections() {
    return sections;
  }

  public void setSections(List<@Valid SectionSummaryRec> sections) {
    this.sections = sections;
  }

  public SubmissionSummaryRec aprps(List<@Valid PremiumSummaryRec> aprps) {
    this.aprps = aprps;
    return this;
  }

  public SubmissionSummaryRec addAprpsItem(PremiumSummaryRec aprpsItem) {
    if (this.aprps == null) {
      this.aprps = new ArrayList<>();
    }
    this.aprps.add(aprpsItem);
    return this;
  }

  /**
   * Get aprps
   * @return aprps
  */
  @Valid 

  @JsonProperty("aprps")
  public List<@Valid PremiumSummaryRec> getAprps() {
    return aprps;
  }

  public void setAprps(List<@Valid PremiumSummaryRec> aprps) {
    this.aprps = aprps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionSummaryRec submissionSummaryRec = (SubmissionSummaryRec) o;
    return Objects.equals(this.version, submissionSummaryRec.version) &&
        Objects.equals(this.submission, submissionSummaryRec.submission) &&
        Objects.equals(this.sections, submissionSummaryRec.sections) &&
        Objects.equals(this.aprps, submissionSummaryRec.aprps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, submission, sections, aprps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSummaryRec {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    aprps: ").append(toIndentedString(aprps)).append("\n");
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

