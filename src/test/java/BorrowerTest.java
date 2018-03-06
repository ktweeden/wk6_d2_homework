import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        this.borrower = new Borrower("Kate");
        this.book = new Book("1984", Genre.SCIFI);
        this.library = new Library("Central", 5);
    }

    @Test
    public void borrowedBooksIsZero() {
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void hasBorrowedBooks() {
        borrower.borrow(book);
        assertEquals(1, borrower.numberOfBorrowedBooks());
    }
}
