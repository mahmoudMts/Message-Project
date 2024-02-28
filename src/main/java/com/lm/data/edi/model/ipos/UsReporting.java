package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * UsReporting
 */

@JsonTypeName("usReporting")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UsReporting implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfCountrySubDivision stateProvince;

  private TypeOfUSBusCat usBusinessCategory;

  private UsClassificationEnum usClassification;

  private TypeOfExempCategory exemptCategory;

  private String usInsuredAddress;

  private LocalBroker localBroker1;

  private LocalBroker localBroker2;

  public UsReporting stateProvince(TypeOfCountrySubDivision stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * Get stateProvince
   * @return stateProvince
  */
  @Valid 

  @JsonProperty("stateProvince")
  public TypeOfCountrySubDivision getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(TypeOfCountrySubDivision stateProvince) {
    this.stateProvince = stateProvince;
  }

  public UsReporting usBusinessCategory(TypeOfUSBusCat usBusinessCategory) {
    this.usBusinessCategory = usBusinessCategory;
    return this;
  }

  /**
   * Get usBusinessCategory
   * @return usBusinessCategory
  */
  @Valid 

  @JsonProperty("usBusinessCategory")
  public TypeOfUSBusCat getUsBusinessCategory() {
    return usBusinessCategory;
  }

  public void setUsBusinessCategory(TypeOfUSBusCat usBusinessCategory) {
    this.usBusinessCategory = usBusinessCategory;
  }

  public UsReporting usClassification(UsClassificationEnum usClassification) {
    this.usClassification = usClassification;
    return this;
  }

  /**
   * Get usClassification
   * @return usClassification
  */
  @Valid 

  @JsonProperty("usClassification")
  public UsClassificationEnum getUsClassification() {
    return usClassification;
  }

  public void setUsClassification(UsClassificationEnum usClassification) {
    this.usClassification = usClassification;
  }

  public UsReporting exemptCategory(TypeOfExempCategory exemptCategory) {
    this.exemptCategory = exemptCategory;
    return this;
  }

  /**
   * Get exemptCategory
   * @return exemptCategory
  */
  @Valid 

  @JsonProperty("exemptCategory")
  public TypeOfExempCategory getExemptCategory() {
    return exemptCategory;
  }

  public void setExemptCategory(TypeOfExempCategory exemptCategory) {
    this.exemptCategory = exemptCategory;
  }

  public UsReporting usInsuredAddress(String usInsuredAddress) {
    this.usInsuredAddress = usInsuredAddress;
    return this;
  }

  /**
   * Get usInsuredAddress
   * @return usInsuredAddress
  */
  

  @JsonProperty("usInsuredAddress")
  public String getUsInsuredAddress() {
    return usInsuredAddress;
  }

  public void setUsInsuredAddress(String usInsuredAddress) {
    this.usInsuredAddress = usInsuredAddress;
  }

  public UsReporting localBroker1(LocalBroker localBroker1) {
    this.localBroker1 = localBroker1;
    return this;
  }

  /**
   * Get localBroker1
   * @return localBroker1
  */
  @Valid 

  @JsonProperty("localBroker1")
  public LocalBroker getLocalBroker1() {
    return localBroker1;
  }

  public void setLocalBroker1(LocalBroker localBroker1) {
    this.localBroker1 = localBroker1;
  }

  public UsReporting localBroker2(LocalBroker localBroker2) {
    this.localBroker2 = localBroker2;
    return this;
  }

  /**
   * Get localBroker2
   * @return localBroker2
  */
  @Valid 

  @JsonProperty("localBroker2")
  public LocalBroker getLocalBroker2() {
    return localBroker2;
  }

  public void setLocalBroker2(LocalBroker localBroker2) {
    this.localBroker2 = localBroker2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsReporting usReporting = (UsReporting) o;
    return Objects.equals(this.stateProvince, usReporting.stateProvince) &&
        Objects.equals(this.usBusinessCategory, usReporting.usBusinessCategory) &&
        Objects.equals(this.usClassification, usReporting.usClassification) &&
        Objects.equals(this.exemptCategory, usReporting.exemptCategory) &&
        Objects.equals(this.usInsuredAddress, usReporting.usInsuredAddress) &&
        Objects.equals(this.localBroker1, usReporting.localBroker1) &&
        Objects.equals(this.localBroker2, usReporting.localBroker2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateProvince, usBusinessCategory, usClassification, exemptCategory, usInsuredAddress, localBroker1, localBroker2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsReporting {\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    usBusinessCategory: ").append(toIndentedString(usBusinessCategory)).append("\n");
    sb.append("    usClassification: ").append(toIndentedString(usClassification)).append("\n");
    sb.append("    exemptCategory: ").append(toIndentedString(exemptCategory)).append("\n");
    sb.append("    usInsuredAddress: ").append(toIndentedString(usInsuredAddress)).append("\n");
    sb.append("    localBroker1: ").append(toIndentedString(localBroker1)).append("\n");
    sb.append("    localBroker2: ").append(toIndentedString(localBroker2)).append("\n");
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

