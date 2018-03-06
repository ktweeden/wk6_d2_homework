import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    Library library;
    Book theColourPurple;
    Borrower borrower;

    @Before
    public void before() {
        this.library = new Library("Central Library",5);
        this.theColourPurple = new Book("The Colour Purple", Genre.GENERAL);
        this.borrower = new Borrower("Kate");
    }

    @Test
    public void libraryIsEmpty() {
        assertEquals(0, this.library.numberOfBooks());
    }

    @Test
    public void libraryHasOneBook() {
        library.addBook(theColourPurple);
        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void cantAddBooksOverCapacity() {
        for (int i= 0; i < 10 ; i++) {
            library.addBook(theColourPurple);
        }
        assertEquals(5, library.numberOfBooks());
    }

    @Test
    public void borrowerCanBorrowBook() {
        library.addBook(theColourPurple);
        library.lend(theColourPurple, borrower);
        assertEquals(1, borrower.numberOfBorrowedBooks());
    }

//    @Test
//    public void genreCountInitialisesAt0() {
//        library.generateGenreCount();
//        assertEquals(0, library.getNumberOfGenre(Genre.GENERAL));
//    }

    @Test
    public void oneAddedToGenreCount() {
        library.addBook(theColourPurple);
        assertEquals(1, library.getNumberOfGenre(Genre.GENERAL));
    }

    @Test
    public void borrowingReducesGenre() {
        library.addBook(theColourPurple);
        assertEquals(1, library.getNumberOfGenre(Genre.GENERAL));
        library.lend(theColourPurple, borrower);
        assertEquals(0, library.getNumberOfGenre(Genre.GENERAL));

    }

//    @Test
//    public void countNumberOfGeneralNovels() {
//        for (int i = 0; i<5; i++ ) {
//            library.addBook(theColourPurple);
//        }
//        library.generateGenreCount();
//        assertEquals(5, library.getNumberOfGenre(Genre.GENERAL));
//    }
}
