package com.lm.data.edi.handler.lambda;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.lm.data.edi.model.ilucsb.ILUCSBNotificationPayload;
import com.lm.data.edi.model.ilucsb.ILUCSBNotificationRequest;

public class EdiILUCSBHandlerTest {
    @Test
    public void testHandleRequestWithValidParameters() {
        EdiILUCSBHandler handler = new EdiILUCSBHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);
        
        ILUCSBNotificationRequest event = new ILUCSBNotificationRequest("00244209C00000", "535c24b7-ab81-4e4b-8671-fb5ffe0d1876", "2023-08-10", "2023-08-01", "2023-08-31");

        //ILUCSBNotificationPayload result = handler.handleRequest(event, context);

        //verify(logger).log("Executing ILUCSB Message ");
        //verify(logger).log("\nMarketID: 535c24b7-ab81-4e4b-8671-fb5ffe0d1876 SettlementDate: 2023-08-10");
        //verify(logger).log("Executing DB Service ");

        //assertNotNull(result);
    }

    @Test
    public void testHandleRequestWithMissingParameters() {
        EdiILUCSBHandler handler = new EdiILUCSBHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);

        ILUCSBNotificationRequest event = new ILUCSBNotificationRequest();
        //ILUCSBNotificationPayload result = handler.handleRequest(event, context);

        //verify(logger).log("marketID or settlementDate is missing");

        //assertNotNull(result);

    }


    @Test
    public void testHandleRequestWithInvalidParameters() {
        EdiILUCSBHandler handler = new EdiILUCSBHandler();

        Context context = mock(Context.class);
        LambdaLogger logger = mock(LambdaLogger.class);
        when(context.getLogger()).thenReturn(logger);


        // Test with invalid settlementDate & marketID (null)
        ILUCSBNotificationRequest event = new ILUCSBNotificationRequest(null, null, null, null, null);
        //ILUCSBNotificationPayload resultInvalidSettlementDate = handler.handleRequest(event, context);

        //verify(logger).log("marketID or settlementDate is missing");

        //assertNotNull(resultInvalidSettlementDate);

    }
}



