package Ex_9;

import java.util.Objects;

public class House<T extends Domestic> {
    private final T domestic;

    public House(T domestic) {
        this.domestic = domestic;
    }

    public T getDomestic() {
        return domestic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(domestic);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof House)) return false;

        House house = (House) obj;
        return this.domestic == house.domestic;
    }

    @Override
    public String toString() {
        return "В этом доме живёт " + this.domestic;
    }
}
