package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _63不同路径ii {
    public int uniquePathsWithObstacles(int[][] g) {
        g[0][0] = g[0][0] == 0 ? 1 :0;
        for (int i = 1; i < g.length; i++) {
            if (g[i][0] == 1 || g[i - 1][0] == 0) g[i][0] = 0;
            else g[i][0] = 1;
        }
        for (int i = 1; i < g[0].length; i++) {
            if (g[0][i] == 1 ||g[0][i - 1] == 0) g[0][i] = 0;
            else g[0][i] = 1;
        }
        for (int i = 1; i < g.length; i++) {
            for (int j = 1; j < g[0].length; j++) {
                if (g[i][j] == 1) {
                    g[i][j] = 0;
                } else {
                    g[i][j] = g[i - 1][j] + g[i][j - 1];
                }
            }
        }
        return g[g.length - 1][g[0].length - 1];
    }
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] f = new int[m + 1][n + 1];
        f[0][1] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    f[i + 1][j + 1] = f[i][j + 1] + f[i + 1][j];
                }
            }
        }
        return f[m][n];
    }


}
