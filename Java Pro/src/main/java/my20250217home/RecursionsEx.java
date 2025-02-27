package my20250217home;

public class RecursionsEx {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(5));
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return factorial(n - 1) * n;
    }

    private static int sumOfNumber(int n) {
        if (n == 1) {
            return n;
        }
        return sumOfNumber(n - 1) + n;
    }
}
