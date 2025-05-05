package dealed.mid;import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _98验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        if (root.left == root.right) return true;
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE) ;
    }

    private boolean isValidBST(TreeNode root, long l, long r) {
        if (root ==null) return true;
        if (root.val <= l || root.val >= r) return false;
        return isValidBST(root.left, l, root.val) &&isValidBST(root.right, root.val, r);
    }
}
