package _projects2024_10.my20240928;

public class Pyramids {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i < num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
