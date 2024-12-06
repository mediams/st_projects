import java.util.Objects;

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

    public int countForce() {
        return force + weapon.getForce();
    }

    public int countProtection() {
        return protection.getLevel();
    }

    @Override
    public void introduce() {
        System.out.printf("Hi! My name is %s, I have %d Health. I have a strange %d (%s) and a protection %d (%s).\n", super.getName(), super.getHealth(), countForce(), Objects.toString(weapon), countProtection(), protection);
    }
}
