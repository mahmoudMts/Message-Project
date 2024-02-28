package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PartyRequest
 */

@JsonTypeName("partyRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PartyRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private Bureau bureau;

  @Valid
  private List<@Valid PartyReferencesInner> partyReferences = new ArrayList<>();

  
  private LocalDate effectiveDate;

  private Boolean retrieveassociatedLMR = false;

  public PartyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyRequest(Bureau bureau, List<@Valid PartyReferencesInner> partyReferences, LocalDate effectiveDate) {
    this.bureau = bureau;
    this.partyReferences = partyReferences;
    this.effectiveDate = effectiveDate;
  }

  public PartyRequest bureau(Bureau bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @NotNull @Valid 

  @JsonProperty("bureau")
  public Bureau getBureau() {
    return bureau;
  }

  public void setBureau(Bureau bureau) {
    this.bureau = bureau;
  }

  public PartyRequest partyReferences(List<@Valid PartyReferencesInner> partyReferences) {
    this.partyReferences = partyReferences;
    return this;
  }

  public PartyRequest addPartyReferencesItem(PartyReferencesInner partyReferencesItem) {
    if (this.partyReferences == null) {
      this.partyReferences = new ArrayList<>();
    }
    this.partyReferences.add(partyReferencesItem);
    return this;
  }

  /**
   * Get partyReferences
   * @return partyReferences
  */
  @NotNull @Valid 

  @JsonProperty("partyReferences")
  public List<@Valid PartyReferencesInner> getPartyReferences() {
    return partyReferences;
  }

  public void setPartyReferences(List<@Valid PartyReferencesInner> partyReferences) {
    this.partyReferences = partyReferences;
  }

  public PartyRequest effectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Get effectiveDate
   * @return effectiveDate
  */
  @NotNull @Valid 

  @JsonProperty("effectiveDate")
  public LocalDate getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(LocalDate effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public PartyRequest retrieveassociatedLMR(Boolean retrieveassociatedLMR) {
    this.retrieveassociatedLMR = retrieveassociatedLMR;
    return this;
  }

  /**
   * Used to identify whether the to retrieve London Market Syndicate details or LBS
   * @return retrieveassociatedLMR
  */
  

  @JsonProperty("retrieveassociatedLMR")
  public Boolean getRetrieveassociatedLMR() {
    return retrieveassociatedLMR;
  }

  public void setRetrieveassociatedLMR(Boolean retrieveassociatedLMR) {
    this.retrieveassociatedLMR = retrieveassociatedLMR;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRequest partyRequest = (PartyRequest) o;
    return Objects.equals(this.bureau, partyRequest.bureau) &&
        Objects.equals(this.partyReferences, partyRequest.partyReferences) &&
        Objects.equals(this.effectiveDate, partyRequest.effectiveDate) &&
        Objects.equals(this.retrieveassociatedLMR, partyRequest.retrieveassociatedLMR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bureau, partyReferences, effectiveDate, retrieveassociatedLMR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRequest {\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    partyReferences: ").append(toIndentedString(partyReferences)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    retrieveassociatedLMR: ").append(toIndentedString(retrieveassociatedLMR)).append("\n");
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

