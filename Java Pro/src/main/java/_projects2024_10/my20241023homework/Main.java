package _projects2024_10.my20241023homework;

public class Main {
    public static void main(String[] args) {
        Box box = new Box("Box");
        box.addToy(new Toy("Toy1"));
        box.addToy(new Toy("Toy1"));
        box.addToy(new Toy("Toy1"));

        box.printToyList();
    }
}