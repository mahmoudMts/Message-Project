package com.lm.data.edi.exception;


public class EdiRuntimeException extends RuntimeException {

    protected StatusCode errorStatusCode;

    public EdiRuntimeException() {
        super();
    }

    public EdiRuntimeException(String message) {
        super(message);
    }

    public EdiRuntimeException(StatusCode errorStatusCode, String message) {
        super(message);
        this.errorStatusCode = errorStatusCode;
    }
    public EdiRuntimeException(String message, Throwable cause, StatusCode errorStatusCode) {
  		super(message, cause);
  		this.errorStatusCode = errorStatusCode;
  	}
    public StatusCode getErrorStatusCode() {
        return errorStatusCode;
    }
    
  
}
