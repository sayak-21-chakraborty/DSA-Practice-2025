package DSA.Rough_BruteForce;

public class CocoEatingBanana {
    public static void main(String[] args) {
        int[] a = {7, 15, 6, 3};
        int h = 8;

        int max = a[0];
        for(int i = 1; i < a.length; i++){
            max = Math.max(max, a[i]);
        }


        for(double i = 1; i <= max; i++){
            int sum = 0;
            for(int j = 0; j < a.length; j++){
                int x = (int) Math.ceil(a[j]/i);
                sum = sum + x;
            }
            System.out.println(sum);
            if(sum == h){
                System.out.println(i);
                break;
            }

        }
    }
}
