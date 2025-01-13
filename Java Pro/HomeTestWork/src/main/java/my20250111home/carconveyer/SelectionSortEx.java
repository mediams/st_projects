package my20250111home.carconveyer;

import java.util.Arrays;

public class SelectionSortEx {
    public static void main(String[] args) {
        int[] array = {12, 5, 2, 89, 0, -1, 27};

        System.out.println(Arrays.toString(selectionSort(array)));

        selectonSortEx
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
