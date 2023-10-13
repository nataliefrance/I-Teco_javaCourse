package Ex_8;

public class Employee extends Person implements Printable, SeasonHandler {
    private int salary;
    private boolean isDidJob;

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
