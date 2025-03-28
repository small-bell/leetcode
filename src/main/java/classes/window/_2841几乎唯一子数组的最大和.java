package classes.window;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2841几乎唯一子数组的最大和 {
    public long maxSum(List<Integer> nums, int m, int k) {

        long res = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            map.merge(nums.get(i), 1, Integer::sum);
            if (i < k - 1) continue;
            if (map.size() >= m) {
                res = Math.max(sum, res);
            }

            Integer merge = map.merge(nums.get(i - k + 1), -1, Integer::sum);
            sum -= nums.get(i - k + 1);
            if (merge == 0) {
                map.remove(nums.get(i - k + 1));
            }

        }

        return res;
    }
}
