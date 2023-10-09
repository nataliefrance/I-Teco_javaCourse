import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = dataEntry(scanner);
        String name = array[0];
        int number = Integer.parseInt(array[1]);
        int sum = sumOfDigits(number);
        printHello(name, sum);
        scanner.close();
    }

    public static String[] dataEntry(Scanner scanner) {
        while(true) {
            System.out.println("Введите имя и число:");
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            if (array.length == 2) {
                if (array[1].length() >= 2 && array[1].length() <= 5) {
                    return array;
                }

                System.out.println("Число должно быть от 10 до 99999 включительно.");
            }
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        if (number == 0) {
            return sum;
        } else {
            sum = number % 10 + sumOfDigits(number / 10);
            return sum;
        }
    }

    public static void printHello(String name, int sum) {
        String sumOfDigits;
        switch (sum) {
            case 1:
                sumOfDigits = "один";
                break;
            case 2:
                sumOfDigits = "два";
                break;
            case 3:
                sumOfDigits = "три";
                break;
            case 4:
                sumOfDigits = "четыре";
                break;
            case 5:
                sumOfDigits = "пять";
                break;
            case 6:
                sumOfDigits = "шесть";
                break;
            case 7:
                sumOfDigits = "семь";
                break;
            case 8:
                sumOfDigits = "восемь";
                break;
            case 9:
                sumOfDigits = "девять";
                break;
            case 10:
                sumOfDigits = "десять";
                break;
            default:
                sumOfDigits = "больше десяти";
        }

        System.out.println("Здравствуй, " + name + "! Сумма цифр в числе = " + sumOfDigits);
    }
}
