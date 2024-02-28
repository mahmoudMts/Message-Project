package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PeriodWithNarrative
 */

@JsonTypeName("periodWithNarrative")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PeriodWithNarrative implements Serializable {

  private static final long serialVersionUID = 1L;

  
  private LocalDate from;

  
  private LocalDate to;

  private String narrative;

  public PeriodWithNarrative from(LocalDate from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @Valid 

  @JsonProperty("from")
  public LocalDate getFrom() {
    return from;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public PeriodWithNarrative to(LocalDate to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @Valid 

  @JsonProperty("to")
  public LocalDate getTo() {
    return to;
  }

  public void setTo(LocalDate to) {
    this.to = to;
  }

  public PeriodWithNarrative narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

  /**
   * Get narrative
   * @return narrative
  */
  

  @JsonProperty("narrative")
  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodWithNarrative periodWithNarrative = (PeriodWithNarrative) o;
    return Objects.equals(this.from, periodWithNarrative.from) &&
        Objects.equals(this.to, periodWithNarrative.to) &&
        Objects.equals(this.narrative, periodWithNarrative.narrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, narrative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodWithNarrative {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
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

