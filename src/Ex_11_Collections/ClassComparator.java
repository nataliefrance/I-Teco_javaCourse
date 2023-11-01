package Ex_11_Collections;

import java.util.Comparator;

public class ClassComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getClassNumber() - student2.getClassNumber();
    }
}
