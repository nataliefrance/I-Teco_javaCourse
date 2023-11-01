package Ex_9_Objects_and_Generics;

public class HouseCat extends Cat implements Domestic {

    public HouseCat(int age, String mood, String name) {
        super(age, mood, name);
    }

    @Override
    public void ruinTheFurniture() {
        System.out.println("Котик " + getName() + " расцарапал стену.");
        setMood("Отличное");
    }

    @Override
    public void lieOnKnees() {
        System.out.println("Котик " + getName() + " лежит на коленках.");
    }

    @Override
    public void pee() {
        System.out.println("Кот " + getName() + " сходил в лоток.");
        setMood("Отличное");
    }

    @Override
    public void sleep() {
        System.out.println("Кот " + getName() + " уснул в корзинке.");
        setMood("Отличное");
    }
}
