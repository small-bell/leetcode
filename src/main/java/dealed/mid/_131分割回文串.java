package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _131分割回文串 {
    boolean[][] f = null;
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        f = new boolean[s.length() + 1][s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            f[i][i] = true;
        }
        for (int i = s.length(); i >= 1 ; i--) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j - i == 1) f[i][j] = s.charAt(i - 1) == s.charAt(j - 1);
                else
                f[i][j] = s.charAt(i - 1) == s.charAt(j - 1) && f[i + 1][j - 1];
            }
        }
        dfs(s, 0, new ArrayList<String>());

        return ans;
    }

    private void dfs(String s, int i, ArrayList<String> lst) {
        if (i >= s.length()) {
            ans.add(new ArrayList<>(lst));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            if (f[i+ 1][j+ 1]) {
                lst.add(s.substring(i, j + 1));
                dfs(s, j, lst);
                lst.remove(lst.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        new _131分割回文串().partition("aba");
    }

}
