package classes.tree;

public class _988从叶结点开始的最小字符串 {
    String ans = "";

    public String smallestFromLeaf(TreeNode root) {
        helper(root, "");
        return ans;
    }

    private void helper(TreeNode root, String s) {
        if (root == null) return;

        s = (char)('a' + root.val) + s;
        if (root.left == null && root.right == null) {
            String candidate = s;
            if (ans.equals("") || candidate.compareTo(ans) < 0) {
                ans = candidate;
            }
            return;
        }

        helper(root.left, s);
        helper(root.right, s);
    }
}
