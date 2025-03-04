package my20250304home;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); //should return 7 since 7 is the largest prime (3 * 7 = 21)

        System.out.println(getLargestPrime(217)); //should return 31 since 31 is the largest prime (7 * 31 = 217)

        System.out.println(getLargestPrime(0)); //should return -1 since 0 does not have any prime numbers

        System.out.println(getLargestPrime(45)); //should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

        System.out.println(getLargestPrime(-1)); //should return -1 since the parameter is negative
    }
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;

        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
