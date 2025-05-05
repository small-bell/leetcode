package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _99恢复二叉搜索树 {
    TreeNode a = null, b = null, pre = null;
    public void recoverTree1(TreeNode root) {
        dfs(root);
        int val = a.val;
        a.val = b.val;
        b.val = val;
    }

    private void dfs(TreeNode root) {
        if (root == null)return;;
        dfs(root.left);
        int val = root.val;
        if (pre != null && val < pre.val) {
            if (a == null) {
                a = pre;
            }
            b = root;
        }
        pre = root;
        dfs(root.right);
    }

    public void recoverTree(TreeNode root) {
        TreeNode a = null, b = null, pre = null;
        Stack<TreeNode> st = new Stack<>();
        while ( root != null ||  !st.isEmpty()) {
            while (root != null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if (pre != null && root.val < pre.val) {
                if (a == null) a = pre;
                b = root;
            }
            pre = root;
            root = root.right;
        }
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }


}
