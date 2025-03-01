package _projects2024_11.my20241119class;

import _projects2024_10.my20241015class.Cat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermadiateOperations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> stringList = List.of("One", "Two", "Three", "Four", "Two");

        List<Integer> result = integerList.stream().filter((integer -> integer % 2 == 0)).filter(integer -> integer <= 6).toList();
        System.out.println(result);

        result = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).limit(3).toList();
        System.out.println(result);

        List<String> stringResult = stringList.stream().peek(System.out::println).distinct().peek(System.err::println).toList();
        System.out.println(stringResult);

        List<Cat> namesOfCats = stringList.stream().map(s -> new Cat(s, 1, "black")).toList();
        System.out.println(namesOfCats);

        List<Character> listOfCharacter = stringList.stream()
                .map(s -> s.charAt(0)) // Извлекаем первый символ каждой строки
                .distinct() // Оставляем только уникальные символы
                .toList(); // Преобразуем в List<Character>
        System.out.println(listOfCharacter);

        //--------------------

//        1. Отсортировать с помощью стримов список из строк
//                - по алфавиту
//                - в обратном порядке

        stringResult = stringList.stream().sorted().toList();
        System.out.println(stringResult);
        stringResult = stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(stringResult);


//        2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений

        stringResult = integerList.stream().map(integer -> integer.toString()).toList();
        System.out.println(stringResult);

//        3. Создать список из экземпляров класса Employee.
//        public class Employee {
//            private String name;
//            private String surname;
//            private int age;
//            private int workingHoursInMonth;
//        }
//
//        С помощью стримов:
//        - вывести список активных сотрудников старше 20 лет
//                - вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
//        - вывести список фамилий сотрудников с именем John
//        - вывести список всех уникальных имен сотрудников
        Employee employees = new Employee();
        List<Employee> listAge = employees.getListEmployees().stream().filter(employee -> employee.getAge() > 20).toList();
        System.out.println(listAge);

        List<Employee> listTimeMoreThan = employees.getListEmployees().stream()
                .filter(employee -> employee.getWorkingHoursInMonth() > 40)
                .filter(employee -> employee.getName().startsWith("J"))
                .toList();
        System.out.println(listTimeMoreThan);

        // Задача 10: Получение списка квадратов чисел
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> resultInteger = numbers5.stream().map(x -> x * x).toList();
        System.out.println(resultInteger);

        // Задача 13: Поиск первой строки, начинающейся с буквы 'b' (findFirs())
        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> resultString = words6.stream().filter(s -> s.startsWith("b")).limit(1).collect(Collectors.toList());
        System.out.println(resultString);

        // Задача 14: Сокращение списка до указанного размера (например 5)
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        resultInteger = numbers6.stream().limit(5).toList();
        System.out.println(resultInteger);

        // Задача 15: Объединение двух списков в один
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<Integer> intR = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println(intR);


    }
}
