public class Main {
    public static void main(String[] args) {
        int[] values = Sorts.initValues(50);
        Sorts.printValues(values);
        System.out.println("Sorted? " + Sorts.isSorted(values));
    }
}
