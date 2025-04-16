package dealed.mid;

import java.util.ArrayList;
import java.util.List;

public class _22括号生成 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(), 0, 0, 2 * n);
        return res;
    }

    private void dfs(StringBuilder sb, int l, int r, int sum) {
        if (l + r == sum ) {
            if (l == r) {
                res.add(sb.toString());
            }
            return;
        }

        if (r > l) return;
        sb.append("(");
        dfs(sb, l + 1, r, sum);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        dfs(sb, l, r + 1, sum);
        sb.deleteCharAt(sb.length() - 1);
    }
}
