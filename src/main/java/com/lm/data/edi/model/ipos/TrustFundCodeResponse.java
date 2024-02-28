package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * The trust fund model
 */

@JsonTypeName("trustFundCodeResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TrustFundCodeResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfTrustFundCode usTrustFundCode;

  private TypeOfTrustFundCode nonUSTrustFundCode;

  private TypeOfFilCode filCode3;

  public TrustFundCodeResponse usTrustFundCode(TypeOfTrustFundCode usTrustFundCode) {
    this.usTrustFundCode = usTrustFundCode;
    return this;
  }

  /**
   * Get usTrustFundCode
   * @return usTrustFundCode
  */
  @Valid 

  @JsonProperty("usTrustFundCode")
  public TypeOfTrustFundCode getUsTrustFundCode() {
    return usTrustFundCode;
  }

  public void setUsTrustFundCode(TypeOfTrustFundCode usTrustFundCode) {
    this.usTrustFundCode = usTrustFundCode;
  }

  public TrustFundCodeResponse nonUSTrustFundCode(TypeOfTrustFundCode nonUSTrustFundCode) {
    this.nonUSTrustFundCode = nonUSTrustFundCode;
    return this;
  }

  /**
   * Get nonUSTrustFundCode
   * @return nonUSTrustFundCode
  */
  @Valid 

  @JsonProperty("nonUSTrustFundCode")
  public TypeOfTrustFundCode getNonUSTrustFundCode() {
    return nonUSTrustFundCode;
  }

  public void setNonUSTrustFundCode(TypeOfTrustFundCode nonUSTrustFundCode) {
    this.nonUSTrustFundCode = nonUSTrustFundCode;
  }

  public TrustFundCodeResponse filCode3(TypeOfFilCode filCode3) {
    this.filCode3 = filCode3;
    return this;
  }

  /**
   * Get filCode3
   * @return filCode3
  */
  @Valid 

  @JsonProperty("filCode3")
  public TypeOfFilCode getFilCode3() {
    return filCode3;
  }

  public void setFilCode3(TypeOfFilCode filCode3) {
    this.filCode3 = filCode3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustFundCodeResponse trustFundCodeResponse = (TrustFundCodeResponse) o;
    return Objects.equals(this.usTrustFundCode, trustFundCodeResponse.usTrustFundCode) &&
        Objects.equals(this.nonUSTrustFundCode, trustFundCodeResponse.nonUSTrustFundCode) &&
        Objects.equals(this.filCode3, trustFundCodeResponse.filCode3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usTrustFundCode, nonUSTrustFundCode, filCode3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustFundCodeResponse {\n");
    sb.append("    usTrustFundCode: ").append(toIndentedString(usTrustFundCode)).append("\n");
    sb.append("    nonUSTrustFundCode: ").append(toIndentedString(nonUSTrustFundCode)).append("\n");
    sb.append("    filCode3: ").append(toIndentedString(filCode3)).append("\n");
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

