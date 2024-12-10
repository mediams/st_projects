package my20241205home;

public class MyError extends Exception{
    public MyError() {
    }

    public MyError(String message) {
        super(message);
    }
}
