public class Book {

    private String title;
    private Genre genre;

    public Book(String title,  Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }
}
