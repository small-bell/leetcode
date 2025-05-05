package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _113路径总和ii {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<Integer>());
        return ans;
    }

    private void dfs(TreeNode root, int targetSum, ArrayList<Integer> lst) {
        if (root == null) {
            return;
        }
        if (root.left == root.right) {
            if (targetSum == root.val) {
                lst.add(root.val);
                ans.add(new ArrayList<>(lst));
                lst.remove(lst.size() - 1);
            }
            return;
        }

        lst.add(root.val);
        dfs(root.left, targetSum - root.val, lst);
        lst.remove(lst.size() - 1);

        lst.add(root.val);
        dfs(root.right, targetSum - root.val, lst);
        lst.remove(lst.size() - 1);
    }


}
