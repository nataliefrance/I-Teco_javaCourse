package Ex_8;

public class Employee extends Person implements Printable, SeasonHandler {
    private int salary;
    private boolean isDidJob;

    public Employee(int salary, boolean isDidJob) {
        this.salary = salary;
        this.isDidJob = isDidJob;
    }

    @Override
    public void printNameAndAge() {
        System.out.println("Сотрудника зовут "+ this.getName() + ", возраст " + this.getAge());
    }

    @Override
    public void printInfo() {
        System.out.println("Зарплата сотрудника " + salary);
        if (isDidJob) {
            System.out.println("Сотрудник выполнил работу");
        } else System.out.println("Сотрудник работу не выполнил");
    }

    @Override
    public void printSeason(Season season) {
        System.out.println("У сотрудника сейчас " + season + ", цвет " + season.getColor());
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDidJob(boolean didJob) {
        isDidJob = didJob;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isDidJob() {
        return isDidJob;
    }
}
