package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * UsAddress
 */

@JsonTypeName("usAddress")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class UsAddress implements Serializable {

  private static final long serialVersionUID = 1L;

  private String line1;

  private String city;

  private String postalCode;

  private String countryCode;

  private String state;

  public UsAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * This is the first line of the address in free form text.
   * @return line1
  */
  

  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public UsAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * This is the City name.
   * @return city
  */
  

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UsAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * This is a series of letters or digits or both, sometimes including spaces or punctuation, included in a postal address for the purpose of sorting mail.
   * @return postalCode
  */
  

  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UsAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The Code for the country - must be a value from ISO-3166.
   * @return countryCode
  */
  

  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UsAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsAddress usAddress = (UsAddress) o;
    return Objects.equals(this.line1, usAddress.line1) &&
        Objects.equals(this.city, usAddress.city) &&
        Objects.equals(this.postalCode, usAddress.postalCode) &&
        Objects.equals(this.countryCode, usAddress.countryCode) &&
        Objects.equals(this.state, usAddress.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, city, postalCode, countryCode, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsAddress {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

