package Project_2;

public enum Role {
    ADMIN("Администратор"),
    MODERATOR("Модератор"),
    USER("Пользователь");

    private final String description;

    Role(String description) {
        this.description = description;
    }
}
