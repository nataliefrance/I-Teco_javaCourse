package Ex_11;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static final HashSet<Student> students = new HashSet<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();


    }

    private static void printMenu() {
        System.out.println("Добро пожаловать в журнал!\n" +
                "Выберите действие:\n" +
                "1.Найти ученика.\n" +
                "2.Показать всех учеников по фамилии по возрастанию.\n" +
                "3.Показать всех учеников по фамилии по убыванию.\n" +
                "4.Отсортировать учеников по классу." +
                "5.Удалить ученика.\n" +
                "6.Выйти из журнала.");

        int input = SCANNER.nextInt();
        switch (input){
            case 1:
                //findStudent();
                break;
            case 2:
                //sortBySurname();
                break;
            case 3:
                //reverseSortBySurname();
                break;
            case 4:
                //sortByClass();
                break;
            case 5:
                //deleteStudent();
                break;
            case 6:
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Некорректный ввод");
                printMenu();
        }
    }

    private static void initialize() {
        Student student1 = new Student("Vasya", "Pupkin", 1, Subject.GYMNASTICS);
        Student student2 = new Student("Ekaterina", "Great", 2, Subject.GEOGRAPHY);
        Student student3 = new Student("Frenk", "Gerbert", 1, Subject.HISTORY);
        Student student4 = new Student("Ludmila", "Petranovskaya", 3, Subject.MATH);
        Student student5 = new Student("Ilon", "Mask", 4, Subject.PHYSICS);
    }
}
