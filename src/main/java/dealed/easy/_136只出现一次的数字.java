package dealed.easy;

public class _136只出现一次的数字 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
