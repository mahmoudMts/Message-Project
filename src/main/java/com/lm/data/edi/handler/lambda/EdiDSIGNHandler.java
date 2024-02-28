package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.EdiStatusCode;
import com.lm.data.edi.mapper.EdiDSIGNMapper;
import com.lm.data.edi.service.EdiDSIGNDataService;
import com.lm.data.edi.validations.EdiValidator;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EdiDSIGNHandler extends EdiBaseHandler implements
        RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {
    @Override
    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {
        //TODO
        LambdaLogger logger = context.getLogger();
        logger.log("EdiDSIGNMsgHandler.handleRequest executing handleRequest");
        APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
        String jsonResponse = null;

            if (isMockMessage){
                jsonResponse =getJsonFromFile("DSIGN.json",logger);
                response.setBody(jsonResponse);
                return response;
            }
        return null;
    }

}
