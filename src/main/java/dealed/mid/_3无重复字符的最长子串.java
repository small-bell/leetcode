package dealed.mid;

public class _3无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int[] m = new int[10000];
        int l = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m[c-' ' ] ++;
            while (m[c-' '] > 1) {
                m[s.charAt(l++) - ' '] --;
            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}
