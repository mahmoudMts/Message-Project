package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * UsSurplusLineDetails
 */

@JsonTypeName("usSurplusLineDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UsSurplusLineDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean usSurplusLineRequired = true;

  private NaicSlReportingStatus usSurplusInfoStatus;

  @Valid
  private List<@Valid UsSurplusLineBroker> usSurplusLineBrokers;

  public UsSurplusLineDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsSurplusLineDetails(Boolean usSurplusLineRequired) {
    this.usSurplusLineRequired = usSurplusLineRequired;
  }

  public UsSurplusLineDetails usSurplusLineRequired(Boolean usSurplusLineRequired) {
    this.usSurplusLineRequired = usSurplusLineRequired;
    return this;
  }

  /**
   * flag to indicate whether US Surpline Line needs to be entered for the premium
   * @return usSurplusLineRequired
  */
  @NotNull 

  @JsonProperty("usSurplusLineRequired")
  public Boolean getUsSurplusLineRequired() {
    return usSurplusLineRequired;
  }

  public void setUsSurplusLineRequired(Boolean usSurplusLineRequired) {
    this.usSurplusLineRequired = usSurplusLineRequired;
  }

  public UsSurplusLineDetails usSurplusInfoStatus(NaicSlReportingStatus usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
    return this;
  }

  /**
   * Get usSurplusInfoStatus
   * @return usSurplusInfoStatus
  */
  @Valid 

  @JsonProperty("usSurplusInfoStatus")
  public NaicSlReportingStatus getUsSurplusInfoStatus() {
    return usSurplusInfoStatus;
  }

  public void setUsSurplusInfoStatus(NaicSlReportingStatus usSurplusInfoStatus) {
    this.usSurplusInfoStatus = usSurplusInfoStatus;
  }

  public UsSurplusLineDetails usSurplusLineBrokers(List<@Valid UsSurplusLineBroker> usSurplusLineBrokers) {
    this.usSurplusLineBrokers = usSurplusLineBrokers;
    return this;
  }

  public UsSurplusLineDetails addUsSurplusLineBrokersItem(UsSurplusLineBroker usSurplusLineBrokersItem) {
    if (this.usSurplusLineBrokers == null) {
      this.usSurplusLineBrokers = new ArrayList<>();
    }
    this.usSurplusLineBrokers.add(usSurplusLineBrokersItem);
    return this;
  }

  /**
   * Get usSurplusLineBrokers
   * @return usSurplusLineBrokers
  */
  @Valid 

  @JsonProperty("usSurplusLineBrokers")
  public List<@Valid UsSurplusLineBroker> getUsSurplusLineBrokers() {
    return usSurplusLineBrokers;
  }

  public void setUsSurplusLineBrokers(List<@Valid UsSurplusLineBroker> usSurplusLineBrokers) {
    this.usSurplusLineBrokers = usSurplusLineBrokers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsSurplusLineDetails usSurplusLineDetails = (UsSurplusLineDetails) o;
    return Objects.equals(this.usSurplusLineRequired, usSurplusLineDetails.usSurplusLineRequired) &&
        Objects.equals(this.usSurplusInfoStatus, usSurplusLineDetails.usSurplusInfoStatus) &&
        Objects.equals(this.usSurplusLineBrokers, usSurplusLineDetails.usSurplusLineBrokers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usSurplusLineRequired, usSurplusInfoStatus, usSurplusLineBrokers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsSurplusLineDetails {\n");
    sb.append("    usSurplusLineRequired: ").append(toIndentedString(usSurplusLineRequired)).append("\n");
    sb.append("    usSurplusInfoStatus: ").append(toIndentedString(usSurplusInfoStatus)).append("\n");
    sb.append("    usSurplusLineBrokers: ").append(toIndentedString(usSurplusLineBrokers)).append("\n");
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

