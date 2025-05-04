package dealed.mid;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.time.*;

public class _86分隔链表 {
    public ListNode partition(ListNode head, int x) {
        ListNode p1 = new ListNode(0), h1 = p1, p2 = new ListNode(0), h2 = p2;
        while (head != null ){
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p1.next = null;
        p2.next = null;

        p1.next = h2.next;
        return  h1.next;
    }


}
