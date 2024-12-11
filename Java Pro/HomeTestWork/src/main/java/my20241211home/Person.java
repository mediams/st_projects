package my20241211home;

import _projects2024_10.my20241024practise.Getter;

import java.util.List;

@Getter
public class Person implements Comparable {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void getAll(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public static void deletePersonByName(List<Person> personList, String name) {
        for (Person p : personList) {
            if (p.getName().equals(name)) {
                personList.remove(p);
            }
        }
    }

    public static Person searchMinAge(List<Person> personList) {
        if (personList == null || personList.isEmpty()) {
            return null;
        }

        Person temp = personList.get(0);
        for (Person p : personList) {
            if (p.getAge().compareTo(temp.getAge()) < 0) {
                temp = p;
            }
        }

        return temp;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
