package my20250304home;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); //→ should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.

        System.out.println(sumFirstAndLastDigit(257)); //→ should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.

        System.out.println(sumFirstAndLastDigit(0)); //→ should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.

        System.out.println(sumFirstAndLastDigit(5)); //→ should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.

        System.out.println(sumFirstAndLastDigit(-10)); //→ should return -1, since the parameter is negative and needs to be positive.

    }

    public static int sumFirstAndLastDigit(int i) {
        if (i < 0) return -1;
        int lastDigit = i % 10;
        while (i > 9) {
            i /= 10;
        }
        return lastDigit + i;
    }

}
