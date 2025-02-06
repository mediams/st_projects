package my20250118home;

import java.util.Arrays;

public class Algorytmus {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;
        System.out.println(binarySearch(array, key));

        array = new int[]{9, 4, 5, 98, 77, 3, 1, 6, 87, 9, 5,};
        System.out.println(Arrays.toString(bubbleSort(array)));

        array = new int[]{9, 4, 5, 98, 77, 3, 1, 6, 87, 9, 5,};
        System.out.println(Arrays.toString(collectionSort(array)));
    }

    private static int[] collectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) break;
        }

        return array;
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midIndex = left + (right - left) / 2;

            if (array[midIndex] == key) {
                return midIndex;
            } else if (array[midIndex] < key) {
                left = midIndex + 1;
            } else right = midIndex - 1;

        }

        return key;
    }
}
