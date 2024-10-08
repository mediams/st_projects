package my20241008dop;

import java.util.Arrays;

public class CheckSeason {

    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(season.name());
        System.out.println(season.ordinal());
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));
        System.out.println(Season.valueOf("AUTUMN"));

        System.out.println(Season.values()[2]);

        displaySeasonMessage(season);

        String seasonMessage = getSeasonMessage(season);
        System.out.println(seasonMessage);
    }

    private static String getSeasonMessage(Season season) {
        String seasonMessage = switch (season) {
            case SUMMER -> "It's sunny summer!";
            case SPRING -> "Spring is coming!";
            case AUTUMN -> "Autumn is ofter rainy";
            default -> {
                System.out.println("Default action");
                yield "It' cold winter";
            }
        };
        return seasonMessage;
    }

    private static void displaySeasonMessage(Season season) {
//        switch (season) {
//            case SUMMER:
//                System.out.println("It's sunny summer!");
//                break;
//            case SPRING:
//                System.out.println("Spring is coming!");
//                break;
//            case AUTUMN:
//                System.out.println("Autumn is ofter rainy");
//                break;
//            default:
//                System.out.println("It' cold winter");
//                break;
//        }
        switch (season) {
            case SUMMER -> System.out.println("It's sunny summer!");
            case SPRING -> System.out.println("Spring is coming!");
            case AUTUMN -> System.out.println("Autumn is ofter rainy");
            default -> {
                System.out.println("Default action");
                System.out.println("It' cold winter");
            }
        }
    }


}
