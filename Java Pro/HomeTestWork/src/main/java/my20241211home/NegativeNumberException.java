package my20241211home;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
