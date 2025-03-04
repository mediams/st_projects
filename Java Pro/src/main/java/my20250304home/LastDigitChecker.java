package my20250304home;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); //→ should return true since 1 is the rightmost digit in numbers 41 and 71

        System.out.println(hasSameLastDigit(23, 32, 42)); //→ should return true since 2 is the rightmost digit in numbers 32 and 42

        System.out.println(hasSameLastDigit(9, 99, 999)); //→ should return false since 9 is not within the range of 10-1000

        System.out.println(isValid(10)); //→ should return true since 10 is within the range of 10-1000

        System.out.println(isValid(468)); //→ should return true since 468 is within the range of 10-1000

        System.out.println(isValid(1051)); //→ should return false since 1051 is not within the range of 10-1000
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        return num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num1 % 10 == num3 % 10;
    }

    public static boolean isValid(int num1) {

        return num1 >= 10 && num1 <= 1000;
    }
}
