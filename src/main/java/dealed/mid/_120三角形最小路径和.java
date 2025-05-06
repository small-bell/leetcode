package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _120三角形最小路径和 {

    public int minimumTotal(List<List<Integer>> tr) {
        int n = tr.size(), min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            List<Integer> lst = tr.get(i);
            List<Integer> pre = tr.get(i - 1);
            for (int j = 0; j < lst.size(); j++) {
                if (j == 0) {
                    lst.set(j, lst.get(j) + pre.get(j));
                } else if (j == lst.size() - 1) {
                    lst.set(j, lst.get(j) + pre.get(j - 1));
                } else {
                    lst.set(j, Math.min(lst.get(j) + pre.get(j - 1), lst.get(j) + pre.get(j)));
                }
            }
        }
        List<Integer> last = tr.get(tr.size() - 1);
        for (int i = 0; i < last.size(); i++) {
            min = Math.min(min, last.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        Object o = new ArrayList<>().get(-1);
        System.out.println(o);
    }

}
