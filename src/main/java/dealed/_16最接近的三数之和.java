package dealed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _16最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = cur + nums[l] + nums[r];
                if (Math.abs(target - sum) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum > target) {
                    r --;
                    while (r > l && r < nums.length - 1 && nums[r] == nums[r + 1]) r --;
                } else if (sum < target){
                    l ++;
                    while (r > l && l > i + 1 && nums[l] == nums[l - 1]) l ++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }
}
