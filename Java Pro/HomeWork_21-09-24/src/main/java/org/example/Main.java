package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Введите число a: ");
                int a = scanner.nextInt();

                System.out.print("Введите число b: ");
                int b = scanner.nextInt();

                result = divide(a, b); // Пытаемся выполнить деление
                isValid = true; // Если исключения не было, цикл завершится
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль невозможно. Попробуйте снова.");
            } catch (Exception e) {
                System.out.println("Ошибка: некорректный ввод. Попробуйте снова.");
                scanner.next(); // Очищаем ввод, чтобы не зациклиться на неверном значении
            }
        }

        System.out.println("Результат деления: " + result);
    }

    // Метод для деления двух чисел с выбрасыванием исключения при делении на ноль
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}