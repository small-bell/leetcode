package classes.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _145二叉树的后序遍历 {

    public List<Integer> postorderTraversal0(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                res.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }



    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);

            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }

        return result;
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> resStack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !s.isEmpty()){
            if(cur != null){
                resStack.push(cur); // root
                s.push(cur);
                cur = cur.right; // right
            }else{
                cur = s.pop();
                cur = cur.left; // left
            }
        }

        List<Integer> res = new ArrayList<>();
        while(!resStack.isEmpty()){
            res.add(resStack.pop().val);
        }
        return res;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> resStack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !s.isEmpty()){
            while (cur != null) {
                resStack.push(cur); // root
                s.push(cur);
                cur = cur.right; // right
            }

            cur = s.pop();
            cur = cur.left; // left
        }

        List<Integer> res = new ArrayList<>();
        while(!resStack.isEmpty()){
            res.add(resStack.pop().val);
        }
        return res;
    }
}
