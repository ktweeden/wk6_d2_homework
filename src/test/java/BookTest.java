import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        this.book = new Book("The Colour Purple", Genre.GENERAL);
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Colour Purple", book.getTitle());
    }
}
