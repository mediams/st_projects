package _projects2024_11.my20241204homework;

public class MyAppException extends Exception {
    public MyAppException() {
    }

    public MyAppException(String message) {
        super(message);
    }

    public MyAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
