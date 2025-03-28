package classes.window;

public class _643子数组最大平均数I {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                sum += nums[i];
                continue;
            }
            sum += nums[i];
            ans = Math.max(sum, ans);
            sum -= nums[i - k + 1];
        }
        return ans * 1.0 / k;
    }

}
