package _projects2024_12.my20241205home.my20241206home;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super("Password does not meet the requirements.");
    }
}
