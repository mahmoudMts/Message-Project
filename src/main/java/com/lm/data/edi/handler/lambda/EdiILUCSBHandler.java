package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.mapper.EdiILUCSBMapper;
import com.lm.data.edi.mapper.EdiUNBMapper;
import com.lm.data.edi.model.header.InterchangeHeaderUNB;
import com.lm.data.edi.model.ilucsb.ILUCSBNotificationPayload;
import com.lm.data.edi.model.ilucsb.SettlementPaymentRow;
import com.lm.data.edi.service.EdiDataService;
import com.lm.data.edi.validations.EdiValidator;

import java.util.ArrayList;
import java.util.List;

public class EdiILUCSBHandler extends EdiBaseHandler
		implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

	public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {
		LambdaLogger logger = context.getLogger();

		APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
		String jsonResponse = null;
		EdiILUCSBMapper ediILUCSBMapper = new EdiILUCSBMapper();
		EdiDataService ediDataService = new EdiDataService();

		logger.log("Executing ILUCSB Message ");
		String partyId = getQueryStringParam("partyId", request);
		String settlementDate = getQueryStringParam("settlementDate", request);
		String marketGroupReference = getQueryStringParam("marketGroupReference", request);
		String fromDate = getQueryStringParam("fromDate", request);
		String toDate = getQueryStringParam("toDate", request);
        
       try {
           if(isMockMessage) {
               jsonResponse = getJsonFromFile("ILUCSB.json", logger);
               response.setBody(jsonResponse);
               return response;
           }

           if (!EdiValidator.validateIlucsbParameters(marketGroupReference, partyId, settlementDate, fromDate, toDate)) {
    		   throw new EdiRuntimeException(EdiStatusCode.BAD_REQUEST,"The essential parameters for ILUCSB have not been provided."); 
    	    }

			logger.log("\nmarketGroupReference: " + partyId + " partyID: " + partyId + " SettlementDate: "
					+ settlementDate + " fromDate: " + fromDate + " toDate: " + toDate);
			logger.log("Executing DB Service ");

			List<SettlementPaymentRow> listSettlementPaymentRow = ediDataService.getIlucsbDataFromDb(partyId,
					settlementDate, fromDate, toDate, logger);
			InterchangeHeaderUNB headerUNB = EdiUNBMapper.mapHeaderUNB("ILUCSB", marketGroupReference);
			ILUCSBNotificationPayload iLUCSBNotificationPayload = null;
			if (listSettlementPaymentRow != null) {

				iLUCSBNotificationPayload = ediILUCSBMapper.mapIlucsbData(listSettlementPaymentRow);
				iLUCSBNotificationPayload.setInterchangeHeaderUNB(headerUNB);
				jsonResponse = getJsonString(iLUCSBNotificationPayload, logger);
				response.setBody(jsonResponse);
				return response;

			}
			iLUCSBNotificationPayload = ediILUCSBMapper.mapIlucsbData(new ArrayList<SettlementPaymentRow>());
			iLUCSBNotificationPayload.setInterchangeHeaderUNB(headerUNB);
			jsonResponse = getJsonString(iLUCSBNotificationPayload, logger);
			response.setBody(jsonResponse);
		} catch (EdiRuntimeException e) {

			throw new EdiRuntimeException("Issue while getting iluscb data", e, EdiStatusCode.INTERNAL_SERVER_ERROR);
		}

		return response;
	}
}
