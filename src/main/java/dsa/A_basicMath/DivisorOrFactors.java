package dsa.A_basicMath;

import java.util.ArrayList;

public class DivisorOrFactors {
    public static void main(String[] args) {
        int num = 12;
        for(int n :divisors(num))
            System.out.print(n + " ");;
    }

    private static ArrayList<Integer> divisors(int num) {
        int sqrt = (int) Math.sqrt(num);
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= sqrt; i++){
            if(num % i == 0) {
                divisors.add(i);

                if( i != num/i )
                    divisors.add(num/i);
            }
        }
        return divisors;
    }
}