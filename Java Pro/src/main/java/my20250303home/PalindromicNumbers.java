package my20250303home;

public class PalindromicNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); //→ should return true

        System.out.println(isPalindrome(707)); //→ should return true

        System.out.println(isPalindrome(11212)); //→ should return false because reverse is 21211 and that is not equal to 11212.
    }

    public static boolean isPalindrome(int i) {
        i = Math.abs(i);
        int temp = i;
        int number = 0;
        while (i > 0) {
            int lastDigit = i % 10;
            number = number * 10 + lastDigit;
            i /= 10;
        }
        return number == temp;
    }
}
