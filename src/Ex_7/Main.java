package Ex_7;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(4, 2, 10, false, "Не в настроении", 0, 10);
        Animal dog = new Dog(4, 20, true, "Отличное", 10, 100);

        dog.setQuantityOfLegs(4);

        Animal[] array = new Animal[]{cat, dog};

        for (Animal animal : array) {
            animal.eat();
            animal.pee();
            animal.sleep();
        }

        ((Dog) dog).bark();
        ((Cat) cat).meow();
    }
}
