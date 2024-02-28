package com.lm.data.edi.handler.lambda;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.lm.data.edi.constants.EdiSql;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.mapper.EdiWSETTMapper;
import com.lm.data.edi.model.wsett.WSETTSettlementRow;
import com.lm.data.edi.service.EdiWSETTDataService;
import com.lm.data.edi.validations.EdiValidator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class EdiWSETTHandler extends EdiBaseHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {
        LambdaLogger logger = context.getLogger();
        APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
        String jsonResponse = null;
        EdiWSETTMapper ediWSETTMapper = new EdiWSETTMapper();
        EdiWSETTDataService ediWSETTDataService = new EdiWSETTDataService();

        logger.log("Executing WSETT Message ");
        String marketGroupReference = getQueryStringParam( "marketGroupReference", request);
        String partyId = getQueryStringParam( "partyId", request);
        String settlementDate = getQueryStringParam( "settlementDate", request);
        String fromDate = getQueryStringParam( "fromDate", request);
        String toDate = getQueryStringParam( "toDate", request);

        try {
            if(isMockMessage) {
                jsonResponse = getJsonFromFile("WSETT.json", logger);
                response.setBody(jsonResponse);
                return response;
            }
            if (!EdiValidator.validateWSETTInputParameter(marketGroupReference, settlementDate, fromDate, toDate)) {
                throw new EdiRuntimeException(EdiStatusCode.BAD_REQUEST, "marketID/settlementDate/fromDate or toDate  is missing");
            }

            logger.log("\nmarketGroupReference: " + marketGroupReference + " partyId: " + partyId + " settlementDate: " + settlementDate + " fromDate: " + fromDate + " toDate: " + toDate+"\n");
            List<String> wsettParamList = new ArrayList<>();
            wsettParamList.add(marketGroupReference);
            wsettParamList.add(partyId);
            wsettParamList.add(settlementDate);
            wsettParamList.add(fromDate);
            wsettParamList.add(toDate);
            List<WSETTSettlementRow> listWSETTSettlementRow = ediWSETTDataService.getWSETTDataFromDb(EdiSql.WSETT_SQL_QUERY, wsettParamList, logger);

            if (listWSETTSettlementRow != null) {
                jsonResponse = getJsonString(ediWSETTMapper.mapSettlementData(listWSETTSettlementRow), logger);
                response.setBody(jsonResponse);
                return response;
                }

            logger.log("\nList is empty\n");
            jsonResponse = getJsonString(ediWSETTMapper.mapSettlementData(new ArrayList<WSETTSettlementRow>()), logger);
            response.setBody(jsonResponse);

        } catch(EdiRuntimeException e) {

            throw new EdiRuntimeException("Issue while getting wsett data", e, EdiStatusCode.INTERNAL_SERVER_ERROR);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
            return response;
    }

}
