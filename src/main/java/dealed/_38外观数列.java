package dealed;

public class _38外观数列 {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = compute(sb);
            System.out.println(sb);
        }
        return sb.toString();
    }

    private StringBuilder compute(StringBuilder sb) {
        StringBuilder res = new StringBuilder("");
        int i = 0;
        while (i < sb.length()) {
            char c = sb.charAt(i);
            int cur = 1;
            while (i < sb.length() - 1 && sb.charAt(i + 1) == sb.charAt(i)) {
                cur ++;
                i ++;
            }

            res.append(cur);
            res.append(c);
            i ++;
        }
        return res;
    }

    public static void main(String[] args) {
        new _38外观数列().countAndSay(4);
    }
}
