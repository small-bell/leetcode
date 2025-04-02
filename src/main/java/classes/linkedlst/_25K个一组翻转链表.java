package classes.linkedlst;

public class _25K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0), curr = head;
        dummy.next = head;
        int n = 0;
        while (curr != null) {
            curr = curr.next;
            n ++;
        }

        ListNode ppre = dummy, pre = dummy;
        curr = head;
        for (int i = 0; i < n / k; i++) {
            for (int j = 0; j < k; j++) {
                ListNode nxt = curr.next;
                curr.next  = pre;
                pre = curr;
                curr = nxt;
            }
            ListNode tail = ppre.next;
            ppre.next = pre;
            tail.next = curr;

            ppre = tail;
            pre = tail;
        }
        ppre.next = curr;

        return dummy.next;
    }
}
