package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * This is the party that is the first point of communication for an organization or party
 */

@JsonTypeName("contact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Contact implements Serializable {

  private static final long serialVersionUID = 1L;

  private Name name;

  private Communication communication;

  public Contact name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @Valid 

  @JsonProperty("name")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Contact communication(Communication communication) {
    this.communication = communication;
    return this;
  }

  /**
   * Get communication
   * @return communication
  */
  @Valid 

  @JsonProperty("communication")
  public Communication getCommunication() {
    return communication;
  }

  public void setCommunication(Communication communication) {
    this.communication = communication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.name, contact.name) &&
        Objects.equals(this.communication, contact.communication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, communication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
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

