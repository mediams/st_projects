package my20241210class;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Tasks {
    public static void main(String[] args) {
// 1) создать любую дату
// - вывести на консоль на немецком / английском языках
// - найти, на какой день недели она выпала
// - вычесть 10 лет из созданной даты, вывести на консоль
// - посчитать количество дней до нее (ChronoUnit.DAYS)
// 2) Найти дату последнего четверга ноября 2024 / второй среды мая 2025

        System.out.println("\n//        создать любую дату");
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("Formatting data and time:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println();
        String formatted = dateTimeFormatter.format(date);
        System.out.println(formatted);

        System.out.println(DateTimeFormatter.ofPattern("dd--MM--yyyy").format(date));

        System.out.println("\n// - вывести на консоль на немецком / английском языках");

        DateTimeFormatter localizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(localizedDate.withLocale(Locale.GERMAN).format(date));
        System.out.println(localizedDate.withLocale(Locale.US).format(date));

        System.out.println("\n// - найти, на какой день недели она выпала");
        LocalDate someDate = LocalDate.of(2020, 10, 5);
        System.out.println("2020-10-5 this is " + someDate.getDayOfWeek());

        System.out.println("\n// - вычесть 10 лет из созданной даты, вывести на консоль");
        LocalDate dateMinus = date.minus(10, ChronoUnit.YEARS);
        System.out.println(dateMinus);
        System.out.println("the day of 10 years minus is: " + date.getDayOfWeek());

        System.out.println("\n// - посчитать количество дней до нее (ChronoUnit.DAYS)");
        System.out.println("between today and " + dateMinus + ": " + ChronoUnit.DAYS.between(date, someDate) + " days");

        System.out.println("\n// 2) Найти дату последнего четверга ноября 2024 / второй среды мая 2025");

        LocalDate lastThursdayInNovember = LocalDate.of(2024, Month.NOVEMBER, 1)
                .with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
        System.out.println(lastThursdayInNovember);
        LocalDate secondWednesdayInMay = LocalDate.of(2025, Month.MAY, 1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY)).plusDays(7);
        System.out.println(secondWednesdayInMay);
    }
}
