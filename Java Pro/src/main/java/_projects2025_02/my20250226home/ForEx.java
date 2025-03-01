package my20250226home;

public class ForEx {
    public static void main(String[] args) {
        for (int i = 0, j = 1; i < 5; i++, j--) {

            System.out.println("Bu");
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            double interestAmount = calculateInterest(100.0, i);
            System.out.println("100 at " + i + "% intrest = " + interestAmount);
        }

    }

    private static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
