package Ex_10_Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            try {
                if (isStringCorrect(s)) {
                    System.out.println("Строка введена правильно! Молодец!");
                    break;
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static boolean isStringCorrect(String s) throws MyException {
        int digit;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit = Character.getNumericValue(ch);
                throw new MyException("Строка содержит цифру " + digit);
            }
        }

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length - 2; i++) {
            if (charArray[i] == charArray[i + 1] && charArray[i + 2] == charArray[i + 1]) {
                throw new MyException("Эта буква повторяется 3 раза подряд " + charArray[i]);
            }
        }
        return true;
    }
}
