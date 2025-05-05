package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _106从中序与后序遍历序列构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, postorder, 0, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int[] postorder, int l, int r, int ll, int rr) {
        if (l > r) return null;
        if (l == r) return new TreeNode(postorder[r]);

        int cur = postorder[r];
        Integer idx = map.get(cur);
        TreeNode root = new TreeNode(postorder[r]);
        root.left = buildTree(inorder, postorder, l, l + idx - ll - 1, ll, idx - 1);
        root.right = buildTree(inorder, postorder,l + idx - ll, r  - 1, idx + 1, rr);
        return root;
    }


}
