import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        int[][] array = new int[4][3];
        Scanner scanner = new Scanner(System.in);

        int i;
        int j;
        for(i = 0; i < array.length; ++i) {
            for(j = 0; j < array[i].length; ++j) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Наш двумерный массив: ");

        for(i = 0; i < array.length; ++i) {
            for(j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        printNumberAndSumOfLine(array);
        printNumberAndSumOfColumn(array);
        arithmeticInteger(array);
        reverseToOneDimensional(array);
        changeEvenAndOdd(array);
    }

    public static void printNumberAndSumOfLine(int[][] array) {
        int sum = 0;

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                sum += array[i][j];
            }

            System.out.println("Line " + i + ": " + sum);
            sum = 0;
        }

    }

    public static void printNumberAndSumOfColumn(int[][] array) {
        int sum = 0;

        for(int i = 0; i < array[0].length; ++i) {
            for(int j = 0; j < array.length; ++j) {
                sum += array[j][i];
            }

            System.out.println("Column " + i + ": " + sum);
            sum = 0;
        }

    }

    public static void changeEvenAndOdd(int[][] array) {
        int i;
        int j;
        for(i = 0; i < array.length; ++i) {
            for(j = 0; j < array[i].length; ++j) {
                if (array[i][j] % 2 == 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }

        System.out.println("Изменённый массив: ");

        for(i = 0; i < array.length; ++i) {
            for(j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void arithmeticInteger(int[][] array) {
        System.out.println("Средние арифметические:");

        for(int i = 0; i < array.length; ++i) {
            int sum = 0;

            int result;
            for(result = 0; result < array[i].length; ++result) {
                sum += array[i][result];
            }

            result = sum / array[i].length;
            System.out.println("line " + i + ": " + result);
        }

    }

    public static void reverseToOneDimensional(int[][] array) {
        int sizeOfResultArray = array.length * array[0].length;
        int[] result = new int[sizeOfResultArray];
        int count = 0;

        int j;
        for(int i = array.length - 1; i >= 0; --i) {
            for(j = array[i].length - 1; j >= 0; --j) {
                result[count] = array[i][j];
                ++count;
            }
        }

        System.out.println("Перевернутый одномерный массив:");
        int[] var8 = result;
        j = result.length;

        for(int var6 = 0; var6 < j; ++var6) {
            int element = var8[var6];
            System.out.print("" + element + " ");
        }

        System.out.println();
    }
}

