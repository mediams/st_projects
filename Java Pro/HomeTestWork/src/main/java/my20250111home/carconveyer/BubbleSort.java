package my20250111home.carconveyer;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 5, 2, 89, 0, -1, 27};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    private static int[] bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
