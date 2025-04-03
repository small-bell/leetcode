package classes.tree;

import java.util.Stack;

public class _404左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        int ans = 0;
        if (root == null) return  0;
        st.add(root);
        while (!st.isEmpty()) {
            TreeNode pop = st.pop();
            if (pop.left != null && pop.left.left == null &&pop.left.right == null) {
                ans += pop.left.val;
            }
            if (pop.right != null) st.add(pop.right);
            if (pop.left != null) st.add(pop.left);
        }
        return ans;
    }
}
