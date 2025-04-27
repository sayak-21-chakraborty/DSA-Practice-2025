package DSA.SDE_Sheet.Strings;

public class B_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String str = " a good   example ";

        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str){
        String[] strArr = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=strArr.length-1; i>0; i--){
            sb.append(strArr[i]).append(" ");
        }
        sb.append(strArr[0]);
        return sb.toString();
    }
}
