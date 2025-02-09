package dsa.C_Arrays.Easy;

public class SecondLargestInAnArray {
 public static void main(String[] args) {
  int arr[] = {13, 46, 24, 52, 20, 9};

  int largest = arr[0];
  int slargest = Integer.MIN_VALUE;

  for(int i =1; i<arr.length ; i++){
   if(arr[i] > largest){
    slargest = largest;
    largest = arr[i];
   } else if(arr[i] < largest && arr[i] > slargest){
    slargest = arr[i];
   }
  }

  System.out.println(slargest);
 }
 }
