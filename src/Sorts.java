import java.util.Random;

public class Sorts {
    public static long comparisons = 0;

    public static int[] initValues(int size) {
        Random rand = new Random();
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = rand.nextInt(1001);
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

    public static int minIndex(int[] values, int startIndex, int endIndex) {
        int indexOfMin = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            comparisons++;
            if (values[i] < values[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public static void selectionSort(int[] values) {
        int endIndex = values.length - 1;
        for (int current = 0; current < endIndex; current++) {
            swap(values, current, minIndex(values, current, endIndex));
        }
    }

    public static void mergeSort(int[] values) {
        int[] tempArray = new int[values.length];
        mergeSort(values, tempArray, 0, values.length - 1);
    }

    private static void mergeSort(int[] values, int[] tempArray, int first, int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(values, tempArray, first, middle);
            mergeSort(values, tempArray, middle + 1, last);
            merge(values, tempArray, first, middle, middle + 1, last);
        }
    }

    private static void merge(int[] values, int[] tempArray,
                              int leftFirst, int leftLast,
                              int rightFirst, int rightLast) {
        int index = leftFirst;
        int saveFirst = leftFirst;

        while (leftFirst <= leftLast && rightFirst <= rightLast) {
            comparisons++;
            if (values[leftFirst] <= values[rightFirst]) {
                tempArray[index] = values[leftFirst];
                leftFirst++;
            } else {
                tempArray[index] = values[rightFirst];
                rightFirst++;
            }
            index++;
        }
        while (leftFirst <= leftLast) {
            tempArray[index] = values[leftFirst];
            leftFirst++;
            index++;
        }
        while (rightFirst <= rightLast) {
            tempArray[index] = values[rightFirst];
            rightFirst++;
            index++;
        }
        for (int i = saveFirst; i <= rightLast; i++) {
            values[i] = tempArray[i];
        }
    }
}




