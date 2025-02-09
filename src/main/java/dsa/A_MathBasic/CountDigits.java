package dsa.A_basicMath;

public class CountDigits {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(count_digit(num));
        System.out.println(count_digit_log(num));
    }

    private static int count_digit_log(int num) {
        return (int) (Math.log10(num) + 1);

    }

    private static int count_digit(int num) {
        int count = 0;
        while(num > 0){
            count += 1;
            num = num/10;
        }
        return count;
    }
}
