package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * PremiumGetRec
 */

@JsonTypeName("premiumGetRec")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class PremiumGetRec implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID premiumId;

  private UUID sectionId;

  private String riskCode;

  private Integer premiumNumber;

  private PremiumSource premiumSource = PremiumSource.TECHNICIANPORTAL;

  private UUID dtPremiumId;

  private TypeOfTransactionType transactionType;

  private String premiumNarrative;

  private Slip slip;

  private Boolean eeaRiskFlag;

  private BigDecimal autoRIComission;

  private String brokerRef1;

  private String brokerRef2;

  private String periodDescription;

  private TypeOfCountry splitsCountry;

  private TypeOfCountry countryOfOrigin;

  private TypeOfCountrySubDivision stateCode;

  private TypeOfDTICode dtiCode;

  private TypeOfVatCode vatCode;

  private TypeOfEntryCode entryCode;

  private TypeOfQualCatCode qualCatCode;

  private String totCode;

  
  private LocalDate settlementDueDate;

  
  private LocalDate monitoringDate;

  
  private LocalDate plannedSettlementDate;

  private SumInsuredMax sumInsuredMax;

  private TypeOfCurrency originalCurrency;

  private BigDecimal bureauLinePercent;

  private BigDecimal grossPremium;

  private BigDecimal grossPremiumPercent;

  private BigDecimal prem100pcnt;

  private Deductions deductions;

  private UkIPT ukIPT;

  private OverseasIPT overseasIPT;

  private BigDecimal exchangeRate;

  private String exchangeRateNarrative;

  private TypeOfCurrency settlementCurrency;

  private BigDecimal premiumNet;

  private War war;

  private Fil fil;

  private TypeOfTrustFundCode trustFundCode;

  private TypeOfTrustFundCode nonUsTrustFundCode;

  private Delink delink;

  private Boolean chargesIndicator;

  private AccountingTypeEnum accountingType;

  private Boolean brexitFlag;

  private LpanTypeEnum lpanType;

  private DepositPremium depositPremium;

  private String nonStandardDeductNarr;

  private String otherDetails;

  private GrossPremSplit grossPremSplit;

  private FireBrigade fireBrigade;

  private Boolean coreinsInd;

  private String obsnd;

  private String ocsnd;

  private UUID originalSectionId;

  private UUID originalPremiumId;

  private TypeOfFilCode opFilCode1;

  private PeriodWithNarrative aprp;

  private PremiumPeriod revisedPolPeriod;

  private PremiumPeriod revisedPremPeriod;

  private PremiumDetailRevisedSlip revisedSlip;

  private SumInsuredMax revisedSumInsuredMax;

  private BigDecimal prevPaidPremAmt;

  private BigDecimal actualPremDueAmt;

  
  private LocalDate adjustedPremDueDate;

  private BigDecimal actualPremIncomeAmt;

  private BigDecimal adjustedPremAmt;

  private BigDecimal adjustmentRate;

  
  private LocalDate adjustedAtDate;

  private String adjustmentNarrative;

  private BigDecimal totalMinPremAmt;

  private MaeEnum mae;

  private Boolean finalAdjustmentInd;

  private Boolean amendedCarrierRef;

  private Boolean partialMarketInd;

  private UUID partialMarketId;

  @Valid
  private List<@Valid InstalmentDetail> instalmentDetails;

  @Valid
  private List<@Valid TaxDetail> taxDetails;

  @Valid
  private List<@Valid AdditionalTaxDetails> additionalTaxDetails;

  private ComplexDeduction complexDeduction;

  private LegislationChild legislationChild;

  private LmChannelEnum channel;

  private EcReporting ecReporting;

  private UsReporting usReporting;

  private OffsetDateTime createdDate;

  private OffsetDateTime lastUpdatedDate;

  private RecordStatusCodeEnum recordStatusCode;

  
  private OffsetDateTime recordStatusDate;

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

  private CorrectionTypeEnum correctionType;

  private CorrectionNarrativeEnum correctionNarrative;

  private PortalWorkflowStatus portalWorkflowStatus = PortalWorkflowStatus.IN_PROGRESS;

  private UUID replacesId;

  private UUID replacedById;

  private UUID signingId;

  private String bsnd;

  private String csnd;

  private String csn;

  
  private OffsetDateTime csd;

  private Integer csnVersion;

  private String bsn;

  
  private OffsetDateTime bsd;

  private Integer bsnVersion;

  private String signingMessage;

  private String signedByUser;

  private String signedByUserFullName;

  private String signedByUserEmail;

  private String directPremiumBsnd;

  private String directPremiumCsnd;

  private Boolean recordValid;

  private Boolean filTypeMandatory;

  private UsSurplusLineDetails usSurplusLineDetails;

  private NaicDetails naicDetails;

  
  private LocalDate contractPolicyPeriodFrom;

  private Integer yearOfAccount;

  private VatDetails vatDetails;

  public PremiumGetRec premiumId(UUID premiumId) {
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

  public PremiumGetRec sectionId(UUID sectionId) {
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

  public PremiumGetRec riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * The risk code from the linked section record. For information only, not to be saved against the premium record
   * @return riskCode
  */
  

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  public PremiumGetRec premiumNumber(Integer premiumNumber) {
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

  public PremiumGetRec premiumSource(PremiumSource premiumSource) {
    this.premiumSource = premiumSource;
    return this;
  }

  /**
   * Get premiumSource
   * @return premiumSource
  */
  @Valid 

  @JsonProperty("premiumSource")
  public PremiumSource getPremiumSource() {
    return premiumSource;
  }

  public void setPremiumSource(PremiumSource premiumSource) {
    this.premiumSource = premiumSource;
  }

  public PremiumGetRec dtPremiumId(UUID dtPremiumId) {
    this.dtPremiumId = dtPremiumId;
    return this;
  }

  /**
   * UUID of the direct premium
   * @return dtPremiumId
  */
  @Valid 

  @JsonProperty("dtPremiumId")
  public UUID getDtPremiumId() {
    return dtPremiumId;
  }

  public void setDtPremiumId(UUID dtPremiumId) {
    this.dtPremiumId = dtPremiumId;
  }

  public PremiumGetRec transactionType(TypeOfTransactionType transactionType) {
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

  public PremiumGetRec premiumNarrative(String premiumNarrative) {
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

  public PremiumGetRec slip(Slip slip) {
    this.slip = slip;
    return this;
  }

  /**
   * Get slip
   * @return slip
  */
  @Valid 

  @JsonProperty("slip")
  public Slip getSlip() {
    return slip;
  }

  public void setSlip(Slip slip) {
    this.slip = slip;
  }

  public PremiumGetRec eeaRiskFlag(Boolean eeaRiskFlag) {
    this.eeaRiskFlag = eeaRiskFlag;
    return this;
  }

  /**
   * Get eeaRiskFlag
   * @return eeaRiskFlag
  */
  

  @JsonProperty("eeaRiskFlag")
  public Boolean getEeaRiskFlag() {
    return eeaRiskFlag;
  }

  public void setEeaRiskFlag(Boolean eeaRiskFlag) {
    this.eeaRiskFlag = eeaRiskFlag;
  }

  public PremiumGetRec autoRIComission(BigDecimal autoRIComission) {
    this.autoRIComission = autoRIComission;
    return this;
  }

  /**
   * Value of the commission applied at the time of creation of premium
   * @return autoRIComission
  */
  @Valid 

  @JsonProperty("autoRIComission")
  public BigDecimal getAutoRIComission() {
    return autoRIComission;
  }

  public void setAutoRIComission(BigDecimal autoRIComission) {
    this.autoRIComission = autoRIComission;
  }

  public PremiumGetRec brokerRef1(String brokerRef1) {
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

  public PremiumGetRec brokerRef2(String brokerRef2) {
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

  public PremiumGetRec periodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
    return this;
  }

  /**
   * Get periodDescription
   * @return periodDescription
  */
  

  @JsonProperty("periodDescription")
  public String getPeriodDescription() {
    return periodDescription;
  }

  public void setPeriodDescription(String periodDescription) {
    this.periodDescription = periodDescription;
  }

  public PremiumGetRec splitsCountry(TypeOfCountry splitsCountry) {
    this.splitsCountry = splitsCountry;
    return this;
  }

  /**
   * Get splitsCountry
   * @return splitsCountry
  */
  @Valid 

  @JsonProperty("splitsCountry")
  public TypeOfCountry getSplitsCountry() {
    return splitsCountry;
  }

  public void setSplitsCountry(TypeOfCountry splitsCountry) {
    this.splitsCountry = splitsCountry;
  }

  public PremiumGetRec countryOfOrigin(TypeOfCountry countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

  /**
   * Get countryOfOrigin
   * @return countryOfOrigin
  */
  @Valid 

  @JsonProperty("countryOfOrigin")
  public TypeOfCountry getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(TypeOfCountry countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public PremiumGetRec stateCode(TypeOfCountrySubDivision stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  */
  @Valid 

  @JsonProperty("stateCode")
  public TypeOfCountrySubDivision getStateCode() {
    return stateCode;
  }

  public void setStateCode(TypeOfCountrySubDivision stateCode) {
    this.stateCode = stateCode;
  }

  public PremiumGetRec dtiCode(TypeOfDTICode dtiCode) {
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

  public PremiumGetRec vatCode(TypeOfVatCode vatCode) {
    this.vatCode = vatCode;
    return this;
  }

  /**
   * Get vatCode
   * @return vatCode
  */
  @Valid 

  @JsonProperty("vatCode")
  public TypeOfVatCode getVatCode() {
    return vatCode;
  }

  public void setVatCode(TypeOfVatCode vatCode) {
    this.vatCode = vatCode;
  }

  public PremiumGetRec entryCode(TypeOfEntryCode entryCode) {
    this.entryCode = entryCode;
    return this;
  }

  /**
   * Get entryCode
   * @return entryCode
  */
  @Valid 

  @JsonProperty("entryCode")
  public TypeOfEntryCode getEntryCode() {
    return entryCode;
  }

  public void setEntryCode(TypeOfEntryCode entryCode) {
    this.entryCode = entryCode;
  }

  public PremiumGetRec qualCatCode(TypeOfQualCatCode qualCatCode) {
    this.qualCatCode = qualCatCode;
    return this;
  }

  /**
   * Get qualCatCode
   * @return qualCatCode
  */
  @Valid 

  @JsonProperty("qualCatCode")
  public TypeOfQualCatCode getQualCatCode() {
    return qualCatCode;
  }

  public void setQualCatCode(TypeOfQualCatCode qualCatCode) {
    this.qualCatCode = qualCatCode;
  }

  public PremiumGetRec totCode(String totCode) {
    this.totCode = totCode;
    return this;
  }

  /**
   * Get totCode
   * @return totCode
  */
  

  @JsonProperty("totCode")
  public String getTotCode() {
    return totCode;
  }

  public void setTotCode(String totCode) {
    this.totCode = totCode;
  }

  public PremiumGetRec settlementDueDate(LocalDate settlementDueDate) {
    this.settlementDueDate = settlementDueDate;
    return this;
  }

  /**
   * Get settlementDueDate
   * @return settlementDueDate
  */
  @Valid 

  @JsonProperty("settlementDueDate")
  public LocalDate getSettlementDueDate() {
    return settlementDueDate;
  }

  public void setSettlementDueDate(LocalDate settlementDueDate) {
    this.settlementDueDate = settlementDueDate;
  }

  public PremiumGetRec monitoringDate(LocalDate monitoringDate) {
    this.monitoringDate = monitoringDate;
    return this;
  }

  /**
   * Get monitoringDate
   * @return monitoringDate
  */
  @Valid 

  @JsonProperty("monitoringDate")
  public LocalDate getMonitoringDate() {
    return monitoringDate;
  }

  public void setMonitoringDate(LocalDate monitoringDate) {
    this.monitoringDate = monitoringDate;
  }

  public PremiumGetRec plannedSettlementDate(LocalDate plannedSettlementDate) {
    this.plannedSettlementDate = plannedSettlementDate;
    return this;
  }

  /**
   * Get plannedSettlementDate
   * @return plannedSettlementDate
  */
  @Valid 

  @JsonProperty("plannedSettlementDate")
  public LocalDate getPlannedSettlementDate() {
    return plannedSettlementDate;
  }

  public void setPlannedSettlementDate(LocalDate plannedSettlementDate) {
    this.plannedSettlementDate = plannedSettlementDate;
  }

  public PremiumGetRec sumInsuredMax(SumInsuredMax sumInsuredMax) {
    this.sumInsuredMax = sumInsuredMax;
    return this;
  }

  /**
   * Get sumInsuredMax
   * @return sumInsuredMax
  */
  @Valid 

  @JsonProperty("sumInsuredMax")
  public SumInsuredMax getSumInsuredMax() {
    return sumInsuredMax;
  }

  public void setSumInsuredMax(SumInsuredMax sumInsuredMax) {
    this.sumInsuredMax = sumInsuredMax;
  }

  public PremiumGetRec originalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
    return this;
  }

  /**
   * Get originalCurrency
   * @return originalCurrency
  */
  @Valid 

  @JsonProperty("originalCurrency")
  public TypeOfCurrency getOriginalCurrency() {
    return originalCurrency;
  }

  public void setOriginalCurrency(TypeOfCurrency originalCurrency) {
    this.originalCurrency = originalCurrency;
  }

  public PremiumGetRec bureauLinePercent(BigDecimal bureauLinePercent) {
    this.bureauLinePercent = bureauLinePercent;
    return this;
  }

  /**
   * Get bureauLinePercent
   * @return bureauLinePercent
  */
  @Valid 

  @JsonProperty("bureauLinePercent")
  public BigDecimal getBureauLinePercent() {
    return bureauLinePercent;
  }

  public void setBureauLinePercent(BigDecimal bureauLinePercent) {
    this.bureauLinePercent = bureauLinePercent;
  }

  public PremiumGetRec grossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
    return this;
  }

  /**
   * Get grossPremium
   * @return grossPremium
  */
  @Valid 

  @JsonProperty("grossPremium")
  public BigDecimal getGrossPremium() {
    return grossPremium;
  }

  public void setGrossPremium(BigDecimal grossPremium) {
    this.grossPremium = grossPremium;
  }

  public PremiumGetRec grossPremiumPercent(BigDecimal grossPremiumPercent) {
    this.grossPremiumPercent = grossPremiumPercent;
    return this;
  }

  /**
   * Get grossPremiumPercent
   * @return grossPremiumPercent
  */
  @Valid 

  @JsonProperty("grossPremiumPercent")
  public BigDecimal getGrossPremiumPercent() {
    return grossPremiumPercent;
  }

  public void setGrossPremiumPercent(BigDecimal grossPremiumPercent) {
    this.grossPremiumPercent = grossPremiumPercent;
  }

  public PremiumGetRec prem100pcnt(BigDecimal prem100pcnt) {
    this.prem100pcnt = prem100pcnt;
    return this;
  }

  /**
   * Get prem100pcnt
   * @return prem100pcnt
  */
  @Valid 

  @JsonProperty("prem100pcnt")
  public BigDecimal getPrem100pcnt() {
    return prem100pcnt;
  }

  public void setPrem100pcnt(BigDecimal prem100pcnt) {
    this.prem100pcnt = prem100pcnt;
  }

  public PremiumGetRec deductions(Deductions deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * Get deductions
   * @return deductions
  */
  @Valid 

  @JsonProperty("deductions")
  public Deductions getDeductions() {
    return deductions;
  }

  public void setDeductions(Deductions deductions) {
    this.deductions = deductions;
  }

  public PremiumGetRec ukIPT(UkIPT ukIPT) {
    this.ukIPT = ukIPT;
    return this;
  }

  /**
   * Get ukIPT
   * @return ukIPT
  */
  @Valid 

  @JsonProperty("ukIPT")
  public UkIPT getUkIPT() {
    return ukIPT;
  }

  public void setUkIPT(UkIPT ukIPT) {
    this.ukIPT = ukIPT;
  }

  public PremiumGetRec overseasIPT(OverseasIPT overseasIPT) {
    this.overseasIPT = overseasIPT;
    return this;
  }

  /**
   * Get overseasIPT
   * @return overseasIPT
  */
  @Valid 

  @JsonProperty("overseasIPT")
  public OverseasIPT getOverseasIPT() {
    return overseasIPT;
  }

  public void setOverseasIPT(OverseasIPT overseasIPT) {
    this.overseasIPT = overseasIPT;
  }

  public PremiumGetRec exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Get exchangeRate
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

  public PremiumGetRec exchangeRateNarrative(String exchangeRateNarrative) {
    this.exchangeRateNarrative = exchangeRateNarrative;
    return this;
  }

  /**
   * Get exchangeRateNarrative
   * @return exchangeRateNarrative
  */
  

  @JsonProperty("exchangeRateNarrative")
  public String getExchangeRateNarrative() {
    return exchangeRateNarrative;
  }

  public void setExchangeRateNarrative(String exchangeRateNarrative) {
    this.exchangeRateNarrative = exchangeRateNarrative;
  }

  public PremiumGetRec settlementCurrency(TypeOfCurrency settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
    return this;
  }

  /**
   * Get settlementCurrency
   * @return settlementCurrency
  */
  @Valid 

  @JsonProperty("settlementCurrency")
  public TypeOfCurrency getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(TypeOfCurrency settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }

  public PremiumGetRec premiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
    return this;
  }

  /**
   * Get premiumNet
   * @return premiumNet
  */
  @Valid 

  @JsonProperty("premiumNet")
  public BigDecimal getPremiumNet() {
    return premiumNet;
  }

  public void setPremiumNet(BigDecimal premiumNet) {
    this.premiumNet = premiumNet;
  }

  public PremiumGetRec war(War war) {
    this.war = war;
    return this;
  }

  /**
   * Get war
   * @return war
  */
  @Valid 

  @JsonProperty("war")
  public War getWar() {
    return war;
  }

  public void setWar(War war) {
    this.war = war;
  }

  public PremiumGetRec fil(Fil fil) {
    this.fil = fil;
    return this;
  }

  /**
   * Get fil
   * @return fil
  */
  @Valid 

  @JsonProperty("fil")
  public Fil getFil() {
    return fil;
  }

  public void setFil(Fil fil) {
    this.fil = fil;
  }

  public PremiumGetRec trustFundCode(TypeOfTrustFundCode trustFundCode) {
    this.trustFundCode = trustFundCode;
    return this;
  }

  /**
   * Get trustFundCode
   * @return trustFundCode
  */
  @Valid 

  @JsonProperty("trustFundCode")
  public TypeOfTrustFundCode getTrustFundCode() {
    return trustFundCode;
  }

  public void setTrustFundCode(TypeOfTrustFundCode trustFundCode) {
    this.trustFundCode = trustFundCode;
  }

  public PremiumGetRec nonUsTrustFundCode(TypeOfTrustFundCode nonUsTrustFundCode) {
    this.nonUsTrustFundCode = nonUsTrustFundCode;
    return this;
  }

  /**
   * Get nonUsTrustFundCode
   * @return nonUsTrustFundCode
  */
  @Valid 

  @JsonProperty("nonUsTrustFundCode")
  public TypeOfTrustFundCode getNonUsTrustFundCode() {
    return nonUsTrustFundCode;
  }

  public void setNonUsTrustFundCode(TypeOfTrustFundCode nonUsTrustFundCode) {
    this.nonUsTrustFundCode = nonUsTrustFundCode;
  }

  public PremiumGetRec delink(Delink delink) {
    this.delink = delink;
    return this;
  }

  /**
   * Get delink
   * @return delink
  */
  @Valid 

  @JsonProperty("delink")
  public Delink getDelink() {
    return delink;
  }

  public void setDelink(Delink delink) {
    this.delink = delink;
  }

  public PremiumGetRec chargesIndicator(Boolean chargesIndicator) {
    this.chargesIndicator = chargesIndicator;
    return this;
  }

  /**
   * Get chargesIndicator
   * @return chargesIndicator
  */
  

  @JsonProperty("chargesIndicator")
  public Boolean getChargesIndicator() {
    return chargesIndicator;
  }

  public void setChargesIndicator(Boolean chargesIndicator) {
    this.chargesIndicator = chargesIndicator;
  }

  public PremiumGetRec accountingType(AccountingTypeEnum accountingType) {
    this.accountingType = accountingType;
    return this;
  }

  /**
   * Get accountingType
   * @return accountingType
  */
  @Valid 

  @JsonProperty("accountingType")
  public AccountingTypeEnum getAccountingType() {
    return accountingType;
  }

  public void setAccountingType(AccountingTypeEnum accountingType) {
    this.accountingType = accountingType;
  }

  public PremiumGetRec brexitFlag(Boolean brexitFlag) {
    this.brexitFlag = brexitFlag;
    return this;
  }

  /**
   * Get brexitFlag
   * @return brexitFlag
  */
  

  @JsonProperty("brexitFlag")
  public Boolean getBrexitFlag() {
    return brexitFlag;
  }

  public void setBrexitFlag(Boolean brexitFlag) {
    this.brexitFlag = brexitFlag;
  }

  public PremiumGetRec lpanType(LpanTypeEnum lpanType) {
    this.lpanType = lpanType;
    return this;
  }

  /**
   * Get lpanType
   * @return lpanType
  */
  @Valid 

  @JsonProperty("lpanType")
  public LpanTypeEnum getLpanType() {
    return lpanType;
  }

  public void setLpanType(LpanTypeEnum lpanType) {
    this.lpanType = lpanType;
  }

  public PremiumGetRec depositPremium(DepositPremium depositPremium) {
    this.depositPremium = depositPremium;
    return this;
  }

  /**
   * Get depositPremium
   * @return depositPremium
  */
  @Valid 

  @JsonProperty("depositPremium")
  public DepositPremium getDepositPremium() {
    return depositPremium;
  }

  public void setDepositPremium(DepositPremium depositPremium) {
    this.depositPremium = depositPremium;
  }

  public PremiumGetRec nonStandardDeductNarr(String nonStandardDeductNarr) {
    this.nonStandardDeductNarr = nonStandardDeductNarr;
    return this;
  }

  /**
   * Get nonStandardDeductNarr
   * @return nonStandardDeductNarr
  */
  

  @JsonProperty("nonStandardDeductNarr")
  public String getNonStandardDeductNarr() {
    return nonStandardDeductNarr;
  }

  public void setNonStandardDeductNarr(String nonStandardDeductNarr) {
    this.nonStandardDeductNarr = nonStandardDeductNarr;
  }

  public PremiumGetRec otherDetails(String otherDetails) {
    this.otherDetails = otherDetails;
    return this;
  }

  /**
   * Get otherDetails
   * @return otherDetails
  */
  

  @JsonProperty("otherDetails")
  public String getOtherDetails() {
    return otherDetails;
  }

  public void setOtherDetails(String otherDetails) {
    this.otherDetails = otherDetails;
  }

  public PremiumGetRec grossPremSplit(GrossPremSplit grossPremSplit) {
    this.grossPremSplit = grossPremSplit;
    return this;
  }

  /**
   * Get grossPremSplit
   * @return grossPremSplit
  */
  @Valid 

  @JsonProperty("grossPremSplit")
  public GrossPremSplit getGrossPremSplit() {
    return grossPremSplit;
  }

  public void setGrossPremSplit(GrossPremSplit grossPremSplit) {
    this.grossPremSplit = grossPremSplit;
  }

  public PremiumGetRec fireBrigade(FireBrigade fireBrigade) {
    this.fireBrigade = fireBrigade;
    return this;
  }

  /**
   * Get fireBrigade
   * @return fireBrigade
  */
  @Valid 

  @JsonProperty("fireBrigade")
  public FireBrigade getFireBrigade() {
    return fireBrigade;
  }

  public void setFireBrigade(FireBrigade fireBrigade) {
    this.fireBrigade = fireBrigade;
  }

  public PremiumGetRec coreinsInd(Boolean coreinsInd) {
    this.coreinsInd = coreinsInd;
    return this;
  }

  /**
   * Get coreinsInd
   * @return coreinsInd
  */
  

  @JsonProperty("coreinsInd")
  public Boolean getCoreinsInd() {
    return coreinsInd;
  }

  public void setCoreinsInd(Boolean coreinsInd) {
    this.coreinsInd = coreinsInd;
  }

  public PremiumGetRec obsnd(String obsnd) {
    this.obsnd = obsnd;
    return this;
  }

  /**
   * the original broker signing number and date, maps to section level
   * @return obsnd
  */
  

  @JsonProperty("obsnd")
  public String getObsnd() {
    return obsnd;
  }

  public void setObsnd(String obsnd) {
    this.obsnd = obsnd;
  }

  public PremiumGetRec ocsnd(String ocsnd) {
    this.ocsnd = ocsnd;
    return this;
  }

  /**
   * the original carrier signing number and date, maps to premium level
   * @return ocsnd
  */
  

  @JsonProperty("ocsnd")
  public String getOcsnd() {
    return ocsnd;
  }

  public void setOcsnd(String ocsnd) {
    this.ocsnd = ocsnd;
  }

  public PremiumGetRec originalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
    return this;
  }

  /**
   * the sectionId of the original premium record
   * @return originalSectionId
  */
  @Valid 

  @JsonProperty("originalSectionId")
  public UUID getOriginalSectionId() {
    return originalSectionId;
  }

  public void setOriginalSectionId(UUID originalSectionId) {
    this.originalSectionId = originalSectionId;
  }

  public PremiumGetRec originalPremiumId(UUID originalPremiumId) {
    this.originalPremiumId = originalPremiumId;
    return this;
  }

  /**
   * the premiumId of the original premium record
   * @return originalPremiumId
  */
  @Valid 

  @JsonProperty("originalPremiumId")
  public UUID getOriginalPremiumId() {
    return originalPremiumId;
  }

  public void setOriginalPremiumId(UUID originalPremiumId) {
    this.originalPremiumId = originalPremiumId;
  }

  public PremiumGetRec opFilCode1(TypeOfFilCode opFilCode1) {
    this.opFilCode1 = opFilCode1;
    return this;
  }

  /**
   * Get opFilCode1
   * @return opFilCode1
  */
  @Valid 

  @JsonProperty("opFilCode1")
  public TypeOfFilCode getOpFilCode1() {
    return opFilCode1;
  }

  public void setOpFilCode1(TypeOfFilCode opFilCode1) {
    this.opFilCode1 = opFilCode1;
  }

  public PremiumGetRec aprp(PeriodWithNarrative aprp) {
    this.aprp = aprp;
    return this;
  }

  /**
   * Get aprp
   * @return aprp
  */
  @Valid 

  @JsonProperty("aprp")
  public PeriodWithNarrative getAprp() {
    return aprp;
  }

  public void setAprp(PeriodWithNarrative aprp) {
    this.aprp = aprp;
  }

  public PremiumGetRec revisedPolPeriod(PremiumPeriod revisedPolPeriod) {
    this.revisedPolPeriod = revisedPolPeriod;
    return this;
  }

  /**
   * Get revisedPolPeriod
   * @return revisedPolPeriod
  */
  @Valid 

  @JsonProperty("revisedPolPeriod")
  public PremiumPeriod getRevisedPolPeriod() {
    return revisedPolPeriod;
  }

  public void setRevisedPolPeriod(PremiumPeriod revisedPolPeriod) {
    this.revisedPolPeriod = revisedPolPeriod;
  }

  public PremiumGetRec revisedPremPeriod(PremiumPeriod revisedPremPeriod) {
    this.revisedPremPeriod = revisedPremPeriod;
    return this;
  }

  /**
   * Get revisedPremPeriod
   * @return revisedPremPeriod
  */
  @Valid 

  @JsonProperty("revisedPremPeriod")
  public PremiumPeriod getRevisedPremPeriod() {
    return revisedPremPeriod;
  }

  public void setRevisedPremPeriod(PremiumPeriod revisedPremPeriod) {
    this.revisedPremPeriod = revisedPremPeriod;
  }

  public PremiumGetRec revisedSlip(PremiumDetailRevisedSlip revisedSlip) {
    this.revisedSlip = revisedSlip;
    return this;
  }

  /**
   * Get revisedSlip
   * @return revisedSlip
  */
  @Valid 

  @JsonProperty("revisedSlip")
  public PremiumDetailRevisedSlip getRevisedSlip() {
    return revisedSlip;
  }

  public void setRevisedSlip(PremiumDetailRevisedSlip revisedSlip) {
    this.revisedSlip = revisedSlip;
  }

  public PremiumGetRec revisedSumInsuredMax(SumInsuredMax revisedSumInsuredMax) {
    this.revisedSumInsuredMax = revisedSumInsuredMax;
    return this;
  }

  /**
   * Get revisedSumInsuredMax
   * @return revisedSumInsuredMax
  */
  @Valid 

  @JsonProperty("revisedSumInsuredMax")
  public SumInsuredMax getRevisedSumInsuredMax() {
    return revisedSumInsuredMax;
  }

  public void setRevisedSumInsuredMax(SumInsuredMax revisedSumInsuredMax) {
    this.revisedSumInsuredMax = revisedSumInsuredMax;
  }

  public PremiumGetRec prevPaidPremAmt(BigDecimal prevPaidPremAmt) {
    this.prevPaidPremAmt = prevPaidPremAmt;
    return this;
  }

  /**
   * Get prevPaidPremAmt
   * @return prevPaidPremAmt
  */
  @Valid 

  @JsonProperty("prevPaidPremAmt")
  public BigDecimal getPrevPaidPremAmt() {
    return prevPaidPremAmt;
  }

  public void setPrevPaidPremAmt(BigDecimal prevPaidPremAmt) {
    this.prevPaidPremAmt = prevPaidPremAmt;
  }

  public PremiumGetRec actualPremDueAmt(BigDecimal actualPremDueAmt) {
    this.actualPremDueAmt = actualPremDueAmt;
    return this;
  }

  /**
   * Get actualPremDueAmt
   * @return actualPremDueAmt
  */
  @Valid 

  @JsonProperty("actualPremDueAmt")
  public BigDecimal getActualPremDueAmt() {
    return actualPremDueAmt;
  }

  public void setActualPremDueAmt(BigDecimal actualPremDueAmt) {
    this.actualPremDueAmt = actualPremDueAmt;
  }

  public PremiumGetRec adjustedPremDueDate(LocalDate adjustedPremDueDate) {
    this.adjustedPremDueDate = adjustedPremDueDate;
    return this;
  }

  /**
   * Get adjustedPremDueDate
   * @return adjustedPremDueDate
  */
  @Valid 

  @JsonProperty("adjustedPremDueDate")
  public LocalDate getAdjustedPremDueDate() {
    return adjustedPremDueDate;
  }

  public void setAdjustedPremDueDate(LocalDate adjustedPremDueDate) {
    this.adjustedPremDueDate = adjustedPremDueDate;
  }

  public PremiumGetRec actualPremIncomeAmt(BigDecimal actualPremIncomeAmt) {
    this.actualPremIncomeAmt = actualPremIncomeAmt;
    return this;
  }

  /**
   * Get actualPremIncomeAmt
   * @return actualPremIncomeAmt
  */
  @Valid 

  @JsonProperty("actualPremIncomeAmt")
  public BigDecimal getActualPremIncomeAmt() {
    return actualPremIncomeAmt;
  }

  public void setActualPremIncomeAmt(BigDecimal actualPremIncomeAmt) {
    this.actualPremIncomeAmt = actualPremIncomeAmt;
  }

  public PremiumGetRec adjustedPremAmt(BigDecimal adjustedPremAmt) {
    this.adjustedPremAmt = adjustedPremAmt;
    return this;
  }

  /**
   * Get adjustedPremAmt
   * @return adjustedPremAmt
  */
  @Valid 

  @JsonProperty("adjustedPremAmt")
  public BigDecimal getAdjustedPremAmt() {
    return adjustedPremAmt;
  }

  public void setAdjustedPremAmt(BigDecimal adjustedPremAmt) {
    this.adjustedPremAmt = adjustedPremAmt;
  }

  public PremiumGetRec adjustmentRate(BigDecimal adjustmentRate) {
    this.adjustmentRate = adjustmentRate;
    return this;
  }

  /**
   * Get adjustmentRate
   * @return adjustmentRate
  */
  @Valid 

  @JsonProperty("adjustmentRate")
  public BigDecimal getAdjustmentRate() {
    return adjustmentRate;
  }

  public void setAdjustmentRate(BigDecimal adjustmentRate) {
    this.adjustmentRate = adjustmentRate;
  }

  public PremiumGetRec adjustedAtDate(LocalDate adjustedAtDate) {
    this.adjustedAtDate = adjustedAtDate;
    return this;
  }

  /**
   * Get adjustedAtDate
   * @return adjustedAtDate
  */
  @Valid 

  @JsonProperty("adjustedAtDate")
  public LocalDate getAdjustedAtDate() {
    return adjustedAtDate;
  }

  public void setAdjustedAtDate(LocalDate adjustedAtDate) {
    this.adjustedAtDate = adjustedAtDate;
  }

  public PremiumGetRec adjustmentNarrative(String adjustmentNarrative) {
    this.adjustmentNarrative = adjustmentNarrative;
    return this;
  }

  /**
   * Get adjustmentNarrative
   * @return adjustmentNarrative
  */
  

  @JsonProperty("adjustmentNarrative")
  public String getAdjustmentNarrative() {
    return adjustmentNarrative;
  }

  public void setAdjustmentNarrative(String adjustmentNarrative) {
    this.adjustmentNarrative = adjustmentNarrative;
  }

  public PremiumGetRec totalMinPremAmt(BigDecimal totalMinPremAmt) {
    this.totalMinPremAmt = totalMinPremAmt;
    return this;
  }

  /**
   * Get totalMinPremAmt
   * @return totalMinPremAmt
  */
  @Valid 

  @JsonProperty("totalMinPremAmt")
  public BigDecimal getTotalMinPremAmt() {
    return totalMinPremAmt;
  }

  public void setTotalMinPremAmt(BigDecimal totalMinPremAmt) {
    this.totalMinPremAmt = totalMinPremAmt;
  }

  public PremiumGetRec mae(MaeEnum mae) {
    this.mae = mae;
    return this;
  }

  /**
   * Get mae
   * @return mae
  */
  @Valid 

  @JsonProperty("mae")
  public MaeEnum getMae() {
    return mae;
  }

  public void setMae(MaeEnum mae) {
    this.mae = mae;
  }

  public PremiumGetRec finalAdjustmentInd(Boolean finalAdjustmentInd) {
    this.finalAdjustmentInd = finalAdjustmentInd;
    return this;
  }

  /**
   * Get finalAdjustmentInd
   * @return finalAdjustmentInd
  */
  

  @JsonProperty("finalAdjustmentInd")
  public Boolean getFinalAdjustmentInd() {
    return finalAdjustmentInd;
  }

  public void setFinalAdjustmentInd(Boolean finalAdjustmentInd) {
    this.finalAdjustmentInd = finalAdjustmentInd;
  }

  public PremiumGetRec amendedCarrierRef(Boolean amendedCarrierRef) {
    this.amendedCarrierRef = amendedCarrierRef;
    return this;
  }

  /**
   * Get amendedCarrierRef
   * @return amendedCarrierRef
  */
  

  @JsonProperty("amendedCarrierRef")
  public Boolean getAmendedCarrierRef() {
    return amendedCarrierRef;
  }

  public void setAmendedCarrierRef(Boolean amendedCarrierRef) {
    this.amendedCarrierRef = amendedCarrierRef;
  }

  public PremiumGetRec partialMarketInd(Boolean partialMarketInd) {
    this.partialMarketInd = partialMarketInd;
    return this;
  }

  /**
   * Get partialMarketInd
   * @return partialMarketInd
  */
  

  @JsonProperty("partialMarketInd")
  public Boolean getPartialMarketInd() {
    return partialMarketInd;
  }

  public void setPartialMarketInd(Boolean partialMarketInd) {
    this.partialMarketInd = partialMarketInd;
  }

  public PremiumGetRec partialMarketId(UUID partialMarketId) {
    this.partialMarketId = partialMarketId;
    return this;
  }

  /**
   * the uuid of the sectionPartialMarket record created for a Partial market endorsement record
   * @return partialMarketId
  */
  @Valid 

  @JsonProperty("partialMarketId")
  public UUID getPartialMarketId() {
    return partialMarketId;
  }

  public void setPartialMarketId(UUID partialMarketId) {
    this.partialMarketId = partialMarketId;
  }

  public PremiumGetRec instalmentDetails(List<@Valid InstalmentDetail> instalmentDetails) {
    this.instalmentDetails = instalmentDetails;
    return this;
  }

  public PremiumGetRec addInstalmentDetailsItem(InstalmentDetail instalmentDetailsItem) {
    if (this.instalmentDetails == null) {
      this.instalmentDetails = new ArrayList<>();
    }
    this.instalmentDetails.add(instalmentDetailsItem);
    return this;
  }

  /**
   * Get instalmentDetails
   * @return instalmentDetails
  */
  @Valid 

  @JsonProperty("instalmentDetails")
  public List<@Valid InstalmentDetail> getInstalmentDetails() {
    return instalmentDetails;
  }

  public void setInstalmentDetails(List<@Valid InstalmentDetail> instalmentDetails) {
    this.instalmentDetails = instalmentDetails;
  }

  public PremiumGetRec taxDetails(List<@Valid TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public PremiumGetRec addTaxDetailsItem(TaxDetail taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

  /**
   * Get taxDetails
   * @return taxDetails
  */
  @Valid 

  @JsonProperty("taxDetails")
  public List<@Valid TaxDetail> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<@Valid TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public PremiumGetRec additionalTaxDetails(List<@Valid AdditionalTaxDetails> additionalTaxDetails) {
    this.additionalTaxDetails = additionalTaxDetails;
    return this;
  }

  public PremiumGetRec addAdditionalTaxDetailsItem(AdditionalTaxDetails additionalTaxDetailsItem) {
    if (this.additionalTaxDetails == null) {
      this.additionalTaxDetails = new ArrayList<>();
    }
    this.additionalTaxDetails.add(additionalTaxDetailsItem);
    return this;
  }

  /**
   * Get additionalTaxDetails
   * @return additionalTaxDetails
  */
  @Valid 

  @JsonProperty("additionalTaxDetails")
  public List<@Valid AdditionalTaxDetails> getAdditionalTaxDetails() {
    return additionalTaxDetails;
  }

  public void setAdditionalTaxDetails(List<@Valid AdditionalTaxDetails> additionalTaxDetails) {
    this.additionalTaxDetails = additionalTaxDetails;
  }

  public PremiumGetRec complexDeduction(ComplexDeduction complexDeduction) {
    this.complexDeduction = complexDeduction;
    return this;
  }

  /**
   * Get complexDeduction
   * @return complexDeduction
  */
  @Valid 

  @JsonProperty("complexDeduction")
  public ComplexDeduction getComplexDeduction() {
    return complexDeduction;
  }

  public void setComplexDeduction(ComplexDeduction complexDeduction) {
    this.complexDeduction = complexDeduction;
  }

  public PremiumGetRec legislationChild(LegislationChild legislationChild) {
    this.legislationChild = legislationChild;
    return this;
  }

  /**
   * Get legislationChild
   * @return legislationChild
  */
  @Valid 

  @JsonProperty("legislationChild")
  public LegislationChild getLegislationChild() {
    return legislationChild;
  }

  public void setLegislationChild(LegislationChild legislationChild) {
    this.legislationChild = legislationChild;
  }

  public PremiumGetRec channel(LmChannelEnum channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @Valid 

  @JsonProperty("Channel")
  public LmChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(LmChannelEnum channel) {
    this.channel = channel;
  }

  public PremiumGetRec ecReporting(EcReporting ecReporting) {
    this.ecReporting = ecReporting;
    return this;
  }

  /**
   * Get ecReporting
   * @return ecReporting
  */
  @Valid 

  @JsonProperty("ecReporting")
  public EcReporting getEcReporting() {
    return ecReporting;
  }

  public void setEcReporting(EcReporting ecReporting) {
    this.ecReporting = ecReporting;
  }

  public PremiumGetRec usReporting(UsReporting usReporting) {
    this.usReporting = usReporting;
    return this;
  }

  /**
   * Get usReporting
   * @return usReporting
  */
  @Valid 

  @JsonProperty("usReporting")
  public UsReporting getUsReporting() {
    return usReporting;
  }

  public void setUsReporting(UsReporting usReporting) {
    this.usReporting = usReporting;
  }

  public PremiumGetRec createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  @Valid 

  @JsonProperty("createdDate")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public PremiumGetRec lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  */
  @Valid 

  @JsonProperty("lastUpdatedDate")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public PremiumGetRec recordStatusCode(RecordStatusCodeEnum recordStatusCode) {
    this.recordStatusCode = recordStatusCode;
    return this;
  }

  /**
   * Get recordStatusCode
   * @return recordStatusCode
  */
  @Valid 

  @JsonProperty("recordStatusCode")
  public RecordStatusCodeEnum getRecordStatusCode() {
    return recordStatusCode;
  }

  public void setRecordStatusCode(RecordStatusCodeEnum recordStatusCode) {
    this.recordStatusCode = recordStatusCode;
  }

  public PremiumGetRec recordStatusDate(OffsetDateTime recordStatusDate) {
    this.recordStatusDate = recordStatusDate;
    return this;
  }

  /**
   * Get recordStatusDate
   * @return recordStatusDate
  */
  @Valid 

  @JsonProperty("recordStatusDate")
  public OffsetDateTime getRecordStatusDate() {
    return recordStatusDate;
  }

  public void setRecordStatusDate(OffsetDateTime recordStatusDate) {
    this.recordStatusDate = recordStatusDate;
  }

  public PremiumGetRec settlementStatus(SettlementStatusEnum settlementStatus) {
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

  public PremiumGetRec settled(SettledEnum settled) {
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

  public PremiumGetRec settlementId(UUID settlementId) {
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

  public PremiumGetRec actualPaymentDate(OffsetDateTime actualPaymentDate) {
    this.actualPaymentDate = actualPaymentDate;
    return this;
  }

  /**
   * actual payment date of the premium, if it does not have instalments
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

  public PremiumGetRec correctionType(CorrectionTypeEnum correctionType) {
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

  public PremiumGetRec correctionNarrative(CorrectionNarrativeEnum correctionNarrative) {
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

  public PremiumGetRec portalWorkflowStatus(PortalWorkflowStatus portalWorkflowStatus) {
    this.portalWorkflowStatus = portalWorkflowStatus;
    return this;
  }

  /**
   * Get portalWorkflowStatus
   * @return portalWorkflowStatus
  */
  @Valid 

  @JsonProperty("portalWorkflowStatus")
  public PortalWorkflowStatus getPortalWorkflowStatus() {
    return portalWorkflowStatus;
  }

  public void setPortalWorkflowStatus(PortalWorkflowStatus portalWorkflowStatus) {
    this.portalWorkflowStatus = portalWorkflowStatus;
  }

  public PremiumGetRec replacesId(UUID replacesId) {
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

  public PremiumGetRec replacedById(UUID replacedById) {
    this.replacedById = replacedById;
    return this;
  }

  /**
   * Get replacedById
   * @return replacedById
  */
  @Valid 

  @JsonProperty("replacedById")
  public UUID getReplacedById() {
    return replacedById;
  }

  public void setReplacedById(UUID replacedById) {
    this.replacedById = replacedById;
  }

  public PremiumGetRec signingId(UUID signingId) {
    this.signingId = signingId;
    return this;
  }

  /**
   * Get signingId
   * @return signingId
  */
  @Valid 

  @JsonProperty("signingId")
  public UUID getSigningId() {
    return signingId;
  }

  public void setSigningId(UUID signingId) {
    this.signingId = signingId;
  }

  public PremiumGetRec bsnd(String bsnd) {
    this.bsnd = bsnd;
    return this;
  }

  /**
   * Get bsnd
   * @return bsnd
  */
  

  @JsonProperty("bsnd")
  public String getBsnd() {
    return bsnd;
  }

  public void setBsnd(String bsnd) {
    this.bsnd = bsnd;
  }

  public PremiumGetRec csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * Carrier signing number and date, e.g. for Lloyds the format is NNNNN DDMMYYYY
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public PremiumGetRec csn(String csn) {
    this.csn = csn;
    return this;
  }

  /**
   * Carrier signing number, the numeric part of the CSND
   * @return csn
  */
  

  @JsonProperty("csn")
  public String getCsn() {
    return csn;
  }

  public void setCsn(String csn) {
    this.csn = csn;
  }

  public PremiumGetRec csd(OffsetDateTime csd) {
    this.csd = csd;
    return this;
  }

  /**
   * Carrier signing date, date and timestamp
   * @return csd
  */
  @Valid 

  @JsonProperty("csd")
  public OffsetDateTime getCsd() {
    return csd;
  }

  public void setCsd(OffsetDateTime csd) {
    this.csd = csd;
  }

  public PremiumGetRec csnVersion(Integer csnVersion) {
    this.csnVersion = csnVersion;
    return this;
  }

  /**
   * Get csnVersion
   * @return csnVersion
  */
  

  @JsonProperty("csnVersion")
  public Integer getCsnVersion() {
    return csnVersion;
  }

  public void setCsnVersion(Integer csnVersion) {
    this.csnVersion = csnVersion;
  }

  public PremiumGetRec bsn(String bsn) {
    this.bsn = bsn;
    return this;
  }

  /**
   * Broker signing number, the numeric part of the BSND
   * @return bsn
  */
  

  @JsonProperty("bsn")
  public String getBsn() {
    return bsn;
  }

  public void setBsn(String bsn) {
    this.bsn = bsn;
  }

  public PremiumGetRec bsd(OffsetDateTime bsd) {
    this.bsd = bsd;
    return this;
  }

  /**
   * Broker signing date, date and timestamp
   * @return bsd
  */
  @Valid 

  @JsonProperty("bsd")
  public OffsetDateTime getBsd() {
    return bsd;
  }

  public void setBsd(OffsetDateTime bsd) {
    this.bsd = bsd;
  }

  public PremiumGetRec bsnVersion(Integer bsnVersion) {
    this.bsnVersion = bsnVersion;
    return this;
  }

  /**
   * Get bsnVersion
   * @return bsnVersion
  */
  

  @JsonProperty("bsnVersion")
  public Integer getBsnVersion() {
    return bsnVersion;
  }

  public void setBsnVersion(Integer bsnVersion) {
    this.bsnVersion = bsnVersion;
  }

  public PremiumGetRec signingMessage(String signingMessage) {
    this.signingMessage = signingMessage;
    return this;
  }

  /**
   * Get signingMessage
   * @return signingMessage
  */
  

  @JsonProperty("signingMessage")
  public String getSigningMessage() {
    return signingMessage;
  }

  public void setSigningMessage(String signingMessage) {
    this.signingMessage = signingMessage;
  }

  public PremiumGetRec signedByUser(String signedByUser) {
    this.signedByUser = signedByUser;
    return this;
  }

  /**
   * The id of the user that signed the transaction
   * @return signedByUser
  */
  

  @JsonProperty("signedByUser")
  public String getSignedByUser() {
    return signedByUser;
  }

  public void setSignedByUser(String signedByUser) {
    this.signedByUser = signedByUser;
  }

  public PremiumGetRec signedByUserFullName(String signedByUserFullName) {
    this.signedByUserFullName = signedByUserFullName;
    return this;
  }

  /**
   * The full name of the user that signed the transaction
   * @return signedByUserFullName
  */
  

  @JsonProperty("signedByUserFullName")
  public String getSignedByUserFullName() {
    return signedByUserFullName;
  }

  public void setSignedByUserFullName(String signedByUserFullName) {
    this.signedByUserFullName = signedByUserFullName;
  }

  public PremiumGetRec signedByUserEmail(String signedByUserEmail) {
    this.signedByUserEmail = signedByUserEmail;
    return this;
  }

  /**
   * The email address of the user that signed the transaction
   * @return signedByUserEmail
  */
  

  @JsonProperty("signedByUserEmail")
  public String getSignedByUserEmail() {
    return signedByUserEmail;
  }

  public void setSignedByUserEmail(String signedByUserEmail) {
    this.signedByUserEmail = signedByUserEmail;
  }

  public PremiumGetRec directPremiumBsnd(String directPremiumBsnd) {
    this.directPremiumBsnd = directPremiumBsnd;
    return this;
  }

  /**
   * used for a auto RI premium. the broker signing number and date of the direct premium
   * @return directPremiumBsnd
  */
  

  @JsonProperty("directPremiumBsnd")
  public String getDirectPremiumBsnd() {
    return directPremiumBsnd;
  }

  public void setDirectPremiumBsnd(String directPremiumBsnd) {
    this.directPremiumBsnd = directPremiumBsnd;
  }

  public PremiumGetRec directPremiumCsnd(String directPremiumCsnd) {
    this.directPremiumCsnd = directPremiumCsnd;
    return this;
  }

  /**
   * used for a auto RI premium.the original carrier signing number and date, maps to premium level
   * @return directPremiumCsnd
  */
  

  @JsonProperty("directPremiumCsnd")
  public String getDirectPremiumCsnd() {
    return directPremiumCsnd;
  }

  public void setDirectPremiumCsnd(String directPremiumCsnd) {
    this.directPremiumCsnd = directPremiumCsnd;
  }

  public PremiumGetRec recordValid(Boolean recordValid) {
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

  public PremiumGetRec filTypeMandatory(Boolean filTypeMandatory) {
    this.filTypeMandatory = filTypeMandatory;
    return this;
  }

  /**
   * Get filTypeMandatory
   * @return filTypeMandatory
  */
  

  @JsonProperty("filTypeMandatory")
  public Boolean getFilTypeMandatory() {
    return filTypeMandatory;
  }

  public void setFilTypeMandatory(Boolean filTypeMandatory) {
    this.filTypeMandatory = filTypeMandatory;
  }

  public PremiumGetRec usSurplusLineDetails(UsSurplusLineDetails usSurplusLineDetails) {
    this.usSurplusLineDetails = usSurplusLineDetails;
    return this;
  }

  /**
   * Get usSurplusLineDetails
   * @return usSurplusLineDetails
  */
  @Valid 

  @JsonProperty("usSurplusLineDetails")
  public UsSurplusLineDetails getUsSurplusLineDetails() {
    return usSurplusLineDetails;
  }

  public void setUsSurplusLineDetails(UsSurplusLineDetails usSurplusLineDetails) {
    this.usSurplusLineDetails = usSurplusLineDetails;
  }

  public PremiumGetRec naicDetails(NaicDetails naicDetails) {
    this.naicDetails = naicDetails;
    return this;
  }

  /**
   * Get naicDetails
   * @return naicDetails
  */
  @Valid 

  @JsonProperty("naicDetails")
  public NaicDetails getNaicDetails() {
    return naicDetails;
  }

  public void setNaicDetails(NaicDetails naicDetails) {
    this.naicDetails = naicDetails;
  }

  public PremiumGetRec contractPolicyPeriodFrom(LocalDate contractPolicyPeriodFrom) {
    this.contractPolicyPeriodFrom = contractPolicyPeriodFrom;
    return this;
  }

  /**
   * Get contractPolicyPeriodFrom
   * @return contractPolicyPeriodFrom
  */
  @Valid 

  @JsonProperty("contractPolicyPeriodFrom")
  public LocalDate getContractPolicyPeriodFrom() {
    return contractPolicyPeriodFrom;
  }

  public void setContractPolicyPeriodFrom(LocalDate contractPolicyPeriodFrom) {
    this.contractPolicyPeriodFrom = contractPolicyPeriodFrom;
  }

  public PremiumGetRec yearOfAccount(Integer yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
    return this;
  }

  /**
   * Get yearOfAccount
   * @return yearOfAccount
  */
  

  @JsonProperty("yearOfAccount")
  public Integer getYearOfAccount() {
    return yearOfAccount;
  }

  public void setYearOfAccount(Integer yearOfAccount) {
    this.yearOfAccount = yearOfAccount;
  }

  public PremiumGetRec vatDetails(VatDetails vatDetails) {
    this.vatDetails = vatDetails;
    return this;
  }

  /**
   * Get vatDetails
   * @return vatDetails
  */
  @Valid 

  @JsonProperty("vatDetails")
  public VatDetails getVatDetails() {
    return vatDetails;
  }

  public void setVatDetails(VatDetails vatDetails) {
    this.vatDetails = vatDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumGetRec premiumGetRec = (PremiumGetRec) o;
    return Objects.equals(this.premiumId, premiumGetRec.premiumId) &&
        Objects.equals(this.sectionId, premiumGetRec.sectionId) &&
        Objects.equals(this.riskCode, premiumGetRec.riskCode) &&
        Objects.equals(this.premiumNumber, premiumGetRec.premiumNumber) &&
        Objects.equals(this.premiumSource, premiumGetRec.premiumSource) &&
        Objects.equals(this.dtPremiumId, premiumGetRec.dtPremiumId) &&
        Objects.equals(this.transactionType, premiumGetRec.transactionType) &&
        Objects.equals(this.premiumNarrative, premiumGetRec.premiumNarrative) &&
        Objects.equals(this.slip, premiumGetRec.slip) &&
        Objects.equals(this.eeaRiskFlag, premiumGetRec.eeaRiskFlag) &&
        Objects.equals(this.autoRIComission, premiumGetRec.autoRIComission) &&
        Objects.equals(this.brokerRef1, premiumGetRec.brokerRef1) &&
        Objects.equals(this.brokerRef2, premiumGetRec.brokerRef2) &&
        Objects.equals(this.periodDescription, premiumGetRec.periodDescription) &&
        Objects.equals(this.splitsCountry, premiumGetRec.splitsCountry) &&
        Objects.equals(this.countryOfOrigin, premiumGetRec.countryOfOrigin) &&
        Objects.equals(this.stateCode, premiumGetRec.stateCode) &&
        Objects.equals(this.dtiCode, premiumGetRec.dtiCode) &&
        Objects.equals(this.vatCode, premiumGetRec.vatCode) &&
        Objects.equals(this.entryCode, premiumGetRec.entryCode) &&
        Objects.equals(this.qualCatCode, premiumGetRec.qualCatCode) &&
        Objects.equals(this.totCode, premiumGetRec.totCode) &&
        Objects.equals(this.settlementDueDate, premiumGetRec.settlementDueDate) &&
        Objects.equals(this.monitoringDate, premiumGetRec.monitoringDate) &&
        Objects.equals(this.plannedSettlementDate, premiumGetRec.plannedSettlementDate) &&
        Objects.equals(this.sumInsuredMax, premiumGetRec.sumInsuredMax) &&
        Objects.equals(this.originalCurrency, premiumGetRec.originalCurrency) &&
        Objects.equals(this.bureauLinePercent, premiumGetRec.bureauLinePercent) &&
        Objects.equals(this.grossPremium, premiumGetRec.grossPremium) &&
        Objects.equals(this.grossPremiumPercent, premiumGetRec.grossPremiumPercent) &&
        Objects.equals(this.prem100pcnt, premiumGetRec.prem100pcnt) &&
        Objects.equals(this.deductions, premiumGetRec.deductions) &&
        Objects.equals(this.ukIPT, premiumGetRec.ukIPT) &&
        Objects.equals(this.overseasIPT, premiumGetRec.overseasIPT) &&
        Objects.equals(this.exchangeRate, premiumGetRec.exchangeRate) &&
        Objects.equals(this.exchangeRateNarrative, premiumGetRec.exchangeRateNarrative) &&
        Objects.equals(this.settlementCurrency, premiumGetRec.settlementCurrency) &&
        Objects.equals(this.premiumNet, premiumGetRec.premiumNet) &&
        Objects.equals(this.war, premiumGetRec.war) &&
        Objects.equals(this.fil, premiumGetRec.fil) &&
        Objects.equals(this.trustFundCode, premiumGetRec.trustFundCode) &&
        Objects.equals(this.nonUsTrustFundCode, premiumGetRec.nonUsTrustFundCode) &&
        Objects.equals(this.delink, premiumGetRec.delink) &&
        Objects.equals(this.chargesIndicator, premiumGetRec.chargesIndicator) &&
        Objects.equals(this.accountingType, premiumGetRec.accountingType) &&
        Objects.equals(this.brexitFlag, premiumGetRec.brexitFlag) &&
        Objects.equals(this.lpanType, premiumGetRec.lpanType) &&
        Objects.equals(this.depositPremium, premiumGetRec.depositPremium) &&
        Objects.equals(this.nonStandardDeductNarr, premiumGetRec.nonStandardDeductNarr) &&
        Objects.equals(this.otherDetails, premiumGetRec.otherDetails) &&
        Objects.equals(this.grossPremSplit, premiumGetRec.grossPremSplit) &&
        Objects.equals(this.fireBrigade, premiumGetRec.fireBrigade) &&
        Objects.equals(this.coreinsInd, premiumGetRec.coreinsInd) &&
        Objects.equals(this.obsnd, premiumGetRec.obsnd) &&
        Objects.equals(this.ocsnd, premiumGetRec.ocsnd) &&
        Objects.equals(this.originalSectionId, premiumGetRec.originalSectionId) &&
        Objects.equals(this.originalPremiumId, premiumGetRec.originalPremiumId) &&
        Objects.equals(this.opFilCode1, premiumGetRec.opFilCode1) &&
        Objects.equals(this.aprp, premiumGetRec.aprp) &&
        Objects.equals(this.revisedPolPeriod, premiumGetRec.revisedPolPeriod) &&
        Objects.equals(this.revisedPremPeriod, premiumGetRec.revisedPremPeriod) &&
        Objects.equals(this.revisedSlip, premiumGetRec.revisedSlip) &&
        Objects.equals(this.revisedSumInsuredMax, premiumGetRec.revisedSumInsuredMax) &&
        Objects.equals(this.prevPaidPremAmt, premiumGetRec.prevPaidPremAmt) &&
        Objects.equals(this.actualPremDueAmt, premiumGetRec.actualPremDueAmt) &&
        Objects.equals(this.adjustedPremDueDate, premiumGetRec.adjustedPremDueDate) &&
        Objects.equals(this.actualPremIncomeAmt, premiumGetRec.actualPremIncomeAmt) &&
        Objects.equals(this.adjustedPremAmt, premiumGetRec.adjustedPremAmt) &&
        Objects.equals(this.adjustmentRate, premiumGetRec.adjustmentRate) &&
        Objects.equals(this.adjustedAtDate, premiumGetRec.adjustedAtDate) &&
        Objects.equals(this.adjustmentNarrative, premiumGetRec.adjustmentNarrative) &&
        Objects.equals(this.totalMinPremAmt, premiumGetRec.totalMinPremAmt) &&
        Objects.equals(this.mae, premiumGetRec.mae) &&
        Objects.equals(this.finalAdjustmentInd, premiumGetRec.finalAdjustmentInd) &&
        Objects.equals(this.amendedCarrierRef, premiumGetRec.amendedCarrierRef) &&
        Objects.equals(this.partialMarketInd, premiumGetRec.partialMarketInd) &&
        Objects.equals(this.partialMarketId, premiumGetRec.partialMarketId) &&
        Objects.equals(this.instalmentDetails, premiumGetRec.instalmentDetails) &&
        Objects.equals(this.taxDetails, premiumGetRec.taxDetails) &&
        Objects.equals(this.additionalTaxDetails, premiumGetRec.additionalTaxDetails) &&
        Objects.equals(this.complexDeduction, premiumGetRec.complexDeduction) &&
        Objects.equals(this.legislationChild, premiumGetRec.legislationChild) &&
        Objects.equals(this.channel, premiumGetRec.channel) &&
        Objects.equals(this.ecReporting, premiumGetRec.ecReporting) &&
        Objects.equals(this.usReporting, premiumGetRec.usReporting) &&
        Objects.equals(this.createdDate, premiumGetRec.createdDate) &&
        Objects.equals(this.lastUpdatedDate, premiumGetRec.lastUpdatedDate) &&
        Objects.equals(this.recordStatusCode, premiumGetRec.recordStatusCode) &&
        Objects.equals(this.recordStatusDate, premiumGetRec.recordStatusDate) &&
        Objects.equals(this.settlementStatus, premiumGetRec.settlementStatus) &&
        Objects.equals(this.settled, premiumGetRec.settled) &&
        Objects.equals(this.settlementId, premiumGetRec.settlementId) &&
        Objects.equals(this.actualPaymentDate, premiumGetRec.actualPaymentDate) &&
        Objects.equals(this.correctionType, premiumGetRec.correctionType) &&
        Objects.equals(this.correctionNarrative, premiumGetRec.correctionNarrative) &&
        Objects.equals(this.portalWorkflowStatus, premiumGetRec.portalWorkflowStatus) &&
        Objects.equals(this.replacesId, premiumGetRec.replacesId) &&
        Objects.equals(this.replacedById, premiumGetRec.replacedById) &&
        Objects.equals(this.signingId, premiumGetRec.signingId) &&
        Objects.equals(this.bsnd, premiumGetRec.bsnd) &&
        Objects.equals(this.csnd, premiumGetRec.csnd) &&
        Objects.equals(this.csn, premiumGetRec.csn) &&
        Objects.equals(this.csd, premiumGetRec.csd) &&
        Objects.equals(this.csnVersion, premiumGetRec.csnVersion) &&
        Objects.equals(this.bsn, premiumGetRec.bsn) &&
        Objects.equals(this.bsd, premiumGetRec.bsd) &&
        Objects.equals(this.bsnVersion, premiumGetRec.bsnVersion) &&
        Objects.equals(this.signingMessage, premiumGetRec.signingMessage) &&
        Objects.equals(this.signedByUser, premiumGetRec.signedByUser) &&
        Objects.equals(this.signedByUserFullName, premiumGetRec.signedByUserFullName) &&
        Objects.equals(this.signedByUserEmail, premiumGetRec.signedByUserEmail) &&
        Objects.equals(this.directPremiumBsnd, premiumGetRec.directPremiumBsnd) &&
        Objects.equals(this.directPremiumCsnd, premiumGetRec.directPremiumCsnd) &&
        Objects.equals(this.recordValid, premiumGetRec.recordValid) &&
        Objects.equals(this.filTypeMandatory, premiumGetRec.filTypeMandatory) &&
        Objects.equals(this.usSurplusLineDetails, premiumGetRec.usSurplusLineDetails) &&
        Objects.equals(this.naicDetails, premiumGetRec.naicDetails) &&
        Objects.equals(this.contractPolicyPeriodFrom, premiumGetRec.contractPolicyPeriodFrom) &&
        Objects.equals(this.yearOfAccount, premiumGetRec.yearOfAccount) &&
        Objects.equals(this.vatDetails, premiumGetRec.vatDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId, sectionId, riskCode, premiumNumber, premiumSource, dtPremiumId, transactionType, premiumNarrative, slip, eeaRiskFlag, autoRIComission, brokerRef1, brokerRef2, periodDescription, splitsCountry, countryOfOrigin, stateCode, dtiCode, vatCode, entryCode, qualCatCode, totCode, settlementDueDate, monitoringDate, plannedSettlementDate, sumInsuredMax, originalCurrency, bureauLinePercent, grossPremium, grossPremiumPercent, prem100pcnt, deductions, ukIPT, overseasIPT, exchangeRate, exchangeRateNarrative, settlementCurrency, premiumNet, war, fil, trustFundCode, nonUsTrustFundCode, delink, chargesIndicator, accountingType, brexitFlag, lpanType, depositPremium, nonStandardDeductNarr, otherDetails, grossPremSplit, fireBrigade, coreinsInd, obsnd, ocsnd, originalSectionId, originalPremiumId, opFilCode1, aprp, revisedPolPeriod, revisedPremPeriod, revisedSlip, revisedSumInsuredMax, prevPaidPremAmt, actualPremDueAmt, adjustedPremDueDate, actualPremIncomeAmt, adjustedPremAmt, adjustmentRate, adjustedAtDate, adjustmentNarrative, totalMinPremAmt, mae, finalAdjustmentInd, amendedCarrierRef, partialMarketInd, partialMarketId, instalmentDetails, taxDetails, additionalTaxDetails, complexDeduction, legislationChild, channel, ecReporting, usReporting, createdDate, lastUpdatedDate, recordStatusCode, recordStatusDate, settlementStatus, settled, settlementId, actualPaymentDate, correctionType, correctionNarrative, portalWorkflowStatus, replacesId, replacedById, signingId, bsnd, csnd, csn, csd, csnVersion, bsn, bsd, bsnVersion, signingMessage, signedByUser, signedByUserFullName, signedByUserEmail, directPremiumBsnd, directPremiumCsnd, recordValid, filTypeMandatory, usSurplusLineDetails, naicDetails, contractPolicyPeriodFrom, yearOfAccount, vatDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumGetRec {\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    premiumNumber: ").append(toIndentedString(premiumNumber)).append("\n");
    sb.append("    premiumSource: ").append(toIndentedString(premiumSource)).append("\n");
    sb.append("    dtPremiumId: ").append(toIndentedString(dtPremiumId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    premiumNarrative: ").append(toIndentedString(premiumNarrative)).append("\n");
    sb.append("    slip: ").append(toIndentedString(slip)).append("\n");
    sb.append("    eeaRiskFlag: ").append(toIndentedString(eeaRiskFlag)).append("\n");
    sb.append("    autoRIComission: ").append(toIndentedString(autoRIComission)).append("\n");
    sb.append("    brokerRef1: ").append(toIndentedString(brokerRef1)).append("\n");
    sb.append("    brokerRef2: ").append(toIndentedString(brokerRef2)).append("\n");
    sb.append("    periodDescription: ").append(toIndentedString(periodDescription)).append("\n");
    sb.append("    splitsCountry: ").append(toIndentedString(splitsCountry)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    dtiCode: ").append(toIndentedString(dtiCode)).append("\n");
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
    sb.append("    entryCode: ").append(toIndentedString(entryCode)).append("\n");
    sb.append("    qualCatCode: ").append(toIndentedString(qualCatCode)).append("\n");
    sb.append("    totCode: ").append(toIndentedString(totCode)).append("\n");
    sb.append("    settlementDueDate: ").append(toIndentedString(settlementDueDate)).append("\n");
    sb.append("    monitoringDate: ").append(toIndentedString(monitoringDate)).append("\n");
    sb.append("    plannedSettlementDate: ").append(toIndentedString(plannedSettlementDate)).append("\n");
    sb.append("    sumInsuredMax: ").append(toIndentedString(sumInsuredMax)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    bureauLinePercent: ").append(toIndentedString(bureauLinePercent)).append("\n");
    sb.append("    grossPremium: ").append(toIndentedString(grossPremium)).append("\n");
    sb.append("    grossPremiumPercent: ").append(toIndentedString(grossPremiumPercent)).append("\n");
    sb.append("    prem100pcnt: ").append(toIndentedString(prem100pcnt)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    ukIPT: ").append(toIndentedString(ukIPT)).append("\n");
    sb.append("    overseasIPT: ").append(toIndentedString(overseasIPT)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    exchangeRateNarrative: ").append(toIndentedString(exchangeRateNarrative)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    premiumNet: ").append(toIndentedString(premiumNet)).append("\n");
    sb.append("    war: ").append(toIndentedString(war)).append("\n");
    sb.append("    fil: ").append(toIndentedString(fil)).append("\n");
    sb.append("    trustFundCode: ").append(toIndentedString(trustFundCode)).append("\n");
    sb.append("    nonUsTrustFundCode: ").append(toIndentedString(nonUsTrustFundCode)).append("\n");
    sb.append("    delink: ").append(toIndentedString(delink)).append("\n");
    sb.append("    chargesIndicator: ").append(toIndentedString(chargesIndicator)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    brexitFlag: ").append(toIndentedString(brexitFlag)).append("\n");
    sb.append("    lpanType: ").append(toIndentedString(lpanType)).append("\n");
    sb.append("    depositPremium: ").append(toIndentedString(depositPremium)).append("\n");
    sb.append("    nonStandardDeductNarr: ").append(toIndentedString(nonStandardDeductNarr)).append("\n");
    sb.append("    otherDetails: ").append(toIndentedString(otherDetails)).append("\n");
    sb.append("    grossPremSplit: ").append(toIndentedString(grossPremSplit)).append("\n");
    sb.append("    fireBrigade: ").append(toIndentedString(fireBrigade)).append("\n");
    sb.append("    coreinsInd: ").append(toIndentedString(coreinsInd)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    ocsnd: ").append(toIndentedString(ocsnd)).append("\n");
    sb.append("    originalSectionId: ").append(toIndentedString(originalSectionId)).append("\n");
    sb.append("    originalPremiumId: ").append(toIndentedString(originalPremiumId)).append("\n");
    sb.append("    opFilCode1: ").append(toIndentedString(opFilCode1)).append("\n");
    sb.append("    aprp: ").append(toIndentedString(aprp)).append("\n");
    sb.append("    revisedPolPeriod: ").append(toIndentedString(revisedPolPeriod)).append("\n");
    sb.append("    revisedPremPeriod: ").append(toIndentedString(revisedPremPeriod)).append("\n");
    sb.append("    revisedSlip: ").append(toIndentedString(revisedSlip)).append("\n");
    sb.append("    revisedSumInsuredMax: ").append(toIndentedString(revisedSumInsuredMax)).append("\n");
    sb.append("    prevPaidPremAmt: ").append(toIndentedString(prevPaidPremAmt)).append("\n");
    sb.append("    actualPremDueAmt: ").append(toIndentedString(actualPremDueAmt)).append("\n");
    sb.append("    adjustedPremDueDate: ").append(toIndentedString(adjustedPremDueDate)).append("\n");
    sb.append("    actualPremIncomeAmt: ").append(toIndentedString(actualPremIncomeAmt)).append("\n");
    sb.append("    adjustedPremAmt: ").append(toIndentedString(adjustedPremAmt)).append("\n");
    sb.append("    adjustmentRate: ").append(toIndentedString(adjustmentRate)).append("\n");
    sb.append("    adjustedAtDate: ").append(toIndentedString(adjustedAtDate)).append("\n");
    sb.append("    adjustmentNarrative: ").append(toIndentedString(adjustmentNarrative)).append("\n");
    sb.append("    totalMinPremAmt: ").append(toIndentedString(totalMinPremAmt)).append("\n");
    sb.append("    mae: ").append(toIndentedString(mae)).append("\n");
    sb.append("    finalAdjustmentInd: ").append(toIndentedString(finalAdjustmentInd)).append("\n");
    sb.append("    amendedCarrierRef: ").append(toIndentedString(amendedCarrierRef)).append("\n");
    sb.append("    partialMarketInd: ").append(toIndentedString(partialMarketInd)).append("\n");
    sb.append("    partialMarketId: ").append(toIndentedString(partialMarketId)).append("\n");
    sb.append("    instalmentDetails: ").append(toIndentedString(instalmentDetails)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    additionalTaxDetails: ").append(toIndentedString(additionalTaxDetails)).append("\n");
    sb.append("    complexDeduction: ").append(toIndentedString(complexDeduction)).append("\n");
    sb.append("    legislationChild: ").append(toIndentedString(legislationChild)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    ecReporting: ").append(toIndentedString(ecReporting)).append("\n");
    sb.append("    usReporting: ").append(toIndentedString(usReporting)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    recordStatusCode: ").append(toIndentedString(recordStatusCode)).append("\n");
    sb.append("    recordStatusDate: ").append(toIndentedString(recordStatusDate)).append("\n");
    sb.append("    settlementStatus: ").append(toIndentedString(settlementStatus)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    actualPaymentDate: ").append(toIndentedString(actualPaymentDate)).append("\n");
    sb.append("    correctionType: ").append(toIndentedString(correctionType)).append("\n");
    sb.append("    correctionNarrative: ").append(toIndentedString(correctionNarrative)).append("\n");
    sb.append("    portalWorkflowStatus: ").append(toIndentedString(portalWorkflowStatus)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
    sb.append("    replacedById: ").append(toIndentedString(replacedById)).append("\n");
    sb.append("    signingId: ").append(toIndentedString(signingId)).append("\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    csn: ").append(toIndentedString(csn)).append("\n");
    sb.append("    csd: ").append(toIndentedString(csd)).append("\n");
    sb.append("    csnVersion: ").append(toIndentedString(csnVersion)).append("\n");
    sb.append("    bsn: ").append(toIndentedString(bsn)).append("\n");
    sb.append("    bsd: ").append(toIndentedString(bsd)).append("\n");
    sb.append("    bsnVersion: ").append(toIndentedString(bsnVersion)).append("\n");
    sb.append("    signingMessage: ").append(toIndentedString(signingMessage)).append("\n");
    sb.append("    signedByUser: ").append(toIndentedString(signedByUser)).append("\n");
    sb.append("    signedByUserFullName: ").append(toIndentedString(signedByUserFullName)).append("\n");
    sb.append("    signedByUserEmail: ").append(toIndentedString(signedByUserEmail)).append("\n");
    sb.append("    directPremiumBsnd: ").append(toIndentedString(directPremiumBsnd)).append("\n");
    sb.append("    directPremiumCsnd: ").append(toIndentedString(directPremiumCsnd)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
    sb.append("    filTypeMandatory: ").append(toIndentedString(filTypeMandatory)).append("\n");
    sb.append("    usSurplusLineDetails: ").append(toIndentedString(usSurplusLineDetails)).append("\n");
    sb.append("    naicDetails: ").append(toIndentedString(naicDetails)).append("\n");
    sb.append("    contractPolicyPeriodFrom: ").append(toIndentedString(contractPolicyPeriodFrom)).append("\n");
    sb.append("    yearOfAccount: ").append(toIndentedString(yearOfAccount)).append("\n");
    sb.append("    vatDetails: ").append(toIndentedString(vatDetails)).append("\n");
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

