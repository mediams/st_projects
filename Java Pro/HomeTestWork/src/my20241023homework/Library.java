package my20241023homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    static class Book {
        private String bookName;
        private String autorName;

        public Book(String bookName, String autorName) {
            this.bookName = bookName;
            this.autorName = autorName;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAutorName() {
            return autorName;
        }
    }

    class LibraryCatalog {
        List<Book> bookList = new ArrayList<>();

        public void addBook(Book book) {
            bookList.add(book);
        }

        public void printCatalog() {
            for (Book book : bookList) {
                System.out.println(book.getBookName() + " " + book.getAutorName());
            }
        }

        public void searchBook(String query) {
            System.out.println("Wir suchen: " + query);
            Comparator<Book> comparator = new Comparator<Book>() {
                @Override
                public int compare(Book book1, Book book2) {
                    System.out.println("+");
                    return book1.getAutorName().compareTo(book2.getAutorName());
                }
            };

        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        LibraryCatalog libraryCatalog = library.new LibraryCatalog();
        libraryCatalog.addBook(new Book("Ein Killer", "John Müller"));
        libraryCatalog.addBook(new Book("Eine andere Geschichte", "Anna Schmidt"));

        libraryCatalog.printCatalog();
        libraryCatalog.searchBook("John Müller");
    }
}
