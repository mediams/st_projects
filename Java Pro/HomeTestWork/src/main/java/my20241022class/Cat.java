package my20241022class;

import java.util.Iterator;
import java.util.List;

public class Cat implements Iterable {
    private String name;

    private Kitten Kitten;

    private List<Kitten> kittenList;

    public Cat(String name) {
        this.name = name;
    }

    public void addKitten(Kitten kitten) {
        kittenList.add(kitten);
    }

    public void setKitten(Cat.Kitten kitten) {
        Kitten = kitten;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "nameKitten='" + Kitten + '\'' +
                '}';
    }

    @Override
    public Iterator<Kitten> iterator() {
        return kittenList.iterator();
    }

    public class Kitten {
        private String kittenName;

        public Kitten(String kittenName) {
            this.kittenName = kittenName;
        }

        @Override
        public String toString() {
            return "Kitten{" +
                    "kittenName='" + kittenName + '\'' +
                    "Mother Name='" + name + '\'' +
                    '}';
        }
    }
}
