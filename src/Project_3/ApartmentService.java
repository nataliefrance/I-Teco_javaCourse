package Project_3;

import Ex_14_Stream.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApartmentService {
    static void addApartment() {
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
    }

    static void removeApartment(String name) {
        Main.buildingsList.removeIf(apartment -> apartment.getName().equals(name));
    }

    static void sortByPrice() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.APARTMENT))
                .sorted(Comparator.comparingInt(Building::getPrice))
                .forEach(System.out::println);
    }

    static void reverseSortByPrice() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.APARTMENT))
                .sorted(Comparator.comparingInt(Building::getPrice).reversed())
                .forEach(System.out::println);
    }

    static void print() {
        Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.APARTMENT))
                .forEach(System.out::println);
    }

    static void groupByMetroStation() {
        Map<String, List<Building>> groupingByMetro = Main.buildingsList.stream()
                .filter(building -> building.type.equals(Type.APARTMENT))
                .collect(Collectors.groupingBy(Building::getMetroStation));

        groupingByMetro.forEach((metroStation, apartments) -> {
            System.out.println("Метро: " + metroStation);
            apartments.forEach(apartment -> System.out.println(apartment.getName()
                    + ", цена: " + apartment.getPrice()
                    + ", рейтинг: " + apartment.getRating()));
            System.out.println();
        });
    }

    static void bestByRating() {
        Main.buildingsList.stream()
                .max(Comparator.comparingDouble(Building::getRating))
                .ifPresent(System.out::println);
    }


}
