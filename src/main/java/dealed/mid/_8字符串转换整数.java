package dealed.mid;

public class _8字符串转换整数 {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i ++;
        if (i == s.length()) return 0;
        int flag = 1;
        if (s.charAt(i) == '-') flag = -1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') i ++;
        if (i == s.length()) return 0;
        int ans = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            if (ans > Integer.MAX_VALUE/10 || ans == Integer.MAX_VALUE/10 && s.charAt(i) > '7')
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            ans = ans * 10  +  s.charAt(i) - '0';
            i ++;
        }
        return flag * ans;
    }

    public int myAtoi1(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') i ++;
        if (i == s.length()) return 0;
        int flag = 1;
        if (s.charAt(i) == '-') flag = -1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') i ++;
        if (i == s.length()) return 0;
        long ans = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            if ( flag * ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (flag * ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            ans = ans * 10  +  s.charAt(i) - '0';
            i ++;
            if ( flag * ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (flag * ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(flag * ans);
    }
}
