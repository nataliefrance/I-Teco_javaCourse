package Ex_12_Lambda;

public class Main {

    public static final Condition<Integer> SUITABLE_AGE = age -> (age >= 17) && (age <= 40);
    public static final Condition<Integer> BIRTH_YEAR = year -> year < 1995;

    public static void main(String[] args) {

        Person personGerbert = new Person("Frenk Gerbert", 30, 1800);
        Student studentGerbert = convertPersonToStudent(personGerbert);

        System.out.println(studentGerbert);
    }

    private static Student convertPersonToStudent(Person person) {
        Converter<Person, Student> converter =
                p -> new Student(p.getName(), p.getAge());

        if (SUITABLE_AGE.check(person.getAge())) {
            Student student = converter.convert(person);

            student.setGroup(BIRTH_YEAR.check(person.getBirthYear())
                    ? "УбИН-01-22"
                    : "УбИН-02-22");
        } else {
            System.out.println("Возраст не подходящий.");
        }
        return new Student();
    }
}
