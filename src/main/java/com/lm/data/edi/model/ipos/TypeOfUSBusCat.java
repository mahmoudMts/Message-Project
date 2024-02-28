package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * TypeOfUSBusCat
 */

@JsonTypeName("typeOfUSBusCat")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TypeOfUSBusCat implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID refUSBusCatId;

  private String typeOfUSBusCat;

  public TypeOfUSBusCat refUSBusCatId(UUID refUSBusCatId) {
    this.refUSBusCatId = refUSBusCatId;
    return this;
  }

  /**
   * A code that (in conjunction with the effective date), uniquely identifies an state will be retrieved from USBusCat reference table
   * @return refUSBusCatId
  */
  @Valid 

  @JsonProperty("refUSBusCatId")
  public UUID getRefUSBusCatId() {
    return refUSBusCatId;
  }

  public void setRefUSBusCatId(UUID refUSBusCatId) {
    this.refUSBusCatId = refUSBusCatId;
  }

  public TypeOfUSBusCat typeOfUSBusCat(String typeOfUSBusCat) {
    this.typeOfUSBusCat = typeOfUSBusCat;
    return this;
  }

  /**
   * Retrieved from reference table USBusCat (code)
   * @return typeOfUSBusCat
  */
  

  @JsonProperty("typeOfUSBusCat")
  public String getTypeOfUSBusCat() {
    return typeOfUSBusCat;
  }

  public void setTypeOfUSBusCat(String typeOfUSBusCat) {
    this.typeOfUSBusCat = typeOfUSBusCat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOfUSBusCat typeOfUSBusCat = (TypeOfUSBusCat) o;
    return Objects.equals(this.refUSBusCatId, typeOfUSBusCat.refUSBusCatId) &&
        Objects.equals(this.typeOfUSBusCat, typeOfUSBusCat.typeOfUSBusCat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refUSBusCatId, typeOfUSBusCat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeOfUSBusCat {\n");
    sb.append("    refUSBusCatId: ").append(toIndentedString(refUSBusCatId)).append("\n");
    sb.append("    typeOfUSBusCat: ").append(toIndentedString(typeOfUSBusCat)).append("\n");
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

