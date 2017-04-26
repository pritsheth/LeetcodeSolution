/**
 * Created by Jerry on 02-04-2017.
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] > target)
                high--;

            else
                low++;
        }
        return null;
    }

    public int findContentChildren(int[] g, int[] s) {

        int child = 0;


        for (int i = 0; i < s.length; i++) {

            int size = s[i];
            int j = 0;

            while (size > 0 && j < g.length) {
                if (g[j] != 0) {
                    g[j]--;
                    size--;
                }
                j++;
            }


        }

        for (int i : g) {
            if (i == 0) child++;
        }

        return child;

    }

}
