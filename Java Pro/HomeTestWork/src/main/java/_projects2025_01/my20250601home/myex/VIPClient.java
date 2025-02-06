package my20250601home.myex;

public class VIPClient implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.2;
    }
}
