package DSA.A_basicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(check_prime(num));
    }

    private static boolean check_prime(int num) {
        int sqrt = (int) Math.sqrt(num);
        int cnt = 0;
        for(int i=1; i<= sqrt; i++){
            if(num % i == 0) {
                cnt += 1;

                if(i != num/i)
                    cnt += 1;
            }
        }
        return cnt == 2;
    }
}
