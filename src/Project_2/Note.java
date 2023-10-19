package Project_2;

public abstract class Note {
    private String author;
    private final TypeOfNote typeOfNote;
    private String name;
    private String body;

    public Note(TypeOfNote typeOfNote, String author) {
        this.typeOfNote = typeOfNote;
        this.author = author;
    }
}
