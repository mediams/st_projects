package _projects2024_10.my20241029practise;

import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isOnSale;
    private int count;

    public Book(String title, String author, double price, boolean isOnSale, int count) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isOnSale = isOnSale;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public int getCount() {
        return count;
    }


    public static class BookComparatorByTitle implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());

        }
    }
    public static class BookComparatorByAuthor implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());

        }
    }
    public static class BookComparatorByPrice implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
//            return o1.getPrice().compareTo(o2.getAuthor());
            return Double.compare(o1.getPrice(), o2.getPrice());

        }
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isOnSale=" + isOnSale +
                ", count=" + count +
                '}';
    }
}
