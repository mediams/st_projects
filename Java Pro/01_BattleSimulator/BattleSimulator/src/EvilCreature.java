public class EvilCreature extends Character {
    private int force;
    private int protection;

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    public int countForce() {
        return force;
    }

    public int countProtection() {
        return protection;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi! My name is %s, I have %d Health. I have a strange %d and a protection %d.\n", super.getName(), super.getHealth(), countForce(), countProtection());
    }
}
