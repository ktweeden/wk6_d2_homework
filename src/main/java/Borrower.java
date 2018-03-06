import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;
    private String name;

    public Borrower(String name) {
        this.books = new ArrayList<>();
        this.name = name;
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public int numberOfBorrowedBooks() {
        return this.books.size();
    }
}
