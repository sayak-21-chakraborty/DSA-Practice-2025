package DSA.A_MathBasic;

public class Exponentiation {
    public static void main(String[] args) {

        System.out.println(powerBruteForce(2, 5));
        System.out.println(optimized(2, 21));
        System.out.println(optimizedDouble(2.00000, -2147483648));
    }

    private static int powerBruteForce(int x, int n){
        int ans = 1;
        for(int i = 1; i <= n; i++)
            ans = ans * x;
        return ans;
    }

    private static int optimized(int x, int n){
        int ans = 1;
        while(n > 0){
            if(n % 2 == 0){
                x = x * x;
                n = n / 2;
            } else {
                ans = ans * x;
                n = n -1;
            }
        }
        return ans;
    }

    private static double optimizedDouble(double x, int n){
            double ans = 1.0;
            long nn = n;

            if(n < 0){
                nn = n * (-1);
            }

            while(nn>0){
                if(nn % 2 == 0){
                    x = x * x;
                    nn = nn/2;
                } else {
                    ans = ans * x;
                    nn = nn - 1;
                }
            }

            if(n < 0)
                return (double)1.0/(double)ans;
            else
                return ans;

        }
    }

