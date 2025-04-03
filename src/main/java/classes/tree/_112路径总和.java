package classes.tree;

public class _112路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    private boolean dfs(TreeNode root, int targetSum, int i) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (i + root.val == targetSum) return true;
            return false;
        }

        return dfs(root.left, targetSum, i + root.val) || dfs(root.right, targetSum, i + root.val);
    }


}
