package DSA.C_Arrays.Easy;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] arr = {8, 6, 9};

//        moveZerosToArrayEnd(arr);
        moveZerosToArrayEndBetter(arr);

        for(int a: arr)
            System.out.print(a + " ");
    }

    private static void moveZerosToArrayEnd(int[] arr){
        int j = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1)
            return;
        for(int i=j+1; i<arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    private static void moveZerosToArrayEndBetter(int[] arr){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index += 1;
            }
        }
    }
}
