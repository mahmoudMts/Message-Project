package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * Kentucky
 */

@JsonTypeName("kentucky")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Kentucky implements Serializable {

  private static final long serialVersionUID = 1L;

  private String brokerDirectName;

  private String nonLocalBrokerName;

  private BigDecimal kentuckySurcharge;

  private Boolean interestInsdKetucky;

  @Valid
  private List<@Valid CovernoteNumber> covernoteNumbers;

  public Kentucky brokerDirectName(String brokerDirectName) {
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

  public Kentucky nonLocalBrokerName(String nonLocalBrokerName) {
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

  public Kentucky kentuckySurcharge(BigDecimal kentuckySurcharge) {
    this.kentuckySurcharge = kentuckySurcharge;
    return this;
  }

  /**
   * Get kentuckySurcharge
   * @return kentuckySurcharge
  */
  @Valid 

  @JsonProperty("kentuckySurcharge")
  public BigDecimal getKentuckySurcharge() {
    return kentuckySurcharge;
  }

  public void setKentuckySurcharge(BigDecimal kentuckySurcharge) {
    this.kentuckySurcharge = kentuckySurcharge;
  }

  public Kentucky interestInsdKetucky(Boolean interestInsdKetucky) {
    this.interestInsdKetucky = interestInsdKetucky;
    return this;
  }

  /**
   * Get interestInsdKetucky
   * @return interestInsdKetucky
  */
  

  @JsonProperty("interestInsdKetucky")
  public Boolean getInterestInsdKetucky() {
    return interestInsdKetucky;
  }

  public void setInterestInsdKetucky(Boolean interestInsdKetucky) {
    this.interestInsdKetucky = interestInsdKetucky;
  }

  public Kentucky covernoteNumbers(List<@Valid CovernoteNumber> covernoteNumbers) {
    this.covernoteNumbers = covernoteNumbers;
    return this;
  }

  public Kentucky addCovernoteNumbersItem(CovernoteNumber covernoteNumbersItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kentucky kentucky = (Kentucky) o;
    return Objects.equals(this.brokerDirectName, kentucky.brokerDirectName) &&
        Objects.equals(this.nonLocalBrokerName, kentucky.nonLocalBrokerName) &&
        Objects.equals(this.kentuckySurcharge, kentucky.kentuckySurcharge) &&
        Objects.equals(this.interestInsdKetucky, kentucky.interestInsdKetucky) &&
        Objects.equals(this.covernoteNumbers, kentucky.covernoteNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerDirectName, nonLocalBrokerName, kentuckySurcharge, interestInsdKetucky, covernoteNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kentucky {\n");
    sb.append("    brokerDirectName: ").append(toIndentedString(brokerDirectName)).append("\n");
    sb.append("    nonLocalBrokerName: ").append(toIndentedString(nonLocalBrokerName)).append("\n");
    sb.append("    kentuckySurcharge: ").append(toIndentedString(kentuckySurcharge)).append("\n");
    sb.append("    interestInsdKetucky: ").append(toIndentedString(interestInsdKetucky)).append("\n");
    sb.append("    covernoteNumbers: ").append(toIndentedString(covernoteNumbers)).append("\n");
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

