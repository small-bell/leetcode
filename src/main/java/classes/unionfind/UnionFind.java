package classes.unionfind;

import java.util.Arrays;

public class UnionFind {
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
}
