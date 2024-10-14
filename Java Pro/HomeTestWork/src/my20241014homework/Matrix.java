package my20241014homework;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        generateMatrix();
    }

    public static void generateMatrix() {
        int n = 4, m = 3;
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }

            }
            System.out.println();
        }
        System.out.println("-" + Arrays.deepToString(array));
    }

}
