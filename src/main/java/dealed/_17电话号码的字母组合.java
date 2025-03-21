package dealed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17电话号码的字母组合 {
    List<String> res = new ArrayList<>();
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        backtrace(0, digits, new StringBuffer(""));
        return res;
    }

    private void backtrace(int idx, String digits, StringBuffer sb) {
        if (idx == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String s = phoneMap.get(digits.charAt(idx));
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrace(idx + 1, digits, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
