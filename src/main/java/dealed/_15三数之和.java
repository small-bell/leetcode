package dealed;

import java.util.*;

public class _15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > 0) {
                break;
            }
            // 去重
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = cur + nums[l] + nums[r];
                if (sum > 0) {
                    r --;
                } else if (sum < 0) {
                    l ++;
                } else {
                    List<Integer> currentLst = new ArrayList<>();
                    currentLst.add(nums[i]);
                    currentLst.add(nums[l]);
                    currentLst.add(nums[r]);
                    ans.add(currentLst);
                    // 去重
                    while (l<r && nums[l] == nums[l+1]) l++;
                    while (l<r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
