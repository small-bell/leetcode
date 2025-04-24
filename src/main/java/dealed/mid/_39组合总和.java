package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _39组合总和 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrace(0, 0, new ArrayList<>(), candidates, target);
        return res;
    }

    private void backtrace(int idx, int sum, ArrayList<Integer> lst, int[] candidates, int target) {
        if (idx == candidates.length) {
            if (sum == target) {
                res.add(new ArrayList<>(lst));
            }
            return;
        }
        for (int i = 0; i * candidates[idx] <= target - sum; i++) {
            for (int j = 0; j < i; j++) {
                lst.add(candidates[idx]);
            }
            backtrace(idx + 1, sum + i * candidates[idx], lst, candidates, target);
            for (int j = 0; j < i; j++) {
                lst.remove(lst.size() - 1);
            }
        }
    }
}
