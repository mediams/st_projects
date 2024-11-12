package my20241112class;

//import my20241029class.Book;

import java.util.Map;
import java.util.TreeMap;

public class KeysInMap {
    public static void main(String[] args) {
        Book book1 = new Book("Rawling", "Harry Potter und der Stein der Weisen", 10, true, 10.0);
        Book book2 = new Book("Rawling", "Harry Potter und die Kammer des Schreckens", 10, true, 10.0);
        Book book3 = new Book("", "Java in Action", 14, true, 19.5);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 6, true, 15.0);
        Book book5 = new Book("Rl: Tolstoy", "War and Peace", 7, true, 12.0);
        Book book6 = new Book("Sedgwik", "Algorithms", 21, true, 14.0);
        Book book7 = new Book("Rawling", "Harry Potter und der Gefangene von Askaban", 10, true, 10.0);

        Map<Book, Integer> bookMap = new TreeMap<>(new Book.BookComparatorByTitle());
        Map<Book, Integer> bookMap2 = new TreeMap<>(new Book.BookComparatorByAuthorAndTitle());
        bookMap.put(book1, book1.getCount());
        bookMap.put(book2, book2.getCount());
        bookMap.put(book3, book3.getCount());
        bookMap.put(book4, book4.getCount());
        bookMap.put(book5, book5.getCount());

        for (Map.Entry<Book, Integer> entry : bookMap.entrySet()){
            System.out.println(entry);
        }

        book1.setTitle("Java"); // this will break tree;
        Book updateBook = book1.updateBook ("Java"); // make copy - modify // kann man das machen

        System.out.println("<-------------------------->");
        for (Map.Entry<Book, Integer> entry : bookMap.entrySet()){
            System.out.println(entry);
        }
    }
}
