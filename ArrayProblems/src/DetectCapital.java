import java.util.*;

/**
 * Created by Prit Sheth on 27-02-2017.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {


        char[] chars = word.toCharArray();
        int length = chars.length;

        if (length == 1) return true;
        boolean flag = isCapital(chars[0]);
        boolean flag1 = isCapital(chars[1]);
        if (!flag && flag1) return false;

        for (int i = 2; i < length; i++) {
            boolean flag2 = isCapital(chars[i]);
            if (flag1 != flag2) {
                return false;
            }
            flag1 = flag2;
        }
        return true;
    }

    private boolean isCapital(char aChar) {
        if (65 <= aChar && aChar < 90)
            return true;
        return false;
    }


    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]))
                result.add(nums2[i]);
        }

return toInt(result);
    }
    public int[] toInt(Set<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }



}
