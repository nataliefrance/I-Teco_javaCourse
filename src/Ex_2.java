import java.util.Arrays;

public class Ex_2 {

    public static void main(String[] args) {
        int[] array = new int[]{3, 22, 1, 13, 4, 6, 16, 5};
        printEven(array);
        printTwoDigit(array);
        printMax(array);
        printSum(array);
        reverse(array);
    }

    public static void printEven(int[] array) {
        System.out.print("Чётные элементы массива: ");
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int element = var1[var3];
            if (element % 2 == 0) {
                System.out.print("" + element + " ");
            }
        }

        System.out.println();
    }

    public static void printTwoDigit(int[] array) {
        System.out.print("Двузначные элементы массива: ");
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int element = var1[var3];
            if (element >= 10 && element <= 99) {
                System.out.print("" + element + " ");
            }
        }

        System.out.println();
    }

    public static void printMax(int[] array) {
        int min = array[0];
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var2[var4];
            if (element > min) {
                min = element;
            }
        }

        System.out.println("Максимальный элемент массива: " + min);
    }

    public static void printSum(int[] array) {
        int sum = 0;
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var2[var4];
            sum += element;
        }

        System.out.println("Сумма всех эелементов массива: " + sum);
    }

    public static void reverse(int[] array) {
        int temp = array[0];

        for(int i = 0; i < array.length / 2; ++i) {
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            temp = array[i + 1];
        }

        System.out.println("Перевернутый массив: " + Arrays.toString(array));
    }
}

