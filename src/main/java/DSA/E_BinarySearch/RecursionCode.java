package DSA.E_BinarySearch;

public class RecursionCode {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        System.out.println(binarySearch(arr, 0, 7, 9));
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (target == arr[mid])
            return mid;
        else if (target > arr[mid])
            return binarySearch(arr, mid + 1, high, target);
        else
            return binarySearch(arr, low, mid - 1, target);
    }
}