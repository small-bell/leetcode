package dealed.easy;

import sun.reflect.generics.tree.Tree;

public class _108将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(0, nums.length - 1, nums);
    }

    private TreeNode build(int l, int r, int[] nums) {
        if (l > r) return null;
        if (l == r) return new TreeNode(nums[l]);
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(l, mid - 1, nums);
        root.right = build(mid + 1, r, nums);
        return root;
    }
}
