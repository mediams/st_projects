package _projects2025_01.my20250601home.bank;

public class Konto {
    String name;
    int count;

    public Konto(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
