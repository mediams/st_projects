package my20241023homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    static class Book {
        private String bookName;
        private String autorName;

    }

    class LibraryCatalog {
        List<Book> bookList = new ArrayList<>();

        public void addBook(Book book) {
            bookList.add(book);
        }

        public void searchBook(String query){
            Comparator comparator = new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return 0;
                }
            };

        }
    }
}
