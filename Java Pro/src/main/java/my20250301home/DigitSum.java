package my20250301home;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits2(226));
    }

    private static int sumDigits2(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return number;
        }
        System.out.println(number % 10);
        return number % 10 + sumDigits(number / 10);
    }


}
