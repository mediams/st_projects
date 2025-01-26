package my20250124summary;

public class LibraryManager {
    private Library library;

    public LibraryManager(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    private void borrowBook(String isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("Book Not founded");
            return;
        }
        int availableCopies = book.getAvailableCopies();
        if (availableCopies > 0) {
            book.setAvailableCopies(availableCopies - 1);
            user.borrowBook(book);
        } else {
            System.out.println("No copies available");
        }
    }

    public void returnBook(String isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("Book Not founded");
            return;
        }
        int availableCopies = book.getAvailableCopies();
        book.setAvailableCopies(availableCopies + 1);
        user.returnBook(book);
    }

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(Book book) {
        library.removeBook(book);
    }

    public void registerUser(User user){
        library.registerUser(user);
    }
}
