package Ex_11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudentService {
    static Student emptyStudent = new Student("no_name", "no_surname", 0, Subject.DEFAULT);
    static Comparator classComparator = new ClassComparator();
    static Comparator surnameComparator = new SurnameComparator();

    static Student findStudent(String surname) {
        if ("".equals(surname)) {
            surname = Main.SCANNER.nextLine();
        }
        for (Student student : Main.students) {
            if (student.getSurname().equalsIgnoreCase(surname)) {
                System.out.println(student + "\n");
                return student;
            }
        }
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
        TreeSet<Student> sortByClassSet = new TreeSet<>(classComparator.thenComparing(surnameComparator));
        sortByClassSet.addAll(Main.students);
        for (Student student : sortByClassSet) {
            System.out.println(student);
        }
        System.out.println();
    }

    static void deleteStudent(String surname) {
        if ("".equals(surname)) {
            surname = Main.SCANNER.nextLine();
        }

        Iterator iterator = Main.students.iterator();

        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getSurname().equalsIgnoreCase(surname)) {
                iterator.remove();
                System.out.println("Студент " + student.getName() + " " + student.getSurname() + " удалён\n");
            }
        }
    }
}
