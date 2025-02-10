package DSA.C_Arrays.Easy;

public class IsArraySortedAndRotate {
    public static void main(String[] args) {
         int arr[] = {3, 4, 5, 1, 2};
//        int arr[] = {2, 1, 3, 4};
        System.out.println(isSortedAndRotate(arr));
    }

    public static boolean isSortedAndRotate(int[] arr){
        // at the most 1 inversion is allowed for the array to be sorted and rotated
        int inversionCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length]){
                inversionCount++;
            }
        }
        return inversionCount<=1;
    }
}
