package dealed;

public class _72编辑距离 {
    public int minDistance(String ss, String tt) {
        int n1 = ss.length(), n2 = tt.length();
        int[][] dp = new int[n1 + 1][ n2 + 1];
        for (int i = 0; i <= n1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n2; i++) {
            dp[0][i] = i;
        }
        dp[0][0] = 0;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (ss.charAt(i - 1) == tt.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[n1][n2];
    }
}
