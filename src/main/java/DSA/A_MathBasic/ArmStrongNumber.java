package DSA.A_basicMath;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(check_armstrong(num));
    }

    private static boolean check_armstrong(int num) {
        int no_of_digits = (int) Math.log10(num) + 1;
        int x = num;
        int sum = 0;

        while(num != 0){
            sum += Math.pow(num % 10, no_of_digits);
            num = num / 10;
        }
        return x == sum;
    }
}
