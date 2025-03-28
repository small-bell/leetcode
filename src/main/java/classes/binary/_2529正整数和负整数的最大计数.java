package classes.binary;

public class _2529正整数和负整数的最大计数 {
    public int maximumCount(int[] nums) {

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == 0) {
                r = mid - 1;
            } else if (nums[mid ]> 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int zero1 = l;
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == 0) {
                l = mid + 1;
            } else if (nums[mid ]> 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
       return Math.max(nums.length - l, zero1);
    }
}
