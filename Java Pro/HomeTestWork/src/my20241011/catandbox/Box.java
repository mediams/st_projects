package my20241011.catandbox;

import java.util.Arrays;

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

    public void addCat (Cat newCat){
        this.cats[count] = newCat;
        count++;
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
