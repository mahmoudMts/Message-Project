package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

/**
 * RecordTypeD01Inner
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class RecordTypeD01Inner   {
  @JsonProperty("companyCode")
  @Pattern(regexp = "[A-Z][0-9]{2}")
  @NotNull
  private String companyCode ;

  @JsonProperty("workDate")
  private String workDate ;

  @JsonProperty("settlementPeriodStart")
  private String settlementPeriodStart ;

  @JsonProperty("settlementPeriodEnd")
  private LocalDate settlementPeriodEnd;




}
