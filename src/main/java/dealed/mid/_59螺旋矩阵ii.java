package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _59螺旋矩阵ii {

    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, u = 0, d = n - 1;
        int i = 1;
        int[][] ans = new int[n][n];
        while (i <= n * n) {
            for (int j = l; j <= r; j++) {
                ans[u][j] = i++;
            }
            u ++;
            for (int j = u; j <= d; j++) {
                ans[j][r] = i ++;
            }
            r --;
            for (int j = r; j >= l; j--) {
                ans[d][j] = i ++;
            }
            d --;
            for (int j = d; j >= u; j--) {
                ans[j][l] = i ++;
            }
            l ++;
        }
        return ans;
    }
    // 很丑陋的写法哈哈哈
    public int[][] generateMatrix1(int n) {
        if (n == 1) {
            return new int[][] {
                    {1}
            };
        }
        int[][] ans = new int[n][n];
        int num = 1;
        int i = 0, j = 0;
        while (n > 0) {
            for (int k = 0; k < n; k++) {
                ans[i][j++] = num++;
            }
            j--;
            i++;
            for (int k = 1; k < n - 1; k++) {
                ans[i++][j] = num++;
            }
            if (n == 1) break;
            for (int k = 0; k < n; k++) {
                ans[i][j--] = num++;
            }
            j++;
            i--;
            for (int k = 1; k < n - 1; k++) {
                ans[i--][j] = num++;
            }
            n -= 2;
            i++;
            j++;

        }
        return ans;
    }



    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int t = 0, b = matrix.length - 1, l = 0, r = matrix[0].length - 1;
        while (t <= b && l <= r) {
            for (int k = l; k <= r; k++) {
                ans.add(matrix[t][k]);
            }
            t ++;
            for (int k = t; k <= b; k++) {
                ans.add(matrix[k][r]);
            }
            r --;
            if (t > b || l > r) {
                break;
            }
            for (int k = r; k >= l; k--) {
                ans.add(matrix[b][k]);
            }
            b --;
            for (int k = b; k >= t; k--) {
                ans.add(matrix[k][l]);
            }
            l++;
        }
        return ans;
    }
}
