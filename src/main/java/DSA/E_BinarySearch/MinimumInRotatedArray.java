package DSA.E_BinarySearch;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(minimumInSortedRotatedArray(arr));
    }

    private static int minimumInSortedRotatedArray(int[] arr){
        int min = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[low] <= arr[mid]){
                min = Math.min(arr[low], min);
                low = mid + 1;
            }
            if(arr[mid] <= arr[high]){
                min = Math.min(arr[mid], min);
                high = mid - 1;
            }
        }
        return min;
    }
}
