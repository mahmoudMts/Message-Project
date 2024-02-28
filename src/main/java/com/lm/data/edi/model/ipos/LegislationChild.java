package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * LegislationChild
 */

@JsonTypeName("legislationChild")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class LegislationChild implements Serializable {

  private static final long serialVersionUID = 1L;

  private Canada canada;

  private French french;

  private Illinois illinois;

  private Kentucky kentucky;

  public LegislationChild canada(Canada canada) {
    this.canada = canada;
    return this;
  }

  /**
   * Get canada
   * @return canada
  */
  @Valid 

  @JsonProperty("canada")
  public Canada getCanada() {
    return canada;
  }

  public void setCanada(Canada canada) {
    this.canada = canada;
  }

  public LegislationChild french(French french) {
    this.french = french;
    return this;
  }

  /**
   * Get french
   * @return french
  */
  @Valid 

  @JsonProperty("french")
  public French getFrench() {
    return french;
  }

  public void setFrench(French french) {
    this.french = french;
  }

  public LegislationChild illinois(Illinois illinois) {
    this.illinois = illinois;
    return this;
  }

  /**
   * Get illinois
   * @return illinois
  */
  @Valid 

  @JsonProperty("illinois")
  public Illinois getIllinois() {
    return illinois;
  }

  public void setIllinois(Illinois illinois) {
    this.illinois = illinois;
  }

  public LegislationChild kentucky(Kentucky kentucky) {
    this.kentucky = kentucky;
    return this;
  }

  /**
   * Get kentucky
   * @return kentucky
  */
  @Valid 

  @JsonProperty("kentucky")
  public Kentucky getKentucky() {
    return kentucky;
  }

  public void setKentucky(Kentucky kentucky) {
    this.kentucky = kentucky;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegislationChild legislationChild = (LegislationChild) o;
    return Objects.equals(this.canada, legislationChild.canada) &&
        Objects.equals(this.french, legislationChild.french) &&
        Objects.equals(this.illinois, legislationChild.illinois) &&
        Objects.equals(this.kentucky, legislationChild.kentucky);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canada, french, illinois, kentucky);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegislationChild {\n");
    sb.append("    canada: ").append(toIndentedString(canada)).append("\n");
    sb.append("    french: ").append(toIndentedString(french)).append("\n");
    sb.append("    illinois: ").append(toIndentedString(illinois)).append("\n");
    sb.append("    kentucky: ").append(toIndentedString(kentucky)).append("\n");
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

