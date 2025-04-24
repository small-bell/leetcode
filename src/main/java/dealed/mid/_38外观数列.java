package dealed.mid;

public class _38外观数列 {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = build(sb);
        }
        return sb.toString();
    }

    private StringBuilder build(StringBuilder sb) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); ) {
            char c = sb.charAt(i);
            int size = 1;
            while (i + 1 < sb.length()  && sb.charAt(i + 1) == c) {
                i ++;
                size ++;
            }
            res.append(size).append((char) c);
            i ++;
        }
        return res;
    }
}
