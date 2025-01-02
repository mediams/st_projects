package _projects2024_12.my20241205home.my20241212practise;

public class Calculator {
    public static void main(String[] args) {

    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Number is NULL!");
        }
        return (double) a / b;
    }
}
