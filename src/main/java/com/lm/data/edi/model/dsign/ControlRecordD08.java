package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.*;

/**
 * Control Record - Amount Totals for Data Type
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class ControlRecordD08   {


  @JsonProperty("signingDate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate signingDate ;

  @JsonProperty("companyCode")
  @Pattern(regexp="[A-Z][0-9]{2}")
  private String companyCode ;

  @JsonProperty("settlementDate")

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate settlementDate ;

  @JsonProperty("centralSettlementReserveReleaseAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String centralSettlementReserveReleaseAmountTotal;

  @JsonProperty("centralSettlementTTYStatementAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String centralSettlementTTYStatementAmountTotal ;

  @JsonProperty("centralSettlementClaimAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String centralSettlementClaimAmountTotal;

  @JsonProperty("nonCentralSettlementPremiumAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String nonCentralSettlementPremiumAmountTotal ;

  @JsonProperty("nonCentralSettlementReserveReleaseAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String nonCentralSettlementReserveReleaseAmountTotal ;

  @JsonProperty("nonCentralSettlementTTYStatementAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String nonCentralSettlementTTYStatementAmountTotal ;

  @JsonProperty("nonCentralSettlementClaimAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String nonCentralSettlementClaimAmountTotal ;

  @JsonProperty("deferredAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String deferredAmountTotal ;

  @JsonProperty("reserveCreditAmountTotal")
  @Pattern(regexp="-?[0-9]+(?:[.][0-9]{2})?")
  private String reserveCreditAmountTotal ;


  @JsonProperty("settlementCurrencyCodeISO")
  private SettlementCurrencyCodeISO settlementCurrencyCodeISO ;

  @JsonProperty("actualSigningAndClaimsDataAray")
  @Valid
  private List<ActualSigningAndClaimsDataAray> actualSigningAndClaimsDataAray ;

  public enum SettlementCurrencyCodeISO {

    GBP("GBP"),
    USD("USD"),
    CAD("CAD"),
    JPY("JPY"),
    AUD("AUD"),
    EUR("EUR"),
    SEK("SEK"),
    NOK("NOK"),
    HKD("HKD"),
    DKK("DKK"),
    CHF("CHF"),
    ZAR("ZAR"),
    SGD("SGD"),
    NZD("NZD");
    private final String value;
    private final static Map<String, SettlementCurrencyCodeISO> CONSTANTS = new HashMap<String, SettlementCurrencyCodeISO>();

    static {
      for (ControlRecordD08 .SettlementCurrencyCodeISO c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private SettlementCurrencyCodeISO(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return this.value;
    }

    @JsonValue
    public String value() {
      return this.value;
    }

    @JsonCreator
    public static ControlRecordD08 .SettlementCurrencyCodeISO fromValue(String value) {
      ControlRecordD08 .SettlementCurrencyCodeISO constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }
}
