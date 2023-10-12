package Ex_7;

public class Cat extends Animal {

    private String mood;
    String name;
    protected int energy;

    public Cat() {
    }

    public Cat(int quantityOfLegs, int hungry, int age, int weight, boolean hasFur, String mood, String name, int energy) {
        super(quantityOfLegs, hungry, age, weight, hasFur);
        this.mood = mood;
        this.name = name;
        this.energy = energy;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public void eat() {
        System.out.println("Кот съел мышь.");;
    }

    public void meow() {
        System.out.println("Мяу!");
    }
}
