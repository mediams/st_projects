package delete01;

import org.springframework.http.converter.json.GsonBuilderUtils;

public enum HttpStatus {
    OK(200) {
        @Override
        public String getMessage() {
            return "OK";
        }
    },
    NOT_FOUND(404) {
        @Override
        public String getMessage() {
            return "Not Found";
        }
    },
    INTERNAL_SERVER_ERROR(500) {
        @Override
        public String getMessage() {
            return "Internal Server Error";
        }
    };

    private int statusCode;

    HttpStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public abstract String getMessage();
}
