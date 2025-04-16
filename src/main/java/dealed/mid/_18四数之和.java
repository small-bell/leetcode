package dealed.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 注意要用long
public class _18四数之和 {
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        for (int i = 0; i <= nums.length - 4; i++) {
            if ((long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if ( (long)nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length  - 3]< target) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j <= nums.length - 3; j++) {
                if ((long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if ((long)nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length  - 2] < target) continue;
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1, r = nums.length - 1;
                while (l < r ) {
                    long val = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (val == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l ++;
                        r --;
                        while (l < r && nums[l] == nums[l - 1]) l ++;
                        while (l < r && nums[r] == nums[r + 1]) r --;
                    } else if (val > target) {
                        r --;
                        while (l < r && nums[r] == nums[r + 1]) r --;
                    } else {
                        l ++;
                        while (l < r && nums[l] == nums[l - 1]) l ++;
                    }
                }
            }
        }
        return ans;
    }

    // 有时候不要过度操作，多做多错
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= nums.length - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j <= nums.length - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    long val = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (val == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l ++;
                        r --;
                        while (l < r && nums[l] == nums[l - 1]) l ++;
                        while (l < r && nums[r] == nums[r + 1]) r --;
                    } else if (val > target) {
                        r --;
                    } else {
                        l ++;
                    }

                }
            }
        }
        return ans;
    }
}
