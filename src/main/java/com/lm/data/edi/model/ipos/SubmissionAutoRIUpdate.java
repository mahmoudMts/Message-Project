package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionAutoRIUpdate
 */

@JsonTypeName("submissionAutoRIUpdate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionAutoRIUpdate implements Serializable {

  private static final long serialVersionUID = 1L;

  private AutoRIStatuses status;

  public SubmissionAutoRIUpdate status(AutoRIStatuses status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 

  @JsonProperty("status")
  public AutoRIStatuses getStatus() {
    return status;
  }

  public void setStatus(AutoRIStatuses status) {
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
    SubmissionAutoRIUpdate submissionAutoRIUpdate = (SubmissionAutoRIUpdate) o;
    return Objects.equals(this.status, submissionAutoRIUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionAutoRIUpdate {\n");
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

