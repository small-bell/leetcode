package dealed;

public class _114二叉树展开为链表 {

    TreeNode last = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);

        root.right = last;
        root.left = null;
        last = root;
    }
}
