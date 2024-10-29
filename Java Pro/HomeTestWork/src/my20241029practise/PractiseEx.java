package my20241029practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PractiseEx {
    public static void main(String[] args) {
        Book book1 = new Book("Rawling", "Harry Potter", 10.0, true, 10);
        Book book2 = new Book("Rawling", "Harry Potter", 10.0, true, 10);
        Book book3 = new Book("", "Java in Action", 14.0, true, 19);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 6.0, true, 15);
        Book book5 = new Book("Rl: Tolstoy", "War and Peace", 7.0, true, 12);
        Book book6 = new Book("Sedgwik", "Algorithms", 21.0, true, 14);
        Book book7 = new Book("Rawling", "Harry Potter", 10.0, true, 10);

        List<Book> books = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7));

        sortCompare(books, new Book.BookComparatorByTitle());
        System.out.println(books);

        sortCompare(books, new Book.BookComparatorByPrice());
//        sortCompare(books, new Book.BookComparatorByAuthor());
        System.out.println(books);

    }

    public static void sortCompare(List<Book> books, Comparator<Book> comparator) {
        for (int i = 0; i < books.size(); i++) {
            boolean isSorted = true;
            Book temp = null;
            for (int j = 0; j < books.size() - i - 1; j++) {
                isSorted = true;
                if (comparator.compare(books.get(j), books.get(j + 1)) > 0) {
                    swap(books, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    private static void swap(List<Book> books, int j, int i) {
        Book temp;
        temp = books.get(j);
        books.set(j, books.get(i));
        books.set((i), temp);
    }
}
