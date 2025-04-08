package dealed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40组合总和II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrace(0, candidates, target, 0, new ArrayList<Integer>());
        return res;
    }

    List<List<Integer>> res = new ArrayList<>();

    private void backtrace(int start, int[] candidates, int target, int cur, ArrayList<Integer> lst) {
        if (cur == target) {
            res.add(new ArrayList<>(lst));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (cur + candidates[i] > target) break;
            lst.add(candidates[i]);
            backtrace(i + 1, candidates, target, cur + candidates[i], lst);
            lst.remove(lst.size() - 1);
        }
    }

    class Solution1 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(0, target, candidates, ans, path);
            return ans;
        }

        private void dfs(int i, int left, int[] candidates, List<List<Integer>> ans, List<Integer> path) {
            // 所选元素之和恰好等于 target
            if (left == 0) {
                ans.add(new ArrayList<>(path));
                return;
            }

            // 没有可以选的数字
            if (i == candidates.length) {
                return;
            }

            // 所选元素之和无法恰好等于 target
            int x = candidates[i];
            if (left < x) {
                return;
            }

            // 选 x
            path.add(x);
            dfs(i + 1, left - x, candidates, ans, path);
            path.remove(path.size() - 1); // 恢复现场

            // 不选 x，那么后面所有等于 x 的数都不选
            // 如果不跳过这些数，会导致「选 x 不选 x'」和「不选 x 选 x'」这两种情况都会加到 ans 中，这就重复了
            i++;
            while (i < candidates.length && candidates[i] == x) {
                i++;
            }
            dfs(i, left, candidates, ans, path);
        }
    }

    class Solution2 {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(0, target, candidates, ans, path);
            return ans;
        }

        private void dfs(int i, int left, int[] candidates, List<List<Integer>> ans, List<Integer> path) {
            // 所选元素之和恰好等于 target
            if (left == 0) {
                ans.add(new ArrayList<>(path));
                return;
            }

            // 在 [i, n-1] 中选一个 candidates[j]
            // 注意选 candidates[j] 意味着 [i,j-1] 中的数都没有选
            for (int j = i; j < candidates.length && candidates[j] <= left; j++) {
                // 如果 j>i，说明 candidates[j-1] 没有选
                // 同方法一，所有等于 candidates[j-1] 的数都不选
                if (j > i && candidates[j] == candidates[j - 1]) {
                    continue;
                }
                path.add(candidates[j]);
                dfs(j + 1, left - candidates[j], candidates, ans, path);
                path.remove(path.size() - 1); // 恢复现场
            }
        }
    }

}






