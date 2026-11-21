public class Main {
    public static void main(String[] args) {
        int[] values = Sorts.initValues(50);
        System.out.println("Before:");
        Sorts.printValues(values);

        Sorts.selectionSort(values);

        System.out.println("Sorted? " + Sorts.isSorted(values));
        System.out.println("After:");
        Sorts.printValues(values);
    }
}
