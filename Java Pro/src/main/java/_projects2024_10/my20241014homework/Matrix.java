package _projects2024_10.my20241014homework;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        generateMatrix(4, 3);
    }

    public static void generateMatrix(int n, int m) {
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) == (m - 1)) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        //classwork
        int min = Math.min(n, m);
        int j = 0;
        int [][] matrix = new int [n][m];
        for (int i = n - 1; i >= n - min; i--) {
            matrix[i][j++]=1;
        }
        System.out.println(Arrays.deepToString(matrix));

    }

}
