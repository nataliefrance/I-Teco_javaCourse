package Project_3;

/*
 Название помещения
 Станция метро
 Адрес
 Кол-во комнат (для квартир)
 Тип помещения (для коммерческих помещений)
 Метраж помещения
 Цена
 Средняя оценка

Вывод при группировке, сортировке необходимо соблюсти формат
(Название – цена - оценка)
 */
public abstract class Building {
    private final String name;
    private final String metroStation;
    private final String address;
    private final double Square;
    private final int price;
    private final double rating;
    protected Type type;

    @Override
    public String toString() {
        return "Помещение: " + name + ", " +
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
}
