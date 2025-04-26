package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _64最小路径和 {
    public int minPathSum(int[][] g) {
        int m = g.length, n = g[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = i == 0 ? g[0][0] : dp[i - 1][0] + g[i][0];
        }


        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + g[0][i];
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1] ) + g[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
