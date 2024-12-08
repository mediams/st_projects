package my20241202home;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        1. Написать программу, которая дает пользователю арифметическую задачу со случайными числами и проверяет ответ

        Random random = new Random();
        int num1 = random.nextInt(11);
        int num2 = random.nextInt(11);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter sum of %d + %d = ", num1, num2);
        int sum = scanner.nextInt();

        while (true) {
            if (sum == (num1 + num2)) {
                System.out.println("Hit!");
                break;
            } else {
                System.out.println("False! Try again!");
                sum = scanner.nextInt();
            }
        }

    }
}
