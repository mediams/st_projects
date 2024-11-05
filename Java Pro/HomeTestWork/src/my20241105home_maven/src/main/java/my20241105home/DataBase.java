package my20241105home;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class DataBase {
    private static TreeSet<Person> personTreeSet = new TreeSet<>();
    private static LinkedList linkedList;

    public DataBase() {
    }

    public static void addPersonToSet (List<Person> personList){
        personTreeSet.addAll(personList);
    }

    public static TreeSet<Person> getPersonTreeSet() {
        return personTreeSet;
    }
}
