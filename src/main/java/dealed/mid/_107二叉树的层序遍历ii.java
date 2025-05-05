package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _107二叉树的层序遍历ii {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if (root == null) return ans;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> lst = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                lst.add(poll.val);
                if (poll.left != null) q.offer(poll.left);
                if (poll.right != null) q.offer(poll.right);
            }
            ans.addFirst(new LinkedList<>(lst));
        }
        return ans;
    }


}
