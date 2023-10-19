package Project_2;

public enum TypeOfNote {
    RECIPES("Рецепт"),
    SHOPPING_LIST("Спиок покупок"),
    TO_DO_LIST("Список дел");

    private final String description;

    TypeOfNote(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
