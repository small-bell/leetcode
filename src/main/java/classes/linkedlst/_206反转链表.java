package classes.linkedlst;

public class _206反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0), pre = null, curr = head;
        dummy.next = head;

        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }
        return pre;
    }
}
