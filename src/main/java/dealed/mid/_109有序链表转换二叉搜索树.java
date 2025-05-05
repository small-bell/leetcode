package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _109有序链表转换二叉搜索树 {
    public TreeNode sortedListToBST(ListNode head) {

        ListNode h = head;
        int len = 0;
        while (h != null) {
            len ++;
            h = h.next;
        }
        return build(head, 0, --len);
    }

    private TreeNode build(ListNode head, int l, int r) {
        if (l == r) {
            ListNode h = head;
            while (l-- > 0) {
                 h = h.next;
            }
            return new TreeNode(h.val);
        }
        if (l > r) return null;
        int mid = (l +r) / 2, _mid = mid;
        ListNode h = head;
        while (mid-- > 0) {
            h = h.next;
        }
        TreeNode node = new TreeNode(h.val);
        node.left = build(head, l, _mid - 1);
        node.right = build(head, _mid + 1, r);
        return node;
    }


}
