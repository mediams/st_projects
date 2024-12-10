package my20240928;

public class EvenSumAndFactorial {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}
