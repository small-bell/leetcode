package classes.tree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _LCP44开幕式焰火 {
    public int numColor(TreeNode root) {
        Set<Integer> set=  new HashSet<>();
        postOrder(root, set);
        return set.size();
    }

    private void postOrder(TreeNode root, Set<Integer> set) {
        TreeNode curr = root, pre = null;
        Stack<TreeNode> st = new Stack<>();
        while (!st.isEmpty() || curr != null) {
            while (curr != null) {
                st.add(curr);
                curr = curr.left;
            }
            curr = st.pop();
            if (curr.right == null || curr.right == pre) {
                set.add(curr.val);
                pre = curr;
                curr = null;
            } else {
                st.add(curr);
                curr = curr.right;
            }
        }
    }
}
