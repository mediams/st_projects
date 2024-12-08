package my20241011classworksummary.catinbox;

public class Box {
    private String name;
    private boolean canBeSold;
    private int count;
    private Cat cat;

    public Box(Cat cat) {
        this.cat = cat;
    }

    public Box(String name, boolean canBeSold, int count, Cat cat) {
        this.name = name;
        this.canBeSold = canBeSold;
        this.count = count;
        this.cat = cat;
    }

    //опусташает обьекты Box
    public void empty() {
        cat = null;
        name = null;
        canBeSold = false;
        count = 0;
    }

    // поверхностностное копирование shallow copy ссылка на один обьект
    public Box makeCopy() {
        Box box = new Box(this.name, this.canBeSold, this.count, this.cat);
        return box;
    }

    //разные обьекты
    public Box deepCopy() {
        Cat cat1 = new Cat(cat.getName(), cat.getAge(), cat.getColour());
        Box box2 = new Box(this.name, this.canBeSold, this.count, cat1);
        return box2;
    }

    public Cat getCat() {
        return cat;
    }

        @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", canBeSold=" + canBeSold +
                ", count=" + count +
                ", cat=" + cat +
                '}';
    }
}
