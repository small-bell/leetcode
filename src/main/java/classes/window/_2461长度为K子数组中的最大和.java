package classes.window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2461长度为K子数组中的最大和 {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, ans = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.merge(nums[i], 1, Integer::sum);
            if (i < k - 1) {
                continue;
            }
            if (map.size() == k) {
                ans = Math.max(sum, ans);
            }
            if (map.merge(nums[i - k + 1], -1, Integer::sum) == 0) {
                map.remove(nums[i - k + 1]);
            }
            sum -= nums[i - k + 1];
        }
        return ans == Integer.MIN_VALUE ? 0: ans;
    }
}
