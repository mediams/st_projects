//package my20241105home;
//
//import java.util.*;
//
//public class Task {
//    /**
//     * Person
//     * id
//     * name
//     * surname
//     * age
//     * sex
//     * email
//     * <p>
//     * Address address
//     * <p>
//     * Address address
//     * id
//     * street
//     * int houseNumber
//     * postCode
//     * <p>
//     * DataBase
//     * static TreeSet
//     * static LinkedList
//     * <p>
//     * <p>
//     * 1 = method List<Person> generatePerson 40() *** написать метод который генерирует 40 рандомных личностей
//     * 2 = TreeSet = name, surname, age, Address *** Необходимо написать метод сортировки
//     * 3 = LinkedList age > param *** в линкет-лист необходимо чтобы попали люди с возрастом не более 25
//     */
//    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>(new Person().gen(40));
//        System.out.println(personList);
//
//        DataBase.addPersonToSet(personList);
//
//        TreeSet<Person> sortedList = DataBase.getPersonTreeSet();
//        System.out.println("Sorted: " + sortedList);
//
//        DataBase.addPersonToLinkedList(personList);
//
//        LinkedList<Person> sortedByAge = DataBase.getPersonLinkedList();
//        System.out.println("By Age: " + sortedByAge);
//    }
//}
