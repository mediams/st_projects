package my20241210class;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class DateTimeNewsExamples {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.nanoTime();
        System.currentTimeMillis();
        System.out.println();

        Instant before = Instant.now();
        method();
        Instant after = Instant.now();

        Duration duration = Duration.between(before, after);
        System.out.println(duration);
        System.out.println(duration.getNano());

        LocalDate date = LocalDate.now();
        date = LocalDate.of(2024, 10, 5);
        System.out.println(date);

        LocalDate tenDaysAfter = date.plus(30, ChronoUnit.DAYS);
        System.out.println(tenDaysAfter);

        LocalDate fiveMonthsAfter = date.plus(5,ChronoUnit.MONTHS);
        System.out.println(fiveMonthsAfter);

        System.out.println(date.getDayOfWeek());
        List<LocalDate> list = date.datesUntil(LocalDate.of(2024, 12, 20), Period.ofDays(7)).toList();
        System.out.println(list);

        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));

        LocalTime time = LocalTime.of(9, 30);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("CET"));
        System.out.println(zonedDateTime);

        System.out.println();
        System.out.println("-----");
        System.out.println();



    }

    private static void method() {
        for (int i = 0; i < 10_000_000; i++) {
            for (int j = 0; j < 10_000_000; j++) {
                //some action
            }
        }
    }
}
