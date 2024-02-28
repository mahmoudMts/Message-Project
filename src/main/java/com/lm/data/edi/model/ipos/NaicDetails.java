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
 * NaicDetails
 */

@JsonTypeName("naicDetails")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class NaicDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean naicRequired = true;

  private NaicSlReportingStatus naicInfoStatus;

  @Valid
  private List<@Valid NaicCarrier> naicCarriers;

  public NaicDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NaicDetails(Boolean naicRequired, NaicSlReportingStatus naicInfoStatus) {
    this.naicRequired = naicRequired;
    this.naicInfoStatus = naicInfoStatus;
  }

  public NaicDetails naicRequired(Boolean naicRequired) {
    this.naicRequired = naicRequired;
    return this;
  }

  /**
   * flag to indicate whether US Surpline Line needs to be entered for the premium
   * @return naicRequired
  */
  @NotNull 

  @JsonProperty("naicRequired")
  public Boolean getNaicRequired() {
    return naicRequired;
  }

  public void setNaicRequired(Boolean naicRequired) {
    this.naicRequired = naicRequired;
  }

  public NaicDetails naicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
    return this;
  }

  /**
   * Get naicInfoStatus
   * @return naicInfoStatus
  */
  @NotNull @Valid 

  @JsonProperty("naicInfoStatus")
  public NaicSlReportingStatus getNaicInfoStatus() {
    return naicInfoStatus;
  }

  public void setNaicInfoStatus(NaicSlReportingStatus naicInfoStatus) {
    this.naicInfoStatus = naicInfoStatus;
  }

  public NaicDetails naicCarriers(List<@Valid NaicCarrier> naicCarriers) {
    this.naicCarriers = naicCarriers;
    return this;
  }

  public NaicDetails addNaicCarriersItem(NaicCarrier naicCarriersItem) {
    if (this.naicCarriers == null) {
      this.naicCarriers = new ArrayList<>();
    }
    this.naicCarriers.add(naicCarriersItem);
    return this;
  }

  /**
   * Get naicCarriers
   * @return naicCarriers
  */
  @Valid 

  @JsonProperty("naicCarriers")
  public List<@Valid NaicCarrier> getNaicCarriers() {
    return naicCarriers;
  }

  public void setNaicCarriers(List<@Valid NaicCarrier> naicCarriers) {
    this.naicCarriers = naicCarriers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaicDetails naicDetails = (NaicDetails) o;
    return Objects.equals(this.naicRequired, naicDetails.naicRequired) &&
        Objects.equals(this.naicInfoStatus, naicDetails.naicInfoStatus) &&
        Objects.equals(this.naicCarriers, naicDetails.naicCarriers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naicRequired, naicInfoStatus, naicCarriers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaicDetails {\n");
    sb.append("    naicRequired: ").append(toIndentedString(naicRequired)).append("\n");
    sb.append("    naicInfoStatus: ").append(toIndentedString(naicInfoStatus)).append("\n");
    sb.append("    naicCarriers: ").append(toIndentedString(naicCarriers)).append("\n");
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

