package Ex_8;

public enum Season {
    WINTER("white"),
    SPRING("blue"),
    SUMMER("green"),
    AUTUMN("yellow");

    private String color;

    Season (String color) {
        this.color = color;
    }
}
