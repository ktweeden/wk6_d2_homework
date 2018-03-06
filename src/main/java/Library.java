import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private String name;
    private HashMap<Genre, Integer> genreCount;

    public Library(String name, int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
        this.name = name;
        this.genreCount = new HashMap<>();
        initializeGenreCount();
    }

    public void addBook(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
            addToGenreCount(book.getGenre());
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public int getNumberOfGenre(Genre genre) {
        return this.genreCount.get(genre);
    }

    public void lend(Book book, Borrower borrower) {
        if (books.remove(book)) {
            borrower.borrow(book);
            removeFromGenreCount(book.getGenre());
        }
    }
    private void initializeGenreCount() {
        for (Genre g : Genre.values()) {
            genreCount.put(g, 0);
        }
    }

    public void addToGenreCount(Genre genre) {
        int newCount = genreCount.get(genre);
        newCount += 1;
        genreCount.put(genre, newCount);
    }

    public void removeFromGenreCount(Genre genre) {
        int newCount = genreCount.get(genre);
        newCount -= 1;
        genreCount.put(genre, newCount);
    }

//    public void generateGenreCount() {
//        for (Book book : this.books) {
//            int newCount = genreCount.get(book.getGenre());
//            newCount += 1;
//            genreCount.put(book.getGenre(), newCount);
//        }
//    }
}
