package com.lm.data.edi.model.ilucsb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ILUCSBNotificationRequest {
	private String marketGroupReference;
	private String partyId;
	private String settlementDate;
	private String fromDate;
	private String toDate;
}
