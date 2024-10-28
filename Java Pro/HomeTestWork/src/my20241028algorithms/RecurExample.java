package my20241028algorithms;

public class RecurExample {
    public static void main(String[] args) {
        System.out.println(sumIteration(5));
    }

    private static int sumIteration(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println("sum = " + sum + " n = " + n);
        }
        return sum;
    }
}
