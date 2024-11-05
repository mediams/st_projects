package my20241105home;

import java.util.ArrayList;
import java.util.List;

public class Task {
    /**
     * Person
     *      id
     *      name
     *      surname
     *      age
     *      sex
     *      email
     *
     *      Address address
     *
     * Address address
     *      id
     *      street
     *      int houseNumber
     *      postCode
     *
     * DataBase
     *      static TreeSet
     *      static LinkedList
     *
     *
     * 1 = method List<Person> generatePerson 40()
     * 2 = TreeSet = name, surname, age, Address
     * 3 = LinkedList age > param
     */
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(new Person().gen(40));
        System.out.println(personList);
    }


}
