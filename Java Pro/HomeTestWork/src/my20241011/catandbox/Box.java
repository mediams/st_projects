package my20241011.catandbox;

import java.util.Arrays;
import java.util.Objects;

public class Box {
    private String name;
    private int count;
    Cat cat;
    Cat[] cats;

    public Box(String name, int count, Cat cat) {
        this.name = name;
        this.count = count;
        this.cat = cat;
    }

    public Box(String name, int count, Cat[] cats) {
        this.name = name;
        this.count = count;
        this.cats = cats;
    }

    public void addCat(Cat newCat) {
        for (int i = 0; i < cats.length; i++) {
            if (Objects.equals(cats[i], newCat)) {
                System.out.println("Habe schon!");
                return;
            }
        }
        Cat[] newCatArrays = Arrays.copyOf(cats, cats.length + 1);
        newCatArrays[cats.length] = newCat;
        this.cats = newCatArrays;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", cat=" + cat +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }
}
