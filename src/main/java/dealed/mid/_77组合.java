package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _77组合 {
    // 位运算 时间复杂度相当于暴搜
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            if (Integer.bitCount(i) == k) {
                List<Integer> lst = new ArrayList<>();
                int cur = i, bit = 0;
                while (cur > 0) {
                    bit++;
                    if ((cur & 1) == 1) {
                        lst.add(bit);
                    }
                    cur >>= 1;
                }
                ans.add(lst);
            }
        }
        return ans;
    }


    List<List<Integer>> ans = new ArrayList<>();
    int k = 0;
    int n = 0;

    // 枚举选不选
    public List<List<Integer>> combine1(int _n, int _k) {
        k = _k;
        n = _n;
        dfs(1, new ArrayList<Integer>());
        return ans;
    }

    private void dfs(int i, ArrayList<Integer> lst) {
        if (lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        if (i > n) {
            return;
        }
        dfs(i + 1, lst);
        lst.add(i);
        dfs(i + 1, lst);
        lst.remove(lst.size() - 1);
    }

    // 枚举选哪个
    public List<List<Integer>> combine2(int _n, int _k) {
        k = _k;
        n = _n;
        int[] used = new int[n + 1];
        dfsSwitch(1, used, new ArrayList<Integer>());
        return ans ;
    }

    private void dfsSwitch(int idx, int[] used, ArrayList<Integer> lst) {
        if (lst.size() == k) {
            ans.add(new ArrayList<>(lst));
            return;
        }
        for (int i = idx; i <= n; i++) {
            if (used[i] == 1) continue;
            used[i] = 1;
            lst.add(i);
            dfsSwitch(i + 1, used, lst);
            lst.remove(lst.size() - 1);
            used[i] = 0;
        }
    }
}