package Ex_9;

public class HouseDog extends Cat implements Domestic{
    public HouseDog(int age, String mood, String name) {
        super(age, mood, name);
    }
    @Override
    public void ruinTheFurniture() {
        System.out.println("Собака " + this.getName() + " разрушил диван.");
    }
    @Override
    public void lieOnKnees() {
        System.out.println("Собака " + this.getName() + " лежит на коленках.");
    }
}
