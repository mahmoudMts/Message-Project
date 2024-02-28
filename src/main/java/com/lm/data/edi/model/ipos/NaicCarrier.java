package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * NaicCarrier
 */

@JsonTypeName("naicCarrier")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class NaicCarrier implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID uuid;

  private BigDecimal splitNumber;

  private String naicCode;

  private String feinCode;

  private TypeOfCountrySubDivision stateOfDomicile;

  private String groupCode;

  private String poolCode;

  private String reinsuredName;

  private BigDecimal grossPremium;

  private UsAddress address;

  private String telephoneNumber;

  private String companyStatus;

  public NaicCarrier uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * reference id
   * @return uuid
  */
  @Valid 

  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public NaicCarrier splitNumber(BigDecimal splitNumber) {
    this.splitNumber = splitNumber;
    return this;
  }

  /**
   * Get splitNumber
   * @return splitNumber
  */
  @Valid 

  @JsonProperty("splitNumber")
  public BigDecimal getSplitNumber() {
    return splitNumber;
  }

  public void setSplitNumber(BigDecimal splitNumber) {
    this.splitNumber = splitNumber;
  }

  public NaicCarrier naicCode(String naicCode) {
    this.naicCode = naicCode;
    return this;
  }

  /**
   * Get naicCode
   * @return naicCode
  */
  

  @JsonProperty("naicCode")
  public String getNaicCode() {
    return naicCode;
  }

  public void setNaicCode(String naicCode) {
    this.naicCode = naicCode;
  }

  public NaicCarrier feinCode(String feinCode) {
    this.feinCode = feinCode;
    return this;
  }

  /**
   * Get feinCode
   * @return feinCode
  */
  

  @JsonProperty("feinCode")
  public String getFeinCode() {
    return feinCode;
  }

  public void setFeinCode(String feinCode) {
    this.feinCode = feinCode;
  }

  public NaicCarrier stateOfDomicile(TypeOfCountrySubDivision stateOfDomicile) {
    this.stateOfDomicile = stateOfDomicile;
    return this;
  }

  /**
   * Get stateOfDomicile
   * @return stateOfDomicile
  */
  @Valid 

  @JsonProperty("stateOfDomicile")
  public TypeOfCountrySubDivision getStateOfDomicile() {
    return stateOfDomicile;
  }

  public void setStateOfDomicile(TypeOfCountrySubDivision stateOfDomicile) {
    this.stateOfDomicile = stateOfDomicile;
  }

  public NaicCarrier groupCode(String groupCode) {
    this.groupCode = groupCode;
    return this;
  }

  /**
   * Get groupCode
   * @return groupCode
  */
  

  @JsonProperty("groupCode")
  public String getGroupCode() {
    return groupCode;
  }

  public void setGroupCode(String groupCode) {
    this.groupCode = groupCode;
  }

  public NaicCarrier poolCode(String poolCode) {
    this.poolCode = poolCode;
    return this;
  }

  /**
   * Get poolCode
   * @return poolCode
  */
  

  @JsonProperty("poolCode")
  public String getPoolCode() {
    return poolCode;
  }

  public void setPoolCode(String poolCode) {
    this.poolCode = poolCode;
  }

  public NaicCarrier reinsuredName(String reinsuredName) {
    this.reinsuredName = reinsuredName;
    return this;
  }

  /**
   * Get reinsuredName
   * @return reinsuredName
  */
  

  @JsonProperty("reinsuredName")
  public String getReinsuredName() {
    return reinsuredName;
  }

  public void setReinsuredName(String reinsuredName) {
    this.reinsuredName = reinsuredName;
  }

  public NaicCarrier grossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
    return this;
  }

  /**
   * Get grossPremium
   * @return grossPremium
  */
  @Valid 

  @JsonProperty("grossPremium")
  public BigDecimal getGrossPremium() {
    return grossPremium;
  }

  public void setGrossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
  }

  public NaicCarrier address(UsAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 

  @JsonProperty("address")
  public UsAddress getAddress() {
    return address;
  }

  public void setAddress(UsAddress address) {
    this.address = address;
  }

  public NaicCarrier telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  */
  

  @JsonProperty("telephoneNumber")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public NaicCarrier companyStatus(String companyStatus) {
    this.companyStatus = companyStatus;
    return this;
  }

  /**
   * Get companyStatus
   * @return companyStatus
  */
  

  @JsonProperty("companyStatus")
  public String getCompanyStatus() {
    return companyStatus;
  }

  public void setCompanyStatus(String companyStatus) {
    this.companyStatus = companyStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaicCarrier naicCarrier = (NaicCarrier) o;
    return Objects.equals(this.uuid, naicCarrier.uuid) &&
        Objects.equals(this.splitNumber, naicCarrier.splitNumber) &&
        Objects.equals(this.naicCode, naicCarrier.naicCode) &&
        Objects.equals(this.feinCode, naicCarrier.feinCode) &&
        Objects.equals(this.stateOfDomicile, naicCarrier.stateOfDomicile) &&
        Objects.equals(this.groupCode, naicCarrier.groupCode) &&
        Objects.equals(this.poolCode, naicCarrier.poolCode) &&
        Objects.equals(this.reinsuredName, naicCarrier.reinsuredName) &&
        Objects.equals(this.grossPremium, naicCarrier.grossPremium) &&
        Objects.equals(this.address, naicCarrier.address) &&
        Objects.equals(this.telephoneNumber, naicCarrier.telephoneNumber) &&
        Objects.equals(this.companyStatus, naicCarrier.companyStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, splitNumber, naicCode, feinCode, stateOfDomicile, groupCode, poolCode, reinsuredName, grossPremium, address, telephoneNumber, companyStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaicCarrier {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    splitNumber: ").append(toIndentedString(splitNumber)).append("\n");
    sb.append("    naicCode: ").append(toIndentedString(naicCode)).append("\n");
    sb.append("    feinCode: ").append(toIndentedString(feinCode)).append("\n");
    sb.append("    stateOfDomicile: ").append(toIndentedString(stateOfDomicile)).append("\n");
    sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
    sb.append("    poolCode: ").append(toIndentedString(poolCode)).append("\n");
    sb.append("    reinsuredName: ").append(toIndentedString(reinsuredName)).append("\n");
    sb.append("    grossPremium: ").append(toIndentedString(grossPremium)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    companyStatus: ").append(toIndentedString(companyStatus)).append("\n");
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

