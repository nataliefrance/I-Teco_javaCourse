package Ex_12;

public class Main {
    public static void main(String[] args) {
        Condition<Integer> suitableAge = age -> (age >= 17) && (age <= 40);
        Condition<Integer> birthYear = year -> year < 1995;

        Person personGerbert = new Person("Frenk Gerbert", 30, 1800);
        Student studentGerbert = convertPersonToStudent(personGerbert, suitableAge, birthYear);

        System.out.println(studentGerbert);
    }

    private static Student convertPersonToStudent(Person person, Condition<Integer> isSuitableAge, Condition<Integer> isYearLess1995){
        Student student = new Student();

        Converter<Person, Student> converter =
                p -> new Student(p.getName(), p.getAge());

        if (isSuitableAge.check(person.getAge())) {
            student = converter.convert(person);

            if (isYearLess1995.check(person.getBirthYear())) {
                student.setGroup("УбИН-01-22");
            } else student.setGroup("УбИН-02-22");

        } else System.out.println("Возраст не подходящий.");

        return student;
    }
}
