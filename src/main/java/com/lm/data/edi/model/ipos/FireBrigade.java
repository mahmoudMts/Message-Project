package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * FireBrigade
 */

@JsonTypeName("fireBrigade")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class FireBrigade implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean code;

  private String chargesRate;

  private String premiumPercent;

  public FireBrigade code(Boolean code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  

  @JsonProperty("code")
  public Boolean getCode() {
    return code;
  }

  public void setCode(Boolean code) {
    this.code = code;
  }

  public FireBrigade chargesRate(String chargesRate) {
    this.chargesRate = chargesRate;
    return this;
  }

  /**
   * Get chargesRate
   * @return chargesRate
  */
  
@Pattern(regexp="\\d+(?:\\.\\d+)?") 
  @JsonProperty("chargesRate")
  public String getChargesRate() {
    return chargesRate;
  }

  public void setChargesRate(String chargesRate) {
    this.chargesRate = chargesRate;
  }

  public FireBrigade premiumPercent(String premiumPercent) {
    this.premiumPercent = premiumPercent;
    return this;
  }

  /**
   * Get premiumPercent
   * @return premiumPercent
  */
  
@Pattern(regexp="\\d+(?:\\.\\d+)?") 
  @JsonProperty("premiumPercent")
  public String getPremiumPercent() {
    return premiumPercent;
  }

  public void setPremiumPercent(String premiumPercent) {
    this.premiumPercent = premiumPercent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireBrigade fireBrigade = (FireBrigade) o;
    return Objects.equals(this.code, fireBrigade.code) &&
        Objects.equals(this.chargesRate, fireBrigade.chargesRate) &&
        Objects.equals(this.premiumPercent, fireBrigade.premiumPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, chargesRate, premiumPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireBrigade {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    chargesRate: ").append(toIndentedString(chargesRate)).append("\n");
    sb.append("    premiumPercent: ").append(toIndentedString(premiumPercent)).append("\n");
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

