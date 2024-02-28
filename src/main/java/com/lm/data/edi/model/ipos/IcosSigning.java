package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IcosSigning
 */

@JsonTypeName("icosSigning")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class IcosSigning implements Serializable {

  private static final long serialVersionUID = 1L;

  private TypeOfCountry countryOfOrigin;

  private TypeOfCurrency originalCurrency;

  private String obsnd;

  private String ocsnd;

  @Valid
  private List<@Valid IcosSigningAdditionalCsnds> additionalCsnds;

  private ReleaseFlagEnum releaseFlag;

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

  private RecordStatusCodeEnum ocsndStatusCode;

  public IcosSigning countryOfOrigin(TypeOfCountry countryOfOrigin) {
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

  public IcosSigning originalCurrency(TypeOfCurrency originalCurrency) {
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

  public IcosSigning obsnd(String obsnd) {
    this.obsnd = obsnd;
    return this;
  }

  /**
   * For OP - the broker signing number and date For AP and RPs - the broker signing number and date of original premium <br> For an auto RI AP/RP, this will be the bsnd of the auto RI of the OP
   * @return obsnd
  */
  

  @JsonProperty("obsnd")
  public String getObsnd() {
    return obsnd;
  }

  public void setObsnd(String obsnd) {
    this.obsnd = obsnd;
  }

  public IcosSigning ocsnd(String ocsnd) {
    this.ocsnd = ocsnd;
    return this;
  }

  /**
   * For OP - the carrier signing number and date For AP and RPs - thecarrier signing number and date of original premium<br> For an auto RI AP/RP, this will be the csnd of the auto RI of the OP
   * @return ocsnd
  */
  

  @JsonProperty("ocsnd")
  public String getOcsnd() {
    return ocsnd;
  }

  public void setOcsnd(String ocsnd) {
    this.ocsnd = ocsnd;
  }

  public IcosSigning additionalCsnds(List<@Valid IcosSigningAdditionalCsnds> additionalCsnds) {
    this.additionalCsnds = additionalCsnds;
    return this;
  }

  public IcosSigning addAdditionalCsndsItem(IcosSigningAdditionalCsnds additionalCsndsItem) {
    if (this.additionalCsnds == null) {
      this.additionalCsnds = new ArrayList<>();
    }
    this.additionalCsnds.add(additionalCsndsItem);
    return this;
  }

  /**
   * Get additionalCsnds
   * @return additionalCsnds
  */
  @Valid 

  @JsonProperty("additionalCsnds")
  public List<@Valid IcosSigningAdditionalCsnds> getAdditionalCsnds() {
    return additionalCsnds;
  }

  public void setAdditionalCsnds(List<@Valid IcosSigningAdditionalCsnds> additionalCsnds) {
    this.additionalCsnds = additionalCsnds;
  }

  public IcosSigning releaseFlag(ReleaseFlagEnum releaseFlag) {
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

  public IcosSigning settled(SettledEnum settled) {
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

  public IcosSigning ocsndStatusCode(RecordStatusCodeEnum ocsndStatusCode) {
    this.ocsndStatusCode = ocsndStatusCode;
    return this;
  }

  /**
   * Get ocsndStatusCode
   * @return ocsndStatusCode
  */
  @Valid 

  @JsonProperty("ocsndStatusCode")
  public RecordStatusCodeEnum getOcsndStatusCode() {
    return ocsndStatusCode;
  }

  public void setOcsndStatusCode(RecordStatusCodeEnum ocsndStatusCode) {
    this.ocsndStatusCode = ocsndStatusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IcosSigning icosSigning = (IcosSigning) o;
    return Objects.equals(this.countryOfOrigin, icosSigning.countryOfOrigin) &&
        Objects.equals(this.originalCurrency, icosSigning.originalCurrency) &&
        Objects.equals(this.obsnd, icosSigning.obsnd) &&
        Objects.equals(this.ocsnd, icosSigning.ocsnd) &&
        Objects.equals(this.additionalCsnds, icosSigning.additionalCsnds) &&
        Objects.equals(this.releaseFlag, icosSigning.releaseFlag) &&
        Objects.equals(this.settled, icosSigning.settled) &&
        Objects.equals(this.ocsndStatusCode, icosSigning.ocsndStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfOrigin, originalCurrency, obsnd, ocsnd, additionalCsnds, releaseFlag, settled, ocsndStatusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IcosSigning {\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    obsnd: ").append(toIndentedString(obsnd)).append("\n");
    sb.append("    ocsnd: ").append(toIndentedString(ocsnd)).append("\n");
    sb.append("    additionalCsnds: ").append(toIndentedString(additionalCsnds)).append("\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    ocsndStatusCode: ").append(toIndentedString(ocsndStatusCode)).append("\n");
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

