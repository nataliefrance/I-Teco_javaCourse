package Ex_11;

public enum Subject {
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
