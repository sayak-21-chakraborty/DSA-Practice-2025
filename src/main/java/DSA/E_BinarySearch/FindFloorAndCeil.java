package DSA.E_BinarySearch;

public class FindFloorAndCeil {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};

        for(int i: getFloorAndCeil(arr, 5))
            System.out.println(i);
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        return new int[]{nums[findFloor(nums, x)], nums[findCeil(nums, x)]};
    }

    private static int findFloor(int[] arr, int x){
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] <= x){
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    private static int findCeil(int[] arr, int x){
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = ( low + high ) / 2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}
