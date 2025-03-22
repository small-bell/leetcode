package dealed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _47全排列II {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrace(nums, 0, new ArrayList<Integer>(), used);
        return ans;
    }

    private void backtrace(int[] nums, int idx, ArrayList<Integer> lst, boolean[] used) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            used[i] = true;
            lst.add(nums[i]);
            backtrace(nums, idx + 1, lst, used);
            lst.remove(lst.size() - 1);
            used[i] = false;
        }
    }

}
