package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _129求根节点到叶节点数字之和 {
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null) {
            return;
        }
        if (root.left == root.right) {
            ans += cur * 10 + root.val;
            return;
        }

        dfs(root.left, cur * 10 + root.val);
        dfs(root.right, cur * 10 + root.val);
    }

    int ans = 0;


}
