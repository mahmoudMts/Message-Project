package com.lm.data.edi.mapper;

import com.lm.data.edi.constants.EdiUNBSenderMap;
import com.lm.data.edi.model.header.InterchangeHeaderUNB;
import com.lm.data.edi.model.header.InterchangeHeaderUNBInterchangeReceiver;
import com.lm.data.edi.model.header.InterchangeHeaderUNBInterchangeSender;
import com.lm.data.edi.model.header.InterchangeHeaderUNBSyntax;

public class EdiUNBMapper {
    
    public static InterchangeHeaderUNB mapHeaderUNB(String messageType, String marketGroupReference) {
    	InterchangeHeaderUNB headerUNB = new InterchangeHeaderUNB();
		headerUNB.setSyntax(new InterchangeHeaderUNBSyntax("2"));
		headerUNB.setInterchangeSender(new InterchangeHeaderUNBInterchangeSender(
	            EdiUNBSenderMap.getSenderIdentification(messageType),
	            EdiUNBSenderMap.getReverseRoutingAddress(messageType)));
		headerUNB.setInterchangeReceiver(new InterchangeHeaderUNBInterchangeReceiver(marketGroupReference));
		headerUNB.setDateTimeOfPreparation("2021-03-23T08:24:51");
		headerUNB.setInterchangeControlReference("13");
		headerUNB.setRecipientReferencePassword("ABCD123");
		headerUNB.setApplicationReference(messageType);
		headerUNB.setProcessingPriorityCode("X");
		headerUNB.setAcknowledgmentRequest("1");
	    headerUNB.setComunicationAgreementID("CANDE");
		headerUNB.setTestIndicator(("0"));
		return headerUNB;
	}
}