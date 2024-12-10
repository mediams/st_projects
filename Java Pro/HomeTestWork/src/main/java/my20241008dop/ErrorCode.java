package my20241008dop;

public enum ErrorCode {

    NOT_FOUND(404, "Page not found"),
    FORBIDDEN(403, "Access forbidden"),
    INTERNAL_SERVER_ERROR(500, "Server error"),
    BAD_REQUEST(502, "Bad request");

    private final int code;

    private final String message;

    ErrorCode(int code, String message) { // private
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
