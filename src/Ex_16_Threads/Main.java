package Ex_16_Threads;

public class Main {
    public static void main(String[] args) {
        Road road = new Road();
        Thread threadPerson = new Thread(road::incrementPersons);
        Thread threadCars = new Thread(road::incrementCars);

        threadPerson.start();
        threadCars.start();
        road.startMoving();
    }
}
