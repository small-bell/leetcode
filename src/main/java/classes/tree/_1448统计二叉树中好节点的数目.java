package classes.tree;

public class _1448统计二叉树中好节点的数目 {
    int ans = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null) return;
        if (max <= root.val) ans ++;

        dfs(root.left, Math.max(max, root.val));
        dfs(root.right, Math.max(max, root.val));
    }
}
