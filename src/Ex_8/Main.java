package Ex_8;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Быстро и дешёво", true, false);
        client.setAge(40);
        client.setName("Игорь");

        Employee employee = new Employee(50_000, false);
        employee.setName("Алёнушка");
        employee.setAge(25);

        printInfo(client);
        printInfo(employee);

        printSeason(client, Season.WINTER);
        printSeason(employee, Season.SPRING);
    }

    static void printInfo(Printable o) {
        o.printNameAndAge();
        o.printInfo();
    }

    static void printSeason(SeasonHandler o, Season season) {
        o.printSeason(season);
    }
}
