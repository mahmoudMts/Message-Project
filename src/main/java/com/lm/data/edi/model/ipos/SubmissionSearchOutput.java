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
 * SubmissionSearchOutput
 */

@JsonTypeName("submissionSearchOutput")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionSearchOutput implements Serializable {

  private static final long serialVersionUID = 1L;

  private PortalWorkflowStatus portalWorkflowStatus = PortalWorkflowStatus.IN_PROGRESS;

  @Valid
  private List<@Valid SubmissionSearchRec> submissionSearchRecs;

  public SubmissionSearchOutput portalWorkflowStatus(PortalWorkflowStatus portalWorkflowStatus) {
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

  public SubmissionSearchOutput submissionSearchRecs(List<@Valid SubmissionSearchRec> submissionSearchRecs) {
    this.submissionSearchRecs = submissionSearchRecs;
    return this;
  }

  public SubmissionSearchOutput addSubmissionSearchRecsItem(SubmissionSearchRec submissionSearchRecsItem) {
    if (this.submissionSearchRecs == null) {
      this.submissionSearchRecs = new ArrayList<>();
    }
    this.submissionSearchRecs.add(submissionSearchRecsItem);
    return this;
  }

  /**
   * Get submissionSearchRecs
   * @return submissionSearchRecs
  */
  @Valid 

  @JsonProperty("submissionSearchRecs")
  public List<@Valid SubmissionSearchRec> getSubmissionSearchRecs() {
    return submissionSearchRecs;
  }

  public void setSubmissionSearchRecs(List<@Valid SubmissionSearchRec> submissionSearchRecs) {
    this.submissionSearchRecs = submissionSearchRecs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionSearchOutput submissionSearchOutput = (SubmissionSearchOutput) o;
    return Objects.equals(this.portalWorkflowStatus, submissionSearchOutput.portalWorkflowStatus) &&
        Objects.equals(this.submissionSearchRecs, submissionSearchOutput.submissionSearchRecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portalWorkflowStatus, submissionSearchRecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSearchOutput {\n");
    sb.append("    portalWorkflowStatus: ").append(toIndentedString(portalWorkflowStatus)).append("\n");
    sb.append("    submissionSearchRecs: ").append(toIndentedString(submissionSearchRecs)).append("\n");
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

