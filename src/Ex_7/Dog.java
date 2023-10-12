package Ex_7;

public class Dog extends Animal {

    private String mood;
    int hungry;
    protected int energy;

    public Dog() {
    }

    public Dog(int age, int weight, boolean hasFur, String mood, int hungry, int energy) {
        super(age, weight, hasFur);
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    public Dog(int quantityOfLegs, int age, int weight, boolean hasFur, String mood, int hungry, int energy) {
        super(quantityOfLegs, age, weight, hasFur);
        this.mood = mood;
        this.hungry = hungry;
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
        System.out.println("Собака съела кость.");
    }

    public void bark() {
        System.out.println("Гав!");
    }
}
