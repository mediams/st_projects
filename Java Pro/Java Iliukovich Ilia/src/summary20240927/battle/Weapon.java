package summary20240927.battle;

public class Weapon {
    private String name;
	private int force; // plus

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
}
