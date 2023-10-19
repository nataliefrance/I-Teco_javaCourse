package Project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final ArrayList<UserDetails> users = new ArrayList<>();
    private static UserDetails currentUser;
    private static final ArrayList<Note> notes = new ArrayList<>();

    public static void main(String[] args) {
        initialize();

        if (login()) {
            printMainMenu();
        }



        SCANNER.close();
    }

    private static void printMainMenu() {
        System.out.println("1. Выполнить вход под другим пользователем\n" +
                "2. Создать новую заметку\n" +
                "3. Поиск заметки по названию");

        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                if (login()){
                    printMainMenu();
                }
                break;
            case 2:
                createNote();
                break;
            case 3:
                //searchNote();
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }

    private static void createNote() {
        System.out.println("Выберите тип заметки:\n" +
                        "1. Рецепты\n" +
                        "2. Список дел\n" +
                        "3. Список покупок");
        int input = SCANNER.nextInt();
        Note note = null;

        switch (input) {
            case 1:
                note = new Recipe(currentUser.getName());
                break;
            case 2:
                note = new ToDoList(currentUser.getName());
                break;
            case 3:
                note = new ShoppingList(currentUser.getName());
                break;
            default:
                System.out.println("Некорректный ввод");
                createNote();
        }

        System.out.println("Введите название заметки:");
        String name = SCANNER.nextLine();
        if ("".equals(name)) {
            name = SCANNER.nextLine();
        }
        note.setName(name);

        System.out.println("Напишите заметку:");
        String body = SCANNER.nextLine();
        if ("".equals(body)) {
            body = SCANNER.nextLine();
        }
        note.setBody(body);
        notes.add(note);

        System.out.println("Заметка " + note.getName() + " создана.");
    }

    private static boolean login() {
        System.out.println("Введите через пробел логин и пароль:");
        try {
            currentUser = checkLoginAndPassword(SCANNER.nextLine());
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static UserDetails checkLoginAndPassword(String input) throws Exception {
        if (input == null) {
            throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }

        if ("".equals(input)) {
            input = SCANNER.nextLine();
        }

        String[] array = input.split(" ");
        UserDetails newUser = null;

        for (UserDetails user : users) {
            if (user.getLogin().equals(array[0]) && user.getPassword().equals(array[1])) {
                newUser = user;
            }
        }

        if (newUser == null) {
            throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }

        return newUser;
    }

    private static void initialize() {
        users.add(new UserDetails(Role.ADMIN, "Natalya", "123", "Наталья"));
        users.add(new UserDetails(Role.MODERATOR, "Evgeniy", "321", "Евгений"));
        users.add(new UserDetails(Role.USER, "Mila", "111", "Мила"));

        Note note = new Recipe("Natalya");
        note.setName("Осенний пирог");
        note.setBody("2 яйца, тыква, мука, разрыхлитель. Всё перемешать и выпекать в духовке 30 минут.");
        notes.add(note);
    }
}
