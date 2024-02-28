package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * CheckSubmissionResponseInner
 */

@JsonTypeName("checkSubmissionResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class CheckSubmissionResponseInner implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID submissionId;

  private Boolean autoRIreqd;

  public CheckSubmissionResponseInner submissionId(UUID submissionId) {
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

  public CheckSubmissionResponseInner autoRIreqd(Boolean autoRIreqd) {
    this.autoRIreqd = autoRIreqd;
    return this;
  }

  /**
   * Get autoRIreqd
   * @return autoRIreqd
  */
  

  @JsonProperty("autoRIreqd")
  public Boolean getAutoRIreqd() {
    return autoRIreqd;
  }

  public void setAutoRIreqd(Boolean autoRIreqd) {
    this.autoRIreqd = autoRIreqd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckSubmissionResponseInner checkSubmissionResponseInner = (CheckSubmissionResponseInner) o;
    return Objects.equals(this.submissionId, checkSubmissionResponseInner.submissionId) &&
        Objects.equals(this.autoRIreqd, checkSubmissionResponseInner.autoRIreqd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, autoRIreqd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSubmissionResponseInner {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    autoRIreqd: ").append(toIndentedString(autoRIreqd)).append("\n");
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

