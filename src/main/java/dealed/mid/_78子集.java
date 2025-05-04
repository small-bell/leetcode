package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _78子集 {
    // 位运算
    public List<List<Integer>> subsets1(int[] nums) {
        int bit = 1 << nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < bit; i++) {
            List<Integer> cur = new ArrayList<>();
            int j = i, k = 0;
            while (j > 0) {
                if ((j & 1) == 1) {
                    cur.add(nums[k]);
                }
                k ++;
                j >>= 1;
            }
            ans.add(cur);
        }
        return ans;
    }

    List<List<Integer>> ans = new ArrayList<>();
    // 选哪个
    public List<List<Integer>> subsets2(int[] nums) {
        dfs(nums, 0, new ArrayList<Integer>());
        return ans;
    }

    private void dfs(int[] nums, int cur, ArrayList<Integer> lst) {
        ans.add(new ArrayList<>(lst));
        for (int i = cur; i < nums.length; i++) {
            lst.add(nums[i]);
            dfs(nums, i + 1, lst);
            lst.remove(lst.size() - 1);
        }
    }

    // 选不选
    public List<List<Integer>> subsets(int[] nums) {
        dfs1(nums, 0, new ArrayList<Integer>());
        return ans;
    }

    private void dfs1(int[] nums, int cur, ArrayList<Integer> lst) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[cur]);
        dfs1(nums, cur + 1, lst);
        lst.remove(lst.size() - 1);
        dfs1(nums, cur + 1, lst);
    }


}
