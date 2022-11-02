import java.util.*;

public class ReverseString {

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();//Stringbuilder ka type different hota he tho usko string me convert krna hoga
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.err.println(result);
    }
}
