package com.lm.data.edi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyndicateDetailsDTO {

	private String marketId;

	private String partyId;

	/**
	 * MCM	nameandAddressDetails	partyIdentificationCoded
	 * Right justified. PARTY IDENTIFICATION coded. The Lloyd's syndicate number is advised. Syndicate number is shown with leading blanks.
	 */
	private String syndicateNumber;
}
