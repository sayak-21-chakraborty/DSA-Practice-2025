package DSA.SDE_Sheet.Strings;

import java.sql.SQLOutput;
import java.util.Arrays;
public class E_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","floeght"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        int i=0;
        while(true) {
            char fst = strs[0].charAt(i);
            char lst = strs[strs.length - 1].charAt(i);
            if (fst == lst) {
                i++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, i);
    }
}
