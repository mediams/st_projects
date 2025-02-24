package my20250224home;

import java.util.Arrays;

public class SelectedSortEx {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 9, 7, 8, 4, 6};

        System.out.println(Arrays.toString(selectSort(array)));
    }

    private static int[] selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
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
