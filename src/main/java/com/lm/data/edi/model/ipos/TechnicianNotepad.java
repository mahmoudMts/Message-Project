package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TechnicianNotepad
 */

@JsonTypeName("technicianNotepad")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TechnicianNotepad implements Serializable {

  private static final long serialVersionUID = 1L;

  private String umr;

  private String text;

  
  private OffsetDateTime lastUpdated;

  private String lastUpdatedBy;

  public TechnicianNotepad() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TechnicianNotepad(String umr) {
    this.umr = umr;
  }

  public TechnicianNotepad umr(String umr) {
    this.umr = umr;
    return this;
  }

  /**
   * Get umr
   * @return umr
  */
  @NotNull 

  @JsonProperty("umr")
  public String getUmr() {
    return umr;
  }

  public void setUmr(String umr) {
    this.umr = umr;
  }

  public TechnicianNotepad text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  */
  

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TechnicianNotepad lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time that the notepad record was last updated
   * @return lastUpdated
  */
  @Valid 

  @JsonProperty("lastUpdated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public TechnicianNotepad lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * The user that last updated the notepad record
   * @return lastUpdatedBy
  */
  

  @JsonProperty("lastUpdatedBy")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicianNotepad technicianNotepad = (TechnicianNotepad) o;
    return Objects.equals(this.umr, technicianNotepad.umr) &&
        Objects.equals(this.text, technicianNotepad.text) &&
        Objects.equals(this.lastUpdated, technicianNotepad.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, technicianNotepad.lastUpdatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(umr, text, lastUpdated, lastUpdatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicianNotepad {\n");
    sb.append("    umr: ").append(toIndentedString(umr)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
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

