package classes.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _199二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (i == 0) {
                    ans.add(poll.val);
                }
                if (poll.right != null) q.offer(poll.right);
                if (poll.left != null) q.offer(poll.left);
            }
        }
        return ans;
    }
}
