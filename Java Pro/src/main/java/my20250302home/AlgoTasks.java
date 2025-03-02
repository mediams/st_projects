package my20250302home;

import java.util.Arrays;

public class AlgoTasks {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 7, 1};

        System.out.println(Arrays.toString(selectedSort(array)));
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
