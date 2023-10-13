package Ex_8;

public enum Season {
    WINTER("белый"),
    SPRING("голубой"),
    SUMMER("зеленый"),
    AUTUMN("желтый");

    private String color;

    Season (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
