package de.telran.lesson2;

public class Pegas extends Horse {
    protected int wingsCount;

    public Pegas(String name, String color, int weight, int wingsCount) {
        super(name, color, weight);
        this.wingsCount = wingsCount;
    }

    public void fly() {
        System.out.println(super.name + " pegasus " + ", with color " + color + " fly with " + wingsCount + " wings.");
    }
}
