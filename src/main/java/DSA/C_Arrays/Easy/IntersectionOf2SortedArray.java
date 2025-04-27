package DSA.C_Arrays.Easy;

import java.util.ArrayList;

public class IntersectionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7};

        ArrayList<Integer> intersectionList;
        intersectionList = intersectionOf2SortedArray(arr1, arr2);
        for(Integer i: intersectionList)
            System.out.print(i + " ");
    }

    private static ArrayList<Integer> intersectionOf2SortedArray(int[] arr1, int[] arr2){
        int n1 = arr1.length, n2 = arr2.length;
        int i = 0, j = 0;

        ArrayList<Integer> intersectionList = new ArrayList<>();

        while(i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                if(intersectionList.size() == 0 || intersectionList.get(intersectionList.size()-1) != arr1[i]){
                    intersectionList.add(arr1[i]);
                }
            }
            i++; j++;
        }
        return intersectionList;
    }
}
