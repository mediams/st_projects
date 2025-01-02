package _projects2024_12.my20241205home.my20241210class;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Examples {
    public static void main(String[] args) {
        // ANSI-коды для форматирования текста
        final String ANSI_RESET = "\u001B[0m"; // Сброс цвета
        final String ANSI_RED = "\u001B[31m"; // Красный цвет

        System.out.println("-+-+-+-+-+-");
        System.out.println("Получение текущей даты и времени (" + ANSI_RED + "Простой пример" + ANSI_RESET + ")\n");

        LocalDate date = LocalDate.now(); // Текущая дата
        LocalTime time = LocalTime.now(); // Текущее время
        LocalDateTime dateTime = LocalDateTime.now(); // Текущие дата и время

        System.out.println("Дата: " + date);
        System.out.println("Время: " + time);
        System.out.println("Дата и время: " + dateTime);

        System.out.println("-+-+-+-+-+-");
        System.out.println("Форматирование даты и времени (" + ANSI_RED + "Работа с шаблонами" + ANSI_RESET + ")\n");

        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime2.format(formatter);

        System.out.println("Отформатированная дата и время: " + formattedDateTime);

        System.out.println("-+-+-+-+-+-");
        System.out.println("Сравнение дат (Актуально для проверки сроков)\n");

        LocalDate today = LocalDate.now();
        LocalDate deadline = LocalDate.of(2024, 12, 31);

        if (today.isBefore(deadline)) {
            System.out.println("Ещё не наступил дедлайн.");
        } else if (today.isEqual(deadline)) {
            System.out.println("Сегодня дедлайн.");
        } else {
            System.out.println("Дедлайн уже прошёл.");
        }

        System.out.println("-+-+-+-+-+-");
        System.out.println("Вычисление разницы между датами (Часто для отчётов)\n");

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 12, 31);

        Period period = Period.between(startDate, endDate);
        System.out.println("Разница: " + period.getYears() + " года, " +
                period.getMonths() + " месяцев, " +
                period.getDays() + " дней.");

        System.out.println("-+-+-+-+-+-");
        System.out.println("Работа с временными зонами (Важный пример для глобальных систем)\n");


        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime berlinTime = utcTime.withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        ZonedDateTime tokyoTime = utcTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        System.out.println("UTC: " + utcTime);
        System.out.println("Берлин: " + berlinTime);
        System.out.println("Токио: " + tokyoTime);

    }
}
