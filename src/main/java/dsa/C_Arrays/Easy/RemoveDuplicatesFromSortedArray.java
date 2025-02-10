package dsa.C_Arrays.Easy;

import java.sql.SQLOutput;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr ={1, 1, 2, 2, 2, 3, 3};
        System.out.println(removeDuplictaesFromArray(arr));
        for(int a: arr){
            System.out.print(a + " ");
        }
    }

    public static int removeDuplictaesFromArray(int[] arr){
        int pointer = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[pointer]){
                pointer += 1;
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
            }
        }
        return pointer+1;
    }
}
