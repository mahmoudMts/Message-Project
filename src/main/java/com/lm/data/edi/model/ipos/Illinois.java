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
 * Illinois
 */

@JsonTypeName("illinois")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Illinois implements Serializable {

  private static final long serialVersionUID = 1L;

  private String brokerDirectName;

  private String nonLocalBrokerName;

  @Valid
  private List<@Valid CovernoteNumber> covernoteNumbers;

  @Valid
  private List<@Valid IllinoisPremium> premiums;

  public Illinois brokerDirectName(String brokerDirectName) {
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

  public Illinois nonLocalBrokerName(String nonLocalBrokerName) {
    this.nonLocalBrokerName = nonLocalBrokerName;
    return this;
  }

  /**
   * Get nonLocalBrokerName
   * @return nonLocalBrokerName
  */
  

  @JsonProperty("nonLocalBrokerName")
  public String getNonLocalBrokerName() {
    return nonLocalBrokerName;
  }

  public void setNonLocalBrokerName(String nonLocalBrokerName) {
    this.nonLocalBrokerName = nonLocalBrokerName;
  }

  public Illinois covernoteNumbers(List<@Valid CovernoteNumber> covernoteNumbers) {
    this.covernoteNumbers = covernoteNumbers;
    return this;
  }

  public Illinois addCovernoteNumbersItem(CovernoteNumber covernoteNumbersItem) {
    if (this.covernoteNumbers == null) {
      this.covernoteNumbers = new ArrayList<>();
    }
    this.covernoteNumbers.add(covernoteNumbersItem);
    return this;
  }

  /**
   * Get covernoteNumbers
   * @return covernoteNumbers
  */
  @Valid 

  @JsonProperty("covernoteNumbers")
  public List<@Valid CovernoteNumber> getCovernoteNumbers() {
    return covernoteNumbers;
  }

  public void setCovernoteNumbers(List<@Valid CovernoteNumber> covernoteNumbers) {
    this.covernoteNumbers = covernoteNumbers;
  }

  public Illinois premiums(List<@Valid IllinoisPremium> premiums) {
    this.premiums = premiums;
    return this;
  }

  public Illinois addPremiumsItem(IllinoisPremium premiumsItem) {
    if (this.premiums == null) {
      this.premiums = new ArrayList<>();
    }
    this.premiums.add(premiumsItem);
    return this;
  }

  /**
   * Get premiums
   * @return premiums
  */
  @Valid 

  @JsonProperty("premiums")
  public List<@Valid IllinoisPremium> getPremiums() {
    return premiums;
  }

  public void setPremiums(List<@Valid IllinoisPremium> premiums) {
    this.premiums = premiums;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Illinois illinois = (Illinois) o;
    return Objects.equals(this.brokerDirectName, illinois.brokerDirectName) &&
        Objects.equals(this.nonLocalBrokerName, illinois.nonLocalBrokerName) &&
        Objects.equals(this.covernoteNumbers, illinois.covernoteNumbers) &&
        Objects.equals(this.premiums, illinois.premiums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerDirectName, nonLocalBrokerName, covernoteNumbers, premiums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Illinois {\n");
    sb.append("    brokerDirectName: ").append(toIndentedString(brokerDirectName)).append("\n");
    sb.append("    nonLocalBrokerName: ").append(toIndentedString(nonLocalBrokerName)).append("\n");
    sb.append("    covernoteNumbers: ").append(toIndentedString(covernoteNumbers)).append("\n");
    sb.append("    premiums: ").append(toIndentedString(premiums)).append("\n");
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

