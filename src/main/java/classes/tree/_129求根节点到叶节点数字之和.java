package classes.tree;

public class _129求根节点到叶节点数字之和 {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }

    private void dfs(TreeNode root, int i) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            i *= 10;
            i += root.val;
            sum += i;
            return;
        }

        dfs(root.left, i * 10 + root.val);
        dfs(root.right, i * 10 + root.val);
    }
}
