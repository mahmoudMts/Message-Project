package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * EcReporting
 */

@JsonTypeName("ecReporting")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class EcReporting implements Serializable {

  private static final long serialVersionUID = 1L;

  private String ecInsuredAddress;

  private LocalBroker localBroker;

  private TypeOfDTICode dtiCode;

  public EcReporting ecInsuredAddress(String ecInsuredAddress) {
    this.ecInsuredAddress = ecInsuredAddress;
    return this;
  }

  /**
   * Get ecInsuredAddress
   * @return ecInsuredAddress
  */
  

  @JsonProperty("ecInsuredAddress")
  public String getEcInsuredAddress() {
    return ecInsuredAddress;
  }

  public void setEcInsuredAddress(String ecInsuredAddress) {
    this.ecInsuredAddress = ecInsuredAddress;
  }

  public EcReporting localBroker(LocalBroker localBroker) {
    this.localBroker = localBroker;
    return this;
  }

  /**
   * Get localBroker
   * @return localBroker
  */
  @Valid 

  @JsonProperty("localBroker")
  public LocalBroker getLocalBroker() {
    return localBroker;
  }

  public void setLocalBroker(LocalBroker localBroker) {
    this.localBroker = localBroker;
  }

  public EcReporting dtiCode(TypeOfDTICode dtiCode) {
    this.dtiCode = dtiCode;
    return this;
  }

  /**
   * Get dtiCode
   * @return dtiCode
  */
  @Valid 

  @JsonProperty("dtiCode")
  public TypeOfDTICode getDtiCode() {
    return dtiCode;
  }

  public void setDtiCode(TypeOfDTICode dtiCode) {
    this.dtiCode = dtiCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcReporting ecReporting = (EcReporting) o;
    return Objects.equals(this.ecInsuredAddress, ecReporting.ecInsuredAddress) &&
        Objects.equals(this.localBroker, ecReporting.localBroker) &&
        Objects.equals(this.dtiCode, ecReporting.dtiCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecInsuredAddress, localBroker, dtiCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcReporting {\n");
    sb.append("    ecInsuredAddress: ").append(toIndentedString(ecInsuredAddress)).append("\n");
    sb.append("    localBroker: ").append(toIndentedString(localBroker)).append("\n");
    sb.append("    dtiCode: ").append(toIndentedString(dtiCode)).append("\n");
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

