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
 * TypeOfEntryCode
 */

@JsonTypeName("typeOfEntryCode")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfEntryCode implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refTypeEntryCodeId;

  private String typeOfEntryCodeValue;

  public TypeOfEntryCode() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeOfEntryCode(UUID refTypeEntryCodeId) {
    this.refTypeEntryCodeId = refTypeEntryCodeId;
  }

  public TypeOfEntryCode refTypeEntryCodeId(UUID refTypeEntryCodeId) {
    this.refTypeEntryCodeId = refTypeEntryCodeId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an Entry Code will be retrieved from refTypeOfMarket reference table
   * @return refTypeEntryCodeId
  */
  @NotNull @Valid 

  @JsonProperty("refTypeEntryCodeId")
  public UUID getRefTypeEntryCodeId() {
    return refTypeEntryCodeId;
  }

  public void setRefTypeEntryCodeId(UUID refTypeEntryCodeId) {
    this.refTypeEntryCodeId = refTypeEntryCodeId;
  }

  public TypeOfEntryCode typeOfEntryCodeValue(String typeOfEntryCodeValue) {
    this.typeOfEntryCodeValue = typeOfEntryCodeValue;
    return this;
  }

  /**
   * Retrieved from reference table refTypeOfEntryCode (code)
   * @return typeOfEntryCodeValue
  */
  

  @JsonProperty("typeOfEntryCodeValue")
  public String getTypeOfEntryCodeValue() {
    return typeOfEntryCodeValue;
  }

  public void setTypeOfEntryCodeValue(String typeOfEntryCodeValue) {
    this.typeOfEntryCodeValue = typeOfEntryCodeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfEntryCode typeOfEntryCode = (TypeOfEntryCode) o;
    return Objects.equals(this.refTypeEntryCodeId, typeOfEntryCode.refTypeEntryCodeId) &&
        Objects.equals(this.typeOfEntryCodeValue, typeOfEntryCode.typeOfEntryCodeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTypeEntryCodeId, typeOfEntryCodeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfEntryCode {\n");
    sb.append("    refTypeEntryCodeId: ").append(toIndentedString(refTypeEntryCodeId)).append("\n");
    sb.append("    typeOfEntryCodeValue: ").append(toIndentedString(typeOfEntryCodeValue)).append("\n");
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

