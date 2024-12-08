package de.telran.lesson2;

public class UniPegas extends Pegas {
    protected int cornsCount;

    public UniPegas(String name, String color, int weight, int cornsCount, int wingsCount) {
        super(name, color, weight, wingsCount);
        this.cornsCount = cornsCount;
    }

    public void fight() {
        System.out.println(name + " can fly with " + wingsCount + " and fight with " + cornsCount + " corns.");
    }
}
