package _projects2025_01.my20250601home.myex;

public class Regular implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}
