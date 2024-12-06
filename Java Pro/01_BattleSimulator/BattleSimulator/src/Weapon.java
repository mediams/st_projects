public class Weapon {
    private String name;
    private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return "Weapon: '" + name +"'";
    }
}
