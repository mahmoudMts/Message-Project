package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * IcosSigningAdditionalCsnds
 */

@JsonTypeName("icosSigning_additionalCsnds")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IcosSigningAdditionalCsnds implements Serializable {

  private static final long serialVersionUID = 1L;

  private String csnd;

  public IcosSigningAdditionalCsnds csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * For AP/RP only - the carrier signing number and date of the AP/RP
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcosSigningAdditionalCsnds icosSigningAdditionalCsnds = (IcosSigningAdditionalCsnds) o;
    return Objects.equals(this.csnd, icosSigningAdditionalCsnds.csnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcosSigningAdditionalCsnds {\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
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

