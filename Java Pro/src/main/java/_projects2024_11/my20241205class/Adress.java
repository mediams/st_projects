package _projects2024_11.my20241205class;

import java.io.Serializable;

public class Adress implements Serializable {
    private String city;
    private String street;

    public Adress(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

