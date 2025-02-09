package dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        bubble_sort(arr);

        for(int num: arr)
            System.out.print(num + " ");
    }

    private static void bubble_sort(int[] arr) {
        for(int i=0; i<= arr.length-2; i++){
            for(int j=0; j<= arr.length-2-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
