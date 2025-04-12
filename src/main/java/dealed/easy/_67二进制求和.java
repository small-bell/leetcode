package dealed.easy;

public class _67二进制求和 {
    public String addBinary(String a, String b) {
        int m = a.length() - 1, n = b.length() - 1, curry = 0;
        StringBuilder sb = new StringBuilder();
        while (m >= 0 || n >= 0 || curry > 0) {
            int cur = (m >= 0 ? a.charAt(m--) - '0' : 0)
                    + (n >= 0 ? b.charAt(n--) - '0' : 0)
                    + curry;
            curry = cur / 2;
            cur = cur % 2;
            sb.insert(0, (char)('0' + cur));
        }
        return sb.toString();
    }
}
