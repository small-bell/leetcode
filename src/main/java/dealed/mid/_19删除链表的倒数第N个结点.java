package dealed.mid;

public class _19删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dm = new ListNode(0), cur = head, tmp = dm;
        dm.next = head;
        for (int i = 0; i < n; i++) {
            cur = cur.next;
        }

        while (cur != null) {
            cur = cur.next;
            dm = dm.next;
        }
        dm.next = dm.next.next;
        return tmp.next;
    }
}
