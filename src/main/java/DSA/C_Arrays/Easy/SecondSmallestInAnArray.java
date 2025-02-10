package DSA.C_Arrays.Easy;

public class SecondSmallestInAnArray {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9, 10};
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < smallest){
                ssmallest = smallest;
                smallest = arr[i];
            } else if(arr[i]>smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        System.out.println(ssmallest);
    }
}