package my20250304home;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit

        System.out.println(getDigitCount(123)); //should return 3

        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative

        System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number
        //
        System.out.println("------------");

        System.out.println(reverse(-121)); //should  return -121

        System.out.println(reverse(1212)); //should return  2121

        System.out.println(reverse(1234)); //should return 4321

        System.out.println(reverse(100)); //should return 1
    }


    private static int reverse(int number) {
        int reverseNumber = 0;

        for (int i = 0; i <= getDigitCount(number) + 1; i++) {
            reverseNumber = reverseNumber * 10 + number % 10;
//            numberToWords(number % 10);
            number /= 10;
        }

        return reverseNumber;
    }

    private static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
        return count;
    }

    private static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        switch (number) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
        }
    }
}
