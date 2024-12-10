package my20240928;

public class SquareFromSymbol {
    public static void main(String[] args) {
        int height = 5;
        int width = 15;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((j == 1) || (j == width) || (i == 1) || i == height) {
                    System.out.print("#");
                } else System.out.print(" ");

            }
            System.out.println();
        }
        int num = 10;
        for (int i = 1; i < num; i++) {
            for (int j = num; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
