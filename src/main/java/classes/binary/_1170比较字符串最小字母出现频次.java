package classes.binary;

import java.util.Arrays;

public class _1170比较字符串最小字母出现频次 {
//    public int[] numSmallerByFrequency(String[] queries, String[] words) {
//        int[] q = new int[queries.length];
//        int[] w = new int[words.length];
//
//        for (int i = 0; i < q.length; i++) {
//            q[i] = f(queries[i]);
//        }
//
//        for (int i = 0; i < w.length; i++) {
//            w[i] = f(words[i]);
//        }
//
//        int[] ans = new int[queries.length];
//        Arrays.sort(w);
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = binarySearch(w, q[i]);
//        }
//        return ans;
//    }
//
//    private int binarySearch(int[] w, int q) { // q < w[..]
//        int l = 0, r = w.length - 1, res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (w[mid] <= q) {
//                l = mid + 1;
//            } else {
//                res = mid;
//                r = mid - 1;
//            }
//        }
//        return w.length - res;
//    }
//
//    public int f(String s) {
//        int cnt = 0;
//        char minChar = Character.MAX_VALUE;  // 初始值为最大字符
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch < minChar) {
//                minChar = ch;
//                cnt = 1;  // 重置频次
//            } else if (ch == minChar) {
//                cnt++;  // 增加频次
//            }
//        }
//        return cnt;
//    }
}
