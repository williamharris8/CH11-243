public class Main {
    public static void main(String[] args) {
        int[] values = Sorts.initValues(50);
        System.out.println("Before:");
        Sorts.printValues(values);

        Sorts.selectionSort(values);

        System.out.println("Sorted? " + Sorts.isSorted(values));
        System.out.println("After:");
        Sorts.printValues(values);

        // Merge Sort
        values = Sorts.initValues(50);
        System.out.println("Before Merge Sort:");
        Sorts.printValues(values);

        Sorts.mergeSort(values);

        System.out.println("Merge Sort - sorted? " + Sorts.isSorted(values));
        Sorts.printValues(values);
    }
}
