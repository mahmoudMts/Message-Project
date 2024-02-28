package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * Reinstatement
 */

@JsonTypeName("reinstatement")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Reinstatement implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID reinstatementId;

  private UUID sectionId;

  private Integer noOfReinstatement;

  private BigDecimal brokerage;

  private BigDecimal amountInCCyOfLoss;

  private String narrative;

  private BigDecimal percentage;

  private String reinstatementFree;

  public Reinstatement reinstatementId(UUID reinstatementId) {
    this.reinstatementId = reinstatementId;
    return this;
  }

  /**
   * Get reinstatementId
   * @return reinstatementId
  */
  @Valid 

  @JsonProperty("reinstatementId")
  public UUID getReinstatementId() {
    return reinstatementId;
  }

  public void setReinstatementId(UUID reinstatementId) {
    this.reinstatementId = reinstatementId;
  }

  public Reinstatement sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Get sectionId
   * @return sectionId
  */
  @Valid 

  @JsonProperty("sectionId")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public Reinstatement noOfReinstatement(Integer noOfReinstatement) {
    this.noOfReinstatement = noOfReinstatement;
    return this;
  }

  /**
   * Get noOfReinstatement
   * @return noOfReinstatement
  */
  

  @JsonProperty("noOfReinstatement")
  public Integer getNoOfReinstatement() {
    return noOfReinstatement;
  }

  public void setNoOfReinstatement(Integer noOfReinstatement) {
    this.noOfReinstatement = noOfReinstatement;
  }

  public Reinstatement brokerage(BigDecimal brokerage) {
    this.brokerage = brokerage;
    return this;
  }

  /**
   * Get brokerage
   * @return brokerage
  */
  @Valid 

  @JsonProperty("brokerage")
  public BigDecimal getBrokerage() {
    return brokerage;
  }

  public void setBrokerage(BigDecimal brokerage) {
    this.brokerage = brokerage;
  }

  public Reinstatement amountInCCyOfLoss(BigDecimal amountInCCyOfLoss) {
    this.amountInCCyOfLoss = amountInCCyOfLoss;
    return this;
  }

  /**
   * Get amountInCCyOfLoss
   * @return amountInCCyOfLoss
  */
  @Valid 

  @JsonProperty("amountInCCyOfLoss")
  public BigDecimal getAmountInCCyOfLoss() {
    return amountInCCyOfLoss;
  }

  public void setAmountInCCyOfLoss(BigDecimal amountInCCyOfLoss) {
    this.amountInCCyOfLoss = amountInCCyOfLoss;
  }

  public Reinstatement narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

  /**
   * Get narrative
   * @return narrative
  */
  

  @JsonProperty("narrative")
  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  public Reinstatement percentage(BigDecimal percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Get percentage
   * @return percentage
  */
  @Valid 

  @JsonProperty("percentage")
  public BigDecimal getPercentage() {
    return percentage;
  }

  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }

  public Reinstatement reinstatementFree(String reinstatementFree) {
    this.reinstatementFree = reinstatementFree;
    return this;
  }

  /**
   * Get reinstatementFree
   * @return reinstatementFree
  */
  

  @JsonProperty("reinstatementFree")
  public String getReinstatementFree() {
    return reinstatementFree;
  }

  public void setReinstatementFree(String reinstatementFree) {
    this.reinstatementFree = reinstatementFree;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reinstatement reinstatement = (Reinstatement) o;
    return Objects.equals(this.reinstatementId, reinstatement.reinstatementId) &&
        Objects.equals(this.sectionId, reinstatement.sectionId) &&
        Objects.equals(this.noOfReinstatement, reinstatement.noOfReinstatement) &&
        Objects.equals(this.brokerage, reinstatement.brokerage) &&
        Objects.equals(this.amountInCCyOfLoss, reinstatement.amountInCCyOfLoss) &&
        Objects.equals(this.narrative, reinstatement.narrative) &&
        Objects.equals(this.percentage, reinstatement.percentage) &&
        Objects.equals(this.reinstatementFree, reinstatement.reinstatementFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reinstatementId, sectionId, noOfReinstatement, brokerage, amountInCCyOfLoss, narrative, percentage, reinstatementFree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reinstatement {\n");
    sb.append("    reinstatementId: ").append(toIndentedString(reinstatementId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    noOfReinstatement: ").append(toIndentedString(noOfReinstatement)).append("\n");
    sb.append("    brokerage: ").append(toIndentedString(brokerage)).append("\n");
    sb.append("    amountInCCyOfLoss: ").append(toIndentedString(amountInCCyOfLoss)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    reinstatementFree: ").append(toIndentedString(reinstatementFree)).append("\n");
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

