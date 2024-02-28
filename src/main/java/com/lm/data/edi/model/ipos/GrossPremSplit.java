package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * GrossPremSplit
 */

@JsonTypeName("grossPremSplit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class GrossPremSplit implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal hull;

  private BigDecimal liability;

  public GrossPremSplit hull(BigDecimal hull) {
    this.hull = hull;
    return this;
  }

  /**
   * Get hull
   * @return hull
  */
  @Valid 

  @JsonProperty("hull")
  public BigDecimal getHull() {
    return hull;
  }

  public void setHull(BigDecimal hull) {
    this.hull = hull;
  }

  public GrossPremSplit liability(BigDecimal liability) {
    this.liability = liability;
    return this;
  }

  /**
   * Get liability
   * @return liability
  */
  @Valid 

  @JsonProperty("liability")
  public BigDecimal getLiability() {
    return liability;
  }

  public void setLiability(BigDecimal liability) {
    this.liability = liability;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrossPremSplit grossPremSplit = (GrossPremSplit) o;
    return Objects.equals(this.hull, grossPremSplit.hull) &&
        Objects.equals(this.liability, grossPremSplit.liability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hull, liability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrossPremSplit {\n");
    sb.append("    hull: ").append(toIndentedString(hull)).append("\n");
    sb.append("    liability: ").append(toIndentedString(liability)).append("\n");
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

