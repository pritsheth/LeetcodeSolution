import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prit Sheth on 11-02-2017.
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


    public int[] nextGreaterElement(int[] findNums, int[] nums) {


        return null;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (answer < result) answer = result;
                result = 0;
            } else
                result++;
        }

        if (answer < result) answer = result;
        return answer;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                visitArray(nums, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0)
                result.add(i + 1);
        }

        return result;

    }

    public void visitArray(int[] nums, int x) {
        if (nums[x - 1] == 0)
            return;
        int val = nums[x - 1];
        nums[x - 1] = 0;
        visitArray(nums, val);
    }

    public String[] findRelativeRanks(int[] nums) {

        Arrays.sort(nums);
return null;
    }

    public char findTheDifference(String s, String t) {

        char[] str2 = t.toCharArray();

        for (char c : str2) {
            if(s.indexOf(c)== -1)return c;
            s = s.replace(c,' ');
        }
        return ' ';
    }


}

