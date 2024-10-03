package my20241002.inheritance;

public class Human extends Creature implements Walkable {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.setHungry(false);
        System.out.println("Animal " + animal.getName() + " is not hungry anymore");
    }

    public void walkAnimal(Animal animal) {
        animal.setHungry(true);
        System.out.println("The animal has taken a walk and is hungry.");
    }

    public void walkAnimal(Animal... animal) {
        for (Animal a : animal) {
            walkAnimal(a);
        }
    }

    public void feedAnimals(Animal... animals) {
        for (Animal a : animals) {
            feedAnimal(a);
        }
    }

    @Override
    public void introduce() {
        System.out.printf("Hi! I'm %s. I'm the man who owns this whole zoo.\n", name);
    }

    @Override
    public void play(Creature another) {
        if (this == another) {
            System.out.printf("%s going to the movies.\n", getName());
        }else System.out.printf("%s play with %s.\n", this.getName(), another.getName());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void walk(Animal animal) {
        animal.setHungry(true);
        System.out.println("The animal has taken a walk and is hungry.");
    }

    public void walk(Animal... animal) {
        for (Animal a : animal) {
            walk(a);
        }
    }

}
