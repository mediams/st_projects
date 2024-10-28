package my20241028algorithms;

public class RecurExample {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumIteration(n));
        System.out.println(sumRecursion(n));
    }


    //Interactive approach

    private static int sumIteration(int n) { //O(n)
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println("sum = " + sum + " n = " + n);
        }
        return sum;
    }

    private static int sumRecursion(int n) {
        //Base
        if (n == 1) {
            return 1;
        }

//        int sum = n + sumRecursion(n - 1);
        int result = sumRecursion(n - 1);
        int sum = n + result;
        System.out.println("sum = " + sum + " n = " + n);
        return sum;
    }
}
