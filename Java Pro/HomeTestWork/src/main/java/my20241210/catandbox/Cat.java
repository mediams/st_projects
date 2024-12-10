package my20241210.catandbox;

public class Cat {
    private String name;
    private Box currentBox;

    public Cat(String name) {
        this.name = name;
    }

    public Box getCurrentBox() {
        return currentBox;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
