package _projects2024_11.my20241111algorythmus;

import java.util.Arrays;

public class MergeArraysChat {
    public static void main(String[] args) {
        // Входные массивы
        int[] arr1 = {1, 2, 3, 5, 7, 8, 10, 0, 0, 0, 0, 0}; // Дополнительные места для слияния
        int[] arr2 = {5, 6, 7, 8, 12};

        // Вызов метода для слияния массивов
        mergeInPlace(arr1, arr2, 7, arr2.length);

        // Вывод результата
        System.out.println("Результат слияния: " + Arrays.toString(arr1));
    }

    public static void mergeInPlace(int[] arr1, int[] arr2, int n, int m) {
        // Индексы для последнего элемента в исходных массивах
        int i = n - 1; // последний элемент в arr1 (учитываем только значимые)
        int j = m - 1; // последний элемент в arr2
        int k = n + m - 1; // последний элемент в расширенном arr1

        // Сравниваем и перемещаем элементы в конец arr1
        while (j >= 0) {
            if (i >= 0 && arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
    }
}

