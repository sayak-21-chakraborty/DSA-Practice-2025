package DSA.C_Arrays.Easy;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr, 3, arr.length-1);

        for(int a: arr)
            System.out.print(a + " ");
    }

    private static void reverseArray(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
