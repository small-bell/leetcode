package dealed;

import java.util.ArrayList;
import java.util.Arrays;
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




    class Solution1 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(0, target, candidates, ans, path);
            return ans;
        }

        private void dfs(int i, int left, int[] candidates, List<List<Integer>> ans, List<Integer> path) {
            if (left == 0) {
                // 找到一个合法组合
                ans.add(new ArrayList<>(path));
                return;
            }

            if (i == candidates.length || left < candidates[i]) {
                return;
            }

            // 不选
            dfs(i + 1, left, candidates, ans, path);

            // 选
            path.add(candidates[i]);
            dfs(i, left - candidates[i], candidates, ans, path);
            path.remove(path.size() - 1); // 恢复现场
        }
    }

    class Solution2 {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(0, target, candidates, ans, path);
            return ans;
        }

        private void dfs(int i, int left, int[] candidates, List<List<Integer>> ans, List<Integer> path) {
            if (left == 0) {
                // 找到一个合法组合
                ans.add(new ArrayList<>(path));
                return;
            }

            if (left < candidates[i]) {
                return;
            }

            // 枚举选哪个
            for (int j = i; j < candidates.length; j++) {
                path.add(candidates[j]);
                dfs(j, left - candidates[j], candidates, ans, path);
                path.remove(path.size() - 1); // 恢复现场
            }
        }
    }
}
