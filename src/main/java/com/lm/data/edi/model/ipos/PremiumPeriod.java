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
 * PremiumPeriod
 */

@JsonTypeName("premiumPeriod")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumPeriod implements Serializable {

  private static final long serialVersionUID = 1L;

  
  private LocalDate from;

  
  private LocalDate to;

  public PremiumPeriod from(LocalDate from) {
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

  public PremiumPeriod to(LocalDate to) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumPeriod premiumPeriod = (PremiumPeriod) o;
    return Objects.equals(this.from, premiumPeriod.from) &&
        Objects.equals(this.to, premiumPeriod.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumPeriod {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

