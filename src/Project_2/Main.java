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

        if (UserService.login()) {
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
                if (UserService.login()) {
                    printMainMenu();
                }
                break;
            case 2:
                if (currentUser.getRole() == Role.USER) {
                    System.out.println("Недостаточно прав доступа");
                    printMainMenu();
                } else {
                    try {
                        NoteService.createNote();
                    } catch (EmptyNoteNameException e) {
                        System.out.println(e.getMessage());
                    }
                    printMainMenu();
                }
                break;
            case 3:
                Note note = NoteService.searchNote();
                while (note == null) {
                    System.out.println("Такой заметки нет.");
                    note = NoteService.searchNote();
                }
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
                try {
                    NoteService.changeNoteName(note);
                } catch (EmptyNoteNameException e) {
                    System.out.println(e.getMessage());
                }
                printMainMenu();
                break;
            case 2:
                NoteService.changeNoteWord(note);
                printMainMenu();
                break;
            case 3:
                NoteService.changeNoteBody(note);
                printMainMenu();
                break;
            case 4:
                NoteService.deleteNote(note);
                printMainMenu();
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }

    private static void initialize() {
        users.add(new UserDetails(Role.ADMIN, "Natalya", "123", "Наталья"));
        users.add(new UserDetails(Role.MODERATOR, "Evgeniy", "321", "Евгений"));
        users.add(new UserDetails(Role.USER, "Mila", "111", "Мила"));

        Note note = new Recipe("Наталья");
        note.setName("Пирог");
        note.setBody("Яйца, мука, разрыхлитель, сахар. Всё перемешать и выпекать в духовке 30 минут.");
        notes.add(note);
    }
}
