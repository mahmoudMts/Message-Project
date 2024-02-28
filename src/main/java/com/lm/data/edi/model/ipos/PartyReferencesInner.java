package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PartyReferencesInner
 */

@JsonTypeName("partyReferences_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PartyReferencesInner implements Serializable {

  private static final long serialVersionUID = 1L;

  private String partyReference;

  public PartyReferencesInner partyReference(String partyReference) {
    this.partyReference = partyReference;
    return this;
  }

  /**
   * Stamp code ( syndicate number) of the syndicate participating in the risk
   * @return partyReference
  */
  

  @JsonProperty("partyReference")
  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyReferencesInner partyReferencesInner = (PartyReferencesInner) o;
    return Objects.equals(this.partyReference, partyReferencesInner.partyReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyReferencesInner {\n");
    sb.append("    partyReference: ").append(toIndentedString(partyReference)).append("\n");
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

