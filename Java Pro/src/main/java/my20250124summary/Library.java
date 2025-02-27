package my20250124summary;

import java.util.List;
import java.util.stream.Stream;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Book findBookByIsbn(String isbn){
        return books.stream()
                .filter(book -> book.isIsbn()
                        .equals(isbn)).findFirst().orElse(null);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", users=" + users +
                '}';
    }
}
