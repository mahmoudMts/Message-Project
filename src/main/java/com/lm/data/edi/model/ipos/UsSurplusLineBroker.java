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
 * UsSurplusLineBroker
 */

@JsonTypeName("usSurplusLineBroker")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UsSurplusLineBroker implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID uuid;

  private BigDecimal splitNumber;

  private TypeOfCountrySubDivision stateOfLicence;

  private String licenseNumber;

  private String companyName;

  private Contact contact;

  private UsAddress address;

  private BigDecimal grossPremium;

  private Integer njSplits;

  public UsSurplusLineBroker uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
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

  public UsSurplusLineBroker splitNumber(BigDecimal splitNumber) {
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

  public UsSurplusLineBroker stateOfLicence(TypeOfCountrySubDivision stateOfLicence) {
    this.stateOfLicence = stateOfLicence;
    return this;
  }

  /**
   * Get stateOfLicence
   * @return stateOfLicence
  */
  @Valid 

  @JsonProperty("stateOfLicence")
  public TypeOfCountrySubDivision getStateOfLicence() {
    return stateOfLicence;
  }

  public void setStateOfLicence(TypeOfCountrySubDivision stateOfLicence) {
    this.stateOfLicence = stateOfLicence;
  }

  public UsSurplusLineBroker licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

  /**
   * Get licenseNumber
   * @return licenseNumber
  */
  

  @JsonProperty("licenseNumber")
  public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public UsSurplusLineBroker companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  */
  

  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UsSurplusLineBroker contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  */
  @Valid 

  @JsonProperty("contact")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public UsSurplusLineBroker address(UsAddress address) {
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

  public UsSurplusLineBroker grossPremium(BigDecimal grossPremium) {
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

  public UsSurplusLineBroker njSplits(Integer njSplits) {
    this.njSplits = njSplits;
    return this;
  }

  /**
   * number of nj splits
   * @return njSplits
  */
  

  @JsonProperty("njSplits")
  public Integer getNjSplits() {
    return njSplits;
  }

  public void setNjSplits(Integer njSplits) {
    this.njSplits = njSplits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsSurplusLineBroker usSurplusLineBroker = (UsSurplusLineBroker) o;
    return Objects.equals(this.uuid, usSurplusLineBroker.uuid) &&
        Objects.equals(this.splitNumber, usSurplusLineBroker.splitNumber) &&
        Objects.equals(this.stateOfLicence, usSurplusLineBroker.stateOfLicence) &&
        Objects.equals(this.licenseNumber, usSurplusLineBroker.licenseNumber) &&
        Objects.equals(this.companyName, usSurplusLineBroker.companyName) &&
        Objects.equals(this.contact, usSurplusLineBroker.contact) &&
        Objects.equals(this.address, usSurplusLineBroker.address) &&
        Objects.equals(this.grossPremium, usSurplusLineBroker.grossPremium) &&
        Objects.equals(this.njSplits, usSurplusLineBroker.njSplits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, splitNumber, stateOfLicence, licenseNumber, companyName, contact, address, grossPremium, njSplits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsSurplusLineBroker {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    splitNumber: ").append(toIndentedString(splitNumber)).append("\n");
    sb.append("    stateOfLicence: ").append(toIndentedString(stateOfLicence)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    grossPremium: ").append(toIndentedString(grossPremium)).append("\n");
    sb.append("    njSplits: ").append(toIndentedString(njSplits)).append("\n");
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

