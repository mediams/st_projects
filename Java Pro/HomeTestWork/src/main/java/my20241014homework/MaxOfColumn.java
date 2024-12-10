package my20241014homework;

import java.util.Arrays;

public class MaxOfColumn {
    public static void main(String[] args) {
        int[][] arrays = {{21, 2, 3}, {4, 15, 6}, {7, 8, 9}};
        int n = arrays.length;
        int m = arrays[0].length;

        int[] newArray = new int[m];

        for (int i = 0; i < m; i++) {
            int temp = arrays[0][i];

            for (int j = 0; j < n; j++) {
                if (arrays[j][i] > temp) {
                    temp = arrays[j][i];
                }
            }
            newArray[i]= temp;
        }
        System.out.println(Arrays.toString(newArray));

        System.out.println(Arrays.toString(getMaxArray(arrays)));

    }
    //classwork
    public static int[] getMaxArray(int[][] array) {
        int[] maxArray = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            int max = array[0][j];
            for (int i = 1; i < array.length; i++) {
                max = Math.max(max, array[i][j]);
            }
            maxArray[j] = max;
        }
        return maxArray;
    }
}


