package my20250224home;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));  //should return false since 1 + 1 is not equal to 1

        System.out.println(hasEqualSum(1, 1, 2));  //should return true since 1 + 1 is equal to 2

        System.out.println(hasEqualSum(1, -1, 0));  //should return true since 1 + (-1) is 1 - 1 and is equal to 0
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return (num1 + num2) == num3;
    }
}
