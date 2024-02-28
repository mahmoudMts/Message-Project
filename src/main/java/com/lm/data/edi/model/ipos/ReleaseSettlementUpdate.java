package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;


/**
 * ReleaseSettlementUpdate
 */

@JsonTypeName("releaseSettlementUpdate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class ReleaseSettlementUpdate implements Serializable {

  private static final long serialVersionUID = 1L;

  private ReleasedForSettlementEnum releasedForSettlement;

  private String brokerRef1;

  private String brokerRef2;

  private BigDecimal exchangeRate;

  private String brokerContact;

  private BigDecimal netPremium;

  private String releaseByUserName;

  
  private OffsetDateTime releasedOnDate;

  
  private LocalDate releaseDate;

  public ReleaseSettlementUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReleaseSettlementUpdate(ReleasedForSettlementEnum releasedForSettlement, OffsetDateTime releasedOnDate) {
    this.releasedForSettlement = releasedForSettlement;
    this.releasedOnDate = releasedOnDate;
  }

  public ReleaseSettlementUpdate releasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
    return this;
  }

  /**
   * Get releasedForSettlement
   * @return releasedForSettlement
  */
  @NotNull @Valid 

  @JsonProperty("releasedForSettlement")
  public ReleasedForSettlementEnum getReleasedForSettlement() {
    return releasedForSettlement;
  }

  public void setReleasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
  }

  public ReleaseSettlementUpdate brokerRef1(String brokerRef1) {
    this.brokerRef1 = brokerRef1;
    return this;
  }

  /**
   * Get brokerRef1
   * @return brokerRef1
  */
  

  @JsonProperty("brokerRef1")
  public String getBrokerRef1() {
    return brokerRef1;
  }

  public void setBrokerRef1(String brokerRef1) {
    this.brokerRef1 = brokerRef1;
  }

  public ReleaseSettlementUpdate brokerRef2(String brokerRef2) {
    this.brokerRef2 = brokerRef2;
    return this;
  }

  /**
   * Get brokerRef2
   * @return brokerRef2
  */
  

  @JsonProperty("brokerRef2")
  public String getBrokerRef2() {
    return brokerRef2;
  }

  public void setBrokerRef2(String brokerRef2) {
    this.brokerRef2 = brokerRef2;
  }

  public ReleaseSettlementUpdate exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Exchange rate used for the calculation
   * @return exchangeRate
  */
  @Valid 

  @JsonProperty("exchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public ReleaseSettlementUpdate brokerContact(String brokerContact) {
    this.brokerContact = brokerContact;
    return this;
  }

  /**
   * Get brokerContact
   * @return brokerContact
  */
  

  @JsonProperty("brokerContact")
  public String getBrokerContact() {
    return brokerContact;
  }

  public void setBrokerContact(String brokerContact) {
    this.brokerContact = brokerContact;
  }

  public ReleaseSettlementUpdate netPremium(BigDecimal netPremium) {
    this.netPremium = netPremium;
    return this;
  }

  /**
   * Get netPremium
   * @return netPremium
  */
  @Valid 

  @JsonProperty("netPremium")
  public BigDecimal getNetPremium() {
    return netPremium;
  }

  public void setNetPremium(BigDecimal netPremium) {
    this.netPremium = netPremium;
  }

  public ReleaseSettlementUpdate releaseByUserName(String releaseByUserName) {
    this.releaseByUserName = releaseByUserName;
    return this;
  }

  /**
   * Get releaseByUserName
   * @return releaseByUserName
  */
  

  @JsonProperty("releaseByUserName")
  public String getReleaseByUserName() {
    return releaseByUserName;
  }

  public void setReleaseByUserName(String releaseByUserName) {
    this.releaseByUserName = releaseByUserName;
  }

  public ReleaseSettlementUpdate releasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
    return this;
  }

  /**
   * Get releasedOnDate
   * @return releasedOnDate
  */
  @NotNull @Valid 

  @JsonProperty("releasedOnDate")
  public OffsetDateTime getReleasedOnDate() {
    return releasedOnDate;
  }

  public void setReleasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
  }

  public ReleaseSettlementUpdate releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
  */
  @Valid 

  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseSettlementUpdate releaseSettlementUpdate = (ReleaseSettlementUpdate) o;
    return Objects.equals(this.releasedForSettlement, releaseSettlementUpdate.releasedForSettlement) &&
        Objects.equals(this.brokerRef1, releaseSettlementUpdate.brokerRef1) &&
        Objects.equals(this.brokerRef2, releaseSettlementUpdate.brokerRef2) &&
        Objects.equals(this.exchangeRate, releaseSettlementUpdate.exchangeRate) &&
        Objects.equals(this.brokerContact, releaseSettlementUpdate.brokerContact) &&
        Objects.equals(this.netPremium, releaseSettlementUpdate.netPremium) &&
        Objects.equals(this.releaseByUserName, releaseSettlementUpdate.releaseByUserName) &&
        Objects.equals(this.releasedOnDate, releaseSettlementUpdate.releasedOnDate) &&
        Objects.equals(this.releaseDate, releaseSettlementUpdate.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releasedForSettlement, brokerRef1, brokerRef2, exchangeRate, brokerContact, netPremium, releaseByUserName, releasedOnDate, releaseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseSettlementUpdate {\n");
    sb.append("    releasedForSettlement: ").append(toIndentedString(releasedForSettlement)).append("\n");
    sb.append("    brokerRef1: ").append(toIndentedString(brokerRef1)).append("\n");
    sb.append("    brokerRef2: ").append(toIndentedString(brokerRef2)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    brokerContact: ").append(toIndentedString(brokerContact)).append("\n");
    sb.append("    netPremium: ").append(toIndentedString(netPremium)).append("\n");
    sb.append("    releaseByUserName: ").append(toIndentedString(releaseByUserName)).append("\n");
    sb.append("    releasedOnDate: ").append(toIndentedString(releasedOnDate)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
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

