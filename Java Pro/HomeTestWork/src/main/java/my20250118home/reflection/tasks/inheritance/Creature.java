package my20250118home.reflection.tasks.inheritance;

public abstract class Creature {

    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void introduce();

    public String getName() {
        return name;
    }

    public void play(Creature another) {
        if (another == null || this == another) {
            throw new RuntimeException("Wrong input parameter. Another creature should be not null and not the same object");
        }
        System.out.println(this.getName() + " plays with " + another.getName());
    }
}
