package classes.dp;

public class _2466统计构造好字符串的方案数 {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        int ans = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i <= high; i++) {
            if (i >= zero) dp[i] += dp[i - zero];
            if (i >= one) dp[i] += dp[i - one];

            if (i >= low) ans = (ans + dp[i]) % MOD;
        }
        return ans;
    }
}
