package Project_3;

public class Apartment extends Building {
    private int numberOfRooms;

    public Apartment(String name, String metroStation, String address, double square, int price, double rating, int numberOfRooms) {
        super(name, metroStation, address, square, price, rating);
        this.numberOfRooms = numberOfRooms;
        super.type = Type.APARTMENT;
    }

    public Apartment() {
        super.type = Type.APARTMENT;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
