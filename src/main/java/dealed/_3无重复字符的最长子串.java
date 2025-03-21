package dealed;

import java.util.HashSet;
import java.util.Set;

public class _3无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length(), l = 0, ans = 0;
        int[] set = new int[10000];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            set[c] ++;
            while (set[c] > 1) {
                set[s.charAt(l++)] --;
            }
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}
