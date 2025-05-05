package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _105从前序与中序遍历序列构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int l, int r, int l1, int r1) {
        if (l == r) return new TreeNode(preorder[l]);
        if (l > r) return null;
        int cur = preorder[l];
        TreeNode root = new TreeNode(cur);
        int idx = map.get(cur);
        root.left = buildTree(preorder, inorder, l + 1, l + idx - l1, l1, idx - 1);
        root.right = buildTree(preorder, inorder, l + idx - l1  + 1, r, idx + 1, r1);
        return root;
    }

}
