package DSA.SDE_Sheet.Strings;

public class C_Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String str){
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) % 2 != 0){
                return str.substring(0, i+1);
            }
        }
        return "";
    }
}
