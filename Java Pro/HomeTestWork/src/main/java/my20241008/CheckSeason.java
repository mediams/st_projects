package my20241008;

public class CheckSeason {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        displaySeasonMessage(season);
        System.out.println(season.ordinal());
    }

    private static void displaySeasonMessage(Season season) {
        switch (season) {
            case AUTUMN -> System.out.println("It's an Autumn!");
            case SPRING -> System.out.println("It's a SPRING");
            case WINTER -> System.out.println("It's a Winter");
            default -> {
                System.out.println("Default");
                System.out.println("It's a Summer");
            }
        }
    }
}
