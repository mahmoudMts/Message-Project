package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.lm.data.edi.constants.EdiSql;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.mapper.EdiMCMMapper;
import com.lm.data.edi.model.mcm.MCMSettlementRow;
import com.lm.data.edi.service.EdiMCMDataService;
import com.lm.data.edi.validations.EdiValidator;

import java.util.ArrayList;
import java.util.List;

public class EdiMCMHandler extends EdiBaseHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {
    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {
        LambdaLogger logger = context.getLogger();
        APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
        String jsonResponse = null;
        EdiMCMMapper ediMCMMapper = new EdiMCMMapper();
        EdiMCMDataService ediMCMDataService = new EdiMCMDataService();

        logger.log("Executing MCM Message ");

        String marketGroupReference = getQueryStringParam("marketGroupReference", request);
        String partyId = getQueryStringParam("partyId", request);
        String signingDate = getQueryStringParam("signingDate", request);
        String fromDate = getQueryStringParam("fromDate", request);
        String toDate = getQueryStringParam("toDate", request);
        try {
            if (isMockMessage) {
                jsonResponse = getJsonFromFile("MCM.json", logger);
                response.setBody(jsonResponse);
                return response;
            }

            if (!EdiValidator.validateMCMInputParameter(marketGroupReference, partyId, signingDate, fromDate, toDate)) {
                throw new EdiRuntimeException(EdiStatusCode.BAD_REQUEST, "marketGroupReference/partyId/signingDate/fromDate or toDate  is missing");
            }

            logger.log("\nMarketID: " + marketGroupReference + " partyId: " + partyId + " signingDate: " + signingDate + " fromDate: " + fromDate + " toDate: " + toDate);
            List<String> mcmParamList = new ArrayList<>();
            mcmParamList.add(marketGroupReference);
            mcmParamList.add(partyId);
            mcmParamList.add(signingDate);
            mcmParamList.add(fromDate);
            mcmParamList.add(toDate);

            List<MCMSettlementRow> listMCMSettlementRow = ediMCMDataService.getMCMDataFromDb(EdiSql.MCM_SQL_QUERY, mcmParamList, logger);

            if (listMCMSettlementRow != null) {
                jsonResponse = getJsonString(ediMCMMapper.mapMcmData(listMCMSettlementRow), logger);
                response.setBody(jsonResponse);
                return response;

            }
            jsonResponse = getJsonString(ediMCMMapper.mapMcmData(new ArrayList<MCMSettlementRow>()), logger);
            response.setBody(jsonResponse);

        } catch (EdiRuntimeException e) {

            throw new EdiRuntimeException("Issue while getting mcm data", e, EdiStatusCode.INTERNAL_SERVER_ERROR);
        }
        return response;
    }

}