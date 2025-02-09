package dsa.A_basicMath;

public class ReserveNumber {
    public static void main(String[] args) {
        int number = 1534236469;
        number = reverse_number(number);
        System.out.println(number);
//        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
    }

    private static int reverse_number(int number) {
        long num = 0;
        boolean negative_flag = false;
        if(number < 0)
            negative_flag = true;
        number = Math.abs(number);
        long num1 = Long.parseLong(String.valueOf(number));

        while(num1 > 0){
            long digit = num1 % 10;
            num = ( num * 10 ) + digit;
            num1 = num1 / 10;
        }
        num = negative_flag ? (-1) * num : num;
        if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
            return Integer.parseInt(String.valueOf(num));
        else
            return 0;
    }

    public int reverse(int x) {
        long rev = 0;
        while(x != 0)
        {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev >Integer.MAX_VALUE)
            return 0;
        return (int)rev;
    }
}
