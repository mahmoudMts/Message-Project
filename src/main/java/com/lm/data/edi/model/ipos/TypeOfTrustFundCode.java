package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfTrustFundCode
 */

@JsonTypeName("typeOfTrustFundCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfTrustFundCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTrustFundId;

  private String typeOfTrustFundCode;

  public TypeOfTrustFundCode refTrustFundId(UUID refTrustFundId) {
    this.refTrustFundId = refTrustFundId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an TrustFundCode will be retrieved from TrustFund reference table
   * @return refTrustFundId
  */
  @Valid 

  @JsonProperty("refTrustFundId")
  public UUID getRefTrustFundId() {
    return refTrustFundId;
  }

  public void setRefTrustFundId(UUID refTrustFundId) {
    this.refTrustFundId = refTrustFundId;
  }

  public TypeOfTrustFundCode typeOfTrustFundCode(String typeOfTrustFundCode) {
    this.typeOfTrustFundCode = typeOfTrustFundCode;
    return this;
  }

  /**
   * Retrieved from reference table TrustFund (code)
   * @return typeOfTrustFundCode
  */
  

  @JsonProperty("typeOfTrustFundCode")
  public String getTypeOfTrustFundCode() {
    return typeOfTrustFundCode;
  }

  public void setTypeOfTrustFundCode(String typeOfTrustFundCode) {
    this.typeOfTrustFundCode = typeOfTrustFundCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfTrustFundCode typeOfTrustFundCode = (TypeOfTrustFundCode) o;
    return Objects.equals(this.refTrustFundId, typeOfTrustFundCode.refTrustFundId) &&
        Objects.equals(this.typeOfTrustFundCode, typeOfTrustFundCode.typeOfTrustFundCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTrustFundId, typeOfTrustFundCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfTrustFundCode {\n");
    sb.append("    refTrustFundId: ").append(toIndentedString(refTrustFundId)).append("\n");
    sb.append("    typeOfTrustFundCode: ").append(toIndentedString(typeOfTrustFundCode)).append("\n");
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

