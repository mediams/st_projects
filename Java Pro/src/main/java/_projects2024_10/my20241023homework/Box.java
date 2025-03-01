package _projects2024_10.my20241023homework;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private String name;

    private List<Toy> toyList = new ArrayList<>();

    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    public void printToyList() {
        for (Toy toy : toyList) {
            System.out.println(toy.getName());
        }
    }

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
