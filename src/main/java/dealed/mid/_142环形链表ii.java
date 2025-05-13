package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _142环形链表ii {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        if (head.next == head) return head;
        ListNode dummy = new ListNode(0), fast = dummy, slow = dummy;
        dummy.next = head;
        fast = fast.next;
        fast = fast.next;
        slow = slow.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }

        slow = dummy;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode detectCycle1(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }


}
