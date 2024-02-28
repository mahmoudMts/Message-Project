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
 * French
 */

@JsonTypeName("french")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class French implements Serializable {

  private static final long serialVersionUID = 1L;

  private String brokerDirectName;

  private String address;

  private String dirAssuredCountry;

  private String brokerReferenceCode;

  private Boolean boundInFranceFlag;

  private Boolean frenchNationalFlag;

  @Valid
  private List<@Valid FrenchRiskCategory> riskCategories;

  public French brokerDirectName(String brokerDirectName) {
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

  public French address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  

  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public French dirAssuredCountry(String dirAssuredCountry) {
    this.dirAssuredCountry = dirAssuredCountry;
    return this;
  }

  /**
   * Get dirAssuredCountry
   * @return dirAssuredCountry
  */
  

  @JsonProperty("dirAssuredCountry")
  public String getDirAssuredCountry() {
    return dirAssuredCountry;
  }

  public void setDirAssuredCountry(String dirAssuredCountry) {
    this.dirAssuredCountry = dirAssuredCountry;
  }

  public French brokerReferenceCode(String brokerReferenceCode) {
    this.brokerReferenceCode = brokerReferenceCode;
    return this;
  }

  /**
   * Get brokerReferenceCode
   * @return brokerReferenceCode
  */
  

  @JsonProperty("brokerReferenceCode")
  public String getBrokerReferenceCode() {
    return brokerReferenceCode;
  }

  public void setBrokerReferenceCode(String brokerReferenceCode) {
    this.brokerReferenceCode = brokerReferenceCode;
  }

  public French boundInFranceFlag(Boolean boundInFranceFlag) {
    this.boundInFranceFlag = boundInFranceFlag;
    return this;
  }

  /**
   * Get boundInFranceFlag
   * @return boundInFranceFlag
  */
  

  @JsonProperty("boundInFranceFlag")
  public Boolean getBoundInFranceFlag() {
    return boundInFranceFlag;
  }

  public void setBoundInFranceFlag(Boolean boundInFranceFlag) {
    this.boundInFranceFlag = boundInFranceFlag;
  }

  public French frenchNationalFlag(Boolean frenchNationalFlag) {
    this.frenchNationalFlag = frenchNationalFlag;
    return this;
  }

  /**
   * Get frenchNationalFlag
   * @return frenchNationalFlag
  */
  

  @JsonProperty("frenchNationalFlag")
  public Boolean getFrenchNationalFlag() {
    return frenchNationalFlag;
  }

  public void setFrenchNationalFlag(Boolean frenchNationalFlag) {
    this.frenchNationalFlag = frenchNationalFlag;
  }

  public French riskCategories(List<@Valid FrenchRiskCategory> riskCategories) {
    this.riskCategories = riskCategories;
    return this;
  }

  public French addRiskCategoriesItem(FrenchRiskCategory riskCategoriesItem) {
    if (this.riskCategories == null) {
      this.riskCategories = new ArrayList<>();
    }
    this.riskCategories.add(riskCategoriesItem);
    return this;
  }

  /**
   * Get riskCategories
   * @return riskCategories
  */
  @Valid 

  @JsonProperty("riskCategories")
  public List<@Valid FrenchRiskCategory> getRiskCategories() {
    return riskCategories;
  }

  public void setRiskCategories(List<@Valid FrenchRiskCategory> riskCategories) {
    this.riskCategories = riskCategories;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    French french = (French) o;
    return Objects.equals(this.brokerDirectName, french.brokerDirectName) &&
        Objects.equals(this.address, french.address) &&
        Objects.equals(this.dirAssuredCountry, french.dirAssuredCountry) &&
        Objects.equals(this.brokerReferenceCode, french.brokerReferenceCode) &&
        Objects.equals(this.boundInFranceFlag, french.boundInFranceFlag) &&
        Objects.equals(this.frenchNationalFlag, french.frenchNationalFlag) &&
        Objects.equals(this.riskCategories, french.riskCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerDirectName, address, dirAssuredCountry, brokerReferenceCode, boundInFranceFlag, frenchNationalFlag, riskCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class French {\n");
    sb.append("    brokerDirectName: ").append(toIndentedString(brokerDirectName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dirAssuredCountry: ").append(toIndentedString(dirAssuredCountry)).append("\n");
    sb.append("    brokerReferenceCode: ").append(toIndentedString(brokerReferenceCode)).append("\n");
    sb.append("    boundInFranceFlag: ").append(toIndentedString(boundInFranceFlag)).append("\n");
    sb.append("    frenchNationalFlag: ").append(toIndentedString(frenchNationalFlag)).append("\n");
    sb.append("    riskCategories: ").append(toIndentedString(riskCategories)).append("\n");
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

