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
    private String name;
    private String metroStation;
    private String address;
    private double Square;
    private int price;
    private double rating;

    @Override
    public String toString() {
        return "Помещение: " + name + ", " +
                "цена: " + price +
                ", средняя оценка: " + rating + ".";
    }
}
