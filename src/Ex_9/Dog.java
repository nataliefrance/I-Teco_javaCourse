package Ex_9;

public class Dog extends Animal{
    private String mood;
    private String name;

    public Dog(int age, String mood, String name) {
        super(age);
        this.mood = mood;
        this.name = name;
    }

    public String getMood() {
        return mood;
    }

    public String getName() {
        return name;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака съела кость.");
    }

    public void bark() {
        System.out.println("Гав!");
    }
}
