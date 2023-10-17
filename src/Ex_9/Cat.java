package Ex_9;

public class Cat extends Animal {
    private String mood;
    private String name;

    public Cat() {
    }

    public Cat(int age, String mood, String name) {
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
        System.out.println("Кот съел мышь.");
        mood = "Отличное";
        System.out.println("Настроение: " + mood);
    }
    public void meow() {
        System.out.println("Мяу!");
    }
}
