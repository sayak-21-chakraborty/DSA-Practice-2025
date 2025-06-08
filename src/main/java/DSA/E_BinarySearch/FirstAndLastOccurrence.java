package DSA.E_BinarySearch;

/*
    Plain Simple Binary search code to find the
    first and last occurrence of a given number
    in a sorted array
 */
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 8, 8, 8, 8, 8, 11, 13};
        System.out.println(findFirst(arr, 4));
        System.out.println(findLast(arr, 4));
    }
    private static int findFirst(int[] arr, int target){
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            } else if(target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    private static int findLast(int[] arr, int target){
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] == target){
                ans = mid;
                low = mid + 1;
            } else if(target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }
}
