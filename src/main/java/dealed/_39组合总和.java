package dealed;

import java.util.ArrayList;
import java.util.List;

public class _39组合总和 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrace(0, candidates, target, 0, new ArrayList<Integer>());
        return res;
    }

    private void backtrace(int idx, int[] candidates, int target, int cur, ArrayList<Integer> lst) {
        if (idx == candidates.length) {
            if (cur == target) {
                res.add(new ArrayList<>(lst));
            }
            return;
        }
        for (int i = 0; i < (target - cur) / candidates[idx] + 1; i++) {
            for (int j = 0; j < i; j++) {
                lst.add(candidates[idx]);
            }
            backtrace(idx +1, candidates, target, cur + i * candidates[idx], lst);
            for (int j = 0; j < i; j++) {
                lst.remove(lst.size() - 1);
            }
        }
    }
}
