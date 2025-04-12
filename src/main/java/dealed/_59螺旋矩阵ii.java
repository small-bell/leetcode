package dealed;

public class _59螺旋矩阵ii {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] res = new int[n][n];
            int l = 0, r = n - 1, u = 0, d = n - 1;
            int num = 1;
            while (num <= n * n) {
                // 右
                for (int j = l; j <= r; j++) {
                    res[u][j] = num++;
                }
                u ++;
                // 下
                for (int j = u; j <= d; j++) {
                    res[j][r] = num++;
                }
                r --;
                // 左
                for (int j = r; j >= l; j--) {
                    res[d][j] = num ++;
                }
                d --;
                //上
                for (int j = d; j >= u; j--) {
                    res[j][l] = num ++;
                }
                l ++;
            }
            return res;
        }
    }

    class Solution1 {
        private final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上

        public int[][] generateMatrix(int n) {
            int[][] ans = new int[n][n];
            int i = 0;
            int j = 0;
            int di = 0;
            for (int val = 1; val <= n * n; val++) { // 要填入的数
                ans[i][j] = val;
                int x = i + DIRS[di][0];
                int y = j + DIRS[di][1]; // 下一步的位置
                // 如果 (x, y) 出界或者已经填入数字
                if (x < 0 || x >= n || y < 0 || y >= n || ans[x][y] != 0) {
                    di = (di + 1) % 4; // 右转 90°
                }
                i += DIRS[di][0];
                j += DIRS[di][1]; // 走一步
            }
            return ans;
        }
    }
}
