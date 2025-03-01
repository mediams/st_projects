package my20250124summary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List <Book> books = new ArrayList<>();
        Library library = new Library(new ArrayList<>(List.of(
                new Book("Detective", "John", "1", 5),
                new Book("Romane", "Smith", "2", 0),
                new Book("Detective2", "John2", "3", 6),
                new Book("Detective3", "John3", "4", 2))

        ), new ArrayList<>(List.of(
                new User("Ivan", 1,
                        new ArrayList<>(List.of(
                                new Book("Detective2", "John2", "5", 6))))
        )));

        library.addBook(new Book("Detective10", "John10", "10", 2));
        System.out.println(library);
        library.removeBook(new Book("Detective3", "John3", "4", 2));
        System.out.println(library);

    }
}
