package my20241206home;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super("Password does not meet the requirements.");
    }
}
