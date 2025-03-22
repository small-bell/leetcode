package dealed;

import java.util.ArrayList;
import java.util.List;

public class _77组合 {

//    List<List<Integer>> ans = new ArrayList<>();
//    public List<List<Integer>> combine(int n, int k) {
//        boolean[] used = new boolean[n];
//        backtrace(n, k, new ArrayList<Integer>(), used);
//        return ans;
//    }
//
//    private void backtrace(int N, int K, ArrayList<Integer> lst, boolean[] used) {
//        if (lst.size() == K) {
//            ans.add(new ArrayList<>(lst));
//            return;
//        }
//
//        for (int i = 1; i <= N; i++) {
//            if (!lst.isEmpty() && lst.get(lst.size() - 1) < i) continue;
//            if (used[i]) continue;
//            used[i] = true;
//            lst.add(i);
//
//            backtrace(N, K, lst, used);
//
//            used[i] = false;
//            lst.remove(lst.size() - 1);
//        }
//    }

//    List<List<Integer>> ans = new ArrayList<>();
//    public List<List<Integer>> combine(int n, int k) {
//        boolean[] used = new boolean[n];
//        backtrace(1, n, k, new ArrayList<Integer>(), used);
//        return ans;
//    }
//
//    private void backtrace(int start, int N, int K, ArrayList<Integer> lst, boolean[] used) {
//        if (lst.size() == K) {
//            ans.add(new ArrayList<>(lst));
//            return;
//        }
//
//        for (int i = start; i <= N; i++) {
//            lst.add(i);
//            backtrace(i + 1, N, K, lst, used);
//            lst.remove(lst.size() - 1);
//        }
//    }

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrace(1, n, k, new ArrayList<Integer>());
        return ans;
    }

    private void backtrace(int idx, int n, int k, ArrayList<Integer> lst) {
        if (lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        if (idx == n + 1) {
            return;
        }
        lst.add(idx);
        backtrace(idx + 1, n, k, lst);
        lst.remove(lst.size() - 1);
        backtrace(idx + 1, n, k, lst);
    }


}
