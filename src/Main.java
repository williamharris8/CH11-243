import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = Sorts.initValues(50);
        System.out.println("Before:");
        Sorts.printValues(values);

        Sorts.selectionSort(values);

        System.out.println("Sorted? " + Sorts.isSorted(values));
        System.out.println("After:");
        Sorts.printValues(values);

        values = Sorts.initValues(50);
        System.out.println("Before Merge Sort:");
        Sorts.printValues(values);

        Sorts.mergeSort(values);

        System.out.println("Merge Sort - sorted? " + Sorts.isSorted(values));
        Sorts.printValues(values);

        int[] sizes = {10000, 1000000};
        for (int n : sizes) {
            int[] original = Sorts.initValues(n);

            int[] copy1 = Arrays.copyOf(original, n);
            Sorts.comparisons = 0;
            long start = System.currentTimeMillis();
            Sorts.selectionSort(copy1);
            long time = System.currentTimeMillis() - start;
            System.out.println("N = " + n);
            System.out.println("  Selection Sort: " + time + " ms, "
                    + Sorts.comparisons + " comparisons, sorted? " + Sorts.isSorted(copy1));

            int[] copy2 = Arrays.copyOf(original, n);
            Sorts.comparisons = 0;
            start = System.currentTimeMillis();
            Sorts.mergeSort(copy2);
            time = System.currentTimeMillis() - start;
            System.out.println("  Merge Sort:     " + time + " ms, "
                    + Sorts.comparisons + " comparisons, sorted? " + Sorts.isSorted(copy2));
        }

        int[] alreadySorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverseSorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] allSame = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7};

        testEdgeCase("Already sorted", alreadySorted);
        testEdgeCase("Reverse sorted", reverseSorted);
        testEdgeCase("All identical", allSame);
    }

    public static void testEdgeCase(String name, int[] data) {
        int[] a = Arrays.copyOf(data, data.length);
        Sorts.comparisons = 0;
        Sorts.selectionSort(a);
        System.out.println(name + " - Selection Sort: sorted? " + Sorts.isSorted(a)
                + ", " + Sorts.comparisons + " comparisons");

        int[] b = Arrays.copyOf(data, data.length);
        Sorts.comparisons = 0;
        Sorts.mergeSort(b);
        System.out.println(name + " - Merge Sort:     sorted? " + Sorts.isSorted(b)
                + ", " + Sorts.comparisons + " comparisons");
    }
}
