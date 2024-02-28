package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SectionDetail
 */

@JsonTypeName("sectionDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class SectionDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID sectionId;

  private UUID dtSectionId;

  private UUID submissionId;

  private ContractDetails contractDetails;

  private String associatedSND;

  private Integer sectionNumber;

  private String sectionTitle;

  private Slip slip;

  private String sectionDescription;

  private String vesselOrAircraftName;

  private String perilsAndConditions;

  @Valid
  private List<@Valid SumInsured> sumInsured;

  private String sumInsuredNarrative;

  private TypeOfBasis sumInsuredBasis;

  private TypeOfBasis excessBasis;

  private String locationVoyage;

  /**
   * Gets or Sets directOrReinsFlag
   */
  public enum DirectOrReinsFlagEnum {
    DIRECT("Direct"),
    
    REINSURANCE("Reinsurance"),
    
    BOTH("Both");

    private String value;

    DirectOrReinsFlagEnum(String value) {
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
    public static DirectOrReinsFlagEnum fromValue(String value) {
      for (DirectOrReinsFlagEnum b : DirectOrReinsFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DirectOrReinsFlagEnum directOrReinsFlag;

  private Boolean eeaRiskFlag;

  private Boolean unsignedPolReport;

  private Boolean policyProduced;

  private String riskCode;

  private BigDecimal maxDeductions;

  private String deductionsNarrative;

  private Boolean adjustableIndicator;

  /**
   * Gets or Sets agreementsRequired
   */
  public enum AgreementsRequiredEnum {
    LEAD_UNDERWRITER("Lead Underwriter"),
    
    BORDEREAU_FROM_BROKER_REQUIRED("Bordereau from Broker Required"),
    
    SYNDICATES("Syndicates");

    private String value;

    AgreementsRequiredEnum(String value) {
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
    public static AgreementsRequiredEnum fromValue(String value) {
      for (AgreementsRequiredEnum b : AgreementsRequiredEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AgreementsRequiredEnum agreementsRequired;

  /**
   * Gets or Sets accountFreq
   */
  public enum AccountFreqEnum {
    MONTHLY("Monthly"),
    
    BI_MONTHLY("Bi-Monthly"),
    
    QUARTERLY("Quarterly"),
    
    YEARLY("Yearly");

    private String value;

    AccountFreqEnum(String value) {
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
    public static AccountFreqEnum fromValue(String value) {
      for (AccountFreqEnum b : AccountFreqEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AccountFreqEnum accountFreq;

  private Boolean fdoFlag;

  private Integer uwYear;

  private PeriodWithNarrative premiumPeriod;

  private String inceptionExpiryTime;

  private String description;

  private Boolean termsOfTradeRegion;

  private EstPremIncome estPremIncome;

  private TotalDepPrem totalDepPrem;

  private TotalMinPrem totalMinPrem;

  private Boolean adjustableStopInd;

  private Adjustment adjustment;

  @Valid
  private List<@Valid Reinstatement> reinstatements;

  private Boolean subjectivityIndicator;

  
  private OffsetDateTime createdDate;

  
  private OffsetDateTime lastUpdatedDate;

  private RecordStatusCodeEnum recordStatusCode;

  
  private OffsetDateTime recordStatusDate;

  private UUID replacesId;

  private UUID replacedById;

  private Boolean recordValid;

  private MarketRecord market;

  public SectionDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SectionDetail(Integer sectionNumber, String sectionTitle, String locationVoyage, Boolean unsignedPolReport, String riskCode, Boolean subjectivityIndicator) {
    this.sectionNumber = sectionNumber;
    this.sectionTitle = sectionTitle;
    this.locationVoyage = locationVoyage;
    this.unsignedPolReport = unsignedPolReport;
    this.riskCode = riskCode;
    this.subjectivityIndicator = subjectivityIndicator;
  }

  public SectionDetail sectionId(UUID sectionId) {
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

  public SectionDetail dtSectionId(UUID dtSectionId) {
    this.dtSectionId = dtSectionId;
    return this;
  }

  /**
   * Get dtSectionId
   * @return dtSectionId
  */
  @Valid 

  @JsonProperty("dtSectionId")
  public UUID getDtSectionId() {
    return dtSectionId;
  }

  public void setDtSectionId(UUID dtSectionId) {
    this.dtSectionId = dtSectionId;
  }

  public SectionDetail submissionId(UUID submissionId) {
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

  public SectionDetail contractDetails(ContractDetails contractDetails) {
    this.contractDetails = contractDetails;
    return this;
  }

  /**
   * Get contractDetails
   * @return contractDetails
  */
  @Valid 

  @JsonProperty("contractDetails")
  public ContractDetails getContractDetails() {
    return contractDetails;
  }

  public void setContractDetails(ContractDetails contractDetails) {
    this.contractDetails = contractDetails;
  }

  public SectionDetail associatedSND(String associatedSND) {
    this.associatedSND = associatedSND;
    return this;
  }

  /**
   * Get associatedSND
   * @return associatedSND
  */
  

  @JsonProperty("associatedSND")
  public String getAssociatedSND() {
    return associatedSND;
  }

  public void setAssociatedSND(String associatedSND) {
    this.associatedSND = associatedSND;
  }

  public SectionDetail sectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
    return this;
  }

  /**
   * Get sectionNumber
   * @return sectionNumber
  */
  @NotNull 

  @JsonProperty("sectionNumber")
  public Integer getSectionNumber() {
    return sectionNumber;
  }

  public void setSectionNumber(Integer sectionNumber) {
    this.sectionNumber = sectionNumber;
  }

  public SectionDetail sectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
    return this;
  }

  /**
   * Get sectionTitle
   * @return sectionTitle
  */
  @NotNull 

  @JsonProperty("sectionTitle")
  public String getSectionTitle() {
    return sectionTitle;
  }

  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle;
  }

  public SectionDetail slip(Slip slip) {
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

  public SectionDetail sectionDescription(String sectionDescription) {
    this.sectionDescription = sectionDescription;
    return this;
  }

  /**
   * Get sectionDescription
   * @return sectionDescription
  */
  

  @JsonProperty("sectionDescription")
  public String getSectionDescription() {
    return sectionDescription;
  }

  public void setSectionDescription(String sectionDescription) {
    this.sectionDescription = sectionDescription;
  }

  public SectionDetail vesselOrAircraftName(String vesselOrAircraftName) {
    this.vesselOrAircraftName = vesselOrAircraftName;
    return this;
  }

  /**
   * Get vesselOrAircraftName
   * @return vesselOrAircraftName
  */
  

  @JsonProperty("vesselOrAircraftName")
  public String getVesselOrAircraftName() {
    return vesselOrAircraftName;
  }

  public void setVesselOrAircraftName(String vesselOrAircraftName) {
    this.vesselOrAircraftName = vesselOrAircraftName;
  }

  public SectionDetail perilsAndConditions(String perilsAndConditions) {
    this.perilsAndConditions = perilsAndConditions;
    return this;
  }

  /**
   * Get perilsAndConditions
   * @return perilsAndConditions
  */
  

  @JsonProperty("perilsAndConditions")
  public String getPerilsAndConditions() {
    return perilsAndConditions;
  }

  public void setPerilsAndConditions(String perilsAndConditions) {
    this.perilsAndConditions = perilsAndConditions;
  }

  public SectionDetail sumInsured(List<@Valid SumInsured> sumInsured) {
    this.sumInsured = sumInsured;
    return this;
  }

  public SectionDetail addSumInsuredItem(SumInsured sumInsuredItem) {
    if (this.sumInsured == null) {
      this.sumInsured = new ArrayList<>();
    }
    this.sumInsured.add(sumInsuredItem);
    return this;
  }

  /**
   * Get sumInsured
   * @return sumInsured
  */
  @Valid 

  @JsonProperty("sumInsured")
  public List<@Valid SumInsured> getSumInsured() {
    return sumInsured;
  }

  public void setSumInsured(List<@Valid SumInsured> sumInsured) {
    this.sumInsured = sumInsured;
  }

  public SectionDetail sumInsuredNarrative(String sumInsuredNarrative) {
    this.sumInsuredNarrative = sumInsuredNarrative;
    return this;
  }

  /**
   * Get sumInsuredNarrative
   * @return sumInsuredNarrative
  */
  

  @JsonProperty("sumInsuredNarrative")
  public String getSumInsuredNarrative() {
    return sumInsuredNarrative;
  }

  public void setSumInsuredNarrative(String sumInsuredNarrative) {
    this.sumInsuredNarrative = sumInsuredNarrative;
  }

  public SectionDetail sumInsuredBasis(TypeOfBasis sumInsuredBasis) {
    this.sumInsuredBasis = sumInsuredBasis;
    return this;
  }

  /**
   * Get sumInsuredBasis
   * @return sumInsuredBasis
  */
  @Valid 

  @JsonProperty("sumInsuredBasis")
  public TypeOfBasis getSumInsuredBasis() {
    return sumInsuredBasis;
  }

  public void setSumInsuredBasis(TypeOfBasis sumInsuredBasis) {
    this.sumInsuredBasis = sumInsuredBasis;
  }

  public SectionDetail excessBasis(TypeOfBasis excessBasis) {
    this.excessBasis = excessBasis;
    return this;
  }

  /**
   * Get excessBasis
   * @return excessBasis
  */
  @Valid 

  @JsonProperty("excessBasis")
  public TypeOfBasis getExcessBasis() {
    return excessBasis;
  }

  public void setExcessBasis(TypeOfBasis excessBasis) {
    this.excessBasis = excessBasis;
  }

  public SectionDetail locationVoyage(String locationVoyage) {
    this.locationVoyage = locationVoyage;
    return this;
  }

  /**
   * Get locationVoyage
   * @return locationVoyage
  */
  @NotNull 

  @JsonProperty("locationVoyage")
  public String getLocationVoyage() {
    return locationVoyage;
  }

  public void setLocationVoyage(String locationVoyage) {
    this.locationVoyage = locationVoyage;
  }

  public SectionDetail directOrReinsFlag(DirectOrReinsFlagEnum directOrReinsFlag) {
    this.directOrReinsFlag = directOrReinsFlag;
    return this;
  }

  /**
   * Get directOrReinsFlag
   * @return directOrReinsFlag
  */
  

  @JsonProperty("directOrReinsFlag")
  public DirectOrReinsFlagEnum getDirectOrReinsFlag() {
    return directOrReinsFlag;
  }

  public void setDirectOrReinsFlag(DirectOrReinsFlagEnum directOrReinsFlag) {
    this.directOrReinsFlag = directOrReinsFlag;
  }

  public SectionDetail eeaRiskFlag(Boolean eeaRiskFlag) {
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

  public SectionDetail unsignedPolReport(Boolean unsignedPolReport) {
    this.unsignedPolReport = unsignedPolReport;
    return this;
  }

  /**
   * Get unsignedPolReport
   * @return unsignedPolReport
  */
  @NotNull 

  @JsonProperty("unsignedPolReport")
  public Boolean getUnsignedPolReport() {
    return unsignedPolReport;
  }

  public void setUnsignedPolReport(Boolean unsignedPolReport) {
    this.unsignedPolReport = unsignedPolReport;
  }

  public SectionDetail policyProduced(Boolean policyProduced) {
    this.policyProduced = policyProduced;
    return this;
  }

  /**
   * Get policyProduced
   * @return policyProduced
  */
  

  @JsonProperty("policyProduced")
  public Boolean getPolicyProduced() {
    return policyProduced;
  }

  public void setPolicyProduced(Boolean policyProduced) {
    this.policyProduced = policyProduced;
  }

  public SectionDetail riskCode(String riskCode) {
    this.riskCode = riskCode;
    return this;
  }

  /**
   * Get riskCode
   * @return riskCode
  */
  @NotNull 

  @JsonProperty("riskCode")
  public String getRiskCode() {
    return riskCode;
  }

  public void setRiskCode(String riskCode) {
    this.riskCode = riskCode;
  }

  public SectionDetail maxDeductions(BigDecimal maxDeductions) {
    this.maxDeductions = maxDeductions;
    return this;
  }

  /**
   * The percentage to be applied to the tax base amount in order to obtain the tax amount
   * @return maxDeductions
  */
  @Valid 

  @JsonProperty("maxDeductions")
  public BigDecimal getMaxDeductions() {
    return maxDeductions;
  }

  public void setMaxDeductions(BigDecimal maxDeductions) {
    this.maxDeductions = maxDeductions;
  }

  public SectionDetail deductionsNarrative(String deductionsNarrative) {
    this.deductionsNarrative = deductionsNarrative;
    return this;
  }

  /**
   * Get deductionsNarrative
   * @return deductionsNarrative
  */
  

  @JsonProperty("deductionsNarrative")
  public String getDeductionsNarrative() {
    return deductionsNarrative;
  }

  public void setDeductionsNarrative(String deductionsNarrative) {
    this.deductionsNarrative = deductionsNarrative;
  }

  public SectionDetail adjustableIndicator(Boolean adjustableIndicator) {
    this.adjustableIndicator = adjustableIndicator;
    return this;
  }

  /**
   * Get adjustableIndicator
   * @return adjustableIndicator
  */
  

  @JsonProperty("adjustableIndicator")
  public Boolean getAdjustableIndicator() {
    return adjustableIndicator;
  }

  public void setAdjustableIndicator(Boolean adjustableIndicator) {
    this.adjustableIndicator = adjustableIndicator;
  }

  public SectionDetail agreementsRequired(AgreementsRequiredEnum agreementsRequired) {
    this.agreementsRequired = agreementsRequired;
    return this;
  }

  /**
   * Get agreementsRequired
   * @return agreementsRequired
  */
  

  @JsonProperty("agreementsRequired")
  public AgreementsRequiredEnum getAgreementsRequired() {
    return agreementsRequired;
  }

  public void setAgreementsRequired(AgreementsRequiredEnum agreementsRequired) {
    this.agreementsRequired = agreementsRequired;
  }

  public SectionDetail accountFreq(AccountFreqEnum accountFreq) {
    this.accountFreq = accountFreq;
    return this;
  }

  /**
   * Get accountFreq
   * @return accountFreq
  */
  

  @JsonProperty("accountFreq")
  public AccountFreqEnum getAccountFreq() {
    return accountFreq;
  }

  public void setAccountFreq(AccountFreqEnum accountFreq) {
    this.accountFreq = accountFreq;
  }

  public SectionDetail fdoFlag(Boolean fdoFlag) {
    this.fdoFlag = fdoFlag;
    return this;
  }

  /**
   * Get fdoFlag
   * @return fdoFlag
  */
  

  @JsonProperty("fdoFlag")
  public Boolean getFdoFlag() {
    return fdoFlag;
  }

  public void setFdoFlag(Boolean fdoFlag) {
    this.fdoFlag = fdoFlag;
  }

  public SectionDetail uwYear(Integer uwYear) {
    this.uwYear = uwYear;
    return this;
  }

  /**
   * Get uwYear
   * @return uwYear
  */
  

  @JsonProperty("uwYear")
  public Integer getUwYear() {
    return uwYear;
  }

  public void setUwYear(Integer uwYear) {
    this.uwYear = uwYear;
  }

  public SectionDetail premiumPeriod(PeriodWithNarrative premiumPeriod) {
    this.premiumPeriod = premiumPeriod;
    return this;
  }

  /**
   * Get premiumPeriod
   * @return premiumPeriod
  */
  @Valid 

  @JsonProperty("premiumPeriod")
  public PeriodWithNarrative getPremiumPeriod() {
    return premiumPeriod;
  }

  public void setPremiumPeriod(PeriodWithNarrative premiumPeriod) {
    this.premiumPeriod = premiumPeriod;
  }

  public SectionDetail inceptionExpiryTime(String inceptionExpiryTime) {
    this.inceptionExpiryTime = inceptionExpiryTime;
    return this;
  }

  /**
   * Get inceptionExpiryTime
   * @return inceptionExpiryTime
  */
  

  @JsonProperty("inceptionExpiryTime")
  public String getInceptionExpiryTime() {
    return inceptionExpiryTime;
  }

  public void setInceptionExpiryTime(String inceptionExpiryTime) {
    this.inceptionExpiryTime = inceptionExpiryTime;
  }

  public SectionDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SectionDetail termsOfTradeRegion(Boolean termsOfTradeRegion) {
    this.termsOfTradeRegion = termsOfTradeRegion;
    return this;
  }

  /**
   * Get termsOfTradeRegion
   * @return termsOfTradeRegion
  */
  

  @JsonProperty("termsOfTradeRegion")
  public Boolean getTermsOfTradeRegion() {
    return termsOfTradeRegion;
  }

  public void setTermsOfTradeRegion(Boolean termsOfTradeRegion) {
    this.termsOfTradeRegion = termsOfTradeRegion;
  }

  public SectionDetail estPremIncome(EstPremIncome estPremIncome) {
    this.estPremIncome = estPremIncome;
    return this;
  }

  /**
   * Get estPremIncome
   * @return estPremIncome
  */
  @Valid 

  @JsonProperty("estPremIncome")
  public EstPremIncome getEstPremIncome() {
    return estPremIncome;
  }

  public void setEstPremIncome(EstPremIncome estPremIncome) {
    this.estPremIncome = estPremIncome;
  }

  public SectionDetail totalDepPrem(TotalDepPrem totalDepPrem) {
    this.totalDepPrem = totalDepPrem;
    return this;
  }

  /**
   * Get totalDepPrem
   * @return totalDepPrem
  */
  @Valid 

  @JsonProperty("totalDepPrem")
  public TotalDepPrem getTotalDepPrem() {
    return totalDepPrem;
  }

  public void setTotalDepPrem(TotalDepPrem totalDepPrem) {
    this.totalDepPrem = totalDepPrem;
  }

  public SectionDetail totalMinPrem(TotalMinPrem totalMinPrem) {
    this.totalMinPrem = totalMinPrem;
    return this;
  }

  /**
   * Get totalMinPrem
   * @return totalMinPrem
  */
  @Valid 

  @JsonProperty("totalMinPrem")
  public TotalMinPrem getTotalMinPrem() {
    return totalMinPrem;
  }

  public void setTotalMinPrem(TotalMinPrem totalMinPrem) {
    this.totalMinPrem = totalMinPrem;
  }

  public SectionDetail adjustableStopInd(Boolean adjustableStopInd) {
    this.adjustableStopInd = adjustableStopInd;
    return this;
  }

  /**
   * Get adjustableStopInd
   * @return adjustableStopInd
  */
  

  @JsonProperty("adjustableStopInd")
  public Boolean getAdjustableStopInd() {
    return adjustableStopInd;
  }

  public void setAdjustableStopInd(Boolean adjustableStopInd) {
    this.adjustableStopInd = adjustableStopInd;
  }

  public SectionDetail adjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
    return this;
  }

  /**
   * Get adjustment
   * @return adjustment
  */
  @Valid 

  @JsonProperty("adjustment")
  public Adjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
  }

  public SectionDetail reinstatements(List<@Valid Reinstatement> reinstatements) {
    this.reinstatements = reinstatements;
    return this;
  }

  public SectionDetail addReinstatementsItem(Reinstatement reinstatementsItem) {
    if (this.reinstatements == null) {
      this.reinstatements = new ArrayList<>();
    }
    this.reinstatements.add(reinstatementsItem);
    return this;
  }

  /**
   * Get reinstatements
   * @return reinstatements
  */
  @Valid 

  @JsonProperty("reinstatements")
  public List<@Valid Reinstatement> getReinstatements() {
    return reinstatements;
  }

  public void setReinstatements(List<@Valid Reinstatement> reinstatements) {
    this.reinstatements = reinstatements;
  }

  public SectionDetail subjectivityIndicator(Boolean subjectivityIndicator) {
    this.subjectivityIndicator = subjectivityIndicator;
    return this;
  }

  /**
   * Get subjectivityIndicator
   * @return subjectivityIndicator
  */
  @NotNull 

  @JsonProperty("subjectivityIndicator")
  public Boolean getSubjectivityIndicator() {
    return subjectivityIndicator;
  }

  public void setSubjectivityIndicator(Boolean subjectivityIndicator) {
    this.subjectivityIndicator = subjectivityIndicator;
  }

  public SectionDetail createdDate(OffsetDateTime createdDate) {
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

  public SectionDetail lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
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

  public SectionDetail recordStatusCode(RecordStatusCodeEnum recordStatusCode) {
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

  public SectionDetail recordStatusDate(OffsetDateTime recordStatusDate) {
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

  public SectionDetail replacesId(UUID replacesId) {
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

  public SectionDetail replacedById(UUID replacedById) {
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

  public SectionDetail recordValid(Boolean recordValid) {
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

  public SectionDetail market(MarketRecord market) {
    this.market = market;
    return this;
  }

  /**
   * Get market
   * @return market
  */
  @Valid 

  @JsonProperty("market")
  public MarketRecord getMarket() {
    return market;
  }

  public void setMarket(MarketRecord market) {
    this.market = market;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionDetail sectionDetail = (SectionDetail) o;
    return Objects.equals(this.sectionId, sectionDetail.sectionId) &&
        Objects.equals(this.dtSectionId, sectionDetail.dtSectionId) &&
        Objects.equals(this.submissionId, sectionDetail.submissionId) &&
        Objects.equals(this.contractDetails, sectionDetail.contractDetails) &&
        Objects.equals(this.associatedSND, sectionDetail.associatedSND) &&
        Objects.equals(this.sectionNumber, sectionDetail.sectionNumber) &&
        Objects.equals(this.sectionTitle, sectionDetail.sectionTitle) &&
        Objects.equals(this.slip, sectionDetail.slip) &&
        Objects.equals(this.sectionDescription, sectionDetail.sectionDescription) &&
        Objects.equals(this.vesselOrAircraftName, sectionDetail.vesselOrAircraftName) &&
        Objects.equals(this.perilsAndConditions, sectionDetail.perilsAndConditions) &&
        Objects.equals(this.sumInsured, sectionDetail.sumInsured) &&
        Objects.equals(this.sumInsuredNarrative, sectionDetail.sumInsuredNarrative) &&
        Objects.equals(this.sumInsuredBasis, sectionDetail.sumInsuredBasis) &&
        Objects.equals(this.excessBasis, sectionDetail.excessBasis) &&
        Objects.equals(this.locationVoyage, sectionDetail.locationVoyage) &&
        Objects.equals(this.directOrReinsFlag, sectionDetail.directOrReinsFlag) &&
        Objects.equals(this.eeaRiskFlag, sectionDetail.eeaRiskFlag) &&
        Objects.equals(this.unsignedPolReport, sectionDetail.unsignedPolReport) &&
        Objects.equals(this.policyProduced, sectionDetail.policyProduced) &&
        Objects.equals(this.riskCode, sectionDetail.riskCode) &&
        Objects.equals(this.maxDeductions, sectionDetail.maxDeductions) &&
        Objects.equals(this.deductionsNarrative, sectionDetail.deductionsNarrative) &&
        Objects.equals(this.adjustableIndicator, sectionDetail.adjustableIndicator) &&
        Objects.equals(this.agreementsRequired, sectionDetail.agreementsRequired) &&
        Objects.equals(this.accountFreq, sectionDetail.accountFreq) &&
        Objects.equals(this.fdoFlag, sectionDetail.fdoFlag) &&
        Objects.equals(this.uwYear, sectionDetail.uwYear) &&
        Objects.equals(this.premiumPeriod, sectionDetail.premiumPeriod) &&
        Objects.equals(this.inceptionExpiryTime, sectionDetail.inceptionExpiryTime) &&
        Objects.equals(this.description, sectionDetail.description) &&
        Objects.equals(this.termsOfTradeRegion, sectionDetail.termsOfTradeRegion) &&
        Objects.equals(this.estPremIncome, sectionDetail.estPremIncome) &&
        Objects.equals(this.totalDepPrem, sectionDetail.totalDepPrem) &&
        Objects.equals(this.totalMinPrem, sectionDetail.totalMinPrem) &&
        Objects.equals(this.adjustableStopInd, sectionDetail.adjustableStopInd) &&
        Objects.equals(this.adjustment, sectionDetail.adjustment) &&
        Objects.equals(this.reinstatements, sectionDetail.reinstatements) &&
        Objects.equals(this.subjectivityIndicator, sectionDetail.subjectivityIndicator) &&
        Objects.equals(this.createdDate, sectionDetail.createdDate) &&
        Objects.equals(this.lastUpdatedDate, sectionDetail.lastUpdatedDate) &&
        Objects.equals(this.recordStatusCode, sectionDetail.recordStatusCode) &&
        Objects.equals(this.recordStatusDate, sectionDetail.recordStatusDate) &&
        Objects.equals(this.replacesId, sectionDetail.replacesId) &&
        Objects.equals(this.replacedById, sectionDetail.replacedById) &&
        Objects.equals(this.recordValid, sectionDetail.recordValid) &&
        Objects.equals(this.market, sectionDetail.market);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, dtSectionId, submissionId, contractDetails, associatedSND, sectionNumber, sectionTitle, slip, sectionDescription, vesselOrAircraftName, perilsAndConditions, sumInsured, sumInsuredNarrative, sumInsuredBasis, excessBasis, locationVoyage, directOrReinsFlag, eeaRiskFlag, unsignedPolReport, policyProduced, riskCode, maxDeductions, deductionsNarrative, adjustableIndicator, agreementsRequired, accountFreq, fdoFlag, uwYear, premiumPeriod, inceptionExpiryTime, description, termsOfTradeRegion, estPremIncome, totalDepPrem, totalMinPrem, adjustableStopInd, adjustment, reinstatements, subjectivityIndicator, createdDate, lastUpdatedDate, recordStatusCode, recordStatusDate, replacesId, replacedById, recordValid, market);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionDetail {\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    dtSectionId: ").append(toIndentedString(dtSectionId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    contractDetails: ").append(toIndentedString(contractDetails)).append("\n");
    sb.append("    associatedSND: ").append(toIndentedString(associatedSND)).append("\n");
    sb.append("    sectionNumber: ").append(toIndentedString(sectionNumber)).append("\n");
    sb.append("    sectionTitle: ").append(toIndentedString(sectionTitle)).append("\n");
    sb.append("    slip: ").append(toIndentedString(slip)).append("\n");
    sb.append("    sectionDescription: ").append(toIndentedString(sectionDescription)).append("\n");
    sb.append("    vesselOrAircraftName: ").append(toIndentedString(vesselOrAircraftName)).append("\n");
    sb.append("    perilsAndConditions: ").append(toIndentedString(perilsAndConditions)).append("\n");
    sb.append("    sumInsured: ").append(toIndentedString(sumInsured)).append("\n");
    sb.append("    sumInsuredNarrative: ").append(toIndentedString(sumInsuredNarrative)).append("\n");
    sb.append("    sumInsuredBasis: ").append(toIndentedString(sumInsuredBasis)).append("\n");
    sb.append("    excessBasis: ").append(toIndentedString(excessBasis)).append("\n");
    sb.append("    locationVoyage: ").append(toIndentedString(locationVoyage)).append("\n");
    sb.append("    directOrReinsFlag: ").append(toIndentedString(directOrReinsFlag)).append("\n");
    sb.append("    eeaRiskFlag: ").append(toIndentedString(eeaRiskFlag)).append("\n");
    sb.append("    unsignedPolReport: ").append(toIndentedString(unsignedPolReport)).append("\n");
    sb.append("    policyProduced: ").append(toIndentedString(policyProduced)).append("\n");
    sb.append("    riskCode: ").append(toIndentedString(riskCode)).append("\n");
    sb.append("    maxDeductions: ").append(toIndentedString(maxDeductions)).append("\n");
    sb.append("    deductionsNarrative: ").append(toIndentedString(deductionsNarrative)).append("\n");
    sb.append("    adjustableIndicator: ").append(toIndentedString(adjustableIndicator)).append("\n");
    sb.append("    agreementsRequired: ").append(toIndentedString(agreementsRequired)).append("\n");
    sb.append("    accountFreq: ").append(toIndentedString(accountFreq)).append("\n");
    sb.append("    fdoFlag: ").append(toIndentedString(fdoFlag)).append("\n");
    sb.append("    uwYear: ").append(toIndentedString(uwYear)).append("\n");
    sb.append("    premiumPeriod: ").append(toIndentedString(premiumPeriod)).append("\n");
    sb.append("    inceptionExpiryTime: ").append(toIndentedString(inceptionExpiryTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    termsOfTradeRegion: ").append(toIndentedString(termsOfTradeRegion)).append("\n");
    sb.append("    estPremIncome: ").append(toIndentedString(estPremIncome)).append("\n");
    sb.append("    totalDepPrem: ").append(toIndentedString(totalDepPrem)).append("\n");
    sb.append("    totalMinPrem: ").append(toIndentedString(totalMinPrem)).append("\n");
    sb.append("    adjustableStopInd: ").append(toIndentedString(adjustableStopInd)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    reinstatements: ").append(toIndentedString(reinstatements)).append("\n");
    sb.append("    subjectivityIndicator: ").append(toIndentedString(subjectivityIndicator)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    recordStatusCode: ").append(toIndentedString(recordStatusCode)).append("\n");
    sb.append("    recordStatusDate: ").append(toIndentedString(recordStatusDate)).append("\n");
    sb.append("    replacesId: ").append(toIndentedString(replacesId)).append("\n");
    sb.append("    replacedById: ").append(toIndentedString(replacedById)).append("\n");
    sb.append("    recordValid: ").append(toIndentedString(recordValid)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
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

