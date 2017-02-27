import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prit Sheth on 12-02-2017.
 */
public class NumberRow {


    public static String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> answer = new ArrayList<String>();

        for (String word : words) {
            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;

            int length = word.length();
            for (int i = 0; i < length; i++) {
                if (row1.indexOf(word.toLowerCase().charAt(i)) != -1)
                    sum1++;

                if (row2.indexOf(word.toLowerCase().charAt(i)) != -1)
                    sum2++;

                if (row3.indexOf(word.toLowerCase().charAt(i)) != -1)
                    sum3++;
            }

            if (sum1 == length || sum2 == length || sum3 == length)
                answer.add(word);

        }


        return answer.toArray(new String[0]);
    }

}
