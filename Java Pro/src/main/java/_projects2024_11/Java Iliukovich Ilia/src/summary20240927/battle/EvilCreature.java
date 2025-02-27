package summary20240927.battle;

public class EvilCreature extends Character {
    private int force; //Power
    private int protection; //Defence

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }
}
