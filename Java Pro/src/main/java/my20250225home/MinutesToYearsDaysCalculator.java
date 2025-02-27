package my20250225home;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);  //→ should print "525600 min = 1 y and 0 d"

        printYearsAndDays(1051200); //→ should print "1051200 min = 2 y and 0 d"

        printYearsAndDays(561600);  //→ should print "561600 min = 1 y and 25 d"
    }

    /*calculate the years and days from the minutes parameter*/
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
                                        //        XX represents the original value minutes.
        long years = minutes / 525600;  //        YY represents the calculated years.
        long restDays = minutes % 525600;
        long days = restDays / 1440;     //        ZZ represents the calculated days.
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
