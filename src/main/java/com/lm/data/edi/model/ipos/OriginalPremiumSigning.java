package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * OriginalPremiumSigning
 */

@JsonTypeName("originalPremiumSigning")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class OriginalPremiumSigning implements Serializable {

  private static final long serialVersionUID = 1L;

  private String bsnd;

  @Valid
  private List<@Valid OCSND> csnds;

  public OriginalPremiumSigning bsnd(String bsnd) {
    this.bsnd = bsnd;
    return this;
  }

  /**
   * the original broker signing number and date, maps to section level
   * @return bsnd
  */
  

  @JsonProperty("bsnd")
  public String getBsnd() {
    return bsnd;
  }

  public void setBsnd(String bsnd) {
    this.bsnd = bsnd;
  }

  public OriginalPremiumSigning csnds(List<@Valid OCSND> csnds) {
    this.csnds = csnds;
    return this;
  }

  public OriginalPremiumSigning addCsndsItem(OCSND csndsItem) {
    if (this.csnds == null) {
      this.csnds = new ArrayList<>();
    }
    this.csnds.add(csndsItem);
    return this;
  }

  /**
   * Get csnds
   * @return csnds
  */
  @Valid 

  @JsonProperty("csnds")
  public List<@Valid OCSND> getCsnds() {
    return csnds;
  }

  public void setCsnds(List<@Valid OCSND> csnds) {
    this.csnds = csnds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalPremiumSigning originalPremiumSigning = (OriginalPremiumSigning) o;
    return Objects.equals(this.bsnd, originalPremiumSigning.bsnd) &&
        Objects.equals(this.csnds, originalPremiumSigning.csnds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsnd, csnds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalPremiumSigning {\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    csnds: ").append(toIndentedString(csnds)).append("\n");
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

