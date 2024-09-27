package summary20240927.battle;

public class Superhero extends Character {
    private int force;
    Weapon weapon;
    Protection protection;

    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        super(name);
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force + weapon.getForce();
    }

    @Override
    public int countProtection() {
        return protection.getLevel();
    }
}
