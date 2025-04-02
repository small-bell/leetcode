package classes.linkedlst;

public class _24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0), pre = dummy, curr = head;
        dummy.next = head;

        while (curr != null && curr.next != null) {
            ListNode nxt = curr.next.next;
            ListNode curNxt = curr.next;
            curNxt.next = curr;
            curr.next = nxt;

            pre.next = curNxt;

            pre = curr;
            curr = nxt;
        }
        return dummy.next;
    }
}
