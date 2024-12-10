package my20241210.catandbox;

import java.util.Arrays;
import java.util.Objects;

public class Box {
    private String name;
    private Cat cat;
    private Cat[] cats;
    private Cat[] newCatsArray;

    public Box(Box box) {
        this.name = name;
    }

    public Box(String name, Cat cat) {
        this.name = name;
        this.cat = cat;
    }

    public Box(String name, Cat[] cats) {
        this.name = name;
        this.cats = cats;
    }

    public Box(String name) {
        this.name = name;
    }

    public void emptyCat(Cat cat) {
        this.cat = null;
    }

    public void addCat(Cat[] cats) {
        this.cat = cat;
    }

    public void addCat(Cat cat) {
        this.cat = cat;
    }

    public Cat[] addCat(Cat[] cats, Cat newCat) {
        for (Cat cat : cats) {
            if (Objects.equals(cat, newCat)) {
                System.out.println("Eine Katze der Namen: " + newCat.getName() + ", Schon haben wir !");
                return cats;
            }
        }
        Cat[] newCatsArray = Arrays.copyOf(cats, cats.length + 1);
        newCatsArray[cats.length] = newCat;
        this.cats = newCatsArray;
        return newCatsArray;
    }

    public Box makeCopy() {
        if (cats == null) {
            Box box = new Box(this.name, this.cat);
            return box;

        }else {
            Box box = new Box(this.name, this.cats);
            return box;

        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                (cat == null ? "" : cat) +
                (cats == null ? "" : Arrays.toString(cats)) +
                '}';
    }
}
