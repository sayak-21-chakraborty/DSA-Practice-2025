package DSA.B_Recursions;

import java.util.ArrayList;
import java.util.List;

public class PrintSumOfAllSubsetsInAscOrder {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> subsetSums = new ArrayList<>();
        recursiveFunc(0, arr, subsetSums, 0);

        System.out.println(subsetSums);
    }

    private static void recursiveFunc(int index, int[] arr, ArrayList<Integer> subsetSums, int sum){
        // Base case to break out of recursion
        if(index == arr.length){
            subsetSums.add(sum);
            return;
        }
        // When I take the element to be considered in the subset
        recursiveFunc(index + 1, arr, subsetSums, sum + arr[index]);

        // When I don't take the element ( Do not consider the element in the subset )
        recursiveFunc(index + 1, arr, subsetSums, sum);
    }
}
