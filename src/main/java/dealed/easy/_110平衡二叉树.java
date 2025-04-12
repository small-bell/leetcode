package dealed.easy;

public class _110平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1 || left == -1 || right == -1) return -1;
        return Math.max(left, right) + 1;
    }
}
