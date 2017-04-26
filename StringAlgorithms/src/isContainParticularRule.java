/**
 * Created by Jerry on 16-04-2017.
 */
public class isContainParticularRule {
    public boolean checkRecord(String s) {

        if (null == s || s.isEmpty())
            return false;
        char[] chars = s.toCharArray();
        int counter =0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
             if(counter == 1)
                return false;
                counter++;
            }
            if (i + 1 < chars.length && chars[i] == 'L' && chars[i + 1] == 'L')
                return false;
        }
        return true;
    }
}
