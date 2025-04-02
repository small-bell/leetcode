package classes.dp;

public class _53最大子数组和 {
    public int maxSubArray(int[] nums) {
        int[] f = new int[nums.length];
        f[0] = nums[0];
        int ans = 0;
        for (int i = 1; i < f.length; i++) {
            f[i] = Math.max(0, f[i - 1]) + nums[i];
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
