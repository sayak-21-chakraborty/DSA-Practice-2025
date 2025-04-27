package DSA.C_Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        ArrayList<Integer> union = new ArrayList<>();
        union = unionOf2SortedArray(arr1, arr2);

        for(Integer i: union){
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> unionOf2SortedArray(int[] arr1, int[] arr2){
        ArrayList<Integer> unionList = new ArrayList<>();
        
        int n1 = arr1.length, n2 = arr2.length;
        int i = 0, j = 0;
        
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(unionList.size() == 0 || unionList.get(unionList.size()-1) != arr1[i]){
                    unionList.add(arr1[i]);
                }
                i++;
            } else if(arr1[i] >= arr2[j]){
                if(unionList.size() == 0 || unionList.get(unionList.size()-1) != arr2[j]){
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(unionList.size() == 0 || unionList.get(unionList.size()-1) != arr1[i]){
                unionList.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(unionList.size() == 0 || unionList.get(unionList.size()-1) != arr2[j]){
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }
}
