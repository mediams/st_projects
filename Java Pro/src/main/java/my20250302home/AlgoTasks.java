package my20250302home;

import java.util.Arrays;

public class AlgoTasks {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7};
        int key = 10;

        System.out.println(Arrays.toString(selectedSort(array)));
        System.out.println(binarySearch(array, key));
    }

    private static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return -1;
    }

    private static int[] selectedSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        return array;
    }

}
