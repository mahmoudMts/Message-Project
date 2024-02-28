package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * ProblemFormatItem
 */
@Data
@EqualsAndHashCode
@ToString
public class ProblemFormatItem   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("detail")
  private String detail = null;
  @JsonProperty("domain")
  private DomainEnum domain = null;

  @JsonProperty("errorCode")
  private Integer errorCode = null;
  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    RISK("RISK"),
    
    PREMIUM("PREMIUM"),
    
    CLAIM("CLAIM"),
    
    DOCUMENT("DOCUMENT"),
    
    EXPERTFEES("EXPERTFEES"),
    
    PARTY("PARTY"),
    
    NOTIFICATION("NOTIFICATION"),
    
    SETTLEMENTS("SETTLEMENTS"),
    
    SANCTIONS("SANCTIONS"),
    
    TREATY("TREATY"),
    
    REFERENCEDATA("REFERENCEDATA"),
    
    QUERY("QUERY");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DomainEnum fromValue(String text) {
      for (DomainEnum b : DomainEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }




}
