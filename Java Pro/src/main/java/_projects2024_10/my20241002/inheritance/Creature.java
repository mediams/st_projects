package _projects2024_10.my20241002.inheritance;

public abstract class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void introduce();

    public abstract void play(Creature another);

    public String getName() {
        return name;
    }
}
