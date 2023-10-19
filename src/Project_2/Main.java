package Project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static ArrayList<UserDetails> users = new ArrayList<>();
    private static UserDetails currentUser;

    public static void main(String[] args) {
        initialize();
        System.out.println("Введите через пробел логин и пароль:");
        try {
            currentUser = checkLoginAndPassword(SCANNER.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        SCANNER.close();
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
