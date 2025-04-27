package DSA.SDE_Sheet.Strings;

public class A_Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String str = "(()())(())(()(()))";

        int counter = 0;
        String ret = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                counter ++;
                if(counter > 1){
                    ret = ret + str.charAt(i);
                }
            }

            else if (str.charAt(i) == ')') {
                counter --;
                if(counter > 0){
                    ret = ret + str.charAt(i);
                }
            }
        }
        System.out.println(ret);
    }
}
