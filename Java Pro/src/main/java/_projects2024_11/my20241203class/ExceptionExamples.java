package _projects2024_11.my20241203class;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ExceptionExamples {
    public static void main(String[] args) {
        // unchecked exception
//        System.out.println(1 / 0);
//        String s = null;
//        System.out.println(s.toLowerCase());

//        throw new IllegalArgumentException("Wrong argument");
//
//        System.out.println("!!!");
        fileMethod();

//        recursion();


        try {
            try{
                throw new NullPointerException();
            }catch (NullPointerException e){
                throw new RuntimeException("Somthing went wrong...");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    private static void recursion() {
        recursion();
    }

    private static void fileMethod() {
        try {
            // open file
            System.out.println("In try block");
            if (false) {
                throw new FileNotFoundException("File not found");
            }
        } catch (FileNotFoundException e) {
            // action when file not found
            System.out.println(e.getMessage());
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            System.out.println(Arrays.toString(stackTrace));
            e.printStackTrace();
        } finally {
            System.out.println("Finaly");
        }
        System.out.println("After block try");
    }
}
