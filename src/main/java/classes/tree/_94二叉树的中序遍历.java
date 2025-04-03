package classes.tree;

import java.util.*;

public class _94二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        TreeNode curr = root;
        Stack<TreeNode> st = new Stack<>();
        while (!st.isEmpty() || curr != null) {
            while (curr != null) {
                st.add(curr);
                curr = curr.left;
            }
            curr = st.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                stack.push(cur);
                cur = cur.left; // left
            }else{
                cur = stack.pop();
                res.add(cur.val); // root
                cur = cur.right; // right
            }
        }
        return res;
    }
}
