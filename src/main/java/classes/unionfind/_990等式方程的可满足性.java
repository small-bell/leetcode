package classes.unionfind;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _990等式方程的可满足性 {
    class UnionFind {
        int[] fa;
        int[] size;
        int cc;
        public UnionFind(int n) {
            fa = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                fa[i] = i;
            }
            Arrays.fill(size, 1);
            cc = n;
        }
        int find(int x) {
            if (fa[x] == x) return x;
            return find(fa[x]);
        }
        boolean union(int from, int to) {
            int x = find(from);
            int y = find(to);
            if (x == y) return false;
            fa[x] = y;
            size[x] += size[y];
            cc --;
            return true;
        }
        int getSize(int x) {
            return size[find(x)];
        }
        boolean check(int from , int to) {
            int x = find(from);
            int y = find(to);
            if (x == y) return false;
            return true;
        }
    }
    public boolean equationsPossible(String[] equations) {
        UnionFind uf = new UnionFind(27);
        for (int i = 0; i < equations.length; i++) {
            String s = equations[i];
            if (s.contains("==")) {
                uf.union(s.charAt(0) - 'a', s.charAt(3) - 'a');
            }
        }
        for (int i = 0; i < equations.length; i++) {
            String s = equations[i];
            if (s.contains("!=")) {
                boolean check = uf.check(s.charAt(0) - 'a', s.charAt(3) - 'a');
                if (!check) return false;
            }
        }
        return true;
    }
}
