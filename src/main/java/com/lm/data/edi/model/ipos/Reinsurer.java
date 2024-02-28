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
 * This is the party that is reinsurer for the insurnace and obligations on a policy
 */

@JsonTypeName("reinsurer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Reinsurer implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid PartyIdentity> partyIdentities;

  private Name name;

  @Valid
  private List<@Valid Contact> contacts;

  private Address address;

  public Reinsurer partyIdentities(List<@Valid PartyIdentity> partyIdentities) {
    this.partyIdentities = partyIdentities;
    return this;
  }

  public Reinsurer addPartyIdentitiesItem(PartyIdentity partyIdentitiesItem) {
    if (this.partyIdentities == null) {
      this.partyIdentities = new ArrayList<>();
    }
    this.partyIdentities.add(partyIdentitiesItem);
    return this;
  }

  /**
   * Get partyIdentities
   * @return partyIdentities
  */
  @Valid 

  @JsonProperty("partyIdentities")
  public List<@Valid PartyIdentity> getPartyIdentities() {
    return partyIdentities;
  }

  public void setPartyIdentities(List<@Valid PartyIdentity> partyIdentities) {
    this.partyIdentities = partyIdentities;
  }

  public Reinsurer name(Name name) {
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

  public Reinsurer contacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Reinsurer addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   * @return contacts
  */
  @Valid 

  @JsonProperty("contacts")
  public List<@Valid Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<@Valid Contact> contacts) {
    this.contacts = contacts;
  }

  public Reinsurer address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 

  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reinsurer reinsurer = (Reinsurer) o;
    return Objects.equals(this.partyIdentities, reinsurer.partyIdentities) &&
        Objects.equals(this.name, reinsurer.name) &&
        Objects.equals(this.contacts, reinsurer.contacts) &&
        Objects.equals(this.address, reinsurer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyIdentities, name, contacts, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reinsurer {\n");
    sb.append("    partyIdentities: ").append(toIndentedString(partyIdentities)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

