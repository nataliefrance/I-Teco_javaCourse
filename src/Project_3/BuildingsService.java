package Project_3;

public class BuildingsService {
    static void clearList() {
        Main.buildingsList.clear();
    }

    static void printAll() {
        System.out.println("Все доступные квартиры:");
        Main.buildingsList.stream()
                .filter(e -> e.type == Type.APARTMENT)
                .forEach(System.out::println);
        System.out.println("Все доступные коммерческие помещения:");
        Main.buildingsList.stream()
                .filter(e -> e.type == Type.COMMERCIAL)
                .forEach(System.out::println);
    }
}
