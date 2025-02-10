package DSA.C_Arrays.Easy;

public class RotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateArrayByOnePlace(arr);
        for(int a: arr)
            System.out.print(a + " ");
    }

    private static void rotateArrayByOnePlace(int[] arr){
        int tmp = arr[0];
        for(int i=0; i< arr.length-1; i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = tmp;
    }
}