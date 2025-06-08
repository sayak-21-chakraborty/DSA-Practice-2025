package DSA;

import java.util.SortedSet;
import java.util.TreeSet;

public class RoughWork {
    public static void main(String[] args) {
//        System.out.println(5 % 5);

//        SortedSet<Integer> ss = new TreeSet<>();
//        ss.add(10);
//        ss.add(5);
//        ss.add(1);
//
//        System.out.println(ss);

        long MOD = 1_000_000_007;

        int x = (int)(Math.pow(5,25) * Math.pow(4,25));

        System.out.println(x %MOD);
    }
}
