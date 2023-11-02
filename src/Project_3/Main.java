package Project_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*Добавить квартиру в список для аренды.
*Удалить квартиру из списка для аренды.
*Отсортировать квартиры по цене (по возрастанию) и вывести.
*Отсортировать квартиры по цене (по убыванию) и вывести.
*Сгруппировать квартиры по станции метро и вывести.
*Выбрать лучшую квартиру по оценке и вывести.
*Вывести изначальный список квартир для аренды.

Такой же функционал должен быть для типа «коммерческое помещение»
Общий функционал:

*Удалить всё из списков.
*Вывести сгруппированные списки. (Квартиры – список, Коммерческие
помещение - список).

 */
public class Main {

    static final List<Building> buildingsList = new ArrayList<>();
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        System.out.println("Добро пожаловать!\n");
        printMainMenu();
        SCANNER.close();
    }

    private static void printMainMenu() {
        System.out.println("1. Продолжить работу только с квартирами.\n" +
                "2. Продолжить работу только с коммерческими помещениями.\n" +
                "3. Удалить все квартиры  и коммерческие помещения из списка.\n" +
                "4. Вывести все доступные помещения.\n" +
                "5. Выйти.");
        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                printApartmentMenu();
                break;
            case 2:
                printCommercialMenu();
                break;
            case 3:
                BuildingsService.clearList();
                System.out.println("Готово!");
                printMainMenu();
                break;
            case 4:
                BuildingsService.printAll();
                System.out.println();
                printMainMenu();
                break;
            case 5:
                break;
            default:
                System.out.println("Некорректный ввод");
                printMainMenu();
        }
    }

    private static void printApartmentMenu() {
        System.out.println("1. Добавить квартиру в список для аренды.\n" +
                "2. Удалить квартиру из списка для аренды.\n" +
                "3. Отсортировать квартиры по цене (по возрастанию).\n" +
                "4. Отсортировать квартиры по цене (по убыванию).\n" +
                "5. Сгруппировать квартиры по станции метро.\n" +
                "6. Выбрать лучшую квартиру по оценке.\n" +
                "7. Вывести список квартир для аренды.\n" +
                "8. Вернуться назад."
        );
        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                ApartmentService.addApartment();
                printApartmentMenu();
                break;
            case 2:
                System.out.println("Введите название:");
                String name = SCANNER.nextLine();
                if ("".equals(name)) {
                    name = SCANNER.nextLine();
                }
                ApartmentService.removeApartment(name);
                System.out.println("Готово!");
                printApartmentMenu();
                break;
            case 3:
                ApartmentService.sortByPrice();
                System.out.println();
                printApartmentMenu();
                break;
            case 4:
                ApartmentService.reverseSortByPrice();
                System.out.println();
                printApartmentMenu();
                break;
            case 5:
                ApartmentService.groupByMetroStation();
                printApartmentMenu();
                break;
            case 6:
                ApartmentService.bestByRating();
                System.out.println();
                printApartmentMenu();
                break;
            case 7:
                ApartmentService.print();
                System.out.println();
                printApartmentMenu();
                break;
            case 8:
                printMainMenu();
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }

    private static void printCommercialMenu() {
        System.out.println("1. Добавить помещение в список для аренды.\n" +
                "2. Удалить помещение из списка для аренды.\n" +
                "3. Отсортировать помещения по цене (по возрастанию).\n" +
                "4. Отсортировать помещения по цене (по убыванию).\n" +
                "5. Сгруппировать помещения по станции метро.\n" +
                "6. Выбрать лучшее помещение по оценке.\n" +
                "7. Вывести изначальный список помещений для аренды.\n"
        );
    }

    private static void init() {
        buildingsList.add(new Apartment("Sunflower", "Luzhniki", "Luzhniki 10", 150.50, 100_000, 4.5, 5));
        buildingsList.add(new Apartment("Spektr", "Luzhniki", "Usacheva 29", 37, 65_000, 2.0, 1));
        buildingsList.add(new Apartment("Old fashion", "Red Square", "Nikolskaya 5", 38, 110_000, 4.0, 1));
        buildingsList.add(new CommercialPremises("Stars", "Polyanka", "Bolshaya Polyanka 29", 55, 90_000, 3.2));
        buildingsList.add(new CommercialPremises("BobrDobr", "Dubrovka", "1 Dubrovskaya str. 25", 100, 200_000, 5.0));
    }
}
