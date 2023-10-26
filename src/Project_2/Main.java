package Project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    protected static final Scanner SCANNER = new Scanner(System.in);
    protected static final ArrayList<UserDetails> users = new ArrayList<>();
    protected static UserDetails currentUser;
    protected static final ArrayList<Note> notes = new ArrayList<>();

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
                if (login()) {
                    printMainMenu();
                }
                break;
            case 2:
                if (currentUser.getRole() == Role.USER) {
                    System.out.println("Недостаточно прав доступа");
                    printMainMenu();
                } else NoteService.createNote();
                break;
            case 3:
                Note note = NoteService.searchNote();
                if (currentUser.getRole() != Role.USER) {
                    printNoteMenu(note);
                } else printMainMenu();
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }

    private static void printNoteMenu(Note note) {
        System.out.println("1. Изменить название\n" +
                "2. Заменить слово в заметке\n" +
                "3. Изменить содержание\n" +
                "4. Удалить заметку");
        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                NoteService.changeNoteName(note);
                break;
            case 2:
                //changeNoteWord();
                break;
            case 3:
                NoteService.changeNoteBody(note);
                break;
            case 4:
                NoteService.deleteNote(note);
                break;
            default:
                System.out.println("Некорректный ввод");
        }

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

        Note note = new Recipe("Наталья");
        note.setName("Осенний пирог");
        note.setBody("Яйца, тыква, мука, разрыхлитель, сахар. Всё перемешать и выпекать в духовке 30 минут.");
        notes.add(note);
    }
}
