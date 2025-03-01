package my20250225home.repeat;

public class ConverterToHoursAndMinutes {
    public static void main(String[] args) {
        System.out.println(convertToHoursAndMinutes(3711));
    }

    private static String convertToHoursAndMinutes(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int restMinutes = minutes % 60;
        int restSeconds = seconds % 60;

        System.out.println(minutes + ": minutes = seconds / 60,\n"
                + hours + ": hours = minutes / 60,\n"
                + restMinutes + ": restMinutes = minutes % 60,\n"
                + restSeconds + ": restSeconds = seconds % 60," );
        return "" + hours + " " + restMinutes + " " + restSeconds;
    }

    private static void convertToHoursAndMinutes(int minutes, int seconds) {

    }
}
