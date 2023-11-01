package Ex_12_Lambda;

public class Student {
    private final String name;
    private final int age;
    private String group;

    public Student() {
        this.name = "noname";
        this.age = -1;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student " + name +
                ", age " + age +
                ", group " + group;
    }
}
