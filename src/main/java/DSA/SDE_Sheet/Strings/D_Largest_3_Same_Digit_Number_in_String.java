package DSA.SDE_Sheet.Strings;

public class D_Largest_3_Same_Digit_Number_in_String {
    public static void main(String[] args) {
        System.out.println(Largest3SameDigitNumber("2300019"));
    }

    private static String Largest3SameDigitNumber(String str){
        char[] chArray = str.toCharArray();
        int counter = 0;
        String max = "";
        for(int i=0; i<=chArray.length-2; i++){
            if(chArray[i] == chArray[i+1]){
                counter ++;
            } else {
                counter = 0;
            }
            if(counter == 2) {
                System.out.println(str.substring(i - 1, i + 2));
                if (Integer.parseInt(str.substring(i - 1, i + 2)) > Integer.parseInt(max.equals("") ? "0" : max)) {
                    max = str.substring(i - 1, i + 2);

                }
                counter = 0;
            }
        }
        return max;
    }
}
