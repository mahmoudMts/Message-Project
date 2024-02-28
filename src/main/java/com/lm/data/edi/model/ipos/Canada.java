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
 * Canada
 */

@JsonTypeName("canada")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Canada implements Serializable {

  private static final long serialVersionUID = 1L;

  private String brokerDirectName;

  @Valid
  private List<@Valid ProvinceDetail> provinceDetails;

  public Canada brokerDirectName(String brokerDirectName) {
    this.brokerDirectName = brokerDirectName;
    return this;
  }

  /**
   * Get brokerDirectName
   * @return brokerDirectName
  */
  

  @JsonProperty("brokerDirectName")
  public String getBrokerDirectName() {
    return brokerDirectName;
  }

  public void setBrokerDirectName(String brokerDirectName) {
    this.brokerDirectName = brokerDirectName;
  }

  public Canada provinceDetails(List<@Valid ProvinceDetail> provinceDetails) {
    this.provinceDetails = provinceDetails;
    return this;
  }

  public Canada addProvinceDetailsItem(ProvinceDetail provinceDetailsItem) {
    if (this.provinceDetails == null) {
      this.provinceDetails = new ArrayList<>();
    }
    this.provinceDetails.add(provinceDetailsItem);
    return this;
  }

  /**
   * Get provinceDetails
   * @return provinceDetails
  */
  @Valid 

  @JsonProperty("provinceDetails")
  public List<@Valid ProvinceDetail> getProvinceDetails() {
    return provinceDetails;
  }

  public void setProvinceDetails(List<@Valid ProvinceDetail> provinceDetails) {
    this.provinceDetails = provinceDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Canada canada = (Canada) o;
    return Objects.equals(this.brokerDirectName, canada.brokerDirectName) &&
        Objects.equals(this.provinceDetails, canada.provinceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerDirectName, provinceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Canada {\n");
    sb.append("    brokerDirectName: ").append(toIndentedString(brokerDirectName)).append("\n");
    sb.append("    provinceDetails: ").append(toIndentedString(provinceDetails)).append("\n");
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

