package de.telran.lesson2;

public class Main {
    public static void main(String[] args) {
        Horse h = new Horse("Bobby", "black", 10);

        h.run();
        h.transport();
        System.out.println();
        Pegas p = new Pegas("Maria", "white", 12, 2);

        p.run();
        p.transport();
        p.fly();
        System.out.println();

        Unicorn u = new Unicorn("Max", "Grey", 14, 2);
        u.run();
        u.transport();
        u.fight();
        System.out.println();

        UniPegas uniPegas = new UniPegas("Tom", "Red", 16, 2, 4);
        uniPegas.run();
        uniPegas.fly();
        uniPegas.fight();
        uniPegas.transport();
    }
}
