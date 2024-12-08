package my20241011.catandbox;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, "Belka");
        Cat cat3 = new Cat(3, "Bolli");
        Cat cat2 = new Cat(1, "Max");
        Cat cat4 = new Cat(1, "Max");

        Box box1 = new Box("Box1", 1, cat1);
        Box box2 = new Box("Box2", 2, cat2);
        Box box3 = new Box("Box3", 3, cat3);

        Cat[] catArray = new Cat[]{cat1, cat2};
        Box box4 = new Box("Box 4", 4, catArray);
        box4.addCat(cat3);
        box4.addCat(cat3);
        System.out.println(box1.toString());
        System.out.println(box4);
    }
}
