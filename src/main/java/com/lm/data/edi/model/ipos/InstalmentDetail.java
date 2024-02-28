package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * InstalmentDetail
 */

@JsonTypeName("instalmentDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class InstalmentDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID instalmentId;

  private UUID dtInstalmentId;

  private Integer number;

  private LocalDate dueDate;

  private BigDecimal netPremium;

  private SettlementStatusEnum settlementStatus;

  /**
   * Gets or Sets settled
   */
  public enum SettledEnum {
    Y("Y"),
    
    N("N");

    private String value;

    SettledEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SettledEnum fromValue(String value) {
      for (SettledEnum b : SettledEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SettledEnum settled;

  private UUID settlementId;

  private OffsetDateTime actualPaymentDate;

  public InstalmentDetail instalmentId(UUID instalmentId) {
    this.instalmentId = instalmentId;
    return this;
  }

  /**
   * Get instalmentId
   * @return instalmentId
  */
  @Valid 

  @JsonProperty("instalmentId")
  public UUID getInstalmentId() {
    return instalmentId;
  }

  public void setInstalmentId(UUID instalmentId) {
    this.instalmentId = instalmentId;
  }

  public InstalmentDetail dtInstalmentId(UUID dtInstalmentId) {
    this.dtInstalmentId = dtInstalmentId;
    return this;
  }

  /**
   * Instalment ID of the direct premium instalment
   * @return dtInstalmentId
  */
  @Valid 

  @JsonProperty("dtInstalmentId")
  public UUID getDtInstalmentId() {
    return dtInstalmentId;
  }

  public void setDtInstalmentId(UUID dtInstalmentId) {
    this.dtInstalmentId = dtInstalmentId;
  }

  public InstalmentDetail number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  

  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public InstalmentDetail dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  */
  @Valid 

  @JsonProperty("dueDate")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public InstalmentDetail netPremium(BigDecimal netPremium) {
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

  public InstalmentDetail settlementStatus(SettlementStatusEnum settlementStatus) {
    this.settlementStatus = settlementStatus;
    return this;
  }

  /**
   * Get settlementStatus
   * @return settlementStatus
  */
  @Valid 

  @JsonProperty("settlementStatus")
  public SettlementStatusEnum getSettlementStatus() {
    return settlementStatus;
  }

  public void setSettlementStatus(SettlementStatusEnum settlementStatus) {
    this.settlementStatus = settlementStatus;
  }

  public InstalmentDetail settled(SettledEnum settled) {
    this.settled = settled;
    return this;
  }

  /**
   * Get settled
   * @return settled
  */
  

  @JsonProperty("settled")
  public SettledEnum getSettled() {
    return settled;
  }

  public void setSettled(SettledEnum settled) {
    this.settled = settled;
  }

  public InstalmentDetail settlementId(UUID settlementId) {
    this.settlementId = settlementId;
    return this;
  }

  /**
   * Get settlementId
   * @return settlementId
  */
  @Valid 

  @JsonProperty("settlementId")
  public UUID getSettlementId() {
    return settlementId;
  }

  public void setSettlementId(UUID settlementId) {
    this.settlementId = settlementId;
  }

  public InstalmentDetail actualPaymentDate(OffsetDateTime actualPaymentDate) {
    this.actualPaymentDate = actualPaymentDate;
    return this;
  }

  /**
   * actual payment date of the instalments
   * @return actualPaymentDate
  */
  @Valid 

  @JsonProperty("actualPaymentDate")
  public OffsetDateTime getActualPaymentDate() {
    return actualPaymentDate;
  }

  public void setActualPaymentDate(OffsetDateTime actualPaymentDate) {
    this.actualPaymentDate = actualPaymentDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstalmentDetail instalmentDetail = (InstalmentDetail) o;
    return Objects.equals(this.instalmentId, instalmentDetail.instalmentId) &&
        Objects.equals(this.dtInstalmentId, instalmentDetail.dtInstalmentId) &&
        Objects.equals(this.number, instalmentDetail.number) &&
        Objects.equals(this.dueDate, instalmentDetail.dueDate) &&
        Objects.equals(this.netPremium, instalmentDetail.netPremium) &&
        Objects.equals(this.settlementStatus, instalmentDetail.settlementStatus) &&
        Objects.equals(this.settled, instalmentDetail.settled) &&
        Objects.equals(this.settlementId, instalmentDetail.settlementId) &&
        Objects.equals(this.actualPaymentDate, instalmentDetail.actualPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instalmentId, dtInstalmentId, number, dueDate, netPremium, settlementStatus, settled, settlementId, actualPaymentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstalmentDetail {\n");
    sb.append("    instalmentId: ").append(toIndentedString(instalmentId)).append("\n");
    sb.append("    dtInstalmentId: ").append(toIndentedString(dtInstalmentId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    netPremium: ").append(toIndentedString(netPremium)).append("\n");
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    actualPaymentDate: ").append(toIndentedString(actualPaymentDate)).append("\n");
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

