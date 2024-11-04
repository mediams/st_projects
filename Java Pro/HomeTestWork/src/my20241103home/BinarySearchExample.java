package my20241103home;
import java.util.Arrays;

public class BinarySearchExample {
    // Метод для выполнения бинарного поиска
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, является ли средний элемент целью
            if (array[mid] == target) {
                return mid; // Возвращаем индекс найденного элемента
            }

            // Если цель меньше среднего элемента, ищем в левой половине
            if (array[mid] > target) {
                right = mid - 1;
            }
            // Если цель больше среднего элемента, ищем в правой половине
            else {
                left = mid + 1;
            }
        }

        // Если элемент не найден, возвращаем -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 11;

        // Массив должен быть отсортирован перед использованием бинарного поиска
        Arrays.sort(array);

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Элемент не найден.");
        } else {
            System.out.println("Элемент найден на индексе: " + result);
        }
    }
}