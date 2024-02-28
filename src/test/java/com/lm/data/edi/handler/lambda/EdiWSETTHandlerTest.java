package com.lm.data.edi.handler.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.model.wsett.WSETTNotificationRequest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EdiWSETTHandlerTest {

    @Test
    public void testHandleRequestWithValidParameters() {
        EdiWSETTHandler handler = new EdiWSETTHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);

        WSETTNotificationRequest event = new WSETTNotificationRequest("00244209C00000", "535c24b7-ab81-4e4b-8671-fb5ffe0d1876", "2023-08-10", "2023-08-01", "2023-08-31");

        //ILUCSBNotificationPayload result = handler.handleRequest(event, context);

        //verify(logger).log("Executing ILUCSB Message ");
        //verify(logger).log("\nMarketID: 535c24b7-ab81-4e4b-8671-fb5ffe0d1876 SettlementDate: 2023-08-10");
        //verify(logger).log("Executing DB Service ");

        //assertNotNull(result);
    }

    @Test
    public void testHandleRequestWithMissingParameters() {
        EdiWSETTHandler handler = new EdiWSETTHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);

        WSETTNotificationRequest event = new WSETTNotificationRequest();
        //ILUCSBNotificationPayload result = handler.handleRequest(event, context);

        //verify(logger).log("marketID or settlementDate is missing");

        //assertNotNull(result);

    }


    @Test
    public void testHandleRequestWithInvalidParameters() {
        EdiWSETTHandler handler = new EdiWSETTHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);


        // Test with invalid settlementDate & marketID (null)
        WSETTNotificationRequest event = new WSETTNotificationRequest(null, null, null, null, null);
        //ILUCSBNotificationPayload resultInvalidSettlementDate = handler.handleRequest(event, context);

        //verify(logger).log("marketID or settlementDate is missing");

        //assertNotNull(resultInvalidSettlementDate);

    }
}