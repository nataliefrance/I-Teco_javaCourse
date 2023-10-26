package Ex_9;

import java.util.Objects;

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
        setMood("Отличное");
    }

    public void bark() {
        System.out.println("Гав!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(mood, dog.mood) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mood, name);
    }

    @Override
    public String toString() {
        return "Собака " + getName() + ", возраст: " + getAge() + ", настроение: " + getMood();
    }
}
