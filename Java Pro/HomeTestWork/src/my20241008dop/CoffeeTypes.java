package my20241008dop;

public enum CoffeeTypes {
    LATTE(3, "Latte"),
    AMERICANO(2, "Americano"),
    ESPRESSO (4, "Espresso"),
    MACCHIATO(4,"Macchiato"),
    CAPPUCCINO (2, "Cappuccino");

    private final int price;
    private final String info;

    CoffeeTypes(int price, String info) {
        this.price = price;
        this.info = info;
    }

    @Override
    public String toString() {
        return "CoffeeTypes{" +
                "price=" + price +
                ", info='" + info + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}
