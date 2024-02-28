package com.lm.data.edi.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lm.data.edi.exception.EdiRuntimeException;
import com.lm.data.edi.exception.StatusCode;

public class EdiRuntimeExceptionTest {

    @Test
    public void testGetErrorStatusCode() {
        StatusCode statusCode = EdiStatusCode.DATA_NOT_FOUND;
        EdiRuntimeException exception = new EdiRuntimeException(statusCode, "Error");
        assertEquals(statusCode, exception.getErrorStatusCode());
    }

    @Test
    public void testGetErrorStatusCode_NullStatusCode() {
        EdiRuntimeException exception = new EdiRuntimeException(null, "Error");
        assertNull(exception.getErrorStatusCode());
    }


}
