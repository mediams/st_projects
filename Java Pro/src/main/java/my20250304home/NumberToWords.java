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

        System.out.println("------------");

        numberToWords(123); //should print "One Two Three"

        numberToWords(1010); //should print "One Zero One Zero".

        numberToWords(1000); //should print "One Zero Zero Zero".

        numberToWords(-12); //should print "Invalid Value" since the parameter is negative.
    }


    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        boolean isNegative = number < 0;
        number = Math.abs(number);

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber != 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
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
            reversedNumber /= 10;
        }


        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.println("Zero");
        }
    }

}
