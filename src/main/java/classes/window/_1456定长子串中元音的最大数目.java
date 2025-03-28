package classes.window;

public class _1456定长子串中元音的最大数目 {
//    public int maxVowels(String s, int k) {
//        char[] target = new char[] {'a', 'e', 'i', 'o', 'u'};
//        int cur = 0, ans = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < target.length; j++) {
//                if (target[j] == s.charAt(i)) {
//                    cur ++;
//                }
//            }
//            if (i < k)  {
//                ans = Math.max(ans, cur);
//                continue;
//            }
//            for (int j = 0; j < target.length; j++) {
//                if (target[j] == s.charAt(i - k)) {
//                    cur --;
//                }
//            }
//            ans = Math.max(ans, cur);
//        }
//        return ans;
//    }

    public int maxVowels(String S, int k) {
        char[] s = S.toCharArray();
        int ans = 0;
        int vowel = 0;
        for (int i = 0; i < s.length; i++) {
            // 1. 进入窗口
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                vowel++;
            }
            if (i < k - 1) { // 窗口大小不足 k
                continue;
            }
            // 2. 更新答案
            ans = Math.max(ans, vowel);
            // 3. 离开窗口
            char out = s[i - k + 1];
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                vowel--;
            }
        }
        return ans;
    }

}
