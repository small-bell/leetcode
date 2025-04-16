package dealed.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15三数之和 {
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            // 三次过滤
            if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] < 0) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int cur = nums[i] + nums[j] + nums[k];
                if (cur == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j ++;
                    k --;
                    while (j < k && nums[j] == nums[j -  1]) j ++;
                    while (j < k &&  nums[k] == nums[k + 1]) k --;
                } else if (cur > 0) {
                    k --;
                    while (j < k &&  nums[k] == nums[k + 1]) k --;
                } else {
                    j ++;
                    while (j < k && nums[j] == nums[j -  1]) j ++;
                }
            }
        }
        return ans;
    }

    // 写一个简单版的，防止面试脑子抽筋
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l <r) {
                int val = nums[i] + nums[l] + nums[r];
                if (val == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l ++;
                    r --;
                    while (l < r && nums[l] == nums[l - 1]) l ++;
                    while (l < r && nums[r] == nums[r + 1]) r --;
                } else if (val>0) {
                    r --;
                } else {
                    l ++;
                }
            }
        }
        return ans;
    }

}
