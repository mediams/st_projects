public abstract class Character {
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract int countForce();

    public abstract int countProtection();

    public void fight(Character another) {

        if (another.countForce() > this.countForce()) {
            System.out.println(another.getName() + " WIN!!");
            this.health = health - (another.countForce() - this.countForce()) / this.countProtection();
        } else if (this.countForce() > another.countForce()) {
            System.out.println(this.getName() + " WIN!!");
            another.health = health - (this.countForce() - another.countForce()) / another.countProtection();

        } else {
            System.out.println("Drow!");
        }
        System.out.println(this.getName() + " health after fight: " + this.getHealth());
        System.out.println(another.getName() + " health after fight: " + another.getHealth());


    }

    public void introduce() {
        System.out.printf("Hi! My name is %s, I have %d Health.\n", name, health);
    }


}
