package _projects2024_12.my20241205home.my20241210.catandbox;

import lombok.ToString;

@ToString
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat 1");
        Cat cat2 = new Cat("Cat 2");
        Cat cat3 = new Cat("Cat 3");
        Box box1 = new Box("Box 1");
        Box box2 = new Box("Box 2", cat2);
        Cat[] cats = new Cat[]{cat1, cat2};

        Box box3 = new Box("Box  all cats", cats);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println("-" + box3);

        box1.addCat(cats);
        cats = box3.addCat(cats, cat3);
        box3.addCat(cats, cat1);

        System.out.println();
        System.out.println(box1);
        System.out.println(box3);

        System.out.println();
        System.out.println(box1);
        box1.addCat(cat1);
        System.out.println(box1);
//        box1.emptyCat(cat1);
        System.out.println(box1);
        System.out.println(box3);

        Box boxCopy = box1.makeCopy();

        System.out.println(boxCopy);
    }
}
