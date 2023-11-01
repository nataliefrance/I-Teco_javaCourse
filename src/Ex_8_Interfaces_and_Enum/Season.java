package Ex_8_Interfaces_and_Enum;

public enum Season {
    WINTER("белый"),
    SPRING("голубой"),
    SUMMER("зеленый"),
    AUTUMN("желтый");

    private final String color;

    Season (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
