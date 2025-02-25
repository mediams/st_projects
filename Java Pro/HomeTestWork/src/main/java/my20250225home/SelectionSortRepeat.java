package my20250225home;

import java.util.Arrays;

public class SelectionSortRepeat {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 7, 1};

        System.out.println(Arrays.toString(sortSelection(array) ));
    }

    private static int[] sortSelection(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
