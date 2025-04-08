package dealed;

public class _151反转字符串中的单词 {
    public String reverseWords(String s) {
        int i = 0, j = s.length() - 1;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') break;
        }
        for (j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') break;
        }
        String substring = s.substring(i, j + 1);

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < substring.length(); k++) {
            if (substring.charAt(k) != ' ') sb.append(substring.charAt(k));
             else if ( k > 0 && substring.charAt(k) == ' ' &&substring.charAt(k  - 1) == ' ') continue;
             else if (k > 0 && substring.charAt(k) == ' ' &&substring.charAt(k  - 1) != ' ') sb.append(substring.charAt(k));
        }

        char[] cs = sb.toString().toCharArray();
        reverse(cs, 0, cs.length - 1);

        for (int k = 0; k < cs.length; ) {
            int l = k;
            for (l = k; l < cs.length; l++) {
                if (cs[l] == ' ') break;
            }
            reverse(cs, k, l - 1);

            k = l + 1;
        }
        return new String(cs);
    }

    private void reverse(char[] cs, int l, int r) {
        while (l < r) {
            char tmp = cs[l];
            cs[l] = cs[r];
            cs[r] = tmp;
            l ++;
            r --;
        }
    }

//    public String reverseWords(String s) {
//        int l = -1, r  = s.length();
//        do {
//            l ++;
//        } while (s.charAt(l) == ' ');
//        do {
//            r --;
//        } while (s.charAt(r) == ' ');
//        char[] cs = s.substring(l, r + 1).toCharArray();
//        StringBuilder sb = new StringBuilder("");
//        for (int i = 0; i < cs.length; i++) {
//            if (cs[i] != ' ') sb.append(cs[i]);
//            else if (i - 1 >= 0 && cs[i] == ' ' && cs[i - 1] == ' ') {
//                continue;
//            } else if (i - 1 >= 0 && cs[i] == ' ' && cs[i - 1] != ' ') {
//                sb.append(' ');
//            }
//        }
//        cs = sb.reverse().toString().toCharArray();
//        for (int i = 0; i < cs.length; ) {
//            int j = i;
//            while (j < cs.length && cs[j] != ' ') j ++;
//            reverse(cs, i, j - 1);
//            i = j + 1;
//        }
//        return new String(cs);
//    }

    public static void main(String[] args) {
        String s = new _151反转字符串中的单词().reverseWords("the sky is blue");
        System.out.println(s);
    }

}
