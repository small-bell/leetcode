package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _114二叉树展开为链表 {
    TreeNode last = null;
    public void flatten(TreeNode root) {
        dfs(root);
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        dfs(root.left);

        root.left = null;
        root.right = last;
        last = root;
    }

}
