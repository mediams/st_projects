package my20250224home;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(1, 1));
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data";
        }
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int restMinutes = minutes % 60;
        int restSeconds = seconds % 60;
        return hours + "h " + restMinutes + "m " + restSeconds % 60 + "S";//XX represents the number of hours,
        // YY the number of minutes, and ZZ the number of seconds.
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid data";
        }
        return getDurationString(seconds + minutes * 60); //XX represents the number of hours,
        // YY the number of minutes, and ZZ the number of seconds.
    }
}
