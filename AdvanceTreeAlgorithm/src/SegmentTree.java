public class SegmentTree {

    int nums[];
    int segment[];

    int nextPowerOf2(int n) {
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        n++;
        return n;
    }

    public void NumArray(int[] nums) {
        if (null == nums || nums.length == 0)
            return;
        this.nums = nums;
        int p = nextPowerOf2(nums.length);


        segment = new int[2 * p - 1];
        constructSumRangeSegmentTree(nums, segment, 0, nums.length - 1, 0);
    }

    public void update(int i, int val) {
        //  nums[i] = val;
        updateSegmentTree(this.segment, i, val, 0, nums.length - 1, 0);

    }

    public int updateSegmentTree(int segment[], int i, int val, int low, int high, int pos) {
        int diff = 0;
        if (pos > segment.length) return 0;

        if (low == i && high == i) {
            diff = val - segment[pos];
            segment[pos] = val;

            return diff;
        }
        int mid = (low + high) / 2;

        if (i <= mid)
            diff = updateSegmentTree(segment, i, val, low, mid, 2 * pos + 1);
        else
            diff = updateSegmentTree(segment, i, val, mid + 1, high, 2 * pos + 2);

        segment[pos] += diff;
        return diff;
    }


    public int sumRange(int i, int j) {
        return getRangeSumQuery(segment, i, j, 0, nums.length - 1, 0);
    }


    public void constructSumRangeSegmentTree(int arr[], int segment[], int low, int high, int pos) {

        if (low == high) {
            segment[pos] = arr[low];
            return;
        }

        int mid = (low + high) >> 1;
        int leftChildPosition = (pos << 1) + 1;
        int rightChildPosition = (pos << 1) + 2;

        constructSumRangeSegmentTree(arr, segment, low, mid, leftChildPosition);
        constructSumRangeSegmentTree(arr, segment, mid + 1, high, rightChildPosition);
        segment[pos] = segment[leftChildPosition] + segment[rightChildPosition];
    }

    public int getRangeSumQuery(int segment[], int queryLow, int queryHigh, int low, int high, int pos) {
        //1) total overlap then return answer from segment
        if (queryLow <= low && high <= queryHigh)
            return segment[pos];

        //2) no overlap then return maximum value
        if (queryHigh < low || queryLow > high)
            return 0;

        //3) partial overlap then divide into two part

        int mid = (low + high) >> 1;
        int leftChildPosition = (pos << 1) + 1;
        int rightChildPosition = (pos << 1) + 2;

        int leftRangeValue = getRangeSumQuery(segment, queryLow, queryHigh, low, mid, leftChildPosition);
        int rightRangeValue = getRangeSumQuery(segment, queryLow, queryHigh, mid + 1, high, rightChildPosition);
        return (leftRangeValue + rightRangeValue);
    }


}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */