package dealed;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103二叉树的锯齿形层序遍历 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        int flag = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> lst = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag == 1) {
                    lst.addLast(node.val);
                } else {
                    lst.addFirst(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right!= null) queue.offer(node.right);
            }
            flag = -flag;
            ans.add(new ArrayList<>(lst));
        }
        return ans;
    }
}
