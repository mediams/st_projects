package my20250115home;

import java.util.Arrays;

public class TasksEx {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 2;

        System.out.println(binarySearch(array, key));

        array = new int[]{2, 4, 5, 8, 7, 4, 1, 6, 3, 2, 5};
        System.out.println(Arrays.toString(bubbleSort(array)));

        System.out.println(linearSearch(array, key));

        array = new int[]{2, 4, 5, 8, 7, 4, 1, 6, 3, 2, 5};

        System.out.println(Arrays.toString(selectedSort(array)));
    }

    private static int[] selectedSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

        }

        return array;
    }

    private static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }

    private static int[] bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }
}
