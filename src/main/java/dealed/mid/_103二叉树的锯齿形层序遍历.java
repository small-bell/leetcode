package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _103二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> lst = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (flag) {
                    lst.addLast(poll.val);
                } else {
                    lst.addFirst(poll.val);
                }
                if (poll.left != null) q.offer(poll.left);
                if (poll.right != null) q.offer(poll.right);
            }
            flag = ! flag;
            ans.add(new LinkedList<>(lst));
        }
        return ans;
    }

}
