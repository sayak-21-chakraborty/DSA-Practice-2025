package dsa.C_Arrays.Easy;

public class IsArraySorted {
    public static void main(String[] args) {
//        int arr[] = {13, 46, 24, 52, 20, 9};
        int arr[] = {1, 2, 3, 4, 7, 9};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
