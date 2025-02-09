package dsa.C_Arrays.Easy;

public class LargestInAnArray {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};

        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }

        System.out.println(largest);
    }
}
