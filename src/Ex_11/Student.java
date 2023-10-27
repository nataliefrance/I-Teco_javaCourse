package Ex_11;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private final String name;
    private String surname;
    private int classNumber;
    private Subject favoriteSubject;

    public Student(String name, String surname, int classNumber, Subject favoriteSubject) {
        this.name = name;
        this.surname = surname;
        this.classNumber = classNumber;
        this.favoriteSubject = favoriteSubject;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public void setFavoriteSubject(Subject favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
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
