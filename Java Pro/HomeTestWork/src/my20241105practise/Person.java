package my20241105practise;

import java.util.LinkedList;
import java.util.TreeSet;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Address address;
    private int age;

}

class Address {
    private int id;
    private String street;
    private int houseNumber;
    private int postCode;
}

class DataBase {
    static TreeSet treeSet;
    static LinkedList linkedList;
}


