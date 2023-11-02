package Project_3;

public class CommercialPremises extends Building {

    public CommercialPremises(String name, String metroStation, String address, double square, int price, double rating) {
        super(name, metroStation, address, square, price, rating);
        super.type = Type.COMMERCIAL;
    }
}
