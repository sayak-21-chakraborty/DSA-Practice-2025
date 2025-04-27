package DSA.E_BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8 , 10, 10, 11};
        System.out.println(lowerBound(arr, 1));

    }

    private static int lowerBound(int[] arr, int x){
        int ans = arr.length;
        int low = 0, high = arr.length -1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
