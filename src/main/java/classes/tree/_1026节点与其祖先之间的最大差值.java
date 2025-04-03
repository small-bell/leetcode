package classes.tree;

public class _1026节点与其祖先之间的最大差值 {
    private int ans;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return ans;
    }

    private void dfs(TreeNode node, int mn, int mx) {
        if (node == null) return;
        mn = Math.min(mn, node.val);
        mx = Math.max(mx, node.val);
        ans = Math.max(ans, Math.max(node.val - mn, mx - node.val));
        dfs(node.left, mn, mx);
        dfs(node.right, mn, mx);
    }
}

// 我觉的这个方法也不错
//class Solution {
//    private int ans;
//
//    public int maxAncestorDiff(TreeNode root) {
//        dfs(root, root.val, root.val);
//        return ans;
//    }
//
//    private void dfs(TreeNode node, int mn, int mx) {
//        if (node == null) {
//            ans = Math.max(ans, mx - mn);
//            return;
//        }
//        mn = Math.min(mn, node.val);
//        mx = Math.max(mx, node.val);
//        dfs(node.left, mn, mx);
//        dfs(node.right, mn, mx);
//    }
//}
