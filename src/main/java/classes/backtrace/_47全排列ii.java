package classes.backtrace;

import java.util.*;
import java.lang.*;

public class _47全排列ii {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length +1];
        dfs(used, nums, new ArrayList<Integer>());
        return ans;
    }

    private void dfs(int[] used, int[] nums, ArrayList<Integer> lst) {
        if (lst.size() == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (used[j] == 1 || (j > 0 && nums[j] == nums[j - 1] && used[j - 1] == 0)) continue;
            used[j] = 1;
            lst.add(nums[j]);
            dfs(used, nums, lst);
            lst.remove(lst.size() - 1);
            used[j ]  = 0;
        }
    }


}
