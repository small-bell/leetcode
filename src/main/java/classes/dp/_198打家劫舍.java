package classes.dp;

public class _198打家劫舍 {
    public int rob(int[] nums) {
        // fi = max(fi-1, fi-2 + nums[2])
        int[] f = new int[nums.length + 1];
        f[0] = 0;
        f[1] = nums[0];
        for (int i = 2; i <= nums.length ; i++) {
            f[i] = Math.max(f[i - 1], f[i - 2] + nums[i - 1]);
        }
        return f[nums.length];
    }
}
