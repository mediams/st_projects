package _projects2024_10.my20241029class;

import java.util.Comparator;

public class Book {
    private String author;
    private String title;
    private int count;
    private boolean canBeSold;
    private double price;

    public Book(String author, String title, int count, boolean canBeSold, double price) {
        this.author = author;
        this.title = title;
        this.count = count;
        this.canBeSold = canBeSold;
        this.price = price;
    }

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public boolean isCanBeSold() {
        return canBeSold;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "author='" + author + '\'' +
                ",\ttitle='" + title + '\'' +
                ",\tcount=" + count +
                ",\tcanBeSold=" + canBeSold +
                ",\tprice=" + price +
                '}';
    }

    public static class BookComparatorByTitle implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());

        }//
    }
    public static class BookComparatorByPrice implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return Double.compare(o2.getPrice(), o1.getPrice());

        }
    }
    public static class BookComparatorByAuthorAndTitle implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            int authorComparison = o1.getAuthor().compareTo(o2.getAuthor());
            if (authorComparison != 0) {
                return authorComparison;
            }
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}

