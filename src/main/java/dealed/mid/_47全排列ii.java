package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _47全排列ii {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,  new ArrayList<Integer>(), new boolean[nums.length]);
        return ans;
    }

    private void dfs(int[] nums, ArrayList<Integer> lst, boolean[] used) {
        if (lst.size() == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            if (used[i]) continue;
            used[i] = true;
            lst.add(nums[i]);
            dfs(nums, lst, used);
            lst.remove(lst.size() - 1);
            used[i] = false;
        }
    }


}
