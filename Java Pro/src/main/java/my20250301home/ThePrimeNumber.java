package my20250301home;

public class ThePrimeNumber {
    public static void main(String[] args) {
        System.out.println("0" + (isPrime(0) ? "" : " NOT") + " a prime number");
        System.out.println("1" + (isPrime(1) ? "" : " NOT") + " a prime number");
        System.out.println("2" + (isPrime(2) ? "" : " NOT") + " a prime number");
        System.out.println("3" + (isPrime(3) ? "" : " NOT") + " a prime number");
        System.out.println("8" + (isPrime(8) ? "" : " NOT") + " a prime number");
        System.out.println("10" + (isPrime(8) ? "" : " NOT") + " a prime number");
        System.out.println("1000" + (isPrime(1000) ? "" : " NOT") + " a prime number");

        System.out.println("-----------------");

        System.out.println(getCountPrimeNumbers(1000));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return false;
        }
        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getCountPrimeNumbers(int number) {
        int count = 0;
        for (int i = 0; i <= number ; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is  prime");
                count++;
            }
//            if (count >= 3) {
//                break;
//            }
        }

        return count;
    }
}
