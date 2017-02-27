import java.util.*;

/**
 * Created by Prit Sheth on 27-02-2017.
 */
public class InterSectionArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> result = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]))
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

    public int[] intersectWithDuplicate(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i], 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                result.add(nums2[i]);
            }

        }

        return toInt(result);
    }

    public int[] toInt(List<Integer> set) {
        int[] a = new int[set.size()];
        int i = 0;
        for (Integer val : set) a[i++] = val;
        return a;
    }

}
