package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * CovernoteNumber
 */

@JsonTypeName("covernoteNumber")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class CovernoteNumber implements Serializable {

  private static final long serialVersionUID = 1L;

  private String covernoteNumber;

  public CovernoteNumber covernoteNumber(String covernoteNumber) {
    this.covernoteNumber = covernoteNumber;
    return this;
  }

  /**
   * Get covernoteNumber
   * @return covernoteNumber
  */
  

  @JsonProperty("covernoteNumber")
  public String getCovernoteNumber() {
    return covernoteNumber;
  }

  public void setCovernoteNumber(String covernoteNumber) {
    this.covernoteNumber = covernoteNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovernoteNumber covernoteNumber = (CovernoteNumber) o;
    return Objects.equals(this.covernoteNumber, covernoteNumber.covernoteNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(covernoteNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovernoteNumber {\n");
    sb.append("    covernoteNumber: ").append(toIndentedString(covernoteNumber)).append("\n");
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

