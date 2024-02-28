package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

/**
 * ItemsTableD05Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class ItemsTableD05Inner   {
  @JsonProperty("numberD05Items")
  @Pattern(regexp="[0-9]{1,3}")
  private String numberD05Items;

  @JsonProperty("amountItems")
  @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
  @NotNull
  private String amountItems;

  @JsonProperty("memberSettlementAmount")
  @Pattern(regexp = "-?[0-9]+(?:[.][0-9]{2})?")
  @NotNull
  private String memberSettlementAmount;

  @JsonProperty("outstandingLoss")
  private OutstandingLoss outstandingLoss;

  @JsonProperty("narrativeInformation1")
  @Size(max=60)
  private String narrativeInformation1;

  @JsonProperty("narrativeInformation2")
  @Size(max = 60)
  private String narrativeInformation2;

  @JsonProperty("narrativeInformation3")
  @Size(max = 60)
  private String narrativeInformation3;

  @JsonProperty("narrativeInformation4")
  @Size(max=60)
  private String narrativeInformation4;
  /**
   * A code used to qualify the outstanding loss position at the end of a periodic account when outstanding loss amount is zero. N-  Nil (No further claim likely), Y - None advised, Space - Request for more inf
   */
  public enum OutstandingLoss {

    N("N"),
    Y("Y"),
    __EMPTY__(" ");
    private final String value;
    private final static Map<String, OutstandingLoss> CONSTANTS = new HashMap<String, OutstandingLoss>();

    static {
      for (ItemsTableD05Inner.OutstandingLoss c: values()) {
        CONSTANTS.put(c.value, c);
      }
    }

    private OutstandingLoss(String value) {
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
    public static ItemsTableD05Inner.OutstandingLoss fromValue(String value) {
      ItemsTableD05Inner.OutstandingLoss constant = CONSTANTS.get(value);
      if (constant == null) {
        throw new IllegalArgumentException(value);
      } else {
        return constant;
      }
    }

  }

}
