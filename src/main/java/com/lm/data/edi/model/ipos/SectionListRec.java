package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SectionListRec
 */

@JsonTypeName("sectionListRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SectionListRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID sectionId;

  private Integer sectionNumber;

  private String sectionTitle;

  public SectionListRec sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Get sectionId
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

  public SectionListRec sectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

  /**
   * Get sectionNumber
   * @return sectionNumber
  */
  

  @JsonProperty("sectionNumber")
  public Integer getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public SectionListRec sectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
    return this;
  }

  /**
   * Get sectionTitle
   * @return sectionTitle
  */
  

  @JsonProperty("sectionTitle")
  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionListRec sectionListRec = (SectionListRec) o;
    return Objects.equals(this.sectionId, sectionListRec.sectionId) &&
        Objects.equals(this.sectionNumber, sectionListRec.sectionNumber) &&
        Objects.equals(this.sectionTitle, sectionListRec.sectionTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, sectionNumber, sectionTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionListRec {\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sectionTitle: ").append(toIndentedString(sectionTitle)).append("\n");
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

