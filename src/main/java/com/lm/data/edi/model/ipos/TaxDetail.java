package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TaxDetail
 */

@JsonTypeName("taxDetail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class TaxDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private UUID taxId;

  private UUID premiumId;

  private TypeOfCountryOfTax countryOfTax;

  private TypeOfCountrySubDivision region;

  private TypeOfTaxType taxType;

  private String riskType;

  private BigDecimal taxablePremium;

  private BigDecimal taxRate;

  private BigDecimal taxAmount;

  /**
   * Gets or Sets deductionAdditionCode
   */
  public enum DeductionAdditionCodeEnum {
    ADDITION("Addition"),
    
    DEDUCTED("Deducted"),
    
    LOCALLY_SETTLED("Locally Settled");

    private String value;

    DeductionAdditionCodeEnum(String value) {
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
    public static DeductionAdditionCodeEnum fromValue(String value) {
      for (DeductionAdditionCodeEnum b : DeductionAdditionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeductionAdditionCodeEnum deductionAdditionCode;

  /**
   * Gets or Sets settledOrRecorded
   */
  public enum SettledOrRecordedEnum {
    SETTLED("Settled"),
    
    RECORDED("Recorded");

    private String value;

    SettledOrRecordedEnum(String value) {
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
    public static SettledOrRecordedEnum fromValue(String value) {
      for (SettledOrRecordedEnum b : SettledOrRecordedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SettledOrRecordedEnum settledOrRecorded;

  /**
   * Gets or Sets directOrBrokerCode
   */
  public enum DirectOrBrokerCodeEnum {
    BR("BR"),
    
    DI("DI");

    private String value;

    DirectOrBrokerCodeEnum(String value) {
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
    public static DirectOrBrokerCodeEnum fromValue(String value) {
      for (DirectOrBrokerCodeEnum b : DirectOrBrokerCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DirectOrBrokerCodeEnum directOrBrokerCode;

  private Integer numberPolicies;

  private Integer numberVehicles;

  public TaxDetail taxId(UUID taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
  */
  @Valid 

  @JsonProperty("taxId")
  public UUID getTaxId() {
    return taxId;
  }

  public void setTaxId(UUID taxId) {
    this.taxId = taxId;
  }

  public TaxDetail premiumId(UUID premiumId) {
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

  public TaxDetail countryOfTax(TypeOfCountryOfTax countryOfTax) {
    this.countryOfTax = countryOfTax;
    return this;
  }

  /**
   * Get countryOfTax
   * @return countryOfTax
  */
  @Valid 

  @JsonProperty("countryOfTax")
  public TypeOfCountryOfTax getCountryOfTax() {
    return countryOfTax;
  }

  public void setCountryOfTax(TypeOfCountryOfTax countryOfTax) {
    this.countryOfTax = countryOfTax;
  }

  public TaxDetail region(TypeOfCountrySubDivision region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @Valid 

  @JsonProperty("region")
  public TypeOfCountrySubDivision getRegion() {
    return region;
  }

  public void setRegion(TypeOfCountrySubDivision region) {
    this.region = region;
  }

  public TaxDetail taxType(TypeOfTaxType taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Get taxType
   * @return taxType
  */
  @Valid 

  @JsonProperty("taxType")
  public TypeOfTaxType getTaxType() {
    return taxType;
  }

  public void setTaxType(TypeOfTaxType taxType) {
    this.taxType = taxType;
  }

  public TaxDetail riskType(String riskType) {
    this.riskType = riskType;
    return this;
  }

  /**
   * Get riskType
   * @return riskType
  */
  

  @JsonProperty("riskType")
  public String getRiskType() {
    return riskType;
  }

  public void setRiskType(String riskType) {
    this.riskType = riskType;
  }

  public TaxDetail taxablePremium(BigDecimal taxablePremium) {
    this.taxablePremium = taxablePremium;
    return this;
  }

  /**
   * Get taxablePremium
   * @return taxablePremium
  */
  @Valid 

  @JsonProperty("taxablePremium")
  public BigDecimal getTaxablePremium() {
    return taxablePremium;
  }

  public void setTaxablePremium(BigDecimal taxablePremium) {
    this.taxablePremium = taxablePremium;
  }

  public TaxDetail taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Get taxRate
   * @return taxRate
  */
  @Valid 

  @JsonProperty("taxRate")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public TaxDetail taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
  @Valid 

  @JsonProperty("taxAmount")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxDetail deductionAdditionCode(DeductionAdditionCodeEnum deductionAdditionCode) {
    this.deductionAdditionCode = deductionAdditionCode;
    return this;
  }

  /**
   * Get deductionAdditionCode
   * @return deductionAdditionCode
  */
  

  @JsonProperty("deductionAdditionCode")
  public DeductionAdditionCodeEnum getDeductionAdditionCode() {
    return deductionAdditionCode;
  }

  public void setDeductionAdditionCode(DeductionAdditionCodeEnum deductionAdditionCode) {
    this.deductionAdditionCode = deductionAdditionCode;
  }

  public TaxDetail settledOrRecorded(SettledOrRecordedEnum settledOrRecorded) {
    this.settledOrRecorded = settledOrRecorded;
    return this;
  }

  /**
   * Get settledOrRecorded
   * @return settledOrRecorded
  */
  

  @JsonProperty("settledOrRecorded")
  public SettledOrRecordedEnum getSettledOrRecorded() {
    return settledOrRecorded;
  }

  public void setSettledOrRecorded(SettledOrRecordedEnum settledOrRecorded) {
    this.settledOrRecorded = settledOrRecorded;
  }

  public TaxDetail directOrBrokerCode(DirectOrBrokerCodeEnum directOrBrokerCode) {
    this.directOrBrokerCode = directOrBrokerCode;
    return this;
  }

  /**
   * Get directOrBrokerCode
   * @return directOrBrokerCode
  */
  

  @JsonProperty("directOrBrokerCode")
  public DirectOrBrokerCodeEnum getDirectOrBrokerCode() {
    return directOrBrokerCode;
  }

  public void setDirectOrBrokerCode(DirectOrBrokerCodeEnum directOrBrokerCode) {
    this.directOrBrokerCode = directOrBrokerCode;
  }

  public TaxDetail numberPolicies(Integer numberPolicies) {
    this.numberPolicies = numberPolicies;
    return this;
  }

  /**
   * Get numberPolicies
   * @return numberPolicies
  */
  

  @JsonProperty("numberPolicies")
  public Integer getNumberPolicies() {
    return numberPolicies;
  }

  public void setNumberPolicies(Integer numberPolicies) {
    this.numberPolicies = numberPolicies;
  }

  public TaxDetail numberVehicles(Integer numberVehicles) {
    this.numberVehicles = numberVehicles;
    return this;
  }

  /**
   * Get numberVehicles
   * @return numberVehicles
  */
  

  @JsonProperty("numberVehicles")
  public Integer getNumberVehicles() {
    return numberVehicles;
  }

  public void setNumberVehicles(Integer numberVehicles) {
    this.numberVehicles = numberVehicles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDetail taxDetail = (TaxDetail) o;
    return Objects.equals(this.taxId, taxDetail.taxId) &&
        Objects.equals(this.premiumId, taxDetail.premiumId) &&
        Objects.equals(this.countryOfTax, taxDetail.countryOfTax) &&
        Objects.equals(this.region, taxDetail.region) &&
        Objects.equals(this.taxType, taxDetail.taxType) &&
        Objects.equals(this.riskType, taxDetail.riskType) &&
        Objects.equals(this.taxablePremium, taxDetail.taxablePremium) &&
        Objects.equals(this.taxRate, taxDetail.taxRate) &&
        Objects.equals(this.taxAmount, taxDetail.taxAmount) &&
        Objects.equals(this.deductionAdditionCode, taxDetail.deductionAdditionCode) &&
        Objects.equals(this.settledOrRecorded, taxDetail.settledOrRecorded) &&
        Objects.equals(this.directOrBrokerCode, taxDetail.directOrBrokerCode) &&
        Objects.equals(this.numberPolicies, taxDetail.numberPolicies) &&
        Objects.equals(this.numberVehicles, taxDetail.numberVehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, premiumId, countryOfTax, region, taxType, riskType, taxablePremium, taxRate, taxAmount, deductionAdditionCode, settledOrRecorded, directOrBrokerCode, numberPolicies, numberVehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDetail {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    countryOfTax: ").append(toIndentedString(countryOfTax)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
    sb.append("    taxablePremium: ").append(toIndentedString(taxablePremium)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    deductionAdditionCode: ").append(toIndentedString(deductionAdditionCode)).append("\n");
    sb.append("    settledOrRecorded: ").append(toIndentedString(settledOrRecorded)).append("\n");
    sb.append("    directOrBrokerCode: ").append(toIndentedString(directOrBrokerCode)).append("\n");
    sb.append("    numberPolicies: ").append(toIndentedString(numberPolicies)).append("\n");
    sb.append("    numberVehicles: ").append(toIndentedString(numberVehicles)).append("\n");
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

