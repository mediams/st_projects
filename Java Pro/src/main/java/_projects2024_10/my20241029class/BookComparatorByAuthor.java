package _projects2024_10.my20241029class;

import java.util.Comparator;

public class BookComparatorByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
