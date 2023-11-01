package Ex_11_Collections;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static final TreeSet<Student> students = new TreeSet<>();
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();
        System.out.println("Добро пожаловать в журнал!\n");
        printMenu();

    }

    private static void printMenu() {
        System.out.println("Выберите действие:\n" +
                "1.Найти ученика.\n" +
                "2.Показать всех учеников по фамилии по возрастанию.\n" +
                "3.Показать всех учеников по фамилии по убыванию.\n" +
                "4.Отсортировать учеников по классу.\n" +
                "5.Удалить ученика.\n" +
                "6.Выйти из журнала.");

        int input = SCANNER.nextInt();
        switch (input){
            case 1:
                System.out.println("Введите фамилию:");
                String surname = SCANNER.nextLine();
                Student student = StudentService.findStudent(surname);
                if (student.equals(StudentService.emptyStudent)) {
                    System.out.println("Такой студент не найден.\n");
                }
                printMenu();
                break;
            case 2:
                StudentService.printBySurname();
                printMenu();
                break;
            case 3:
                StudentService.reversePrintBySurname();
                printMenu();
                break;
            case 4:
                StudentService.sortByClass();
                printMenu();
                break;
            case 5:
                System.out.println("Введите фамилию студента, которого хотите удалить из журнала:");
                String studentSurname = SCANNER.nextLine();
                StudentService.deleteStudent(studentSurname);
                printMenu();
                break;
            case 6:
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Некорректный ввод\n");
                printMenu();
        }
    }

    private static void initialize() {
        Student student1 = new Student("Vasya", "Pupkin", 1, Subject.GYMNASTICS);
        Student student2 = new Student("Ekaterina", "Great", 2, Subject.GEOGRAPHY);
        Student student3 = new Student("Frenk", "Gerbert", 1, Subject.HISTORY);
        Student student4 = new Student("Ludmila", "Petranovskaya", 3, Subject.MATH);
        Student student5 = new Student("Ilon", "Mask", 4, Subject.PHYSICS);
        Collections.addAll(students, student1, student2, student3, student4, student5);
    }
}
