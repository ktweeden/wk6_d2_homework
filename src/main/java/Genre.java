public enum Genre {
    THRILLER("Things that thrill"),
    HORROR("Things that scare"),
    FANTASY("Things that are fantastic"),
    SCIFI("Things that are speculative"),
    ROMANCE("Things that fluster"),
    CRIME("Things that are criminal"),
    GENERAL("Other stuff");

    private String description;

    Genre(String description) {
        this.description = description;
    }

}
