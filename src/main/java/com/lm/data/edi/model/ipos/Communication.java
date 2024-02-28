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
 * This object indicates ways to communicate with a  party.
 */

@JsonTypeName("communication")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Communication implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid CommunicationContactNumbers> contactNumbers;

  private String emailAddress;

  public Communication contactNumbers(List<@Valid CommunicationContactNumbers> contactNumbers) {
    this.contactNumbers = contactNumbers;
    return this;
  }

  public Communication addContactNumbersItem(CommunicationContactNumbers contactNumbersItem) {
    if (this.contactNumbers == null) {
      this.contactNumbers = new ArrayList<>();
    }
    this.contactNumbers.add(contactNumbersItem);
    return this;
  }

  /**
   * Get contactNumbers
   * @return contactNumbers
  */
  @Valid 

  @JsonProperty("contactNumbers")
  public List<@Valid CommunicationContactNumbers> getContactNumbers() {
    return contactNumbers;
  }

  public void setContactNumbers(List<@Valid CommunicationContactNumbers> contactNumbers) {
    this.contactNumbers = contactNumbers;
  }

  public Communication emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * This is an electronic address
   * @return emailAddress
  */
  

  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Communication communication = (Communication) o;
    return Objects.equals(this.contactNumbers, communication.contactNumbers) &&
        Objects.equals(this.emailAddress, communication.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNumbers, emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Communication {\n");
    sb.append("    contactNumbers: ").append(toIndentedString(contactNumbers)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
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

