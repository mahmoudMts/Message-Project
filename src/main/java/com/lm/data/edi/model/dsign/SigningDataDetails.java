package com.lm.data.edi.model.dsign;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the signing detail information and the information in the separate segments will repeat as many times as needed for each carrier group. D09 and DA9 are mandatory segments but will be produced by ASG.
 */
@Data
@EqualsAndHashCode
@ToString
@Builder
public class SigningDataDetails  {
    /**
     * Data first Record, Mandatory, Max Occurrence - One occurrence for each company Group in a particular IE Account. Identifies the company to which applies and the period to which the details apply.
     * (Required)
     *
     */
    @JsonProperty("recordTypeD01")
    @Valid
    @NotNull
    private List<RecordTypeD01Inner> recordTypeD01 = new ArrayList<RecordTypeD01Inner>();

    @JsonProperty("group1")
    @Valid
    private List<Group1arrayInner> group1 = new ArrayList<Group1arrayInner>();

    @JsonProperty("amendmentRecordDA1")
    @Valid
    private List<AmendmentRecordDA1Inner> amendmentRecordDA1 = new ArrayList<AmendmentRecordDA1Inner>();


}
