package dealed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            int i_num = nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if ((long) nums[i] + nums[nums.length - 3] + nums[nums.length - 2] + nums[nums.length - 1] < target) {
                continue;
            }


            for (int j = i + 1; j < nums.length - 2; j++) {
                int j_num = nums[j];
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }

                if ((long) nums[i] + nums[j] + nums[nums.length - 2] + nums[nums.length - 1] < target) {
                    continue;
                }

                int l = j + 1, r = nums.length - 1;

                while ( l < r) {
                    int sum = i_num + j_num + nums[l] + nums[r];
                    if (sum == target) {
                        List<Integer> cur = new ArrayList<>();
                        cur.add(nums[i]);
                        cur.add(nums[j]);
                        cur.add(nums[l]);
                        cur.add(nums[r]);
                        ans.add(cur);
                        l ++;
                        r --;
                        while (l > j + 1 && l < r && nums[l] == nums[l - 1]) l ++;
                        while (r < nums.length - 1 && l < r && nums[r] == nums[r + 1]) r --;
                    } else if (sum > target) {
                        r --;
                        while (r < nums.length - 1 && l < r && nums[r] == nums[r + 1]) r --;
                    } else {
                        l ++;
                        while (l > j + 1 && l < r && nums[l] == nums[l - 1]) l ++;
                    }
                }
            }

        }
        return ans;
    }
}
