package com.lm.data.edi.model.mcm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MCMSettlementRow {
        private String segmentTag;
        private String monetoryAmountQualifier;
        private String amount;
        private String currency;
        private String controlQualifier;
        private String transactionCount;
        private String dateTimeQualifier;
        private String controlMessagePeriod;
        private String yearOfAccount;
        private String messageName;
        private String userNumber;
        private String messageReferenceNumber;
        private String processingIndicatorAuditOrRiskCode;
        private String processingIndicatorBusinessCategoryCode;
        private String gisQualifier;
        private String separatorId;
        private String nameAndAddressQualifier;
        private String partyIdentificationCoded;


}


