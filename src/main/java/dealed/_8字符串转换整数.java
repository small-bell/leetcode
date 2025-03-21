package dealed;

public class _8字符串转换整数 {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return  0;
        }
        int i = -1;
        while (i < s.length() - 1 && s.charAt(++i) == ' ');
        if (i == s.length()) return 0;
        int flag = 1;
        if (s.charAt(i) == '-') flag = -1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') i ++;
        if (i == s.length()) return 0;

        int res = 0, bndry = Integer.MAX_VALUE / 10;;
        for (; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') return flag * res;
            if (res > bndry || res == bndry && c > '7') return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 +   c - '0';
        }
        return res * flag;
    }

    public static void main(String[] args) {
        int s = new _8字符串转换整数().myAtoi("42");
        System.out.println(s);
    }
}
