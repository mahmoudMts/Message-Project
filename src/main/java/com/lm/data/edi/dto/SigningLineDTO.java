package com.lm.data.edi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigningLineDTO {
	
	/**
	 * carrierReference
	 */
	private String companyReference;
	
	/**
	 * carrierSecondaryReference
	 */
	private String companySecondaryReference;
}
