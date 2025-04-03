package classes.tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class _144二叉树的前序遍历 {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            ans.add(pop.val);
            if (pop.right != null) stack.push(pop.right);
            if (pop.left != null) stack.push(pop.left);
        }
        return ans;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !s.isEmpty()){
            while (cur != null) {
                res.add(cur.val); // root
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            cur = cur.right; // right
        }
        return res;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !s.isEmpty()){
            if(cur != null){
                res.add(cur.val); // root
                s.push(cur);
                cur = cur.left; // left
            }else{
                cur = s.pop();
                cur = cur.right; // right
            }
        }
        return res;
    }





}
