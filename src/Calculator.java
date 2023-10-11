import java.util.Scanner;

public class Calculator {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static Integer previousAnswer;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Калькулятор! Выберите действие:");
        printMenu();
        SCANNER.close();
    }
    public static void printMenu() {
        if (previousAnswer != null) {
            System.out.println("1. Ввести пример\n" +
                    "2. Продолжить работать с ответом предыдущего примера\n" +
                    "3. Выход");

            int input = SCANNER.nextInt();
            switch (input) {
                case 1:
                    newExample();
                    break;
                case 2:
                    continueWork();
                    break;
                case 3:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    printMenu();
            }
        } else {
            System.out.println("1. Ввести пример\n" + "2. Выход");
            int input = SCANNER.nextInt();
            switch (input) {
                case 1:
                    newExample();
                    break;
                case 2:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    printMenu();
            }
        }
    }

    public static void newExample() {
        System.out.println("Введите пример через пробел");
        String example = SCANNER.nextLine();
        if ("".equals(example)) {
            example = SCANNER.nextLine();
        }
        String[] array;
        if (example != null) {
            array = example.split(" ");
        } else return;

        int firstNumber;
        int secondNumber = 0;

        try {
            firstNumber = Integer.parseInt(array[0]);
            if (array.length > 2) {
                secondNumber = Integer.parseInt(array[2]);
            }

            switch (array[1]) {
                case "+":
                    addition(firstNumber, secondNumber);
                    printMenu();
                    break;
                case "-":
                    subtraction(firstNumber, secondNumber);
                    printMenu();
                    break;
                case "*":
                    multiplication(firstNumber, secondNumber);
                    printMenu();
                    break;
                case "/":
                    division(firstNumber, secondNumber);
                    printMenu();
                    break;
                case "!":
                    factorial(firstNumber);
                    printMenu();
                    break;
                case "^":
                    exponentiation(firstNumber, secondNumber);
                    printMenu();
                    break;
                case "?":
                    comparison(firstNumber, secondNumber);
                    printMenu();
                    break;
                default:
                    System.out.println("Введен некорректный пример");
                    printMenu();
            }
        } catch (Exception exception) {
            System.out.println("Введен некорректный пример");
            printMenu();
        }
    }

    public static void continueWork() {
        System.out.println("1. Сложение\n"
                + "2. Вычитание\n"
                + "3. Умножение\n"
                + "4. Деление\n"
                + "5. Факториал\n"
                + "6. Возведение в степень\n"
                + "7. Сравнение\n"
                + "0. Назад");

        int input = SCANNER.nextInt();
        switch (input) {
            case 1:
                System.out.println("Введите новое число");
                addition(SCANNER.nextInt(), previousAnswer);
                printMenu();
                break;
            case 2:
                System.out.println("Введите новое число");
                subtraction(SCANNER.nextInt(), previousAnswer);
                printMenu();
                break;
            case 3:
                System.out.println("Введите новое число");
                multiplication(SCANNER.nextInt(), previousAnswer);
                printMenu();
                break;
            case 4:
                System.out.println("Введите новое число");
                division(SCANNER.nextInt(), previousAnswer);
                printMenu();
                break;
            case 5:
                factorial(previousAnswer);
                printMenu();
                break;
            case 6:
                System.out.println("Введите степень");
                exponentiation(previousAnswer, SCANNER.nextInt());
                printMenu();
                break;
            case 7:
                System.out.println("Введите новое число");
                comparison(SCANNER.nextInt(), previousAnswer);
                printMenu();
                break;
            case 0:
                System.out.println("Введите новое число");
                printMenu();
                break;
            default:
                System.out.println("Некорректный ввод");
                printMenu();
        }
    }

    public static void addition(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber + secondNumber;
        System.out.println("\"+\": " + firstNumber + " + " + secondNumber + " = " + previousAnswer);
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber - secondNumber;
        System.out.println("\"-\": " + firstNumber + " - " + secondNumber + " = " + previousAnswer);
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber * secondNumber;
        System.out.println("\"*\": " + firstNumber + " * " + secondNumber + " = " + previousAnswer);
    }

    public static void division(int firstNumber, int secondNumber) {
        previousAnswer = firstNumber / secondNumber;
        System.out.println();
        System.out.println("\"/\": " + firstNumber + " / " + secondNumber + " = " + previousAnswer);
    }

    public static void factorial(int number) {
        previousAnswer = 1;

        System.out.print("\"!\": " + number + "! = ");
        while (number != 1) {
            previousAnswer *= number;
            System.out.print(number + " * ");
            number--;
        }
        System.out.println("1 = " + previousAnswer);
    }

    public static void exponentiation(int firstNumber, int secondNumber) {
        previousAnswer = (int) Math.pow(firstNumber, secondNumber);
        System.out.println("\"^\": " + firstNumber + " ^ " + secondNumber + " = " + previousAnswer);
    }

    public static void comparison(int firstNumber, int secondNumber) {
        previousAnswer = Math.max(firstNumber, secondNumber);
        System.out.println("\"?\": " + firstNumber + " ? " + secondNumber + " = " + previousAnswer);
    }
}
