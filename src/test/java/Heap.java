import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class Heap {
    int[] d = new int[10000];
    int size = 0;

    public static void main(String[] args) {
        Heap heap = new Heap();
        int[] arr = new int[] {5, 1, 4, 4, 8, 6, 6};
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int res = heap.pop();
            System.out.println(res);
        }
    }

    private int pop() {
        int ans = d[1], idx = 1;
        d[1] = d[size--];
        while (true) {
            int l = idx * 2, r = idx * 2 + 1, min = l;
            if (l > size) {
                break;
            }
            if (r <= size && d[r] < d[l]) {
                min = r;
            }
            swap(d, min, idx);
            idx = min;
        }
        return ans;
    }

    private void insert(int i) {
        d[++size] = i;
        int cur = size;
        while (cur > 0) {
            int p = cur / 2;
            if (d[p] > i) {
                swap(d, cur, p);
                cur = p;
            } else {
                break;
            }
        }
    }

    private void swap(int[] d, int cur, int p) {
        int tmp = d[cur];
        d[cur] = d[p];
        d[p] = tmp;
    }


}
