import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerry on 11-02-2017.
 */
public class ReverseText {

    public static void main(String[] args) {
      
    }


    public static String reverseString(String s) {

        String answer = "";

        if (s == null || s.isEmpty()) return "";

        for (int i = s.length() - 1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        return answer;
    }

    //Optimized version :
    public static String reverseStringEfficient(String s) {

        if (s == null || s.isEmpty()) return "";
        char[] result = s.toCharArray();

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            result[i] = (char) (result[i] ^ result[j]);
            result[j] = (char) (result[i] ^ result[j]);
            result[i] = (char) (result[i] ^ result[j]);
        }
        return new String(result);
    }


}

