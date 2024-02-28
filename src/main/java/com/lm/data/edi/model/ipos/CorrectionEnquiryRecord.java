package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CorrectionEnquiryRecord
 */

@JsonTypeName("correctionEnquiryRecord")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class CorrectionEnquiryRecord implements Serializable {

  private static final long serialVersionUID = 1L;

  private String bsnd;

  private String csnd;

  private UUID premiumId;

  private ReleaseFlagEnum releaseFlag;

  /**
   * Gets or Sets delinkreleaseFlag
   */
  public enum DelinkreleaseFlagEnum {
    DELINKED("Delinked"),
    
    SCHEDULED("Scheduled"),
    
    RELEASED("Released");

    private String value;

    DelinkreleaseFlagEnum(String value) {
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
    public static DelinkreleaseFlagEnum fromValue(String value) {
      for (DelinkreleaseFlagEnum b : DelinkreleaseFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DelinkreleaseFlagEnum delinkreleaseFlag;

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

  private Boolean hasAP;

  private Boolean hasRP;

  public CorrectionEnquiryRecord bsnd(String bsnd) {
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

  public CorrectionEnquiryRecord csnd(String csnd) {
    this.csnd = csnd;
    return this;
  }

  /**
   * Get csnd
   * @return csnd
  */
  

  @JsonProperty("csnd")
  public String getCsnd() {
    return csnd;
  }

  public void setCsnd(String csnd) {
    this.csnd = csnd;
  }

  public CorrectionEnquiryRecord premiumId(UUID premiumId) {
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

  public CorrectionEnquiryRecord releaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
    return this;
  }

  /**
   * Get releaseFlag
   * @return releaseFlag
  */
  @Valid 

  @JsonProperty("releaseFlag")
  public ReleaseFlagEnum getReleaseFlag() {
    return releaseFlag;
  }

  public void setReleaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
  }

  public CorrectionEnquiryRecord delinkreleaseFlag(DelinkreleaseFlagEnum delinkreleaseFlag) {
    this.delinkreleaseFlag = delinkreleaseFlag;
    return this;
  }

  /**
   * Get delinkreleaseFlag
   * @return delinkreleaseFlag
  */
  

  @JsonProperty("delinkreleaseFlag")
  public DelinkreleaseFlagEnum getDelinkreleaseFlag() {
    return delinkreleaseFlag;
  }

  public void setDelinkreleaseFlag(DelinkreleaseFlagEnum delinkreleaseFlag) {
    this.delinkreleaseFlag = delinkreleaseFlag;
  }

  public CorrectionEnquiryRecord settled(SettledEnum settled) {
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

  public CorrectionEnquiryRecord hasAP(Boolean hasAP) {
    this.hasAP = hasAP;
    return this;
  }

  /**
   * Get hasAP
   * @return hasAP
  */
  

  @JsonProperty("hasAP")
  public Boolean getHasAP() {
    return hasAP;
  }

  public void setHasAP(Boolean hasAP) {
    this.hasAP = hasAP;
  }

  public CorrectionEnquiryRecord hasRP(Boolean hasRP) {
    this.hasRP = hasRP;
    return this;
  }

  /**
   * Get hasRP
   * @return hasRP
  */
  

  @JsonProperty("hasRP")
  public Boolean getHasRP() {
    return hasRP;
  }

  public void setHasRP(Boolean hasRP) {
    this.hasRP = hasRP;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrectionEnquiryRecord correctionEnquiryRecord = (CorrectionEnquiryRecord) o;
    return Objects.equals(this.bsnd, correctionEnquiryRecord.bsnd) &&
        Objects.equals(this.csnd, correctionEnquiryRecord.csnd) &&
        Objects.equals(this.premiumId, correctionEnquiryRecord.premiumId) &&
        Objects.equals(this.releaseFlag, correctionEnquiryRecord.releaseFlag) &&
        Objects.equals(this.delinkreleaseFlag, correctionEnquiryRecord.delinkreleaseFlag) &&
        Objects.equals(this.settled, correctionEnquiryRecord.settled) &&
        Objects.equals(this.hasAP, correctionEnquiryRecord.hasAP) &&
        Objects.equals(this.hasRP, correctionEnquiryRecord.hasRP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsnd, csnd, premiumId, releaseFlag, delinkreleaseFlag, settled, hasAP, hasRP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectionEnquiryRecord {\n");
    sb.append("    bsnd: ").append(toIndentedString(bsnd)).append("\n");
    sb.append("    csnd: ").append(toIndentedString(csnd)).append("\n");
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    delinkreleaseFlag: ").append(toIndentedString(delinkreleaseFlag)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    hasAP: ").append(toIndentedString(hasAP)).append("\n");
    sb.append("    hasRP: ").append(toIndentedString(hasRP)).append("\n");
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

