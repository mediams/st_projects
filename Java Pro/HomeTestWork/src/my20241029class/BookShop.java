package my20241029class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShop {
    public static void main(String[] args) {
        Book book1 = new Book("Rawling", "Harry Potter und der Stein der Weisen", 10, true, 10.0);
        Book book2 = new Book("Rawling", "Harry Potter und die Kammer des Schreckens", 10, true, 10.0);
        Book book3 = new Book("", "Java in Action", 14, true, 19.5);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 6, true, 15.0);
        Book book5 = new Book("Rl: Tolstoy", "War and Peace", 7, true, 12.0);
        Book book6 = new Book("Sedgwik", "Algorithms", 21, true, 14.0);
        Book book7 = new Book("Rawling", "Harry Potter und der Gefangene von Askaban", 10, true, 10.0);

        List<Book> books = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7));

        System.out.println("Sort by Title: \n" + books);
        Collections.sort(books, new Book.BookComparatorByTitle());
        System.out.println("Sort by Author: \n" + books);
        Collections.sort(books, new BookComparatorByAuthor()); // merge sort ---> stable ---> does not change order of sorted elements


        System.out.println("Sort by Price: \n" + books);
        Collections.sort(books, new Book.BookComparatorByPrice());


        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getCount(), o2.getCount());
            }
        });
        System.out.println("Sort by Count: \n" + books);
        System.out.println(books);
    }
}
