package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfVatCode
 */

@JsonTypeName("typeOfVatCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfVatCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeOfVatCode;

  private String typeOfVatCode;

  public TypeOfVatCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeOfVatCode(UUID refTypeOfVatCode) {
    this.refTypeOfVatCode = refTypeOfVatCode;
  }

  public TypeOfVatCode refTypeOfVatCode(UUID refTypeOfVatCode) {
    this.refTypeOfVatCode = refTypeOfVatCode;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an vatCode will be retrieved from refvatCode reference table
   * @return refTypeOfVatCode
  */
  @NotNull @Valid 

  @JsonProperty("refTypeOfVatCode")
  public UUID getRefTypeOfVatCode() {
    return refTypeOfVatCode;
  }

  public void setRefTypeOfVatCode(UUID refTypeOfVatCode) {
    this.refTypeOfVatCode = refTypeOfVatCode;
  }

  public TypeOfVatCode typeOfVatCode(String typeOfVatCode) {
    this.typeOfVatCode = typeOfVatCode;
    return this;
  }

  /**
   * Retrieved from reference table refvatCode (code)
   * @return typeOfVatCode
  */
  

  @JsonProperty("typeOfVatCode")
  public String getTypeOfVatCode() {
    return typeOfVatCode;
  }

  public void setTypeOfVatCode(String typeOfVatCode) {
    this.typeOfVatCode = typeOfVatCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfVatCode typeOfVatCode = (TypeOfVatCode) o;
    return Objects.equals(this.refTypeOfVatCode, typeOfVatCode.refTypeOfVatCode) &&
        Objects.equals(this.typeOfVatCode, typeOfVatCode.typeOfVatCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeOfVatCode, typeOfVatCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfVatCode {\n");
    sb.append("    refTypeOfVatCode: ").append(toIndentedString(refTypeOfVatCode)).append("\n");
    sb.append("    typeOfVatCode: ").append(toIndentedString(typeOfVatCode)).append("\n");
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

