package Ex_9;

public class HouseCat extends Cat implements Domestic{

    public HouseCat(int age, String mood, String name) {
        super(age, mood, name);
    }

    @Override
    public void ruinTheFurniture() {
        System.out.println("Котик " + this.getName() + " расцарапал стену.");
        setMood("Отличное");
        System.out.println("Настроение: " + getMood());
    }

    @Override
    public void lieOnKnees() {
        System.out.println("Котик " + this.getName() + " лежит на коленках.");
    }
}
