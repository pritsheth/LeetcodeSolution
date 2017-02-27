/**
 * Created by Prit Sheth on 27-02-2017.
 */
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int length = findNums.length;
        int result[] = new int[length];
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            flag = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == findNums[i]) {
                    if (j == nums.length - 1) {
                        break;
                    }
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] < nums[k]) {
                            result[i] = nums[k];
                            flag = true;
                            break;
                        }
                    }


                }

            }
            if (!flag) result[i] = -1;
        }

        return result;
    }

}
