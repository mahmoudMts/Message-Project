package com.lm.data.edi.exception;

public enum EdiStatusCode implements StatusCode {

	/* SUCCESS(200, "SUCCESS", "Success"), */
    DATA_NOT_FOUND(404, "DATA_NOT_FOUND", "The item was not found"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR", "A server error occurred that needs to be handled."),
    BAD_REQUEST(400, "BAD_REQUEST", "Bad Request")/*,
    UNAUTHORIZED(401, "UNAUTHORIZED", "The user is not authorized."),
    FORBIDDEN(403, "FORBIDDEN", "The user is authorized, but does not have the necessary privileges to perform this operation")*/;

    private int code;
    private String message;
    private String title;

    private EdiStatusCode(int code, String title, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getStatusCode() {
        return code;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
