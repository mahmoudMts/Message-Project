package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionSearchRec
 */

@JsonTypeName("submissionSearchRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionSearchRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID submissionId;

  private TypeOfTransactionType transactionType;

  private Bureau bureau;

  private CorrectionTypeEnum correctionType;

  public SubmissionSearchRec submissionId(UUID submissionId) {
    this.submissionId = submissionId;
    return this;
  }

  /**
   * Get submissionId
   * @return submissionId
  */
  @Valid 

  @JsonProperty("submissionId")
  public UUID getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(UUID submissionId) {
    this.submissionId = submissionId;
  }

  public SubmissionSearchRec transactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @Valid 

  @JsonProperty("transactionType")
  public TypeOfTransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TypeOfTransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public SubmissionSearchRec bureau(Bureau bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @Valid 

  @JsonProperty("bureau")
  public Bureau getBureau() {
    return bureau;
  }

  public void setBureau(Bureau bureau) {
    this.bureau = bureau;
  }

  public SubmissionSearchRec correctionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
    return this;
  }

  /**
   * Get correctionType
   * @return correctionType
  */
  @Valid 

  @JsonProperty("correctionType")
  public CorrectionTypeEnum getCorrectionType() {
    return correctionType;
  }

  public void setCorrectionType(CorrectionTypeEnum correctionType) {
    this.correctionType = correctionType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionSearchRec submissionSearchRec = (SubmissionSearchRec) o;
    return Objects.equals(this.submissionId, submissionSearchRec.submissionId) &&
        Objects.equals(this.transactionType, submissionSearchRec.transactionType) &&
        Objects.equals(this.bureau, submissionSearchRec.bureau) &&
        Objects.equals(this.correctionType, submissionSearchRec.correctionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, transactionType, bureau, correctionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionSearchRec {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
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

