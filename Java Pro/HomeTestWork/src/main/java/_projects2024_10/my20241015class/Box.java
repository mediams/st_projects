package _projects2024_10.my20241015class;

public class Box {
    private String name;
    private boolean canBeSold;
    private int count;
    private Cat cat;

    private void empty() {
    }
    public Box(String name, boolean canBeSold, int count, Cat cat) {
        this.name = name;
        this.canBeSold = canBeSold;
        this.count = count;
        this.cat = cat;
    }

//    public void empty() {
//        cat = null;
//        name = null;
//        canBeSold = false;
//        count = 0;
//    }

    public Box makeCopy() {
        return new Box(name, canBeSold, count, cat);
    }

    public Box deepCopy() {
        return new Box(name, canBeSold, count, new Cat(cat.getName(), cat.getAge(), cat.getColour()));
    }

    public static void main(String[] args) {
        Cat cat = new Cat("My Cat", 2, "grey");
        Box box = new Box("Box", true, 12, cat);

        Box box2 = box.makeCopy();

    }


}

