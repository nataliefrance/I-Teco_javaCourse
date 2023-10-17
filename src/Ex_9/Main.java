package Ex_9;

public class Main {
    public static void main(String[] args) {
        HouseCat catVasiliy = new HouseCat(5, "Очень плохое", "Василий");
        HouseDog dogPryadka = new HouseDog(3, "Отличное", "Прядка");


        House<HouseCat> house1 = new House<>(catVasiliy);
        House<HouseDog> house2 = new House<>(dogPryadka);
        House<HouseDog> house3 = new House<>(dogPryadka);

        System.out.println("Кот " + catVasiliy.getName() + ". Настроение: " + catVasiliy.getMood());
        catVasiliy.ruinTheFurniture();
        catVasiliy.eat();
        catVasiliy.lieOnKnees();
        catVasiliy.meow();

        System.out.println(house1);
        System.out.println(house2.equals(house3));
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
    }
}
