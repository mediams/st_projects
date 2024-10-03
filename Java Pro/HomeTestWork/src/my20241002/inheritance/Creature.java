package my20241002.inheritance;

public abstract class Creature {
    private String name;

    public abstract void introduce();

    public abstract void play(Creature another);

    public String getName() {
        return name;
    }
}
