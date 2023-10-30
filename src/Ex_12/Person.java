package Ex_12;

public class Person {
    private final String name;
    private final int age;
    private final int birthYear;

    public Person(String name, int age, int birthYear) {
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
