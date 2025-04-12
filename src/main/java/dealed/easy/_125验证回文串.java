package dealed.easy;

import javafx.util.Pair;

import java.util.Locale;

public class _125验证回文串 {
    public boolean isPalindrome1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String src = sb.toString();
        return sb.reverse().toString().equals(src);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isDigit(s.charAt(l)) && !Character.isLetter(s.charAt(l))) l ++;
            while (l < r && !Character.isDigit(s.charAt(r)) && !Character.isLetter(s.charAt(r))) r --;

            if (s.charAt(l) != s.charAt(r)) return false;
            l ++;
            r --;
        }
        return true;
    }

}
