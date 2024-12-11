package _projects2024_11.my20241105home.shop;

public class Item implements Comparable<Item> {
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

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.price, o.price);
    }
}
