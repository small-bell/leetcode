package dealed;

import java.util.ArrayList;
import java.util.List;

public class _22括号生成 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrace(new StringBuilder(), 2 * n, 0, 0);
        return res;
    }

    private void backtrace(StringBuilder sb, int all, int lc, int rc) {
        if (sb.length() == all) {
            if (lc == rc) {
                res.add(sb.toString());
            }
            return;
        }
        if (rc > lc) {
            return;
        }
        sb.append("(");
        backtrace(sb, all, lc + 1, rc);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(")");
        backtrace(sb, all, lc, rc + 1);
        sb.deleteCharAt(sb.length() - 1);
    }

}
