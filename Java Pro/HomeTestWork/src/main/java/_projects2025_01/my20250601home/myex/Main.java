package my20250601home.myex;

public class Main {
    public static void main(String[] args) {
        Discount regular = new Regular();
        Discount vip = new VIPClient();

        System.out.println(regular.calculate(100));
        System.out.println(vip.calculate(100));

        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println(calculator.calculate(regular, 100));
        System.out.println(calculator.calculate(vip, 100));
    }
}
