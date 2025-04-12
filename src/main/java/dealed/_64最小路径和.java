package dealed;

import java.util.Arrays;

public class _64最小路径和 {

    class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] f = new int[m + 1][n + 1];
            Arrays.fill(f[0], Integer.MAX_VALUE);
            f[0][1] = 0;
            for (int i = 0; i < m; i++) {
                f[i + 1][0] = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    f[i + 1][j + 1] = Math.min(f[i + 1][j], f[i][j + 1]) + grid[i][j];
                }
            }
            return f[m][n];
        }
    }
}
