package classes.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _872叶子相似的树 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        inorder(root1, l1);
        inorder(root2, l2);
        if (l1.size() != l2.size()) return false;

        for (int i = 0; i < l1.size(); i++) {
            // 注意对象一定要用equals
            if (!l1.get(i).equals(l2.get(i))) return false;
        }

        return true;
    }

//    private void inorder(TreeNode root1, List<Integer> l1) {
//        if (root1 == null) return;
//        if (root1.left == null && root1.right == null) {
//            l1.add(root1.val);
//            return;
//        }
//        inorder(root1.left, l1);
//        inorder(root1.right, l1);
//    }

    private void inorder(TreeNode root, List<Integer> l1) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (!st.isEmpty() || curr != null) {
            while (curr!= null) {
                st.add(curr);
                curr = curr.left;
            }
            TreeNode pop = st.pop();
            if (pop.left == null && pop.right == null) l1.add(pop.val);
            curr = pop.right;
        }
    }


}
