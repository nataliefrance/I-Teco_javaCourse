package Ex_11_Collections;

public enum Subject {
    DEFAULT(""),
    MATH("Математика"),
    GEOGRAPHY("География"),
    PHYSICS("Физика"),
    GYMNASTICS("Гимнастика"),
    HISTORY("История");

    private final String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
