package _projects2024_12.my20241205home.my20241210.matrixarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getMatrix(3, 5);
        System.out.println();
        int[] arrays = {1, 2, 3, 4, 5, 6};
        getArrays(arrays, 2);
    }

    private static void getArrays(int[] arrays, int i) {
        int count = 0;
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] % i == 0) {
                count++;
            }
        }
        int m = 0;
        int[] newArrays = new int[count];

        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] % i == 0) {
                newArrays[m] = arrays[j];
                m++;
            }
        }

        System.out.println(Arrays.toString(newArrays));
    }

    private static void getMatrix(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (i + j == n - 1) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
