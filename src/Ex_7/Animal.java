package Ex_7;

public abstract class Animal {

    private int quantityOfLegs;
    private int hungry;
    int age;
    protected int weight;
    public boolean hasFur;

    public Animal(){
    }

    public Animal(int age, int weight, boolean hasFur) {
        this.age = age;
        this.weight = weight;
        this.hasFur = hasFur;
    }

    public Animal(int quantityOfLegs, int hungry, int age, int weight, boolean hasFur) {
        this.quantityOfLegs = quantityOfLegs;
        this.hungry = hungry;
        this.age = age;
        this.weight = weight;
        this.hasFur = hasFur;
    }

    public void eat() {
        System.out.println("Животное поело.");
    }

    protected void pee() {
        System.out.println("Животное сходило в кусты.");
    }

    protected void sleep() {
        System.out.println("Животное уснуло.");
    }

    public int getQuantityOfLegs() {
        return quantityOfLegs;
    }

    public int getHungry() {
        return hungry;
    }

    public void setQuantityOfLegs(int quantityOfLegs) {
        this.quantityOfLegs = quantityOfLegs;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
}
