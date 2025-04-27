package DSA.E_BinarySearch;

public class IterativeCode {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int[] arr = {5};
        System.out.println(binarySearch(arr, 1, 5));
    }

    private static int binarySearch(int[] arr, int n, int target){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid+1 ;
            else
                high = mid -1;
        }
        return -1;
    }
}
