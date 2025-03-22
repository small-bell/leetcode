package dealed;

import java.util.ArrayList;
import java.util.List;

public class _216组合总和III {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrace(0, k, n, new ArrayList<Integer>(), 0);
        return ans;
    }

    private void backtrace(int idx, int k, int n, ArrayList<Integer> lst, int sum) {
        if (idx == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(lst));
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!lst.isEmpty() && lst.get(lst.size() - 1) >= i) continue;
            lst.add(i);
            backtrace(idx + 1, k, n, lst, sum + i);
            lst.remove(lst.size() - 1);
        }
    }

    public static void main(String[] args) {
        new _216组合总和III().combinationSum3(3, 7);
    }
}
