package my20241211home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SomeEx {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Igor", 25),
                new Person("Stas", 22)
        ));
        personList.add(new Person("Nikolay", 24));
        personList.add(new Person("Eva", 21));
        personList.add(new Person("Elsa", 22));

        Person.getAll(personList);
//        Person.deletePersonByName(personList, "Eva");
        System.out.println();
        Person.getAll(personList);

        System.out.println();
        System.out.println(Person.searchMinAge(personList));


        System.out.println("Напишите компаратор, который будет сортировать студентов по их оценкам в порядке убывания. " +
                "\nПроверьте его работу на списке студентов.");

        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Lisa", 5.2),
                new Student("Olga", 3.2)
        ));
        studentList.add(new Student("Igor", 3.6));
        studentList.add(new Student("Igor", 4.8));
        studentList.add(new Student("Igor", 4.6));

        studentList.sort(new Student());

        System.out.println(studentList);

        System.out.println("Дан список чисел: [5, 12, 8, 3, 25, 10, 7]. Используя Stream API, выполните:\n" +
                "\n" +
                "Фильтрацию чисел, оставляя только те, которые больше 10.\n" +
                "Умножение каждого числа на 2.\n" +
                "Нахождение суммы всех оставшихся чисел");

        List<Integer> integerList = List.of(5, 12, 8, 3, 25, 10, 7);

        List<Integer> moreThenTen = integerList.stream()
                .filter(integer -> integer > 10)
                .collect(Collectors.toList());

        System.out.println(moreThenTen);

        System.out.println(moreThenTen.stream()
                .map(integer -> integer * 2)
                .toList());

        System.out.println(moreThenTen.stream()
                .reduce((integer, integer2) -> integer + integer2)
                .get());

        System.out.println("Напишите метод, который принимает список чисел и возвращает их сумму. \n" +
                "Если встречается отрицательное число, выбрасывается исключение IllegalArgumentException. \n" +
                "Создайте собственное исключение NegativeNumberException, чтобы заменить стандартное исключение.\n");

        List<Integer> integers = List.of(1, 2, 3, 4, 5, -6, 7, 8, -9);
        try {
            sumAllOfNumbers(integers);
        } catch (NegativeNumberException e) {
            System.err.println("Negative Number Exception: " + e.getMessage());
        }
    }

    private static void sumAllOfNumbers(List<Integer> integers) throws NegativeNumberException {
        for (int i : integers) {
            if (i < 0) {
                throw new NegativeNumberException(" " + i);
            }
        }
    }
}
