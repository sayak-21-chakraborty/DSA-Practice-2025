package DSA.B_Recursions;

public class GoodNumber {
    public static void main(String[] args) {
        long MOD = 1000000007;
        System.out.println(pow(5, 25, MOD));
        System.out.println(pow(4, 2, MOD));

        long ans = (pow(5, 25, MOD) * pow(4, 25, MOD)) % MOD;
        System.out.println(ans);

    }

    private static long pow(long x, long n, long MOD){
        long ans = 1;
        while(n>0){
            if(n % 2 == 0){
                x = ( x * x ) % MOD;
                n = n/2;
            } else {
                ans = ( ans * x ) % MOD;
                n = n - 1;
            }
        }
        return ans;
    }
}
