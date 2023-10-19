package Project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static ArrayList<UserDetails> users = new ArrayList<>();
    private static UserDetails currentUser;
    private static ArrayList<Note> notes = new ArrayList<>();

    public static void main(String[] args) {
        initialize();
        login();
        printMainMenu();



        SCANNER.close();
    }

    private static void printMainMenu(){
        System.out.println("1. Выполнить вход под другим пользователем\n" +
                "2. Создать новую заметку\n" +
                "3. Поиск заметки по названию");

        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                login();
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

    private static void createNote(){

    }

    private static void login(){
        System.out.println("Введите через пробел логин и пароль:");
        try {
            currentUser = checkLoginAndPassword(SCANNER.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static UserDetails checkLoginAndPassword(String input) throws Exception{
        if (input == null || input == "") {
            throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }
        String[] array = input.split(" ");
        UserDetails emptyUser = new UserDetails(Role.USER, "Empty", "000", "Empty");

        for (UserDetails user : users) {
            if (user.getLogin().equals(array[0]) && user.getPassword().equals(array[1])) {
                return user;
            } else throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }
        return emptyUser;
    }

    private static void initialize() {
        users.add(new UserDetails(Role.ADMIN, "Natalya", "123", "Наталья"));
        users.add(new UserDetails(Role.MODERATOR, "Evgeniy", "321", "Евгений"));
        users.add(new UserDetails(Role.USER, "Mila", "111", "Мила"));
    }
}
