public class Main {
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9, 1, 5, 6};
        System.out.println("Before MergeSort:");
        printArray(arr1);
        MergeSort.sort(arr1, 0, arr1.length - 1);
        System.out.println("After MergeSort:");
        printArray(arr1);

        int[] arr2 = {10, 7, 8, 9, 1, 5};
        System.out.println("\nBefore QuickSort:");
        printArray(arr2);
        QuickSort.sort(arr2, 0, arr2.length - 1);
        System.out.println("After QuickSort:");
        printArray(arr2);

        int[] arr3 = {7, 10, 4, 3, 20, 15};
        int k = 2;
        int kthSmallest = DeterministicSelect.select(arr3, k);
        System.out.println("\n" + k + "min element" + kthSmallest);

        ClosestPair.point[] points = {
                new ClosestPair.point(0, 0),
                new ClosestPair.point(3, 4),
                new ClosestPair.point(7, 1),
                new ClosestPair.point(2, 2)
        };
        double minDist = ClosestPair.closest(points);
        System.out.println("\nmin distance " + minDist);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}