package dealed.mid;

import java.util.ArrayList;
import java.util.List;

public class _6Z字形变换 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int flag = -1, idx = 0;
        List<StringBuilder> lst = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) {
            lst.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lst.get(idx).append(c);
            if (idx == 0 || idx == numRows - 1) {
                flag = - flag;
            }
            idx += flag;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < lst.size(); i++) {
            ans.append(lst.get(i));
        }
        return ans.toString();
    }
}
