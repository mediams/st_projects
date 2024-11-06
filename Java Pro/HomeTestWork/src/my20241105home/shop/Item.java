package my20241105home.shop;

public class Item {
    private String title;
    private double price;

    public Item(String title, double price) {
        this.title = title;
        this.price = Math.round(price * 100) / 100.00;;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
