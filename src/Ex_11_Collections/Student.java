package Ex_11_Collections;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final int classNumber;
    private final Subject favoriteSubject;

    public Student(String name, String surname, int classNumber, Subject favoriteSubject) {
        this.name = name;
        this.surname = surname;
        this.classNumber = classNumber;
        this.favoriteSubject = favoriteSubject;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getClassNumber() {
        return classNumber;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                ", класс №" + classNumber +
                ", любимый предмет " + favoriteSubject.getName();
    }

    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return classNumber == student.classNumber && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && favoriteSubject == student.favoriteSubject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, classNumber, favoriteSubject);
    }
}
