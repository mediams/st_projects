package my20250304home;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5); //should print the following:
        printSquareStar(8); //should print the following:
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                if (i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
