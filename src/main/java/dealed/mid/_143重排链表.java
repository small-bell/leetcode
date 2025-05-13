package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _143重排链表 {
    public void reorderList(ListNode head) {
        ListNode dm = new ListNode(0), f = dm, s = dm;
        dm.next = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        ListNode pre = null, cur = s.next;
        s.next = null;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }

        ListNode c1 = dm.next, c2 = pre;

        while (c2 != null) {
            ListNode tmp1 = c1.next;
            ListNode tmp2 = c2.next;

            c1.next = c2;
            c2.next = tmp1;

            c1 = tmp1;
            c2 = tmp2;
        }
    }


}
