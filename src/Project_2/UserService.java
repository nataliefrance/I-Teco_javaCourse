package Project_2;

public class UserService {
    protected static boolean login() {
        System.out.println("Введите через пробел логин и пароль:");
        try {
            Main.currentUser = checkLoginAndPassword(Main.SCANNER.nextLine());
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    protected static UserDetails checkLoginAndPassword(String input) throws Exception {
        if (input == null) {
            throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }

        if ("".equals(input)) {
            input = Main.SCANNER.nextLine();
        }

        String[] array = input.split(" ");
        UserDetails newUser = null;

        for (UserDetails user : Main.users) {
            if (user.getLogin().equals(array[0]) && user.getPassword().equals(array[1])) {
                newUser = user;
            }
        }

        if (newUser == null) {
            throw new WrongLoginOrPasswordException("Неправильный логин и пароль");
        }

        return newUser;
    }
}
