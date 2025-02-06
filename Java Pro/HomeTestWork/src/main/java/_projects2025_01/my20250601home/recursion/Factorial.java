package my20250601home.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        int sum = 0;
        if (n == 0) {
            System.out.println("Base n: " + n);
            return 1;
        }
        System.out.println("Recurse n: " + n);
        sum = n * factorial(n - 1);
        return sum;
    }
}
