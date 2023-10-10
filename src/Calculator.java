import java.util.Scanner;

//Список операций - (сложение (+), вычитание (-), умножение (*), деление (/), факториал
//(!), возведение в степень (^) и сравнение двух чисел (?))

//Пример строки на вход: “100 + 13”, “27 / 3”, “7 !”, “4 ^ 3”, “35 ? 24”
public class Calculator {
    static int previousAnswer;
    static boolean hasPreviousAnswer;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в Калькулятор! Выберите действие:");
        printMenu(scanner, hasPreviousAnswer);
        scanner.close();
    }

    public static void printMenu (Scanner scanner, boolean hasPreviousAnswer){
        if (hasPreviousAnswer) {
            System.out.println("1. Ввести пример\n" + "2. Продолжить работать с ответом предыдущего примера\n" + "3. Выход\n");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    newExample(scanner);
                    break;
                case "2":
                    continueWork(scanner);
                    break;
                case "3":
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    printMenu(scanner, true);
            }
        } else {
            System.out.println("1. Ввести пример\n" + "2. Выход\n");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    newExample(scanner);
                    break;
                case "2":
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    printMenu(scanner, false);
            }
        }
    }

    public static void newExample(Scanner scanner) {
        System.out.println("Введите пример через пробел");
        String example = scanner.nextLine();
        String[] array;
        if (example!= null && !example.isEmpty()) {
             array = example.split(" ");
        } else return;

        int firstNumber;
        int secondNumber = 0;

        try {
            firstNumber = Integer.parseInt(array[0]);
            if (array.length > 2){
                secondNumber = Integer.parseInt(array[2]);
            }

            switch (array[1]) {
                case "+":
                    addition(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "-":
                    subtraction(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "*":
                    multiplication(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "/":
                    division(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "!":
                    factorial(firstNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "^":
                    exponentiation(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                case "?":
                    comparison(firstNumber, secondNumber);
                    printMenu(scanner, hasPreviousAnswer);
                    break;
                default:
                    System.out.println("Введен некорректный пример");
                    printMenu(scanner, hasPreviousAnswer);
            }
        } catch (Exception exception) {
            System.out.println("Введен некорректный пример");
            printMenu(scanner, hasPreviousAnswer);
        }
    }

    public static void continueWork(Scanner scanner) {
        System.out.println("1. Сложение\n + 2. Вычитание\n + 3. Умножение\n + 4. Деление\n + 5. Факториал\n + " +
                "6. Возведение в степень\n + 7. Сравнение\n + 0. Назад\n");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                System.out.println("Введите новое число");
                addition(scanner.nextInt(), previousAnswer);
                break;
            case "2":
                System.out.println("Введите новое число");
                subtraction(scanner.nextInt(), previousAnswer);
                break;
            case "3":
                System.out.println("Введите новое число");
                multiplication(scanner.nextInt(), previousAnswer);
                break;
            case "4":
                System.out.println("Введите новое число");
                division(scanner.nextInt(), previousAnswer);
                break;
            case "5":
                factorial(previousAnswer);
                break;
            case "6":
                System.out.println("Введите степень");
                exponentiation(previousAnswer, scanner.nextInt());
                break;
            case "7":
                System.out.println("Введите новое число");
                comparison(scanner.nextInt(), previousAnswer);
                break;
            case "0":
                System.out.println("Введите новое число");
                printMenu(scanner, hasPreviousAnswer);
                break;
            default:
                System.out.println("Некорректный ввод");
                printMenu(scanner, hasPreviousAnswer);
        }
    }

    public static void addition(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber + secondNumber;
        hasPreviousAnswer = true;
        System.out.println("\"+\": " + firstNumber + " + " + secondNumber + " = " + previousAnswer + "\n");
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber - secondNumber;
        hasPreviousAnswer = true;
        System.out.println("\"-\": " + firstNumber + " - " + secondNumber + " = " + previousAnswer + "\n");
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber * secondNumber;
        hasPreviousAnswer = true;
        System.out.println("\"*\": " + firstNumber + " * " + secondNumber + " = " + previousAnswer + "\n");
    }

    public static void division(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber / secondNumber;
        hasPreviousAnswer = true;
        System.out.println();
        System.out.println("\"/\": " + firstNumber + " / " + secondNumber + " = " + previousAnswer + "\n");
    }

    public static void factorial(int number) {
        previousAnswer = 1;

        System.out.print("\"!\": " + number + "! = ");
        while (number != 1) {
            previousAnswer *= number;
            System.out.print(number + " * ");
            number--;
        }
        hasPreviousAnswer = true;
        System.out.print("1 = " + previousAnswer + "\n");
    }

    public static void exponentiation(int firstNumber, int secondNumber){
        previousAnswer = (int) Math.pow(firstNumber, secondNumber);
        hasPreviousAnswer = true;
        System.out.println("\"^\": " + firstNumber + " ^ " + secondNumber + " = " + previousAnswer + "\n");
    }

    public static void comparison(int firstNumber, int secondNumber){
        previousAnswer = Math.max(firstNumber, secondNumber);
        hasPreviousAnswer = true;
        System.out.println("\"?\": " + firstNumber + " ? " + secondNumber + " = " + previousAnswer + "\n");
    }
}
