package de.telran.lesson2;

public class Unicorn extends Horse {
    protected int cornsCount;

    public Unicorn(String name, String color, int weight, int cornsCount) {
        super(name, color, weight);
        this.cornsCount = cornsCount;
    }

    public void fight() {
        System.out.println("Unicorn fight with " + cornsCount + " corns.");
    }
}
