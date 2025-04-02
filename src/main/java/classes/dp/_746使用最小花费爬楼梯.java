package classes.dp;

public class _746使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
//        fn = MIN(fn-1 + cost[n-1] || fn-2 + cost[n-2])
        int[] dp = new int[cost.length + 1];
        dp[0] = dp[1]  = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
