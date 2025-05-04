package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _93复原IP地址 {
    List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(0,0,  s, new StringBuilder());
        return ans;
    }

    private void dfs(int i, int size, String s, StringBuilder sb) {
        if (i == s.length()) {
            if (size == 4) {
                ans.add(sb.substring(1, sb.length()));
            }
            return;
        }
        if (size > 4) return;
        if (s.charAt(i) == '0') {
            sb.append(".0");
            dfs(i + 1, size + 1, s, sb);
            sb.delete(sb.length() - 2, sb.length());
            return;
        }
        for (int j = 1; j <= 3; j++) {
            if (i + j > s.length()) continue;
            String sub = s.substring(i, i + j);
            int val = Integer.parseInt(sub);
            if (0 < val && val <= 255) {
                sb.append(".").append(sub);
                dfs(i + j, size + 1, s, sb);
                sb.delete(sb.length() - sub.length() - 1, sb.length());
            }
        }
    }


}
