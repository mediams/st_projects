package my20241215home;

import my20241215home.Person;

import java.time.*;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Логгирование вместо System.out.println
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = intList.stream()
                .map(integer -> integer.toString())
                .toList();

        logger.info("List of strings: " + stringList);

        // Преобразование дат в текстовый формат
        List<String> localDate = LocalDate.of(2024, 12, 1)
                .datesUntil(LocalDate.of(2024, 12, 10))
                .map(localDate1 -> localDate1.toString())
                .toList();

        localDate.forEach(date -> logger.info("Date: " + date));

        // Простая арифметика
        List<Integer> integerList = List.of(10, 20, 30)
                .stream()
                .map(integer -> integer + 5)
                .toList();

        logger.info("Modified integer list: " + integerList);

        // Работа с объектами
        List<Person> stringListNew = List.of("Olga", "Lena", "Bob")
                .stream()
                .map(Person::new)
                .toList();

        logger.info("Persons from names: " + stringListNew);

        // Извлечение данных
        List<Person> personListAge = List.of(new Person("Rob", 20), new Person("Bill", 40));

        List<Integer> ageList = personListAge.stream()
                .map(Person::getAge)
                .toList();

        logger.info("Ages: " + ageList);

        // Работа с ZonedDateTime
        List<ZonedDateTime> zonedDates = LocalDate.of(2024, Month.DECEMBER, 1)
                .datesUntil(LocalDate.of(2024, Month.DECEMBER, 22))
                .filter(localDate1 -> localDate1.getDayOfWeek() == DayOfWeek.THURSDAY ||
                        localDate1.getDayOfWeek() == DayOfWeek.TUESDAY ||
                        localDate1.getDayOfWeek() == DayOfWeek.FRIDAY)
                .map(date -> ZonedDateTime.of(date, LocalTime.of(11, 30), ZoneId.of("CET")))
                .toList();

        zonedDates.forEach(zonedDate -> logger.info("ZonedDateTime: " + zonedDate));
    }
}
