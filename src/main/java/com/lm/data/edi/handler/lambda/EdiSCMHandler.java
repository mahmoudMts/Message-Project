package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;

import java.sql.ResultSet;

public class EdiSCMHandler extends EdiBaseHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

    @Override
    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("SCMMockHandler.handleRequest executing handleRequest");
        APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
        String jsonResponse = null;

        try {
            ResultSet databaseResult = null;
            if (isMockMessage) {
                jsonResponse = getJsonFromFile("SCM.json", logger);
                response.setBody(jsonResponse);
                return response;
            }


        } catch (EdiRuntimeException e) {

            throw new EdiRuntimeException("Issue while getting SCMMockHandler data", e, EdiStatusCode.INTERNAL_SERVER_ERROR);
        }

        return null;
    }
}
