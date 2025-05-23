package classes.dp;

public class _377组合总和Ⅳ {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] > 0) {
                    dp[i] = dp[i - nums[j]] + dp[i];
                }
            }
        }
        return dp[target];
    }
}
