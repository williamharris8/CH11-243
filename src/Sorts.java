import java.util.Random;

public class Sorts {
    public static int[] initValues(int size) {
        Random rand = new Random();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(1001); // 0 to 1000
        }
        return values;
    }

    public static boolean isSorted(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] values, int indexOne, int indexTwo) {
        int temp = values[indexOne];
        values[indexOne] = values[indexTwo];
        values[indexTwo] = temp;
    }

    public static void printValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%5d", values[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

