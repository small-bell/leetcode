package dealed.easy;

public class _58最后一个单词的长度 {
    public int lengthOfLastWord1(String s) {
        char[] cs = s.trim().toCharArray();
        int ans = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
            if (Character.isLetter(cs[i])) {
                ans ++;
            } else {
                break;
            }
        }
        return ans;
    }

    public int lengthOfLastWord(String s) {
        char[] cs = s.toCharArray();
        int i = cs.length - 1, ans = 0;
        while (cs[i] == ' ') i --;
        while (i >= 0 && Character.isLetter(cs[i--]) ) ans++;
        return ans;
    }
}
