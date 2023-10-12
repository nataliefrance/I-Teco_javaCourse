package Ex_7;

public abstract class Animal {

    int age;
    protected int weight;
    public int quantityOfLegs;

    public Animal(){}

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
    private void eat() {
        System.out.println("Животное поело.");
    }

    void pee() {
        System.out.println("Животное сходило в кусты");
    }

    protected void sleep() {
        System.out.println("Животное уснуло");
    }
}
