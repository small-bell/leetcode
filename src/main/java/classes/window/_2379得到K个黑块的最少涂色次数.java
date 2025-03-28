package classes.window;

public class _2379得到K个黑块的最少涂色次数 {
    public int minimumRecolors(String s, int k) {

        int white = 0, res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') white ++;
            if (i < k - 1) continue;
            res = Math.min(white, res);
            if (s.charAt(i - k + 1) == 'W') white --;
        }
        return res;
    }

}
