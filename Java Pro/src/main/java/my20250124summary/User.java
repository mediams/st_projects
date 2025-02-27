package my20250124summary;


import java.util.List;

public class User {
    private String name;
    private int userId;
    private List<Book> borrowedBooks;

    public User(String name, int userId, List<Book> borrowedBooks) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
