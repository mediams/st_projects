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
    }
}


