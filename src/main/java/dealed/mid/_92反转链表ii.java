package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _92反转链表ii {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dm = new ListNode(0), ph = dm;
        dm.next = head;
        for (int i = 0; i < left - 1; i++) {
            ph = ph.next;
        }
        ListNode cur = ph.next, pre = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        ph.next.next = cur;
        ph.next = pre;
        return dm.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1), dm = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        head.next = new ListNode(5);
        head = head.next;
        new _92反转链表ii().reverseBetween(dm, 2, 4);
    }


}
