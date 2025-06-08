package DSA.E_BinarySearch.BS_Answers;

public class FindSqrtOfANumber {
    public static void main(String[] args) {
        int n = 28;
        System.out.println(sqrtOfANumber(28));
    }

    private static int sqrtOfANumber(int n){
        int low = 1, high = n;
        int ans = 1;

        while (low <= high){
            int mid = ( low + high ) / 2;

            if((mid * mid) <= n){
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
}
