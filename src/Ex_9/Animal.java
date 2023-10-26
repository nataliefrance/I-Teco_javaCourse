package Ex_9;

public abstract class Animal {

    private int age;

    public Animal(){
    }

    public Animal(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Животное поело.");
    }
    public void pee() {
        System.out.println("Животное сходило в кусты.");
    }
    public void sleep() {
        System.out.println("Животное уснуло.");
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
