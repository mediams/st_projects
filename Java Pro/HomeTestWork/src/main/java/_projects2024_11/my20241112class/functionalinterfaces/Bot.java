package _projects2024_11.my20241112class.functionalinterfaces;

public class Bot {
    String name;

    public Bot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bot{" +
                "name='" + name + '\'' +
                '}';
    }
}
