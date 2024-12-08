package my20241103home;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5};
        int result = newBinarySearch(array);
        if (result == -1) {
            System.out.println("Элемент не найден.");
        } else {
            System.out.println("Элемент найден на индексе: " + result);
        }
    }

    public static int newBinarySearch(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            System.out.printf("left = %d, right = %d\n", left, right);
            int mid = left + (right - left) / 2;
            int current = array[mid];
            System.out.println("mid = " + mid + ", array[mid] = " + array[mid]);
            if (current > array[mid - 1] && current > array[mid + 1]) {
                return mid;
            }
            if (current > array[mid - 1] && current < array[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }


}