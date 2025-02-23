package my20250217home;

public class RecoursionRepeat {
    public static void main(String[] args) {
        System.out.println(sumOfNNumber(5));
        System.out.println(miltiOfNNumber(5));
        reverseNummer(123);
        System.out.println("\n" + linearSearch(new int[]{1, 2, 3, 4, 5}, 4));
    }

    private static int sumOfNNumber(int n) {
        if (n == 1) {
            return n = 1;
        }
        return sumOfNNumber(n - 1) + n;
    }

    private static int miltiOfNNumber(int n) {
        if (n == 1) {
            return n = 1;
        }
        return miltiOfNNumber(n - 1) * n;
    }

    private static void reverseNummer(int n) {
        if (n == 1) {
            System.out.print(n % 10);
            return;
        }
        System.out.print(n % 10);
        reverseNummer(n / 10);
    }

    private static int linearSearch(int [] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
