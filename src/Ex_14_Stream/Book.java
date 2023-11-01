package Ex_14_Stream;

public class Book {
    private final String name;
    private final String author;
    private final int volume;
    private final boolean isFiction;

    public Book(String name, String author, int volume, boolean isFiction) {
        this.name = name;
        this.author = author;
        this.volume = volume;
        this.isFiction = isFiction;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isFiction() {
        return isFiction;
    }

    @Override
    public String toString() {
        return "Book: " +
                "name '" + name + '\'' +
                ", author '" + author + '\'' +
                ", volume " + volume +
                " pages, " + (isFiction? "fiction" : "nonfiction");
    }
}
