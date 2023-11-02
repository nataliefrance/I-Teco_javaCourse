package Project_3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommercialService {
    /*static void addCommerial() {
        Apartment apartment = new Apartment();
        System.out.println("Введите название:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
            apartment.setName(name);
        }

        System.out.println("Введите станцию метро:");
        String station = Main.SCANNER.nextLine();
        if ("".equals(station)) {
            station = Main.SCANNER.nextLine();
            apartment.setMetroStation(station);
        }

        System.out.println("Введите адрес:");
        String address = Main.SCANNER.nextLine();
        if ("".equals(address)) {
            address = Main.SCANNER.nextLine();
            apartment.setAddress(address);
        }

        System.out.println("Введите площадь:");
        double square = Main.SCANNER.nextDouble();
        apartment.setSquare(square);

        System.out.println("Введите цену:");
        int price = Main.SCANNER.nextInt();
        apartment.setPrice(price);

        System.out.println("Введите рейтинг:");
        double rating = Main.SCANNER.nextDouble();
        apartment.setRating(rating);

        System.out.println("Введите количество комнат:");
        int rooms = Main.SCANNER.nextInt();
        apartment.setNumberOfRooms(rooms);

        Main.buildingsList.add(apartment);
        System.out.println("Готово!");
    }*/

    static void remove(String name) {
        Main.buildingsList.removeIf(commercial -> commercial.getName().equals(name));
    }

    static void sortByPrice() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.COMMERCIAL))
                .sorted(Comparator.comparingInt(Building::getPrice))
                .forEach(System.out::println);
    }

    static void reverseSortByPrice() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.COMMERCIAL))
                .sorted(Comparator.comparingInt(Building::getPrice).reversed())
                .forEach(System.out::println);
    }

    static void print() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.COMMERCIAL))
                .forEach(System.out::println);
    }

    static void groupByMetroStation() {
        Map<String, List<Building>> groupingByMetro = Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.COMMERCIAL))
                .collect(Collectors.groupingBy(Building::getMetroStation));

        groupingByMetro.forEach((metroStation, commercials) -> {
            System.out.println("Метро: " + metroStation);
            commercials.forEach(commercial -> System.out.println(commercial.getName()
                    + ", цена: " + commercial.getPrice()
                    + ", рейтинг: " + commercial.getRating()));
            System.out.println();
        });
    }

    static void bestByRating() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.COMMERCIAL))
                .max(Comparator.comparingDouble(Building::getRating))
                .ifPresent(System.out::println);
    }
}
