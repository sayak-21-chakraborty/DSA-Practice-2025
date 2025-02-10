package DSA.C_Arrays.Easy;

public class RotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            newArr[(i+3) % arr.length] = arr[i];
        }

        for(int a: newArr)
            System.out.print(a + " ");
    }
}
