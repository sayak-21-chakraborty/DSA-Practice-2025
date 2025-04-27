package DSA.E_BinarySearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 8, 8, 11, 11, 11, 12};
        System.out.println(upperBound(arr, 12));
    }

    private static int upperBound(int[] arr, int target){
        int ans = arr.length;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] > target){
                ans = mid;
                high = mid -1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}
