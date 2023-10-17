package Ex_9;

public class House<T extends Domestic> {
    private final T domestic;

    public House(T domestic) {
        this.domestic = domestic;
    }

    public T getDomestic() {
        return domestic;
    }
}
