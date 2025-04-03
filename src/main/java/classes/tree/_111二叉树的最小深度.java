package classes.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _111二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;
        q.offer(root);
        int ans = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = q.poll();
                if (poll.left != null) q.add(poll.left);
                if (poll.right != null) q.add(poll.right);
                if (poll.left == null &&poll.right == null) return ++ans;
            }
            ans ++;
        }
        return ans;
    }
}
