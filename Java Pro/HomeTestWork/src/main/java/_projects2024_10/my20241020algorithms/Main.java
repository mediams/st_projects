package _projects2024_10.my20241020algorithms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a number 3: ");
        int num3 = scanner.nextInt();
        System.out.println("Result: " + sumOfNumbers(num1, num2, num3));
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        int sum;
        sum = num1 + num2 + num3;
        return sum;
    }
}
