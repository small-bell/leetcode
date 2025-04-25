package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _61旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode dm = new ListNode(0);
        dm.next = head;
        int n = 0;
        while (dm.next != null) {
            dm = dm.next;
            n ++;
        }
        dm.next = head;
        k %= n;
        n -= k;
        dm = new ListNode(0);
        dm.next = head;
        while (n -- > 0) {
            dm = dm.next;
        }
        head = dm.next;
        dm.next = null;
        return head;
    }
}
