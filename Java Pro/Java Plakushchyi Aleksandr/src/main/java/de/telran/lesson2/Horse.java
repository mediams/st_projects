package de.telran.lesson2;

public class Horse {
    protected String name;
    protected String color;
    private int weight;

    public Horse() {
    }

    public Horse(String name, String color, int weight) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void run() {
        System.out.println(name + " horse " + ", with color " + color + " run.");

    }

    public void transport() {
        System.out.println(name + ", horse transported weight: " + weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
