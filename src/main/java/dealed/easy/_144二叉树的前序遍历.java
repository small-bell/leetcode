package dealed.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144二叉树的前序遍历 {
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        ans.add(root.val);
        dfs(root.left, ans);
        dfs(root.right, ans);
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> st = new Stack<>();
        TreeNode pre = root;
        st.push(root);
        List<Integer> ans = new ArrayList<>();
        if (root == null)return ans;
        while (!st.isEmpty()) {
            TreeNode pop = st.pop();
            ans.add(pop.val);
            if (pop.right != null) st.push(pop.right);
            if (pop.left != null) st.push(pop.left);
        }
        return ans;
    }
}
