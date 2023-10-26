package Project_2;

public abstract class Note {
    private final String author;
    private final TypeOfNote typeOfNote;
    private String name;
    private String body;

    public Note(TypeOfNote typeOfNote, String author) {
        this.typeOfNote = typeOfNote;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Заметка \"" + name +
                "\"\nАвтор: " + author +
                " \nТипа заметки: " + typeOfNote.getDescription() +
                " \nСодержание: " + body + "\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}
