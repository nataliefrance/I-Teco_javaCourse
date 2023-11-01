package Ex_9_Objects_and_Generics;

public class HouseDog extends Cat implements Domestic{
    public HouseDog(int age, String mood, String name) {
        super(age, mood, name);
    }

    @Override
    public void ruinTheFurniture() {
        System.out.println("Собака " + getName() + " разрушил диван.");
        setMood("Плохое");
    }
    @Override
    public void lieOnKnees() {
        System.out.println("Собака " + getName() + " лежит на коленках.");
    }

    @Override
    public void pee() {
        System.out.println("Собака " + getName() + " сходила в туалет во дворе.");
        setMood("Отличное");
    }

    @Override
    public void sleep() {
        System.out.println("Собака " + getName() + " уснула на коврике.");
    }
}
