package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _82删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dm = new ListNode(0), p = dm;
        dm.next = head;

        while (p.next != null) {
            int val = p.next.val;
            ListNode n = p.next;
            while (n.next != null && n.next.val == val) n = n.next;
            if (n != p.next) {
                p.next = n.next;
            } else {
                p = p.next;
            }
        }

        return dm.next;
    }

}
