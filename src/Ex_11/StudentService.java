package Ex_11;

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
}
