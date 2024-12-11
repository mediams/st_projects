package my20241211home;

import java.util.ArrayList;
import java.util.List;

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
    }
}
