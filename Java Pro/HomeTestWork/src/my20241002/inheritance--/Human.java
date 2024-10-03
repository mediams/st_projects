package lesson20240924.inheritance;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.setHungry(false);
        System.out.println("Animal " + animal.getName() + " is not hungry anymore");
    }

    public void feedAnimals(Animal... animals) {
        for (Animal a : animals) {
            feedAnimal(a);
        }
    }

}
