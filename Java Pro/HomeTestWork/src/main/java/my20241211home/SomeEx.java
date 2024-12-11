package my20241211home;

import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(studentList, new Student());

        System.out.println(studentList);
    }
}
