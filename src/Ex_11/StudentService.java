package Ex_11;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentService {
    static Student emptyStudent = new Student("noname", "nosurname", 0, Subject.DEFAULT);
    static Comparator comparator = new ClassComparator();

    static Student findStudent(String surname) {
        if ("".equals(surname)) {
            surname = Main.SCANNER.nextLine();
        }
        for (Student student : Main.students) {
            if (student.getSurname().equalsIgnoreCase(surname)) {
                System.out.println(student);
                return student;
            }
        }
        System.out.println("Студент с такой фамилией не найден.\n");
        return emptyStudent;
    }

    static void printBySurname() {
        for (Student student : Main.students) {
            System.out.println(student);
        }
        System.out.println();
    }

    static void reversePrintBySurname() {
        Set<Student> reverseSet = Main.students.descendingSet();
        for (Student student : reverseSet) {
            System.out.println(student);
        }
        System.out.println();
    }

    static void sortByClass() {
        Set<Student> sortByClassSet = new TreeSet<>(comparator);
        sortByClassSet.addAll(Main.students);
        for (Student student : sortByClassSet) {
            System.out.println(student);
        }
        System.out.println();
    }
}
