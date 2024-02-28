package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionIdsAndStatus
 */

@JsonTypeName("submissionIdsAndStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionIdsAndStatus implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID submissionId;

  private SubmissionStatuses status;

  public SubmissionIdsAndStatus submissionId(UUID submissionId) {
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

  public SubmissionIdsAndStatus status(SubmissionStatuses status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 

  @JsonProperty("status")
  public SubmissionStatuses getStatus() {
    return status;
  }

  public void setStatus(SubmissionStatuses status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionIdsAndStatus submissionIdsAndStatus = (SubmissionIdsAndStatus) o;
    return Objects.equals(this.submissionId, submissionIdsAndStatus.submissionId) &&
        Objects.equals(this.status, submissionIdsAndStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionIdsAndStatus {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

