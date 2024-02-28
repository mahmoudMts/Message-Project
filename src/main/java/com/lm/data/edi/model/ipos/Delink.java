package com.lm.data.edi.model.ipos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Delink
 */

@JsonTypeName("delink")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-05T14:26:08.215951400+05:30[Asia/Calcutta]")
public class Delink implements Serializable {

  private static final long serialVersionUID = 1L;

  private ReleaseFlagEnum releaseFlag;

  private String description;

  /**
   * Gets or Sets brokerReleaseAllowed
   */
  public enum BrokerReleaseAllowedEnum {
    TRUE("true"),
    
    YES_UP_UNTIL_SDD("Yes - Up until SDD"),
    
    NO_DXC_TO_RELEASE("No - DXC to Release");

    private String value;

    BrokerReleaseAllowedEnum(String value) {
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
    public static BrokerReleaseAllowedEnum fromValue(String value) {
      for (BrokerReleaseAllowedEnum b : BrokerReleaseAllowedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BrokerReleaseAllowedEnum brokerReleaseAllowed;

  private ReleasedForSettlementEnum releasedForSettlement;

  private String releaseByUserId;

  private OffsetDateTime releasedOnDate;

  private LocalDate releaseDate;

  public Delink() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Delink(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
  }

  public Delink releaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
    return this;
  }

  /**
   * Get releaseFlag
   * @return releaseFlag
  */
  @NotNull @Valid 

  @JsonProperty("releaseFlag")
  public ReleaseFlagEnum getReleaseFlag() {
    return releaseFlag;
  }

  public void setReleaseFlag(ReleaseFlagEnum releaseFlag) {
    this.releaseFlag = releaseFlag;
  }

  public Delink description(String description) {
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

  public Delink brokerReleaseAllowed(BrokerReleaseAllowedEnum brokerReleaseAllowed) {
    this.brokerReleaseAllowed = brokerReleaseAllowed;
    return this;
  }

  /**
   * Get brokerReleaseAllowed
   * @return brokerReleaseAllowed
  */
  

  @JsonProperty("brokerReleaseAllowed")
  public BrokerReleaseAllowedEnum getBrokerReleaseAllowed() {
    return brokerReleaseAllowed;
  }

  public void setBrokerReleaseAllowed(BrokerReleaseAllowedEnum brokerReleaseAllowed) {
    this.brokerReleaseAllowed = brokerReleaseAllowed;
  }

  public Delink releasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
    return this;
  }

  /**
   * Get releasedForSettlement
   * @return releasedForSettlement
  */
  @Valid 

  @JsonProperty("releasedForSettlement")
  public ReleasedForSettlementEnum getReleasedForSettlement() {
    return releasedForSettlement;
  }

  public void setReleasedForSettlement(ReleasedForSettlementEnum releasedForSettlement) {
    this.releasedForSettlement = releasedForSettlement;
  }

  public Delink releaseByUserId(String releaseByUserId) {
    this.releaseByUserId = releaseByUserId;
    return this;
  }

  /**
   * The userId of the tecchnician/broker that released the linked premium for settlement - For future use in RESETT epic
   * @return releaseByUserId
  */
  

  @JsonProperty("releaseByUserId")
  public String getReleaseByUserId() {
    return releaseByUserId;
  }

  public void setReleaseByUserId(String releaseByUserId) {
    this.releaseByUserId = releaseByUserId;
  }

  public Delink releasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
    return this;
  }

  /**
   * The date and time the linked premium for released for settlement - For future use in RESETT epic
   * @return releasedOnDate
  */
  @Valid 

  @JsonProperty("releasedOnDate")
  public OffsetDateTime getReleasedOnDate() {
    return releasedOnDate;
  }

  public void setReleasedOnDate(OffsetDateTime releasedOnDate) {
    this.releasedOnDate = releasedOnDate;
  }

  public Delink releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Date on which Release is to be done. It's a user entered field. It will be date of processing when nothing entered - For future use in RESETT epic
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
    Delink delink = (Delink) o;
    return Objects.equals(this.releaseFlag, delink.releaseFlag) &&
        Objects.equals(this.description, delink.description) &&
        Objects.equals(this.brokerReleaseAllowed, delink.brokerReleaseAllowed) &&
        Objects.equals(this.releasedForSettlement, delink.releasedForSettlement) &&
        Objects.equals(this.releaseByUserId, delink.releaseByUserId) &&
        Objects.equals(this.releasedOnDate, delink.releasedOnDate) &&
        Objects.equals(this.releaseDate, delink.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseFlag, description, brokerReleaseAllowed, releasedForSettlement, releaseByUserId, releasedOnDate, releaseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Delink {\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brokerReleaseAllowed: ").append(toIndentedString(brokerReleaseAllowed)).append("\n");
    sb.append("    releasedForSettlement: ").append(toIndentedString(releasedForSettlement)).append("\n");
    sb.append("    releaseByUserId: ").append(toIndentedString(releaseByUserId)).append("\n");
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

