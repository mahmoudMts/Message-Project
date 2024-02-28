package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;

public class EdiIPCCSMHandler extends EdiBaseHandler implements RequestHandler<APIGatewayV2HTTPEvent, APIGatewayV2HTTPResponse> {

    public APIGatewayV2HTTPResponse handleRequest(APIGatewayV2HTTPEvent request, Context context) {
        LambdaLogger logger = context.getLogger();

        APIGatewayV2HTTPResponse response = getAPIGatewayResponse();
        String jsonResponse = null;

        if(isMockMessage) {
            jsonResponse = getJsonFromFile("IPCCSM.json", logger);
            response.setBody(jsonResponse);
            return response;
        }
        return null;
    }
}
