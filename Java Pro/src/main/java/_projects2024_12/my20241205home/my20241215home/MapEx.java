package _projects2024_12.my20241205home.my20241215home;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        List<String> messages = List.of("Hello", "Goodbye");
        List<String> timestampedMessages = messages.stream()
                .map(msg -> "[" + LocalTime.now() + "] " + msg) // Добавляет текущую временную метку
                .toList();
        System.out.println(timestampedMessages);

//        Преобразуй список чисел в их строки: Создай поток чисел 1, 2, 3, 4, 5 и с помощью map преобразуй их в строки (например, "1", "2").
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> stringList = intList.stream()
                .map(integer -> integer.toString())
                .toList();

        System.out.println(stringList);

//        Преобразуй даты в текстовый формат:
//        Используй LocalDate.of(2024, 12, 1).datesUntil(LocalDate.of(2024, 12, 10))
//        и преобразуй каждую дату в строку формата yyyy-MM-dd.

        List<String> localDate = LocalDate.of(2024, 12, 1).datesUntil(LocalDate.of(2024, 12, 10))
                .map(localDate1 -> localDate1.toString())
                .toList();

        localDate.forEach(System.out::println);

//        Простая арифметика: Создай список чисел 10, 20, 30 и с помощью map прибавь к каждому числу 5.

        List<Integer> integerList = List.of(10, 20, 30)
                .stream()
                .map(integer -> integer + 5)
                .toList();

        System.out.println(integerList);

//        Работа с объектами: Создай класс Person с полем name. Создай список имен, а затем преобразуй их в список объектов Person.

        Person person = new Person("John");
        List<Person> personList = List.of(person, new Person("Nick"));

        List<Person> stringListNew = List.of("Olga", "Lena", "Bob")
                .stream()
                .map(s -> new Person(s))
                .toList();

        System.out.println(stringListNew);
        System.out.println(personList);

//        Извлечение данных: Создай список объектов Person, у которых есть поле age. С помощью map создай список возрастов.

        List<Person> personListAge = List.of(new Person("Rob", 20), new Person("Bill", 40));

        List<Integer> list = personListAge.stream()
                .map(person1 -> person1.getAge())
                .toList();
        System.out.println(list);
    }
}
