package classes.linkedlst;

public class _92反转链表II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = dummy;
        for (int i = 0; i < left - 1; i++) {
            tmp = tmp.next;
        }

        ListNode pre = null, curr =tmp.next;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }

        tmp.next.next = curr;
        tmp.next = pre;
        return dummy.next;
    }
}
