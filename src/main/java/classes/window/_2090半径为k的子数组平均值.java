package classes.window;

import java.util.Arrays;

public class _2090半径为k的子数组平均值 {
    public int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i < 2 * k) continue;
            res[i - k] = (int)(sum / (k * 2 + 1));
            sum -= nums[i - 2 * k ];
        }
        return res;
    }
}
