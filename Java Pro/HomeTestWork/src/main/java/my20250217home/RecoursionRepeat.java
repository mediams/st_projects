package my20250217home;

public class RecoursionRepeat {
    public static void main(String[] args) {
        System.out.println(sumOfNNumber(5));
        System.out.println(miltiOfNNumber(5));
        reverseNummer(123);
        System.out.println("\n" + linearSearch(new int[]{1, 2, 3, 4, 5}, 4));
        reverseWhile(123);

        System.out.println("--------------");
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 10, 18};
        int key = 18;

        System.out.printf("in Position: %d", binarySearch(array, key));
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mit = left + (right - left) / 2;
//            int mit = (left + right)  / 2;
            if (array[mit] == key) {
                return mit;
            } else if (array[mit] > key) {
                right = mit - 1;
            }else
                left = mit + 1;
        }
        return -1;
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

    private static void reverseWhile(int n) {
        while (n != 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }
}
