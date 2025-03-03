package my20250303home;

public class RevertDigit {
    public static void main(String[] args) {
        reverseDigit(123456);
        System.out.println("\n" + sumDigit(123456));

    }

    private static int sumDigit(int i) {
        if (i < 10) {
            return i;
        }
        return sumDigit(i / 10) + i % 10;
    }

    private static void reverseDigit(int i) {
        while (i > 0) {
            System.out.print(i % 10);
            i /= 10;
        }
    }

}
