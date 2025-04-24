package dealed.mid;

import java.util.*;
import java.lang.*;

public class _40组合总和ii {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum21(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, 0,new ArrayList<Integer>(), candidates, target);
        return res;
    }

    private void dfs(int idx, int sum, ArrayList<Integer> lst, int[] candidates, int target) {
        if (idx == candidates.length) {
            if (sum == target) res.add(new ArrayList<>(lst));
            return;
        }

        if (sum > target) {
            return;
        }

        lst.add(candidates[idx]);
        dfs(idx + 1, sum + candidates[idx], lst, candidates, target);
        lst.remove(lst.size() - 1);

        idx ++;
        while (idx < candidates.length && candidates[idx] == candidates[idx - 1]) idx ++;
        dfs(idx, sum, lst, candidates, target);
    }



    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        dfs(0, 0, target, candidates, new ArrayList<Integer>());
        return ans;
    }

    private void dfs(int idx, int cur, int target, int[] candidates, ArrayList<Integer> lst) {
        if (cur == target) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int i = idx; i < candidates.length && cur < target; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            lst.add(candidates[i]);
            dfs(i + 1, cur + candidates[i], target, candidates, lst);
            lst.remove(lst.size() - 1);
        }
    }

}
