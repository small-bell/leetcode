package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _90子集ii {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup1(int[] nums) {
        Arrays.sort(nums);
        select(0, nums, new ArrayList<Integer>());
        return ans;
    }

    private void select(int i, int[] nums, ArrayList<Integer> lst) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[i]);
        select(i +1, nums, lst);
        lst.remove(lst.size() - 1);
        int j = i + 1;
        while (j < nums.length && nums[j] == nums[i]) j ++;
        select(j, nums, lst);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        which(0, nums, new ArrayList<Integer>());
        return ans;
    }

    private void which(int i, int[] nums, ArrayList<Integer> lst) {
        ans.add(new ArrayList<>(lst));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;
            lst.add(nums[j]);
            which(j + 1, nums, lst);
            lst.remove(lst.size() - 1);
        }
    }
}
