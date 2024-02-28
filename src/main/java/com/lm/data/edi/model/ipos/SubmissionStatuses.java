package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets submissionStatuses
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum SubmissionStatuses {
  
  DRAFT("Draft"),
  
  IN_PROGRESS("In Progress"),
  
  SIGNED("Signed"),
  
  STREAM_FAILED("Stream Failed"),
  
  CANCELLED("Cancelled"),
  
  REJECTED("Rejected"),
  
  CORRECTED("Corrected"),
  
  PORTAL_COMPLETE("Portal Complete"),
  
  WORKPACKAGE_COMPLETE("Workpackage Complete");

  private String value;

  SubmissionStatuses(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubmissionStatuses fromValue(String value) {
    for (SubmissionStatuses b : SubmissionStatuses.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

