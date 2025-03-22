package dealed;

import java.util.ArrayList;
import java.util.List;

public class _46全排列 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
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
            used[i] = true;
            lst.add(nums[i]);
            backtrace(nums, idx + 1, lst, used);
            lst.remove(lst.size() - 1);
            used[i] = false;
        }
    }
}
