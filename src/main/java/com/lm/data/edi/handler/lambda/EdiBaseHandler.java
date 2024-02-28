package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayV2HTTPResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class EdiBaseHandler {

    protected static final Boolean isMockMessage = true;

    protected APIGatewayV2HTTPResponse getAPIGatewayResponse() {

        APIGatewayV2HTTPResponse response = new APIGatewayV2HTTPResponse();
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        response.setHeaders(headers);
        response.setStatusCode(200);
        return response;
    }

    protected String getQueryStringParam(String param, APIGatewayV2HTTPEvent request) {
        return request.getQueryStringParameters().getOrDefault(param, null);
    }

    protected String getJsonString(Object obj, LambdaLogger logger) {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            return jsonMapper.writeValueAsString(obj);
        } catch (Exception ex) {
            logger.log("Error converting the response to json string " + ex.getMessage());
        }
        return null;
    }

    protected String getJsonFromFile(String file, LambdaLogger logger) {
        ObjectMapper jsonMapper = new ObjectMapper();
        try {
            Map<String, Object> jsonData = jsonMapper.readValue(new File(file),
                    new TypeReference<Map<String, Object>>() {
                    });
            String json = jsonMapper.writeValueAsString(jsonData);
            logger.log("Mock Json :: " + json);
            return json;
        } catch (Exception ex) {
            logger.log("Error converting the to json from file " + ex.getMessage());
        }
        return null;
    }

    protected void validatePayload(Map<String, String> event) {
    }

}
