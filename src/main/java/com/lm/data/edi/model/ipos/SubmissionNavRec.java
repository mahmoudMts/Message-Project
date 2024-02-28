package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * SubmissionNavRec
 */

@JsonTypeName("submissionNavRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SubmissionNavRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID submissionId;

  private TechnicianPortalBureauEnum bureau;

  private SubmissionStatuses status;

  private TypeOfTransactionType transactionType;

  private CorrectionTypeEnum correctionType;

  @Valid
  private List<@Valid SectionNavRec> opItems;

  @Valid
  private List<@Valid PremiumNavRec> aprpItems;

  public SubmissionNavRec submissionId(UUID submissionId) {
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

  public SubmissionNavRec bureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
    return this;
  }

  /**
   * Get bureau
   * @return bureau
  */
  @Valid 

  @JsonProperty("bureau")
  public TechnicianPortalBureauEnum getBureau() {
    return bureau;
  }

  public void setBureau(TechnicianPortalBureauEnum bureau) {
    this.bureau = bureau;
  }

  public SubmissionNavRec status(SubmissionStatuses status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 

  @JsonProperty("status")
  public SubmissionStatuses getStatus() {
    return status;
  }

  public void setStatus(SubmissionStatuses status) {
    this.status = status;
  }

  public SubmissionNavRec transactionType(TypeOfTransactionType transactionType) {
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

  public SubmissionNavRec correctionType(CorrectionTypeEnum correctionType) {
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

  public SubmissionNavRec opItems(List<@Valid SectionNavRec> opItems) {
    this.opItems = opItems;
    return this;
  }

  public SubmissionNavRec addOpItemsItem(SectionNavRec opItemsItem) {
    if (this.opItems == null) {
      this.opItems = new ArrayList<>();
    }
    this.opItems.add(opItemsItem);
    return this;
  }

  /**
   * Get opItems
   * @return opItems
  */
  @Valid 

  @JsonProperty("opItems")
  public List<@Valid SectionNavRec> getOpItems() {
    return opItems;
  }

  public void setOpItems(List<@Valid SectionNavRec> opItems) {
    this.opItems = opItems;
  }

  public SubmissionNavRec aprpItems(List<@Valid PremiumNavRec> aprpItems) {
    this.aprpItems = aprpItems;
    return this;
  }

  public SubmissionNavRec addAprpItemsItem(PremiumNavRec aprpItemsItem) {
    if (this.aprpItems == null) {
      this.aprpItems = new ArrayList<>();
    }
    this.aprpItems.add(aprpItemsItem);
    return this;
  }

  /**
   * Get aprpItems
   * @return aprpItems
  */
  @Valid 

  @JsonProperty("aprpItems")
  public List<@Valid PremiumNavRec> getAprpItems() {
    return aprpItems;
  }

  public void setAprpItems(List<@Valid PremiumNavRec> aprpItems) {
    this.aprpItems = aprpItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionNavRec submissionNavRec = (SubmissionNavRec) o;
    return Objects.equals(this.submissionId, submissionNavRec.submissionId) &&
        Objects.equals(this.bureau, submissionNavRec.bureau) &&
        Objects.equals(this.status, submissionNavRec.status) &&
        Objects.equals(this.transactionType, submissionNavRec.transactionType) &&
        Objects.equals(this.correctionType, submissionNavRec.correctionType) &&
        Objects.equals(this.opItems, submissionNavRec.opItems) &&
        Objects.equals(this.aprpItems, submissionNavRec.aprpItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, bureau, status, transactionType, correctionType, opItems, aprpItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionNavRec {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    bureau: ").append(toIndentedString(bureau)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
    sb.append("    opItems: ").append(toIndentedString(opItems)).append("\n");
    sb.append("    aprpItems: ").append(toIndentedString(aprpItems)).append("\n");
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

