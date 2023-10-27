package Ex_11;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class StudentService {
    static Student emptyStudent = new Student("noname", "nosurname", 0, Subject.DEFAULT);

    static Student findStudent(String surname){
        if ("".equals(surname)){
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
    static void reversePrintBySurname(){
        Set<Student> reverseSet= Main.students.descendingSet();
        for (Student student : reverseSet) {
            System.out.println(student);
        }
        System.out.println();
    }
}
