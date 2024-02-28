package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * NjSplitDetail
 */

@JsonTypeName("njSplitDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class NjSplitDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private BigDecimal splitNumber;

  private String transactionNumber;

  private String policyNumber;

  private BigDecimal grossAmount;

  public NjSplitDetail splitNumber(BigDecimal splitNumber) {
    this.splitNumber = splitNumber;
    return this;
  }

  /**
   * Get splitNumber
   * @return splitNumber
  */
  @Valid 

  @JsonProperty("splitNumber")
  public BigDecimal getSplitNumber() {
    return splitNumber;
  }

  public void setSplitNumber(BigDecimal splitNumber) {
    this.splitNumber = splitNumber;
  }

  public NjSplitDetail transactionNumber(String transactionNumber) {
    this.transactionNumber = transactionNumber;
    return this;
  }

  /**
   * Get transactionNumber
   * @return transactionNumber
  */
  

  @JsonProperty("transactionNumber")
  public String getTransactionNumber() {
    return transactionNumber;
  }

  public void setTransactionNumber(String transactionNumber) {
    this.transactionNumber = transactionNumber;
  }

  public NjSplitDetail policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * Get policyNumber
   * @return policyNumber
  */
  

  @JsonProperty("policyNumber")
  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public NjSplitDetail grossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

  /**
   * Get grossAmount
   * @return grossAmount
  */
  @Valid 

  @JsonProperty("grossAmount")
  public BigDecimal getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NjSplitDetail njSplitDetail = (NjSplitDetail) o;
    return Objects.equals(this.splitNumber, njSplitDetail.splitNumber) &&
        Objects.equals(this.transactionNumber, njSplitDetail.transactionNumber) &&
        Objects.equals(this.policyNumber, njSplitDetail.policyNumber) &&
        Objects.equals(this.grossAmount, njSplitDetail.grossAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitNumber, transactionNumber, policyNumber, grossAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NjSplitDetail {\n");
    sb.append("    splitNumber: ").append(toIndentedString(splitNumber)).append("\n");
    sb.append("    transactionNumber: ").append(toIndentedString(transactionNumber)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
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

