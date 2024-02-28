package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

/**
 * TreatyStatementSigningsD05Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class TreatyStatementSigningsD05Inner {

@JsonProperty("D02D03D04D05CommonContainers")
@Valid
@NotNull
private D02D03D04D05InCommon d02D03D04D05CommonContainers;

@JsonProperty("itemsTableD05")
@Size(max = 44)
@Valid
@NotNull
private List<ItemsTableD05Inner> itemsTableD05 = new ArrayList<ItemsTableD05Inner>();

@JsonProperty("addClaimsPresent")
private TreatyStatementSigningsD05Inner.AddClaimsPresent addClaimsPresent;

@JsonProperty("addClaimsNew")
@Size(max = 8)
@Valid
private List<AddClaimsNew> addClaimsNew = new ArrayList<AddClaimsNew>();


public enum AddClaimsPresent {

  Y("Y"),
  N("N");
  private final String value;
  private final static Map<String, TreatyStatementSigningsD05Inner.AddClaimsPresent> CONSTANTS = new HashMap<String, TreatyStatementSigningsD05Inner.AddClaimsPresent>();

  static {
    for (TreatyStatementSigningsD05Inner.AddClaimsPresent c : values()) {
      CONSTANTS.put(c.value, c);
    }
  }

  private AddClaimsPresent(String value) {
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
  public static TreatyStatementSigningsD05Inner.AddClaimsPresent fromValue(String value) {
    TreatyStatementSigningsD05Inner.AddClaimsPresent constant = CONSTANTS.get(value);
    if (constant == null) {
      throw new IllegalArgumentException(value);
    } else {
      return constant;
    }
  }
}
}

