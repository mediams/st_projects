package my20250226home;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); //→  should return false since the parameter is not in the range (1-9999)

        System.out.println(isLeapYear(1600)); //→ should return true since 1600 is a leap year

        System.out.println(isLeapYear(2017)); //→ should return false since 2017 is not a leap year

        System.out.println(isLeapYear(2000)); //→ should return true because 2000 is a leap year

        System.out.println(isLeapYear(2020)); //→ should return true because 2000 is a leap year
        System.out.println(isLeapYear(2018)); //→ should return true because 2000 is a leap year

        System.out.println(getDaysInMonth(1, 2020)); //→ should return 31 since January has 31 days.

        System.out.println(getDaysInMonth(2, 2020)); //→ should return 29 since February has 29 days in a leap year and 2020 is a leap year.

        System.out.println(getDaysInMonth(2, 2018)); //→ should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

        System.out.println(getDaysInMonth(-1, 2020)); //→ should return -1 since the parameter month is invalid.

        System.out.println(getDaysInMonth(1, -2020)); //→ should return -1 since the parameter year is outside the range of 1 to 9999.
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        return switch (month) {
            case 1, 12, 10, 8, 7, 5, 3 -> 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else yield 28;
            }
            case 4, 11, 9, 6 -> 30;
            default -> -1;
        };
    }

}
