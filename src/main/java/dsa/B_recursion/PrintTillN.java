package dsa.B_recursion;

public class PrintTillN {
    private static int count = 0;
    public static void main(String[] args) {
        int n = 10;
        print_number(n);
    }

    private static void print_number(int n) {
        if(count == n)
            return;
        System.out.println(count);
        count ++;
        print_number(n);
    }

}
