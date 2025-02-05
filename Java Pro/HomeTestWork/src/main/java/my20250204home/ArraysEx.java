package my20250204home;

public class ArraysEx {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10}};

        for (int[] b : a) {
            for (int c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
