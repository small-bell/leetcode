package dealed.mid;

public class _24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        ListNode dm = new ListNode(0), pre = dm, cur = head;
        dm.next = head;
        while (cur != null && cur.next != null) {
            ListNode nxt = cur.next.next;
            cur.next.next = cur;
            pre.next =cur.next;
            cur.next = nxt;
            pre = cur;
            cur = cur.next;
        }
        return dm.next;
    }
}
