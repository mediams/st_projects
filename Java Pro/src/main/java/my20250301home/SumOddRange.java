package my20250301home;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); //→ should return 2500

        System.out.println(sumOdd(-1, 100)); //→ should return -1

        System.out.println(sumOdd(100, 100)); //→ should return 0

        System.out.println(sumOdd(13, 13)); //→ should return 13 (This set contains one number, 13, and it is odd)

        System.out.println(sumOdd(100, -100)); //→ should return -1

        System.out.println(sumOdd(100, 1000)); //→ should return 247500
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if ((start > end) || start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
