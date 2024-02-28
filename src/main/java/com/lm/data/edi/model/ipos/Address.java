package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * This object identifies the postal address/location
 */

@JsonTypeName("address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Address implements Serializable {

  private static final long serialVersionUID = 1L;

  private String line1;

  private String city;

  private String postalCode;

  private String countryCode;

  public Address line1(String line1) {
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

  public Address city(String city) {
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

  public Address postalCode(String postalCode) {
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

  public Address countryCode(String countryCode) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.countryCode, address.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, city, postalCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

