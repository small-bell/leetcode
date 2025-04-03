package classes.tree;

public class _1315祖父节点值为偶数的节点和 {
    int ans = 0;

    public int sumEvenGrandparent(TreeNode root) {
        findSum(root);
        return ans;
    }

    void findSum(TreeNode t) {
        if (t == null) {
            return;
        }
        if (t.val % 2 == 0) {
            if (t.left != null) {
                if (t.left.left != null) {
                    ans += t.left.left.val;
                }
                if (t.left.right != null) {
                    ans += t.left.right.val;
                }
            }
            if (t.right != null) {
                if (t.right.left != null) {
                    ans += t.right.left.val;
                }
                if (t.right.right != null) {
                    ans += t.right.right.val;
                }
            }
        }
        findSum(t.left);
        findSum(t.right);
    }
}
