package DSA.E_BinarySearch.BS_Answers;

public class FindNthRootOfANumber {
    public static void main(String[] args) {
        System.out.println(NthRootOfANumber(69, 4));
    }

    private static int NthRootOfANumber(int m, int n){
        int ans = -1;
        int low = 1, high = n;

        while(low <= high){
            int mid = ( low + high ) / 2;
            int midN = func(mid, m, n);

            if(midN == 1)
                return mid;
            else if(midN == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return ans;
    }

    private static int func(int mid, int m, int n){
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m)
                return 2;
        }
        if(ans == m)
            return 1;
        return 0;
    }
}


