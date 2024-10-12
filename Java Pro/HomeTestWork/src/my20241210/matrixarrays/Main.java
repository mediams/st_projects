package my20241210.matrixarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getMatrix(5, 5);
    }

    private static void getMatrix(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (i + j == m - 1){
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
