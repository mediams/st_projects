package summary20240927.battle;

public abstract class Character {
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
//        this.health = 100;
    }

    //Count Power
    public abstract int countForce();

    //Count Defence
    public abstract int countProtection();

    //Говорит о себе
    public void introduce() {
        System.out.println("Hi! I'm " + name);
        System.out.printf("I have %d health, I have %d force, I have %d protection.\n", health, countForce(), countProtection());
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    //    health =  health - (force1 - force2) / level
    public void fight(Character another) {
        System.out.println();

        if (another.countForce() > this.countForce()) {
            System.out.println("Person " + another.getName() + " is WIN!");
            this.health = this.health - (another.countForce() - this.countForce()) / another.countProtection();
        } else if (another.countForce() < this.countForce()) {
            System.out.println("Person " + this.getName() + " is WIN!");
            another.health = another.health - (this.countForce() - another.countForce()) / this.countProtection();
        } else System.out.println("Draw!");


        System.out.println(another.getName() + " " + another.health);
        System.out.println(this.getName() + " " + this.health);

    }
}
