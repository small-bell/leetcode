package dealed.easy;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94二叉树的中序遍历 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }
        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);
    }


    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> st = new Stack<>();
        TreeNode pre = root;
        List<Integer> ans = new ArrayList<>();
        while (!st.isEmpty() || pre != null) {
            while (pre != null) {
                st.push(pre);
                pre = pre.left;
            }
            pre = st.pop();
            ans.add(pre.val);
            pre = pre.right;
        }
        return ans;
    }
}
