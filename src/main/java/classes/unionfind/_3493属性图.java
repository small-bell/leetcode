package classes.unionfind;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _3493属性图 {
    int[] fa;
    int[] size;
    int cc;
    public int numberOfComponents(int[][] ps, int k) {
        fa = new int[ps.length];
        for (int i = 0; i < ps.length; i++) {
            fa[i] = i;
        }
        size = new int[ps.length];
        Arrays.fill(size, 1);
        cc = ps.length;

        HashSet<Integer>[] set = new HashSet[ps.length];
        for (int i = 0; i < ps.length; i++) {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i < ps.length; i++) {
            for (int j = 0; j < ps[i].length; j++) {
                set[i].add(ps[i][j]);
            }
        }

        for (int i = 0; i < ps.length; i++) {
            Set<Integer> a = set[i];
            for (int j = 0; j < i; j++) {
                int cnt = 0;
                for (int x : set[j]) {
                    if (a.contains(x)) {
                        cnt++;
                    }
                }
                if (cnt >= k) {
                    merge(i, j);
                }
            }
        }
        return cc;
    }

    private void merge(int i, int j) {
        int x = find(i);
        int y = find(j);
        if (x == y) return;
        fa[x] = y;
        size[x] += size[y];
        cc --;
    }

    private int find(int i) {
        if (fa[i] == i) return i;
        return find(fa[i]);
    }


}
