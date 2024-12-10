package my20241105home;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class DataBase {
    private static TreeSet<Person> personTreeSet = new TreeSet<>();
    private static LinkedList linkedList = new LinkedList<>();

    public DataBase() {
    }

    public static void addPersonToSet (List<Person> personList){
        personTreeSet.addAll(personList);
    }

    public static TreeSet<Person> getPersonTreeSet() {
        return personTreeSet;
    }

    public static void addPersonToLinkedList(List<Person> personList){
        for (Person p : personList){
            if (p.getAge() < 25) {
                linkedList.add(p);
            }
        }
    }

    public static LinkedList<Person> getPersonLinkedList(){
        return linkedList;
    }
}
