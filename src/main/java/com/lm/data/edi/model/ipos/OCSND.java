package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * OCSND
 */

@JsonTypeName("oCSND")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class OCSND implements Serializable {

  private static final long serialVersionUID = 1L;

  private String csnd;

  private UUID sectionId;

  private UUID premiumId;

  public OCSND csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * the original carrier signing number and date, maps to premium level
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public OCSND sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * the sectionId of the original premium record, available on the signingPremium record
   * @return sectionId
  */
  @Valid 

  @JsonProperty("sectionId")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public OCSND premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * the premiumId of the original premium record, available on the signingPremium record
   * @return premiumId
  */
  @Valid 

  @JsonProperty("premiumId")
  public UUID getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(UUID premiumId) {
    this.premiumId = premiumId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCSND oCSND = (OCSND) o;
    return Objects.equals(this.csnd, oCSND.csnd) &&
        Objects.equals(this.sectionId, oCSND.sectionId) &&
        Objects.equals(this.premiumId, oCSND.premiumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csnd, sectionId, premiumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCSND {\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
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

