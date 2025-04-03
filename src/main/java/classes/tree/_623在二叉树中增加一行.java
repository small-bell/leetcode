package classes.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _623在二叉树中增加一行 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return new TreeNode(val);
        }
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        q.offer(root);
        int layer = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (++layer == depth - 1) {
                for (int i = 0; i < size; i++) {
                    TreeNode poll = q.poll();
                    TreeNode tmpl = new TreeNode(val),
                            tmpr = new TreeNode(val), l = poll.left, r = poll.right;
                    tmpl.left = l;
                    tmpr.right = r;
                    poll.left = tmpl;
                    poll.right = tmpr;
                }
                return root;
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode poll = q.poll();
                    if (poll.left != null) q.offer(poll.left);
                    if (poll.right != null) q.offer(poll.right);
                }
            }
        }
        return root;
    }
}
