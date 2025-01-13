package my20250111home.carconveyer;

import java.util.Arrays;

public class SelectionSortEx {
    public static void main(String[] args) {
        int[] array = {12, 5, 2, 89, 0, -1, 27};

        System.out.println(Arrays.toString(selectionSort(array)));
        array = new int[]{12, 5, 2, 89, 0, -1, 27};
        System.out.println(Arrays.toString(selectonSortEx(array)));
    }

    private static int[] selectonSortEx(int[] array) {
        for (int j = 0; j < array.length -1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            int temp = array[j];
            array[j] = array[minIndex];
            array[minIndex] = temp;
        }


        return array;
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
