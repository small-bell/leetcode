package pre;

public class _5最长回文子串 {

    public String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            check(i, s);
        }
        return s.substring(ans_l, ans_r);
    }
    int ans_l = 0;
    int ans_r = 0;
    int max = 0;

    private int check(int i, String s) {
        int res = 1;
        int l = i - 1, r = i + 1;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            res += 2;
            l --;
            r++;
        }
        if (res > max) {
            ans_l = l + 1;
        }

        int double_res = 0;
        if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
            double_res += 2;
            l = i - 1;
            r = i + 2;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                double_res += 2;
            }
            res = Math.max(double_res, res);
        }
        return res;
    }

}
