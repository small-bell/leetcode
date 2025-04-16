package dealed.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _16最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int  ans = nums[0] + nums[1] + nums[2], sub = Math.abs(target - ans);
        for (int i = 0; i <= nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l <r) {
                int val = nums[i] + nums[l] + nums[r];
                if (Math.abs(val - target) < sub) {
                    sub = Math.abs(val - target);
                    ans = val;
                }
                if (val == target) {
                    return val;
                } else if (val>target) {
                    r --;
                } else {
                    l ++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new _16最接近的三数之和().threeSumClosest(new int[] {1,1,1,0}, 1000);
    }
}
