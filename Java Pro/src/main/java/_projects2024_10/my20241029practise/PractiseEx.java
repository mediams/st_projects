package _projects2024_10.my20241029practise;

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
        Collections.sort(books, new Book.BookComparatorByPrice());
        System.out.println(books);

        sortCompare(books, new Book.BookComparatorByPrice());
//        sortCompare(books, new Book.BookComparatorByAuthor());
        System.out.println(books);

    }
// какие вопросы будут на собесе
    public static void sortCompare(List<Book> books, Comparator<Book> comparator) {
        // first operation - make copy to array or ArrayList
        List<Book> booksCopy = new ArrayList<>(books); // off jetzt // O(n) operation
        for (int i = 0; i < books.size(); i++) { // n
            boolean isSorted = true;
            Book temp = null;
            for (int j = 0; j < books.size() - i - 1; j++) { // n/2
                if (comparator.compare(books.get(j), books.get(j + 1)) > 0) { // ArrayList 1, LinkidList On
                    swap(books, j, j + 1); // von 1 ---- bis n
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    } // n * n / 2 * n ----> O(n^3) for LinkedLIst
    // n * n / 2 ----> O(n^2) for ArrayList
    // last operation - write sorted copy to books

    private static void swap(List<Book> books, int j, int i) {
        Book temp;
        temp = books.get(j);
        books.set(j, books.get(i));
        books.set((i), temp);
    }

    // besser als swap
    public static void swap2(List<Book> books, int i, int j) {
        if (i != j) {
            Book temp = books.get(i);
            books.set(i, books.get(j));
            books.set(j, temp);
        }
    }

    public static void selectionSort(List<Book> books, Comparator<Book> comparator2) {
        for (int i = 0; i < books.size(); i++) {
            Book minBook = books.get(i);
            int indexMinBook = i;
            for (int j = i + 1; i < books.size(); i++) {
                if (comparator2.compare(minBook, books.get(j)) > 0) {
                    minBook = books.get(j);
                    indexMinBook = j;
                    swap2(books, i, indexMinBook);
                }
            }
        }
    }
}

