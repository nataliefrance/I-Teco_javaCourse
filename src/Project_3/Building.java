package Project_3;

public abstract class Building {
    private String name;
    private String metroStation;
    private String address;
    private double Square;
    private int price;
    private double rating;
    protected Type type;

    @Override
    public String toString() {
        return name + ", " +
                "цена: " + price +
                ", средняя оценка: " + rating + ".";
    }

    public Building(String name, String metroStation, String address, double square, int price, double rating) {
        this.name = name;
        this.metroStation = metroStation;
        this.address = address;
        Square = square;
        this.price = price;
        this.rating = rating;
    }

    public Building() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMetroStation(String metroStation) {
        this.metroStation = metroStation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSquare(double square) {
        Square = square;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMetroStation() {
        return metroStation;
    }

    public double getRating() {
        return rating;
    }
}
