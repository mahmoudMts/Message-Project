package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * PremiumNavRec
 */

@JsonTypeName("premiumNavRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumNavRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID sectionId;

  private Integer sectionNumber;

  private String riskCode;

  private String sectionTitle;

  private Integer premiumNumber;

  private String premiumNarrative;

  private TypeOfTransactionType transactionType;

  private String obsnd;

  private String ocsnd;

  private UUID replacesId;

  private CorrectionNarrativeEnum correctionNarrative;

  private Boolean recordValid;

  public PremiumNavRec premiumId(UUID premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * Get premiumId
   * @return premiumId
  */
  @Valid 

  @JsonProperty("premiumId")
  public UUID getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(UUID premiumId) {
    this.premiumId = premiumId;
  }

  public PremiumNavRec sectionId(UUID sectionId) {
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

  public PremiumNavRec sectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

  /**
   * Get sectionNumber
   * @return sectionNumber
  */
  

  @JsonProperty("sectionNumber")
  public Integer getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public PremiumNavRec riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * Get riskCode
   * @return riskCode
  */
  

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  public PremiumNavRec sectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
    return this;
  }

  /**
   * Get sectionTitle
   * @return sectionTitle
  */
  

  @JsonProperty("sectionTitle")
  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  public PremiumNavRec premiumNumber(Integer premiumNumber) {
    this.premiumNumber = premiumNumber;
    return this;
  }

  /**
   * Get premiumNumber
   * @return premiumNumber
  */
  

  @JsonProperty("premiumNumber")
  public Integer getPremiumNumber() {
    return premiumNumber;
  }

  public void setPremiumNumber(Integer premiumNumber) {
    this.premiumNumber = premiumNumber;
  }

  public PremiumNavRec premiumNarrative(String premiumNarrative) {
    this.premiumNarrative = premiumNarrative;
    return this;
  }

  /**
   * Get premiumNarrative
   * @return premiumNarrative
  */
  

  @JsonProperty("premiumNarrative")
  public String getPremiumNarrative() {
    return premiumNarrative;
  }

  public void setPremiumNarrative(String premiumNarrative) {
    this.premiumNarrative = premiumNarrative;
  }

  public PremiumNavRec transactionType(TypeOfTransactionType transactionType) {
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

  public PremiumNavRec obsnd(String obsnd) {
    this.obsnd = obsnd;
    return this;
  }

  /**
   * Get obsnd
   * @return obsnd
  */
  

  @JsonProperty("obsnd")
  public String getObsnd() {
    return obsnd;
  }

  public void setObsnd(String obsnd) {
    this.obsnd = obsnd;
  }

  public PremiumNavRec ocsnd(String ocsnd) {
    this.ocsnd = ocsnd;
    return this;
  }

  /**
   * Get ocsnd
   * @return ocsnd
  */
  

  @JsonProperty("ocsnd")
  public String getOcsnd() {
    return ocsnd;
  }

  public void setOcsnd(String ocsnd) {
    this.ocsnd = ocsnd;
  }

  public PremiumNavRec replacesId(UUID replacesId) {
    this.replacesId = replacesId;
    return this;
  }

  /**
   * Get replacesId
   * @return replacesId
  */
  @Valid 

  @JsonProperty("replacesId")
  public UUID getReplacesId() {
    return replacesId;
  }

  public void setReplacesId(UUID replacesId) {
    this.replacesId = replacesId;
  }

  public PremiumNavRec correctionNarrative(CorrectionNarrativeEnum correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
    return this;
  }

  /**
   * Get correctionNarrative
   * @return correctionNarrative
  */
  @Valid 

  @JsonProperty("correctionNarrative")
  public CorrectionNarrativeEnum getCorrectionNarrative() {
    return correctionNarrative;
  }

  public void setCorrectionNarrative(CorrectionNarrativeEnum correctionNarrative) {
    this.correctionNarrative = correctionNarrative;
  }

  public PremiumNavRec recordValid(Boolean recordValid) {
    this.recordValid = recordValid;
    return this;
  }

  /**
   * Get recordValid
   * @return recordValid
  */
  

  @JsonProperty("recordValid")
  public Boolean getRecordValid() {
    return recordValid;
  }

  public void setRecordValid(Boolean recordValid) {
    this.recordValid = recordValid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumNavRec premiumNavRec = (PremiumNavRec) o;
    return Objects.equals(this.premiumId, premiumNavRec.premiumId) &&
        Objects.equals(this.sectionId, premiumNavRec.sectionId) &&
        Objects.equals(this.sectionNumber, premiumNavRec.sectionNumber) &&
        Objects.equals(this.riskCode, premiumNavRec.riskCode) &&
        Objects.equals(this.sectionTitle, premiumNavRec.sectionTitle) &&
        Objects.equals(this.premiumNumber, premiumNavRec.premiumNumber) &&
        Objects.equals(this.premiumNarrative, premiumNavRec.premiumNarrative) &&
        Objects.equals(this.transactionType, premiumNavRec.transactionType) &&
        Objects.equals(this.obsnd, premiumNavRec.obsnd) &&
        Objects.equals(this.ocsnd, premiumNavRec.ocsnd) &&
        Objects.equals(this.replacesId, premiumNavRec.replacesId) &&
        Objects.equals(this.correctionNarrative, premiumNavRec.correctionNarrative) &&
        Objects.equals(this.recordValid, premiumNavRec.recordValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, sectionId, sectionNumber, riskCode, sectionTitle, premiumNumber, premiumNarrative, transactionType, obsnd, ocsnd, replacesId, correctionNarrative, recordValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumNavRec {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    sectionTitle: ").append(toIndentedString(sectionTitle)).append("\n");
    sb.append("    premiumNumber: ").append(toIndentedString(premiumNumber)).append("\n");
    sb.append("    premiumNarrative: ").append(toIndentedString(premiumNarrative)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    ocsnd: ").append(toIndentedString(ocsnd)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
    sb.append("    correctionNarrative: ").append(toIndentedString(correctionNarrative)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
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

