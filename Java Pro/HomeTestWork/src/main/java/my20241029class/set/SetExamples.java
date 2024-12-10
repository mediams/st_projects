package my20241029class.set;

import my20241029class.Book;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("F");
        set.add("E");
        set.add("C");
        set.add("Y");
        set.add("E");

        System.out.println(set);

        for (String s : set) {
            System.out.print(s + " ");
        }
        Book book1 = new Book("Rawling1", "Harry Potter", 10, true, 10.0);
        Book book2 = new Book("Rawling2", "Harry Potter", 10, true, 10.0);
        Book book3 = new Book("", "Java in Action", 14, true, 19.5);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 6, true, 15.0);
        Book book5 = new Book("Rl: Tolstoy", "War and Peace", 7, true, 12.0);
        Book book6 = new Book("Sedgwik", "Algorithms", 21, true, 14.0);
        Book book7 = new Book("Rawling", "Harry Potter und der Gefangene von Askaban", 10, true, 10.0);
        Set<Book> bookSet = new TreeSet<>(new Book.BookComparatorByAuthorAndTitle());
        bookSet.add(book1);
        bookSet.add(book3);
        bookSet.add(book2);

        System.out.println(bookSet);

        Iterator <String> iterator = set.iterator();
        System.out.println(set.contains("B"));

        TreeSet<String> treeSet = (TreeSet<String>) set;
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<String> headedSet = treeSet.headSet("B");
        System.out.println(headedSet);
        SortedSet<String> tailedSet = treeSet.tailSet("C");
        System.out.println(tailedSet);
        SortedSet<String> subSet = treeSet.subSet("F", "C");
    }
}
