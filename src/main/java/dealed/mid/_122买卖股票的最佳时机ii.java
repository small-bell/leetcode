package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _122买卖股票的最佳时机ii {


    // 贪心
    public int maxProfit1(int[] prices) {
        int mx = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                mx += prices[i] - prices[i - 1];
            }
        }
        return mx;
    }

    // dp
    public int maxProfit(int[] prices) {
        int[][] f = new int[prices.length + 1][2];
        f[0][1] = Integer.MIN_VALUE;
        for (int i = 1; i <= prices.length; i++) {
            f[i][0] = Math.max(f[i - 1][1] + prices[i - 1], f[i - 1][0]);
            f[i][1] = Math.max(f[i - 1][0] - prices[i - 1], f[i - 1][1]);
        }
        return f[prices.length][0];
    }
}
