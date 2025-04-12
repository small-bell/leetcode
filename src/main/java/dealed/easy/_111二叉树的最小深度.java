package dealed.easy;

import java.util.LinkedList;
import java.util.Queue;

public class _111二叉树的最小深度 {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return min;
    }

    private void dfs(TreeNode root, int deep) {
        if (root == null) {

            return;
        }
        if (root.left == null && root.right == null) {
            min = Math.min(++deep, min);
            return;
        }
        deep++;
        dfs(root.left, deep);
        dfs(root.right, deep);
    }

    public int minDepth1(TreeNode root) {
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
