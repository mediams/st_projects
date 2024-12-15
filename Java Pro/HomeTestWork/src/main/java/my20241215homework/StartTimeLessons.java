package my20241215homework;

import java.time.*;
import java.util.List;

public class StartTimeLessons {
    public static void main(String[] args) {
        List<ZonedDateTime> localDate = LocalDate.of(2024, Month.DECEMBER, 1).datesUntil(LocalDate.of(2024, Month.DECEMBER, 22))
                .filter(localDate1 -> localDate1.getDayOfWeek() == DayOfWeek.THURSDAY || localDate1.getDayOfWeek() == DayOfWeek.TUESDAY ||
                        localDate1.getDayOfWeek() == DayOfWeek.FRIDAY)
                .map(LocalDate -> ZonedDateTime.of(LocalDate, LocalTime.of(9, 30), ZoneId.of("CET")))
                .toList();

        localDate.forEach(System.out::println);

    }
}
