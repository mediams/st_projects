package my20241011classworksummary.catinbox;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty", 2, "Grey");
        Box box1 = new Box("Box1", true, 1, cat1);

        System.out.println(cat1);
        System.out.println(box1.toString());

        System.out.println();
        Box box2 = box1.makeCopy();
        System.out.println(box1.getCat() == box2.getCat());
        System.out.println(Objects.equals(box1.getCat(), box2.getCat()));

        System.out.println(box2);

        System.out.println(box1.deepCopy());
        System.out.println();

        Box box3 = box1.deepCopy();
        System.out.println(box1.getCat() == box3.getCat());
        System.out.println(Objects.equals(box1.getCat(), box3.getCat()));
    }
}
