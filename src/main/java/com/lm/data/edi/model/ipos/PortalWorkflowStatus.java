package com.lm.data.edi.model.ipos;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets portalWorkflowStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public enum PortalWorkflowStatus {
  
  IN_PROGRESS("In Progress"),
  
  PORTAL_COMPLETE("Portal Complete"),
  
  AUDIT_REJECTED("Audit Rejected"),
  
  WORKPACKAGE_COMPLETE("Workpackage Complete");

  private String value;

  PortalWorkflowStatus(String value) {
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
  public static PortalWorkflowStatus fromValue(String value) {
    for (PortalWorkflowStatus b : PortalWorkflowStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

