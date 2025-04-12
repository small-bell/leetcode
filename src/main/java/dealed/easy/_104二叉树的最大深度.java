package dealed.easy;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _104二叉树的最大深度 {
    int max = 0;
    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    private void dfs(TreeNode root, int deep) {
        if (root == null) {
            max = Math.max(deep, max);
            return;
        }
        dfs(root.left, deep + 1);
        dfs(root.right, deep + 1);
    }

    public int maxDepth1(TreeNode root) {
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
            }
            ans ++;
        }
        return ans;
    }
}
