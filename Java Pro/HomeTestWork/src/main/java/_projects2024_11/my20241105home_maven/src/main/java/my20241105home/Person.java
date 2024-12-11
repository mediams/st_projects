package my20241105home;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String email;

    private Address address;

    public Person(int id, String name, String surname, int age, String sex, String email, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public List<Person> gen(int countPeople) {
        List<Person> list = new ArrayList<>();
        Faker faker = new Faker();

        for (int i = 0; i < countPeople; i++) {
            int id = faker.number().randomDigit();
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            int age = faker.number().numberBetween(18, 99);
            String sex = faker.demographic().sex();
            String email = faker.internet().emailAddress();
            Address address = new Address(faker.number().randomDigit(), faker.address().streetAddress(), faker.number().numberBetween(1, 50), faker.number().numberBetween(10001, 9999));

            list.add(new Person(id, name, surname, age, sex, email, address));
        }
        return list;
    }

    //    name, surname, age, Address
    @Override
    public int compareTo(Person o) {
        int result = Integer.compare(id, o.id);
        if (result != 0) {
            return result;
        }
        result = name.compareTo(o.name);
        if (result != 0) {
            return result;
        }
        result = surname.compareTo(o.surname);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(age, o.age);
        if (result != 0) {
            return result;
        }
        return address.compareTo(o.address);
    }
}
